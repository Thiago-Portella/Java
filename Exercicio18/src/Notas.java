
import java.util.Scanner;
public class Notas {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double nota1, nota2, media;
	System.out.println("Digite, na ordem, as notas do primeiro e segundo bimestre do aluno: ");
	nota1 = input.nextDouble();
	nota2 = input.nextDouble();
	media = (nota1 + nota2) / 2;
	if (media > 9 && media <= 10) {
		System.out.println("Parab�ns, voc� foi aprovado com conceito A!");
	} else if (media > 8 && media <= 9) {
		System.out.println("Muito bem, voc� foi aprovado com conceito B.");
	} else if (media > 6 && media <= 8) {
		System.out.println("Voc� est� na m�dia. Foi aprovado com conceito C.");
	} else if (media >= 3 && media <= 6) {
		System.out.println("Estude bastante, pois voc� precisar� passar nos exames finais.");
	} else if (media < 3) {
		System.out.println("Nos vemos ano que vem, j� que voc� foi reprovado. � bom passar as f�rias estudando!");
	} else {
		System.out.println("� imposs�vel burlar o sistema. Essa nota n�o pode ser cauculada!");
	}
	System.out.println("At� a pr�xima!");
}
}
