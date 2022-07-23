import java.util.Scanner;

public class Main {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args)
		    {
			 Scanner scanner = new Scanner(System.in);
		
			 String temp;
		        // storing input in variable
		    System.out.println("enter the total num:");
		    int n =scanner.nextInt();
		    scanner.nextLine();
		    
		    System.out.println("enter name one by one");
			 String[] names=new String[n];
		        // create string array called names
		    for (int i = 0; i < n; i++) {
		         names[i]=scanner.nextLine();
		    }
		       
		        for (int i = 0; i < n; i++) {
		            for (int j = i + 1; j < n; j++) {
		                
		                // to compare one string with other strings
		                if (names[i].compareTo(names[j]) > 0) {
		                    // swapping
		                    temp = names[i];
		                    names[i] = names[j];
		                    names[j] = temp;
		                }
		            }
		        }
		        
		        // print output array
		        System.out.println(
		            "The names in alphabetical order are: ");
		        for (int i = 0; i < n; i++) {
		            System.out.println(names[i]);
		        }
		    }
	

}
