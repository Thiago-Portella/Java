import java.util.Scanner;

public class Media {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double nota1, nota2, media;
	System.out.println("Digite a primeira nota: ");
	nota1 = input.nextDouble();
	System.out.println("Digite a segunda nota: ");
	nota2 = input.nextDouble();
	media = (nota1 + nota2) / 2;
	if (media >= 6) {
		System.out.println("Parab�ns, voc� foi aprovado! Sua m�dia foi: " + media);
	}
	System.out.println("Sinto muito, mas voc� foi reprovado. Sua m�dia foi: " + media);
}
}
