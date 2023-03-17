package com.dose;

import java.util.Scanner;

public class Vaccination {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 // Create object of VaccinationSuccessful
	    SuccessVaccination v = new SuccessVaccination();
	    System.out.println("Enter user nationality: ");
	    String str=sc.nextLine();
	    System.out.println("Enter the age");
	    int age= sc.nextInt();
	    // Call first dose method
	      v.firstDose(str,age);
	    
	    // Call second dose method
	     // v.secondDose(boolean isFirstDoseCompleted );

	    
	    // Call booster dose method
	      //v.boosterDose();
	      
		 } 

}
