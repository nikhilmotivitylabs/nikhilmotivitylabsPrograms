package motivitylabs;

public class Patients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital patient1=new Hospital();
		patient1.service();
		patient1.serviceNeed("general checkup");
		System.out.println("The service given to them is "+patient1.serviceTaken());
		patient1.doctorMeeting();
		System.out.println("the bill is "+patient1.payBill(30000));
	}

}
class Hospital{
	boolean doctorTime=true;
	void service() {
		System.out.println("1.general checkup ,2.operations,3.Doctor Consultant");
	}
	void serviceNeed(String serviceNeeded) {
		System.out.println("The Service we Need is "+serviceNeeded);
	}
	String serviceTaken() {
		return "genral checkup";
	}
	void doctorMeeting() {
		if(doctorTime == true) {
			System.out.println("you can Meet the doctor");
		}
		else {
			System.out.println("you need to wait");
		}
	}
	String payBill(double amount) {
		System.out.println("The Amount given is "+amount);
		return "paided";
	}
}
