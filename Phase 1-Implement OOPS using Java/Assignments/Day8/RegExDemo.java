package mypack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		//any one of a|b|c
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a");
		System.out.println(m.matches());
		
		//any of a|b|c followed by any of a|b|c
		p = Pattern.compile("[abc][abc]");
	    m = p.matcher("ab");
		System.out.println(m.matches());
		
		//any of a|b|c followed by any of a|b|c followed by any of a|b|c
		p = Pattern.compile("[abc]{3}");
	    m = p.matcher("abc");
		System.out.println(m.matches());
		
		//3 upper case characters
		
		p = Pattern.compile("[A-Z]{3}");
	    m = p.matcher("ABC");
		System.out.println(m.matches());
		
		
		//2 or 3 upper case characters
		p = Pattern.compile("[A-Z]{2,3}");
	    m = p.matcher("ABC");
		System.out.println(m.matches());
		
		
		//2 alphabet characters(ignore case)
		
		p = Pattern.compile("[A-Za-z]{2}");
	    m = p.matcher("AB");
		System.out.println(m.matches());
		
		
		// 2 or 3 alphabets and numbers
		
		p = Pattern.compile("[A-Za-z0-9]{2,3}");
	    m = p.matcher("ABC");
		System.out.println(m.matches());
		
		
		//start with alphabet followed by 1 or 2 alphanumeric
		
		p = Pattern.compile("[A-Za-z][0-9a-zA-Z]{1,2}");
	    m = p.matcher("AB9");
		System.out.println(m.matches());
		
		
		//should have at least one alphabet character(no numerals and underscores)
		
		p = Pattern.compile("[A-Za-z]{1,}");
	    m = p.matcher("k");
		System.out.println(m.matches());
		
		
		
		//containing 3 characters and should not contain A-C
		
		p = Pattern.compile("[^A-C]{3}");
	    m = p.matcher("DDR");
		System.out.println(m.matches());
		
		
		//exactly 3 digits
		
		p = Pattern.compile("[0-9]{3}");
	    m = p.matcher("987");
		System.out.println(m.matches());
		
		//exactly 3 alphabets
		p = Pattern.compile("[A-Za-z]{3}");
	    m = p.matcher("ABC");
		System.out.println(m.matches());
		
		
		//1 to 20 characters containing alphabets,numbers and underscores
		
		p = Pattern.compile("[A-Za-z0-9_]{1,20}");
	    m = p.matcher("A9_");
		System.out.println(m.matches());
		
		
		//containing only 10 numbers not starting with 0
		
		p = Pattern.compile("[1-9][0-9]{9}");
	    m = p.matcher("1909090978");
		System.out.println(m.matches());
		
		
		
		
		
		
		
		
		
		
	}

}
