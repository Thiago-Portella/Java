import java.util.Scanner;

public class Vendedor {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double produto, lucro;
	System.out.println("Informe o preço do produto: ");
	produto = input.nextDouble();
	if (produto <= 20) {
		lucro = (produto * 45) / 100;
		System.out.println("Seu produto sofreu um reajuste de 45%, ficando com o preço final de R$" + (produto + lucro) + ".");
	} else {
		lucro = (produto * 30) / 100;
		System.out.println("Seu produto sofreu um reajuste de 30%, ficando com o preço final de R$" + (produto + lucro) + ".");
	}
}
}
