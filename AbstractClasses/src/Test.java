abstract class GeneralBank {
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank {

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return 8.5;
	}
	
}

class KotMBank extends GeneralBank {

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();
		System.out.println("ICICI BANK: " + 
				"Fixed Rate = " + iciciBank.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + iciciBank.getSavingsInterestRate() + "%");
		System.out.println("KOTAK MAHINDRA BANK: " + 
				"Fixed Rate = " + kotMBank.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + kotMBank.getSavingsInterestRate() + "%");
		System.out.println("----------------------------------------------------------");
		GeneralBank gBank1 = new ICICIBank();
		GeneralBank gBank2 = new KotMBank();
		System.out.println("GENERAL BANK1: " + 
				"Fixed Rate = " + gBank1.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + gBank1.getSavingsInterestRate() + "%");

		System.out.println("GENERAL BANK2: " + 
                "Fixed Rate = " + gBank2.getFixedDepositInterestRate() + "%, " + 
                "Saving Rate = " + gBank2.getSavingsInterestRate() + "%");	
	}

}
