package motivitylabs;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee1=new EmployeeDetails();
		employee1.id=10101;
		employee1.name="nikhil";
		EmployeeDetails.department="C.S.E";
		EmployeeDetails.collegeName="Sr";
		employee1.subject="java";
		employee1.salary=30000;
		
		System.out.println("Employee id : "+employee1.id);
		System.out.println("Employee name is: ");
		System.out.println("Department is: "+EmployeeDetails.department);
		System.out.println("CollegeName is: "+EmployeeDetails.collegeName);
		System.out.println("The Subject by "+employee1.subject+" is taught by "+employee1.name);
		System.out.println("the salary of "+employee1.name+" is $"+employee1.salary);
		

	}

}
class EmployeeDetails{
	int id;
	String name;
	static String department;
	static String collegeName;
	String subject;
	double salary;
}