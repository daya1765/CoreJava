package CoreJava;

public class Tesla extends Car{
	public void drive() {
		System.out.println("Drive Safely");
	}
	public static void main(String[] args) {
		Tesla t=new Tesla();//object of class Tesla is created and constructor of its super class is automatically invoked
		t.drive();//calling drive method of class Tesla
		t.gearchanged();//calling gearchanged method of class Car
	}

	

}
