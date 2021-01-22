package staticExamples;

public class StaticVar {
	//Program of static variable


	int rollno;
	   String name;
	static String college ="ITS";

	StaticVar(int r,String n){
	rollno = r;
	name = n;
	   }
	void display (){System.out.println(rollno+" "+name+" "+college);}

	public static void main(String args[]){
	 StaticVar s1 = new StaticVar(111,"Karan");
	 StaticVar s2 = new StaticVar(222,"Aryan");

	s1.display();
	s2.display();
	 }
	}


