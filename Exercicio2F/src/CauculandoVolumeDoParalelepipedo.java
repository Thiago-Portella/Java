import java.util.Scanner;

public class CauculandoVolumeDoParalelepipedo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double volume, altura, largura, profundidade;
	System.out.println("INforme a altura do paralelep�pedo: ");
	altura = input.nextDouble();
	System.out.println("Qual � a largura?");
	largura = input.nextDouble();
	System.out.println("E sua profundidade?");
	profundidade = input.nextDouble();
	volume = largura * altura * profundidade;
	System.out.println("A �rea do paralelep�pedo �: " + volume);
}
}
