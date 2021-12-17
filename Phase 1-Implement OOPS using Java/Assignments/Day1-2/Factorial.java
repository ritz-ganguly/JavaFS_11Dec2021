package day1;

public class Factorial {
    public static int fact(int n) {
    	int mult=1;
    	for(int i=1;i<=n;i++)
    		mult *= i;
    	
    	return mult;
    	
    	
    }
	public static void main(String[] args) {
	  System.out.println(fact(4));	

	}

}
