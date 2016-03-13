

public class Calculate {
	public static void main(String [] args) {
		System.out.println("Calculate joke!");
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		float sum = first + second;
		float pro = first * second;
		float power = (float)Math.pow(first,second);
		System.out.println("Summa = " + sum);
		System.out.println("Proizvedenie = " + pro);
		System.out.println("Vozvedenie v stepen = " + power);
	}
}