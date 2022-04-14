package root;

public class root {

	public static void main(String[] args) {

		@GetMapping("/employees")
		List<Employee> all() {
		  return repository.findAll();
		}

	}

}
