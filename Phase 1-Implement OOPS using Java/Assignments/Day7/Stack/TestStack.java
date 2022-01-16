
public class TestStack {

	public static void main(String[] args) {
	MyStack s1= new MyStack(10);
	s1.push(1);
	s1.push(3);
	s1.push(8);
	s1.display();
	s1.pop();
	s1.display();
	System.out.println(s1.peek());
	

	}

}
