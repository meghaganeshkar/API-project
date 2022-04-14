
public class EmployeeRepository {

	public static void main(String[] args) {

		package payroll;

		import org.springframework.data.jpa.repository.JpaRepository;

		interface EmployeeRepository extends JpaRepository<Employee, Long> {

		}

	}

}
