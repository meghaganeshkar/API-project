
public class PUTcontroller {

	public static void main(String[] args) {

		@PutMapping("/employees/{id}")
		ResponseEntity<?> replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

		  Employee updatedEmployee = repository.findById(id) //
		      .map(employee -> {
		        employee.setName(newEmployee.getName());
		        employee.setRole(newEmployee.getRole());
		        return repository.save(employee);
		      }) //
		      .orElseGet(() -> {
		        newEmployee.setId(id);
		        return repository.save(newEmployee);
		      });

		  EntityModel<Employee> entityModel = assembler.toModel(updatedEmployee);

		  return ResponseEntity //
		      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
		      .body(entityModel);
		}
	}

}
