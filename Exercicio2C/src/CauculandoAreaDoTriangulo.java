import java.util.Scanner;

public class CauculandoAreaDoTriangulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int area, altura, base;
	System.out.println("Qual é a base do triângulo?");
	base = input.nextInt();
	System.out.println("Qual a altura do triângulo?");
	altura = input.nextInt();
	area = (altura * base) * 2;
	System.out.println("A área de seu triângulo é: " + area);
}
}
