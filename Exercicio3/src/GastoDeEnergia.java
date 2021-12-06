import java.util.Scanner;

/*3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça 
um programa Java que receba o valor do salário mínimo e a quantidade de kw gasta 
por uma residência e calcule: 
 a. o valor em reais de cada kw. 
 b. o valor em reais a ser pago 
 c. o novo valor a ser pago por essa residência com um desconto de 10% */

public class GastoDeEnergia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, kw, unidade, reais, desconto;
		System.out.println("Informe o valor do salário.");
		salario = teclado.nextDouble();
		System.out.println("Informe a quantidade de kw gasta.");
		kw = teclado.nextDouble();
		unidade = salario / 700;
		System.out.println("O preço do kw é: " + unidade);
		reais = kw * unidade;
		System.out.println("O preço total sería: " + reais);
		desconto = reais * 0.9;
		System.out.println("O valor a ser pago é: " + desconto);
	}
}