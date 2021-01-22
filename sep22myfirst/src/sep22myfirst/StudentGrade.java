package sep22myfirst;

import java.util.Scanner;

public class StudentGrade {
//private static final String Break = null;
//static int i=90;
 
 
	public static void main(String[] args) { 
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Perccent Mark");
		int percentMark=s1.nextInt();
		
		
			if(percentMark>=90) {
		System.out.println("Grade= A");}
		
			
			
	
			else if (percentMark<90 && percentMark >=70) {
				
				System.out.println("Grade= B");}
			
		
			
			else if (percentMark<70 && percentMark>=50) {
				
					System.out.println("Grade= C");}
				
					else {
						System.out.println("Grade= F");
					}
					
				}
			
			
			
			}
		
			
		
			

	

	
