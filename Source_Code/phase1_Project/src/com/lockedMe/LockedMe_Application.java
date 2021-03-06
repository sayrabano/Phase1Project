package com.lockedMe;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockedMe_Application 
{

	
	
	public static void main(String[] args) 
	
	{  
//	    Welcome Statement ----->
		
		final String Welcome_Message = "<-------------------- Welcome to LockedMe.Com ----------------------->" +
				"\n<-------------------- Developed by: SAYRA BANO ------------------->";
		System.out.println(Welcome_Message);
		
		int cont = 1;
		try {
		
//         do-while loop to Enter Back into Main Menu Option to ------>
		do {
//		Variable Declaration -------->
		Scanner obj = new Scanner (System.in);
		int choice;
		
		
//		Display Menu ------>
		display_Menu();
		
		System.out.println("Enter Your Choice:");
		choice = Integer.parseInt(obj.nextLine());
		
//		Using the switch-case to enter the logic of Menu_Option ------->
		switch(choice) 
		{
		case 1: displays_all_Files();
		          break;
		case 2: add_File();
		          break;
		case 3: delete_File();
		          break;
		case 4: search_File();
		          break;
		case 5: exitApplication();
		          break;
		default :System.out.println("Invalid Option ! Enter Correct Option.");
		}
		
//		obj.close();
		}while(cont>0);
		
		}
		catch(NumberFormatException nfex) {
			System.out.println("Only Numeric Values are valid to Enter into Logic :");
			System.out.println("\t\tPlease Check or Try again!");
			
		}
	}
	public static void display_Menu() {
//	   Calling the Display Menu Method ------>
		
		System.out.println("\n..................................................");
		System.out.println("\t\tCompany Lockers Pvt.Ltd.");
		System.out.println(".................................................\n");
		System.out.println("1. Display all the Files!");
		System.out.println("2. Add_New_File!");
		System.out.println("3. Delete_a_File!");
		System.out.println("4. Search_a_File!");
		System.out.println("5.Exit the Application!");
		System.out.println("...............................................");
		
		
	} 
	
	public static void displays_all_Files() {
		

//		Calling the display_all_files Method to get FileNames in Ascending Ordered------->
		
		List<String> fl = Locked_Me_Operations. retrievel_Listof_File_Names();
		
		System.out.println("\nList of Files Before Sorting:");
		System.out.println("// Here is the full List of Files //");
        fl.forEach(file -> System.out.println("-> "+file));
        
//        Sorting File_Names using Collections Class ------>
        Collections.sort(fl);
		System.out.println("\nList of Files After Sorting:");
		System.out.println("// Here is the full List of Files //");
        fl.forEach(file -> System.out.println("-> "+file));
        
		
	}
	
	public static void add_File() 
	
	{

       boolean isCreated = Locked_Me_Operations .add_File();
//        Calling Add File Method to addFile ---->
		
		  if (isCreated) {
            System.out.println("File create Successfully!");
        } else {
            System.out.println(" File not Created try Again!");
        }
		
	}
	public static void delete_File() 
//	     Calling the Delete File Method  to delete file from the Folder ----->
	{
         boolean isDelete = Locked_Me_Operations.delete_File();
		
		if (isDelete) 
		{ 
		      System.out.println(" File is Deleted Successfully :" );
		    } 
		else
		    {
		      System.out.println("Failed to delete the file! Try Again.");
		      
		    }
	}
	public static void search_File()
	{
            boolean isFound = Locked_Me_Operations .search_File();
//            Calling the Search File Method to search user-specified File to the Folder ----->
		
//		IfElse Condition ----->
		if (isFound) 
		{ 
		      System.out.println("File is found:" );
		    } 
		else
		    {
		      System.out.println("File not found");
	
		
		    }
		
	}

	public static void exitApplication() 
	{
		System.out.println("Thank You ! Application Is going closing.");
		System.out.println("\n\n\nPlease Contact @sayra123 for Further Application Building.");
		System.exit(0);
	}	
	
}  
