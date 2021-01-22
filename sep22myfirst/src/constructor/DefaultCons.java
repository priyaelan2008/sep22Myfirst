package constructor;

public class DefaultCons{  
	int id;  
	String name;  
	  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
	DefaultCons s1=new DefaultCons ();  
	DefaultCons s2=new DefaultCons ();  
	System.out.println(s1.id);
	System.out.println(s2.name);
	s1.display();  
	s2.display();  
	}  
	}




