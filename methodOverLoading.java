package CoreJava;

public class methodOverLoading {
	void sum() {
		int a=10,b=25,c;
		c=a+b;
		System.out.println(c);
		
	}
	void sum(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void sum(int x,double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		methodOverLoading m=new methodOverLoading();
		m.sum();
		m.sum(100,50);
		m.sum(100,50.45);
	}

}
