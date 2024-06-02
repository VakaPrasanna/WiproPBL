
public class Patient {

	String patientName;
	double height, weight;
	
	Patient(String name, double height, double weight){
		this.patientName = name;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI() {
		// BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
		return ( weight / ( height * height ) ) * 703;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient = new Patient("XYZ", 177/2.54, 59*2.2);
		System.out.println("Name: " + patient.patientName + "\nBMI: " + patient.computeBMI());
	}


}
