package conditionStatement;

public class SwitchOnTheTV {
	
	boolean isTVon;
	public void CheckSwitchOnTheTV() {
		if(isTVon) {
			System.out.println("Switch on the tv");		
		}else {
			System.out.println("Switch off the tv");
		}
	}

	public static void main(String[] args) {
		
		SwitchOnTheTV tv =new SwitchOnTheTV();
		/*if(tv.isTVon) {
			System.out.println("Switch on the tv");
		}else {
			System.out.println("Switch off the tv");
		}
	}*/
		tv.CheckSwitchOnTheTV();

	}
}
