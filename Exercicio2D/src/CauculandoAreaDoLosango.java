import java.util.Scanner;

public class CauculandoAreaDoLosango {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double area, diagonal1, diagonal2;
	System.out.println("Informe a primeira diagonal do losango: ");
	diagonal1 = input.nextDouble();
	System.out.println("Agora, informe a segunda diagonal: ");
	diagonal2 = input.nextDouble();
	area = diagonal1 * diagonal2;
	System.out.println("A área do losango é: " + area);
}
}
