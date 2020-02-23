package DS.stack;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack(5);
		 stack.peak();// You will now that Stack is empty.
		 stack.push(10);
		 System.out.println(" Stack  peak value "+ stack.peak()); //  Stack  peak value 10
		 
		 stack.pop();
		 stack.peak();// You will now that Stack is empty.
		 System.out.println(" Stack is full : "+ stack.isFull()); //  Stack is full : false
		 stack.push(9);
		 stack.push(8);
		 stack.push(7);
		 stack.push(6);
		 stack.push(5);
		  int index =5;
		  while(index >=0) {
			  System.out.println(stack.get(index)); // 9,8,7,6,5
			  index--;
		  }
		 
		 
         
	}

}
