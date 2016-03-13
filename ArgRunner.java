import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArgRunner {
	public static void main (String[] args) {

		Calculator calc = new Calculator();
		/*
		ArrayList <Float> list = new ArrayList<Float>();
		for (String arg : args) {
			list.add(Float.valueOf(arg));
		}		
		*/
		float[] list = new float[args.length];
		for(int i=0;i<args.length;i++){
			list[i] = Float.valueOf(args[i]);
		}
		
		calc.add(list);
		System.out.println("Сложение = " + (calc.getResult()));
		calc.cleanResult();
		
		calc.subtr(list);
		System.out.println("Вычитание = " + (calc.getResult()));
		calc.cleanResult();	
		
		calc.mult(list);
		System.out.println("Умножение = " + calc.getResult());
		calc.cleanResult();
		
		calc.divide(list);
		System.out.println("Деление = " + calc.getResult());
		calc.cleanResult();
		

	}
}