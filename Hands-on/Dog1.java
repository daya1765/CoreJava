package CoreJava;

 class Dog1 extends Mammal {
	 public void sound() {
		 System.out.println("I bark");
	 }
	 public static void main(String[] args) {
		 Dog1  d=new Dog1();//creating object of class Dog1 
		 d.eat();//calling eat method of class Animall
		 d.nature();//calling nature method of class Mammal
		 d.sound();//calling sound method of class Dog1
	 }

}
