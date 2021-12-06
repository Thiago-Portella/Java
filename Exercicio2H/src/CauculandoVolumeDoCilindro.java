import java.util.Scanner;

public class CauculandoVolumeDoCilindro {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double raio, pi, altura, volume;
	pi = 3.14;
	System.out.println("Informe o raio do cilindro. Em seguida informe a altura: ");
	raio = input.nextDouble();
	altura = input.nextDouble();
	volume = raio * raio * altura * pi;
	System.out.println("O volume do cilindro é: " + volume);
}
}
