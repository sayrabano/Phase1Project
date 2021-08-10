package com.lockedMe;

import java.util.List;
import java.util.Scanner;

public class LockedMe_Application 
{

	
	
	public static void main(String[] args) 
	
	{
		final String Welcome_Message = "<-------------------- Welcome to LockedMe.Com ----------------------->" +
				"\n<-------------------- Developed by: SAYRA BANO ------------------->";
		System.out.println(Welcome_Message);
		
		int cont = 1;

		do {
//		Variable Declaration -------->
		Scanner obj = new Scanner (System.in);
		int choice;
		
		
//		Display Menu ------>
		display_Menu();
		
		System.out.println("Enter Your Choice:");
		choice = Integer.parseInt(obj.nextLine());
		
//		Using the switch-case to enter Menu_Option ------->
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
		case 5: System.exit(0);
		          break;
		default :System.out.println("Invalid Option ! Enter Correct Option.");
		}
		
//		obj.close();
		}while(cont>0);
		
	
	}
	public static void display_Menu() {
		
		System.out.println("\n..................................................");
		System.out.println("\t\tCompany Lockers Pvt.Ltd.");
		System.out.println(".................................................\n");
		System.out.println("1. Display all the Files!");
		System.out.println("2. Add_New_File!");
		System.out.println("3. Delete_a_File!");
		System.out.println("4. Search_a_File!");
		System.out.println("5.Exit to Application!");
		System.out.println("...............................................");
		
	} 
	public static void displays_all_Files() {
		

//		Calling the display_all_files method to get FileNames in Ascending Ordered------->
		
		List<String> fl = Locked_Me_Operations. retrievel_Listof_File_Names();
		System.out.println("// Here is the full List of Files //");
        fl.forEach(file -> System.out.println("-> "+file));
		
	}
	
	public static void add_File() {

       boolean isCreated = Locked_Me_Operations .add_File();
		
		  if (isCreated) {
            System.out.println("File create Successfully!");
        } else {
            System.out.println("File not Created try Again!");
        }
		
	}
	public static void delete_File() {
         boolean isDelete = Locked_Me_Operations.delete_File();
		
		if (isDelete) 
		{ 
		      System.out.println(" File is Deleted Successfully :" );
		    } 
		else
		    {
		      System.out.println("Failed to delete the file.");
		      
		    }
	}
	public static void search_File() {
            boolean isFound = Locked_Me_Operations .search_File();
		
		
		if (isFound) 
		{ 
		      System.out.println("File is found:" );
		    } 
		else
		    {
		      System.out.println("File not found");
	
		
		    }
		
	}

		
	
}  
