
public class EmployeeNotFoundException {

	public static void main(String[] args) {
		package payroll;

		class EmployeeNotFoundException extends RuntimeException {

		  EmployeeNotFoundException(Long id) {
		    super("Could not find employee " + id);
		  }
		}

	}

}
