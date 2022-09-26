package CoreJava;
 abstract class Car {
	 //default constructor of class Car
	 Car(){
		 System.out.println("Car is built ");
	 }
	 abstract void drive();//abstract method
	 public void gearchanged() {
		 System.out.println("Gear changed");
	 }

}
 
