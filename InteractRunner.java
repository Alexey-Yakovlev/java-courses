import java.util.Scanner;

public class InteractRunner {
	
	Scanner sc = new Scanner(System.in);
	Calculator calc = new Calculator();	
	
	public int checkOperation(){		
		System.out.println("\nЧто будем делать? Выбери варианты (№):\n");
		System.out.println(" 1. Сложение" + "\n 2. Вычитание" + "\n 3. Умножение" + "\n 4. Деление\n");
		int whatDo = sc.nextInt();
		while(whatDo > 4 || whatDo < 1){
			System.out.println("Нет такой команды. Повторите ввод:");
			whatDo = sc.nextInt();
		}
		return whatDo;
	}
	
	public float[] enterOperands() {
		System.out.println("Вводите числа через пробел:");
		System.out.println(sc.nextLine());
		String [] operands = sc.nextLine().split(" ");
		
		/*
		for (String i : operands){
			System.out.println("элементы массива после разбиения строки " + i);
		}
		*/
		
		float[] list = new float[operands.length];
		for(int i=0;i<operands.length;i++){
			list[i] = Float.valueOf(operands[i]);
		}
		return list;
	}	
	
	public void doOperation(int whatDo, float[] list){
		switch (whatDo){ 
			case 1:
				System.out.println("Производим сложение...");
				calc.add(list);
				break;
			case 2:
				System.out.println("Производим вычитание...");
				calc.subtr(list);
				break;
			case 3:
				System.out.println("Производим умножение...");
				calc.mult(list);
				break;
			case 4:
				System.out.println("Производим деление...");
				calc.divide(list);
				break;
		}
		System.out.println("Результат: " + calc.getResult());
		calc.cleanResult();	
	}
	//sc.close();
}        