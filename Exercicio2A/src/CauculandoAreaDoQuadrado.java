import java.util.Scanner;

public class CauculandoAreaDoQuadrado {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double lado, resultado;
	System.out.println("Informe o lado do quadr�do: ");
	lado = input.nextDouble();
	resultado = lado * lado;
	System.out.println("A �rea do quadr�do � igual a: " + resultado);
}
}
