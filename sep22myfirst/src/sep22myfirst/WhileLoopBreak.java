package sep22myfirst;

public class WhileLoopBreak {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==4) {
				break;
			}
			
			System.out.println("while loop"+i);
			i++;
		}
		
		}

	}


