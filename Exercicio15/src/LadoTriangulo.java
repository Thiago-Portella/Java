import java.util.Scanner;

public class LadoTriangulo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int ladoA, ladoB, ladoC;
	System.out.println("Informe o primeiro poss�vel lado do tri�ngulo: ");
	ladoA = input.nextInt();
	System.out.println("Agora, informe o poss�vel segundo lado: ");
	ladoB = input.nextInt();
	System.out.println("Por fim, qual � o terceiro lado?");
	ladoC = input.nextInt();
	if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB) {
		System.out.println("Parab�ns, voc� sabe o que � um tri�ngulo!");
	}
	else {
		System.out.println("Acho que voc� precisa aprender como formar um tri�ngulo. Volte para a escola!");
	}
	System.out.println("At� a pr�xima!");
}
}
