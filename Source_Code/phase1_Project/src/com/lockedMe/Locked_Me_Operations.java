package com.lockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locked_Me_Operations 

{   
//	Mentioning the file_Directory------------>
	static final String FILE_DIRECTORY = "E:\\MyPhase1Project\\File_Directory";
	
	
	
	public static List<String> retrievel_Listof_File_Names()
	
	
	{   
	
		
//		Initializing of List and File-------------->
		List<String> file_Names = new ArrayList<String>();
		
		File file_Path = new File(FILE_DIRECTORY);
		
//		Getting file_Names and Putting into a List_Form ----------->
		
		for(var file:file_Path.list())
			file_Names.add(file);
		
		return file_Names;
		
	}
	
	public static boolean add_File() 
	{
		//Adding file provided by user ------->
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the File as  you wish:");
		String adding_new_File = sc.nextLine();
		
//		 Getting the Countof_Lines to input in the file to the User -------->
		System.out.println("Enter the Number of Lines you want to write in the File:");
		int countof_Lines = Integer.parseInt(sc.nextLine());
		
//		Creating the file_Writer ----->
		
		FileWriter file_Write = null;
		
		
		
		try 
		{
			file_Write = new FileWriter(FILE_DIRECTORY +"\\"+adding_new_File);
			
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
		finally {
			try {
				if(file_Write!=null)
					file_Write.close();
				sc.close();
					
			}
			catch (IOException e) {
			e.printStackTrace();
			}
			
		}
		
		
	
	}

	
	
	
	
	
	
	
}
