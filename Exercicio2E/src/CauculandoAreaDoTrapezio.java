import java.util.Scanner;

public class CauculandoAreaDoTrapezio {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int area, base_maior, base_menor, altura;
	System.out.println("Qual � a base menor do trap�zio?");
	base_menor = input.nextInt();
	System.out.println("Qual a base_maior?");
	base_maior = input.nextInt();
	System.out.println("Qual a altura?");
	altura = input.nextInt();
	area = (base_menor + base_maior) * altura / 2;
	System.out.println("A �rea do trap�zio �: " + area);
}
}
