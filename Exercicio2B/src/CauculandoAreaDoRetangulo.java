import java.util.Scanner;

public class CauculandoAreaDoRetangulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int area, altura, base;
	System.out.println("Declare a base do retângulo: ");
	base = input.nextInt();
	System.out.println("Agora, informe a altura do retângulo: ");
	altura = input.nextInt();
	area = altura * base;
	System.out.println("A área do retângulo é: " + area);
}
}
