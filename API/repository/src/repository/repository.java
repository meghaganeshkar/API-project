package repository;

public class repository {

	public static void main(String[] args) {

		@GetMapping("/employees/{id}")
		EntityModel<Employee> one(@PathVariable Long id) {

		  Employee employee = repository.findById(id) //
		      .orElseThrow(() -> new EmployeeNotFoundException(id));

		  return EntityModel.of(employee, //
		      linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
		      linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
		}

	}

}
