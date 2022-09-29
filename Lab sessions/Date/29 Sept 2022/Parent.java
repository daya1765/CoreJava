/*
 Program :Create a class parent with default constructor and void sing method.print something inside the constructor and method
          Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
          Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.
 @author : Raja Kumar Gupta
 @date  : 29 Sept 2022
 */

package CoreJava;

 class Parent {
	 //Constructor of Parent class
	Parent(){
		System.out.println("I am in parent class");
	}
	public void sing() {
		System.out.println("I can sing a song");
	}

}//end of class Parent
