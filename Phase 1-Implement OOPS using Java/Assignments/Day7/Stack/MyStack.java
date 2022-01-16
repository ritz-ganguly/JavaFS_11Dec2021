
public class MyStack implements StackInterface {
	private int a[];
	int sz;
	int tos;
MyStack(int size){
	sz=size;
	a=new int[sz];
	tos=-1;
	
	
}

public void push(int item) {
	if(tos==sz-1) 
		System.out.println("Stack full");
	else
		a[++tos]=item;
		
	
	}

public int pop() {
	
	if(tos==-1) {
		System.out.println("Stack Underflow");
	return -99999;
	}
	else
		return a[tos--];
	
}

public int peek() {
	
	return a[tos];
}
	
	public void display() {
		
	for(int i=0;i<=tos;i++)
		System.out.println(a[i]);
		
	}
	
}

