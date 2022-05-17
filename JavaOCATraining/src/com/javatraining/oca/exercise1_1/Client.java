package com.javatraining.oca.exercise1_1;

class CharStack {
	protected char[] stackArray; 
	protected int topOfStack;
	private static int counter;

	public CharStack(int capacity) {
		stackArray = new char[capacity];
		topOfStack = -1;
		counter++;
	}

	public void push(char element) { stackArray[++topOfStack] = element; }
	public char pop() { return stackArray[topOfStack--]; }
	public char peek() { return stackArray[topOfStack]; }
	public boolean isEmpty() { return topOfStack == -1; }
	public boolean isFull() { return topOfStack == stackArray.length -1; }
	public static int getInstanceCount() { return counter; }
}

class PrintableCharStack extends CharStack{

	public PrintableCharStack(int capacity) {
		super(capacity);
	}
	
	public void printStackElements() { // (2)
		for (int i = 0; i <= topOfStack; i++)
		System.out.print(stackArray[i]); // Print each char on terminal
		System.out.println();
	}	
}

public class Client {
	public static void main(String[] args) {
		PrintableCharStack stack = new PrintableCharStack(40);
		String str = "!no tis ot nuf era skcatS";
		System.out.println("Original string: " + str); 
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		stack.printStackElements();
		System.out.println();
		
		System.out.print("Reversed string: ");
		while (!stack.isEmpty()) { 
			System.out.print(stack.pop());
		}
		System.out.println();
		

	}
}