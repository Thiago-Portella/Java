import java.util.Scanner;

public class CauculandoVolumeDoCubo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double volume, lado;
	System.out.println("Informe o lado do cubo para determinar seu volume: ");
	lado = input.nextDouble();
	volume = lado * lado * lado;
	System.out.println("O volume total do cubo é: " + volume);
}
}
