package q3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;




public class Application {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);  
		    System.out.println("Enter Student No");
		    String studentNo = scan.nextLine();		    
		    System.out.println("Enter Student Name");
		    String name = scan.nextLine();
		    System.out.println("Enter Student SurName");
		    String surName = scan.nextLine();		    
		    scan.close();
		    Student student=new Student(name,surName);
		    
		    HashMap<String, Student> studentMap=new HashMap<String, Student>();
		    studentMap.put(studentNo, student); 
		    System.out.println(studentMap);
		
		}

}
