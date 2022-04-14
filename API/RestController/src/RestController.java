
public class RestController {

	public static void main(String[] args) {

		@RestController
		class EmployeeController {

		  private final EmployeeRepository repository;

		  private final EmployeeModelAssembler assembler;

		  EmployeeController(EmployeeRepository repository, EmployeeModelAssembler assembler) {

		    this.repository = repository;
		    this.assembler = assembler;
		  }

		  ...

		}

	}

}
