package Test;


public class Program1_Stack {
	private int size;
	private int[] a;
	private int top;

	public Program1_Stack(int s) {
		size = s;
		a = new int[size];
		top = -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int peek()
	{
		return a[top];
	}
	public void push(int item)
	{
		if(isFull())
			System.out.println("Cant insert any iteam stack is full");
		else
		{
			top++;
			a[top]=item;
			System.out.println("item has been inserted");
		}
	}
	
	public int pop()
	{
		int deleted=-1;
		if(isEmpty())
		{
			System.out.println("No elements left to be deleted");
		}
		else
		{
			deleted=a[top];
			top--;
		}
		return deleted;
	}
	public void Display()
	{
		int temp = top;
		while(temp>-1)
		{
			System.out.println(a[temp]);
			temp--;
		}
	}
	public static void main(String[] args) {
		Program1_Stack stack= new Program1_Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.Display();
	//	stack.push(6);
		stack.pop();
		System.out.println("after popping");
		stack.Display();
		System.out.println("peek :" + stack.peek());
	}
}
