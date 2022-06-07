package motivitylabs;

public class Staticmethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor obj=new Doctor();
		obj.abc();
	}

}

class Doctor{
	 static int i=500;
	void abc() {
		System.out.println(""+i);
	}
}
