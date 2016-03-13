import java.util.Scanner;

public class StartApp {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			InteractRunner ir = new InteractRunner();
			String exit = "y";
			while (!exit.equals("n")) {
				int whatDo =  ir.checkOperation();
				float[] list = ir.enterOperands();
				ir.doOperation(whatDo,list);
				System.out.println("Посчитаем что-нибудь еще? (y/n)");
				exit = sc.next();
			}

		}
		finally {
			sc.close();
		}
	}
}