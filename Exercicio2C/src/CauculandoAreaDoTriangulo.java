import java.util.Scanner;

public class CauculandoAreaDoTriangulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int area, altura, base;
	System.out.println("Qual � a base do tri�ngulo?");
	base = input.nextInt();
	System.out.println("Qual a altura do tri�ngulo?");
	altura = input.nextInt();
	area = (altura * base) * 2;
	System.out.println("A �rea de seu tri�ngulo �: " + area);
}
}
