import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boston {
	
 private String getUserOrigin() 
   {
	   Scanner reader = new Scanner(System.in);
	   System.out.println("Please enter the station you are leaving from: \n");
	   String origin = reader.nextLine();
	   //user inputs origin station
	   return origin;
   }
   private String getUserDestination (){
	   Scanner reader = new Scanner(System.in);
	   System.out.println("Please enter the station you wish to go to: \n");
	   //user input destination
	   String destination = reader.nextLine();
	   return destination;
   }
   private String printOutput() 
   {
	return null;
   }
   
  
}