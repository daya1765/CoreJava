package collection;
 
import java.util.Stack;
class Stack_Ex {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
        ob.push(3);
        ob.push(4);
        ob.push(8);
        System.out.println("the stack is:"+ob);
        ob.pop();
        System.out.println(" stack after pop :"+ob);
	}

}
