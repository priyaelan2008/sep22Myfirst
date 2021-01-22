package constructor;

public class Student1 {
	
	//Examples of constructor overloading
	
	int id;
	String name;
	int age;
	
	Student1 (int i,String n){
		
		 id=i;
		 name=n;
		
	}
	Student1(int i,String n,int a){
	
       id=i;
	 name=n;
	  age=a;
	
	}
	void display() {
		System.out.println(id+name+age);
	}
	
	public static void main(String[] args) {

    Student1 student=new Student1(1,"Eshitha");
    Student1 student1=new Student1(2,"Enanya",6);
    student.display();
    student1.display();

	}

}
