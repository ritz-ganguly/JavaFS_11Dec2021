package mypack;

public class App {

	public static void main(String[] args) {
		SingleLinkedList obj = new SingleLinkedList();
		obj.insertFirst(1);
		obj.insertLast(2);
		obj.printElements();
		obj.insertFirst(3);
		obj.printElements();
		obj.insertPosition(4, 4);
		obj.printElements();
		

	}

}
