package Oct10;
//import sep22myfirst.HelloWorld;
public class Testpack {
	
	
	void display() {
		System.out.println("current pack");
	}
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50};
				
		String names[]= {"elan","priya","eshi","Enan"};
		
		int arraySize=a.length;
		
		for(int j=0;j<arraySize;j++) {
			System.out.println("Array Value "+a[j]);

		}
		
		System.out.println("Array a Length "+arraySize);
		
		Testpack h1=new Testpack();
		sep22myfirst.HelloWorld h=new sep22myfirst.HelloWorld();
		h.display();
		h1.display();
		
		
	}

}
