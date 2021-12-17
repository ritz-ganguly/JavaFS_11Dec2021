package day1;
import day1.*;

public class NCR_NPR {
    public static double ncr(int n, int r) {
    	
    	double x = Factorial.fact(n)/(Factorial.fact(n-r) * Factorial.fact(r));
    	
    	return x;
    	
    }
    
    public static double npr(int n, int r) {
    	
    	return Factorial.fact(n)/(Factorial.fact(n-r));
    }
	public static void main(String[] args) {
		
		System.out.println(ncr(5,2));
		System.out.println(npr(5,3));

	}

}
