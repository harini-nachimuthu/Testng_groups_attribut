package Employee_Test;

import org.testng.annotations.Test;

public class TC_007_EmployeeTest {
  @Test(groups= {"smoke","regression"})
  
  public void createEmployee() {
	  System.out.println("Create Employee is done ...");
  }
  @Test(groups="regression")
  public void updateEmployee() {
	  System.out.println("Update Employee is done...");
  }
  @Test(groups= {"regression","critical"})
  public void deleteEmployee() {
	  System.out.println("Delete Employee is done...");
  }
  @Test(groups= {"smoke","regression"})
  public void getEmployeeDetails() {
	  System.out.println("Get Employee details is done ...");
  }
}
