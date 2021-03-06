package com.lockedMe;

//importing Necessary Packages ---->

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locked_Me_Operations 

//    Folder_Path --->
{   static final String FILE_DIRECTORY  = "E:\\MyPhase1Project\\File_Directory";

	public static List<String> retrievel_Listof_File_Names( )
	
	//* Method for Getting List of Files from the Directory ---->
	{   
	
		
//		Declaring a List for getting file Names-------------->
		List<String> file_Names = new ArrayList<String>();
		
//		Creating file Object ------>
		File file_Path = new File(FILE_DIRECTORY);
		
		
		
//		Getting file_Names and Putting into a List_Form ----------->
		
		for(var file:file_Path.list())
			file_Names.add(file);
		
//		Returning List of File ------>
		return file_Names;
		
	}
	
	public static boolean add_File() 
	 //* This Method will append the new file in the file_Directory ---->
	{
		
		//Adding file provided by user ------->
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the File Name which you want to add:");
		String adding_new_File = sc.nextLine();
		
//		 Getting the Countof_Lines to input in the file to the User -------->
		System.out.println("Enter the Number of Lines you want to write in the File:");
		int countof_Lines = Integer.parseInt(sc.nextLine());
		
//		Creating the file_Writer ----->
		
		FileWriter file_Write = null;
		
//		Using try-catch to handle Exceptions ------>
		
		try 
		{
			file_Write = new FileWriter(FILE_DIRECTORY +"\\"+adding_new_File);
			
//			Taking linesof_Count from the user ----->
			for(int i=1;i<=countof_Lines;i++) 
			{
				System.out.println("Enter the text for line no. " + i + ":");
			    String dataIntoFile = sc.nextLine() + "\n";
			    file_Write.write(dataIntoFile);
			}	
			
			
			return true;
			
		}
		
		
		catch(IOException e)
		
		{e.printStackTrace();
			return false;
		}
		
		
//		Finally Block to execute the Statement ----->
		finally {
			try {
				if(file_Write!=null)
					file_Write.close();
//				sc.close();
					
			}
			catch (IOException e) {
			e.printStackTrace();
			}
			
		}
		
		
		
		
	
	}

	
	
	
	public static boolean delete_File() 
	//* This Method will Delete User_Specified File ----->
	{
//		Creating Scanner_Object to get input ---->
		Scanner sc = new Scanner (System.in);
		
//		 Getting File Name  user-specified  ------->
		System.out.println("Enter the name of file which you want to delete:");
		String file_Name = sc.nextLine();
//		sc.close();
	    
	    File file_name = new File(FILE_DIRECTORY +"//"+ file_Name);
	    
		
		
//	   Using if-else to  Delete user specified file ------>
	    if(file_name.delete()) 
	    {
	    	return true;
	    }
	    else 
	    {
	    	return false;
	    }
		
		
		
		
	}
	
	
	
    public static boolean search_File() 
//	Method for searching  a user-specified file ------>
    {      
//            Creating Scanner_Object to get input ---->
	        Scanner sc = new Scanner (System.in);
			
//	        Getting the input to the User ----->
			System.out.println("Enter the name of file which you want to Search:");
			String file_Name_tobe_Search = sc.nextLine();
//			sc.close();

		    
		    File search_file_name = new File(FILE_DIRECTORY +"//"+file_Name_tobe_Search);
		    
		    //* Using if-else Condition ----->
		    if((search_file_name.exists())) 
		    {
		    	return true;
		    }
		    else 
		    {
		    	return false;
		    }
	
    }
    
}


