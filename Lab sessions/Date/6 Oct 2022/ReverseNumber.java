/*Program-To print the reverse of a number
@Author-Raja kumar Gupta
@date- 6th October 2022
*/

package CoreJava;

import java.util.Scanner;

class ReverseNumber {

	public static void main(String[] args) {
		//Creating object of class Scanner to take input from User
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number ");
	    //Taking a number to variable num
	    int num=sc.nextInt();
	    int reverse_num,remainder;
	    reverse_num=0;
	    int num1=num;
	    while(num>0) {
	    	remainder=num%10;//It will give last digit of number
	    	reverse_num=reverse_num*10+remainder;//calculating the reverse of the number
	    	num=num/10;
	    }
	    //Printing the reverse of the number
	    System.out.println("The reverse of  "+num1+" is "+reverse_num);
	    

	}

}
