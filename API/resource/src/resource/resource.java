package resource;

public class resource {

	public static void main(String[] args) {

		@GetMapping("/employees")
		CollectionModel<EntityModel<Employee>> all() {

		  List<EntityModel<Employee>> employees = repository.findAll().stream()
		      .map(employee -> EntityModel.of(employee,
		          linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
		          linkTo(methodOn(EmployeeController.class).all()).withRel("employees")))
		      .collect(Collectors.toList());

		  return CollectionModel.of(employees, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
		}
	}

}
