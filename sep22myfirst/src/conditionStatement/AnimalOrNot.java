package conditionStatement;

public class AnimalOrNot {
	
	String animalName="fish";
	
	public void GuessAnimalOrNot() {
		switch (animalName) {
		case "fish":
			System.out.println("fish is the animal");
			break;
		case"duck":
			System.out.println("duck is the animal");
			break;
			
			
		case"Bird":
			System.out.println("Bird is the animal");
			break;
		case"monkey":
			System.out.println("Monkey is the animal");
			break;

		default:
			System.out.println("Not match to animal");
			break;
		}
		
		}
	

	public static void main(String[] args) {
		AnimalOrNot animal=new AnimalOrNot();
		animal.GuessAnimalOrNot();



	}

}
