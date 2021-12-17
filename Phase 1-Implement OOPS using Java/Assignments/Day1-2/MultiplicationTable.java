package day1;
import java.util.*;
public class MultiplicationTable {
    public static void mult(int n) {
    	
    	for(int i=1;i<=10;i++) {
    		System.out.println(n + " * " + i + " = " + n*i);
    		
    	}
    	
    }
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		sc.close();
		mult(n);
	}

}
