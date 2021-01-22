package constructor;

public class Animal {
	
	String animalName;
	String animalColor;
	
    Animal(String name,String color){
    	animalName=name;
    	animalColor=color;
    	
    }
	public void SayAboutAnimal() {
		
		System.out.println(animalName  +   animalColor);
    }
	

	

	public static void main(String[] args) {
	Animal animal1=new Animal("monkey", "peach");
    Animal animal2=new Animal("bear","black");
    
 animal1.SayAboutAnimal();
 animal2.SayAboutAnimal();
    
	}


	}


