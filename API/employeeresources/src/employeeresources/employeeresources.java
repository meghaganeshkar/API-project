package employeeresources;

public class employeeresources {

	public static void main(String[] args) {

		{
			  "_embedded": {
			    "employeeList": [
			      {
			        "id": 1,
			        "name": "Bilbo Baggins",
			        "role": "burglar",
			        "_links": {
			          "self": {
			            "href": "http://localhost:8080/employees/1"
			          },
			          "employees": {
			            "href": "http://localhost:8080/employees"
			          }
			        }
			      },
			      {
			        "id": 2,
			        "name": "Frodo Baggins",
			        "role": "thief",
			        "_links": {
			          "self": {
			            "href": "http://localhost:8080/employees/2"
			          },
			          "employees": {
			            "href": "http://localhost:8080/employees"
			          }
			        }
			      }
			    ]
			  },
			  "_links": {
			    "self": {
			      "href": "http://localhost:8080/employees"
			    }
			  }
			}
	}

}
