package CoreJava;

 class Sum {
	public int sum(int x,int y) {
		int c;
		c=x+y;
		return c;
	}
	public int sum(int x,int y,int z) {
		return (x+y+z);
	}
	public double sum(double x,double y) {
		double c;
		c=x+y;
		return c;
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.sum(10,20));//calling method sum having two int type parameters 
		System.out.println(s.sum(10,20,30));//calling method sum having three int type parameters
		System.out.println(s.sum(5.5,10.45));//calling method sum having two double type parameters
	}

}
