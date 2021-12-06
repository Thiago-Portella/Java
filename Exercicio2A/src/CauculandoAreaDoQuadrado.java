import java.util.Scanner;

public class CauculandoAreaDoQuadrado {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double lado, resultado;
	System.out.println("Informe o lado do quadrádo: ");
	lado = input.nextDouble();
	resultado = lado * lado;
	System.out.println("A área do quadrádo é igual a: " + resultado);
}
}
