import java.util.Scanner;

public class CauculandoVolumeDoParalelepipedo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double volume, altura, largura, profundidade;
	System.out.println("INforme a altura do paralelepípedo: ");
	altura = input.nextDouble();
	System.out.println("Qual é a largura?");
	largura = input.nextDouble();
	System.out.println("E sua profundidade?");
	profundidade = input.nextDouble();
	volume = largura * altura * profundidade;
	System.out.println("A área do paralelepípedo é: " + volume);
}
}
