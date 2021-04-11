package com.htc.arraylistsample;

import java.util.*;
//Arraylist that hold Student objects.
public class StudentMain {
	public static void main(String args[]){  
		  //Creating user-defined class objects  
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  //create iterator obj
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  //returns true if next ele exists
		    Student st=(Student)itr.next(); //move to next position 
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
}
