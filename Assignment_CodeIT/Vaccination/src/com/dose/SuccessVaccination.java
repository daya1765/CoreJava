package com.dose;

public class SuccessVaccination  extends Vaccine{

	@Override
	public void boosterDose(boolean isSecondDoseCompeleted) {
		 if(isSecondDoseCompeleted) {
		 System.out.println("You can take booster dose ");
		 }
		 else {
			 System.out.println("You need to complete your second dose before the booster dose.");
			 
		 }
		
	}

}

