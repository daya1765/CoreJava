package com.dose;

public abstract class Vaccine {
	
	
	// Concrete method for first dose
	 public void firstDose(String nationality, int age) {
	     if (nationality.equalsIgnoreCase("Indian")) {
	    	 if(age>=18) {
	             System.out.println("You can take first dose.");
	             System.out.println("Please pay Rs. 250.");
	             secondDose(true);
	    	 }
	    	 else {
	    		 System.out.println("You can not take first dose as your age is less than 18.");
	    		 secondDose(false);
	    	 }
	    	 
	       
	     } 
	     else {
	         System.out.println("Sorry, you are not eligible for the first dose as you are not indian");
	         secondDose(false);
	     }
	 }
	 
	
	 
	 // Concrete method for second dose
	 public void secondDose(boolean isFirstDoseCompleted) {
	     if (isFirstDoseCompleted) {
	         System.out.println("You can take second dose.");
	         boosterDose(true);
	     } else {
	         System.out.println("Sorry, you need to complete your first dose before taking the second dose.");
	         boosterDose(false);
	     }
	 }
	 // Abstract method for booster dose
	 public abstract void boosterDose(boolean isSecondDoseCompeleted);

}
