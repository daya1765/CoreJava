package CoreJava;

 class TemporaryEmp extends Employee{
	double hike=0.35;
	public static void main(String[] args) {
		TemporaryEmp t=new TemporaryEmp();
		System.out.println("The salary is "+t.salary);
		System.out.println("hike is "+ t.hike);
		PermanentEmp p=new PermanentEmp();
		System.out.println("The age of employee is "+p.age);
		System.out.println("The salary is "+p.salary);
	}

}
