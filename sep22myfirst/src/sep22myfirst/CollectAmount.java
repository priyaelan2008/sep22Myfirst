package sep22myfirst;

public class CollectAmount {
	
	long collectedAmount=200000000l;
	
	public long collectTheAmount() {
		System.out.println("Collect the amount is" +collectedAmount);
	
		return collectedAmount;
		
	}

	public static void main(String[] args) {

    CollectAmount amount=new CollectAmount();
  long Amount= amount.collectTheAmount();
  System.out.println(Amount);
	}

}
