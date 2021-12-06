import java.util.Scanner;

public class LadoTriangulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int ladoA, ladoB, ladoC;
	System.out.println("Informe o primeiro possível lado do triângulo: ");
	ladoA = input.nextInt();
	System.out.println("Agora, informe o possível segundo lado: ");
	ladoB = input.nextInt();
	System.out.println("Por fim, qual é o terceiro lado?");
	ladoC = input.nextInt();
	if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB) {
		System.out.println("Parabéns, você sabe o que é um triângulo!");
	}
	else {
		System.out.println("Acho que você precisa aprender como formar um triângulo. Volte para a escola!");
	}
	System.out.println("Até a próxima!");
}
}
