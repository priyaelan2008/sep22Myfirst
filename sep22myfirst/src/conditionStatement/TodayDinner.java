package conditionStatement;

public class TodayDinner {
String dinnerName="Biriyani";

public void guessTodayDinner() {
	if(dinnerName.equals("Biriyani")) {
		System.out.println("Biriyani is correct");
	}else if(dinnerName.equals("Dosa")) {
		System.out.println("Dosa is correct");
	}else if(dinnerName.equals("Idly")){
		System.out.println("Idly is correct");
	}else
	System.out.println("KanjiRice");
}
	public static void main(String[] args) {
		
TodayDinner dinner=new TodayDinner();
dinner.guessTodayDinner();
	}

}
