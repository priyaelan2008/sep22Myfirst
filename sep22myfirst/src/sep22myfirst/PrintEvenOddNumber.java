package sep22myfirst;

public class PrintEvenOddNumber {

	public static void main(String[] args) {
		String evenNumber="";
		for(int i=1;i<=20;i++) {
			//System.out.println("loop"+i);
			
			if(i%2==0) {
				//evenNumber=evenNumber+i+",";
				
				System.out.println(i+" is even");
				
			}
			else {
				System.out.println(i+" is odd");
			}
			
		}
			
		//System.out.println(evenNumber.substring(0,evenNumber.length()-1)+" is even");

	}

}
