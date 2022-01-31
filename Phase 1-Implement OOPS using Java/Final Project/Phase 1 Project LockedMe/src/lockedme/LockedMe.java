package lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe {
	private static String folderPath = "C:\\Users\\ADMIN\\Desktop\\simplilearn\\LockedMeFiles";
	
	private static String errorMessage = "Some error occured. Please contact admin@lockedme.com";

	public static void displayMenu() {

		System.out.println("*******************************************************************");
		System.out.println("\t\tWelcome to LockedMe.com");
		System.out.println("\t\tDesigned by Ritankar Ganguly");
		System.out.println("*******************************************************************");
		System.out.println("\t\t1. Display all Files");
		System.out.println("\t\t2. Add a File");
		System.out.println("\t\t3. Delete a File");
		System.out.println("\t\t4. Search a File");
		System.out.println("\t\t5. Exit");

	}
   /**
    * This function returns all the files from the directory 
    */
	public static void getAllFiles() {
		
		try {

		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		LinkedList<String> filename = new LinkedList<>();
		for (var f : listOfFiles) {
			if (f.isFile())
				filename.add(f.getName());

		}
		
		
		Collections.sort(filename, new Comparator<String>() {
		    public int compare(String o1, String o2) {
		        return extractInt(o1) - extractInt(o2);
		    }

		    int extractInt(String s) {
		        String num = s.replaceAll("\\D", "");
		        // return 0 if no digits found
		        return num.isEmpty() ? 0 : Integer.parseInt(num);
		    }
		});
		
		
		if (filename.size() == 0)
			System.out.println("No files present in the directory ");

		else {
			System.out.println("The files in the directory are: ");
			for (var f : filename)
				System.out.println(f);
		}
		
		}
		
		catch(Exception e) {
			
			System.out.println(errorMessage);
		}
		
	
		
		

	}

	
	/**
	 * This method takes the filename and number of lines and creates a file accordingly
	 */
	public static void createFiles() {
     Scanner obj = new Scanner(System.in);
     
     try {
     System.out.println("Enter the name of the file along with the extension you want to create  ");
     String fname = obj.nextLine();
     
     if(fname.length() == 0)
     {
    	 System.out.println("Filename can't be empty ");
    	 return;
    	 
     }
     
     System.out.println("Enter the number of lines you want to enter in the file ");
     int num  = Integer.parseInt(obj.nextLine());
     
     FileWriter fw = new FileWriter(folderPath + "\\" + fname);
     if(num <=0)
     {
    	 File file = new File(folderPath + "\\" + fname);
    	 file.createNewFile();
     
     }
     
     else {
    	 
    	 for(int i = 1; i<=num; i++) {
    		 
    		 System.out.println("Enter the contents of  Line "+i);
    		 String line = obj.nextLine();
    		 fw.write(line+"\n");
    	 }
    	 
    	 System.out.println("New file " + fname + " created succesfully ");
    	 fw.close();
    	 
     }
		
     
     }
     catch(NumberFormatException e) {
    	 System.out.println("Enter a valid number ");
    	 
     }
     
     catch(NullPointerException e) {
    	 System.out.println("Enter a valid number ");
    	 
     }
     catch(Exception e) {
    	 
    	 System.out.println(errorMessage);
     }
     
    
	}
   /**
    * This method deletes a file from the directory.
    */
	public static void deleteFiles() {
		Scanner obj = new Scanner(System.in);
        try {
		
		System.out.println("Enter the file along with extension you want to delete  ");
		String fname = obj.nextLine();
		
		File file = new File(folderPath+"\\"+fname);
		
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		LinkedList<String> filename = new LinkedList<>();
		for (var f : listOfFiles) {
			if (f.isFile())
				filename.add(f.getName());

		}
        
		if(filename.contains(file.getName()))
        {
        	file.delete();
            System.out.println("File " +fname+ " deleted successfully");
        }
        else
        {
        	
            System.out.println("File "+fname + " does not exist");
        }
		
        }
        
        catch(Exception e) {
        	
        	System.out.println(errorMessage);
        }
        
	
	}
	
	/**
	 * This method searches whether a file exist in the folder or not
	 */

	public static void searchFiles() {
		Scanner obj = new Scanner(System.in);
		try {
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		LinkedList<String> filename = new LinkedList<>();
		for (var f : listOfFiles) {
			if (f.isFile())
				filename.add(f.getName());

		}
		
		System.out.println("Enter the filename alongwith the extension you want to search ");
		String fn = obj.nextLine();
		if(filename.contains(fn))
			System.out.println("File " +fn + " is found in the folder ");
		else
			System.out.println("File " + fn +" is not found in the folder ");
		
		}
		catch(Exception e)
		{
			
			System.out.println(errorMessage);
		}
		
		

	}
 
public static void main(String[] args) {
		
		String ch;
		Scanner obj2 = new Scanner(System.in);
		try {
		
		do {
			displayMenu();
			System.out.println("Enter your choice ");
			
		    ch = obj2.nextLine().trim();
			
		    switch(ch) {
		    
		    case "1": getAllFiles();
		            break;
		           
		    case "2": createFiles();
		            break;
		         
		    case "3": deleteFiles();
		            break;
		            
		    case "4": searchFiles();
		            break;
		     
		    case "5": System.exit(0);
		            break;
		            
		    default: System.out.println("Invalid option ");
		             break;
		    
		    }
			
		}while(ch!="asdfghjklzxcvbnmqwertytuio");

		}
		
	     
	     catch(NullPointerException e) {
	    	 System.out.println("Enter a valid number ");
	    	 
	     }
		catch(Exception e)
		{
			
			System.out.println(errorMessage);
		}
	}


}
