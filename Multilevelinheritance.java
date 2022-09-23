package CoreJava;


class India
{
	void belongTo()
  {
		System.out.println("I am in  India");
  }  
}  




class Uttarpradesh  extends India
{ 
	void belongTo1()
  {
		System.out.println("I belongs to UttarPradesh");
  }  
}



class  Varanasi extends   Uttarpradesh{
 

	public static void main(String args[])
  {  
		//creating object of  Varanasi class
		Varanasi obj=new Varanasi();  
		
		
      obj.belongTo();
      obj.belongTo1();
  }   
}



