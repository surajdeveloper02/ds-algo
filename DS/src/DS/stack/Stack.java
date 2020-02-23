package DS.stack;

import sun.util.logging.resources.logging;

public class Stack {
	
	long stackArray[];
	int top;
	int  maxSize;
	
	public Stack(int size) {
		// Initialize  the stack 
		stackArray = new long[size];
		this.top = -1;
		 this.maxSize = size-1;
	  
	
	}
	
	public boolean isFull() {
		// This will check is the stack is full
		return top == maxSize;
	}
	public boolean isEmpty()
	{
		// This will check is the stack is empty
		return this.top == -1;
	}
	
	public void push(long value) {
		// This will push the value to stack
		if(!isFull()) {
			top++;
			stackArray[top] = value;
		}else {
			System.out.println(" Stack is full !");
		}
	
	}
	public long pop() {
		// This will pop the value from stack
		 if(!isEmpty()) {
			 int oldIndex = top;
				top--;
				return stackArray[oldIndex];
		 }else {
			 System.out.println("Stack is empty");
			 return 0;
		 }
		
		
	}
	public long peak() {
		// This will give you the peak of stack or current top value 
		if(!isEmpty()) {
			return stackArray[top];
		}else {
			System.out.println("Stack is empty");
			return 0;
		}
		
		
		
	}
	public long get(int index) {
		// This method will give you the value of the index
		if(index>=0 && index<=maxSize) {
			return stackArray[index];
		}else {
			System.out.print(" Unknown Index position : ");
			return index;
		}
	}

}
