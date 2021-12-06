import java.util.Scanner;

public class DescontoImposto {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double salario, salarioDesconto;
	System.out.println("Informe o seu sal�rio para saber o desconto do imposto de renda:");
	salario = input.nextDouble();
	if (salario <= 1000.00) {
		System.out.println("Seu sal�rio � menor que R$1000,00. Est� isento do imposto de renda.");
	} else if (salario > 1000.00 && salario <= 2500.00) {
		salarioDesconto = (salario* 12.05) / 100;
		System.out.println("Seu sal�rio sofreu um desconto de 12,5%: R$" + salarioDesconto + ". O resultado final foi: R$" + (salario - salarioDesconto));
	} else if (salario > 2500.00 && salario <= 5000.00) {
		salarioDesconto = (salario* 25.00) / 100;
		System.out.println("Seu sal�rio sofreu um desconto de 25%: R$" + salarioDesconto + ". O resultado final foi: R$" + (salario - salarioDesconto));
	} else {
		System.out.println("Voc� recebe mais que R$5000,00. Seu sal�rio sofreu um desconto fixo de R$1300,00. Sal�rio final: R$" + (salario - 1300.00));
	}
}
}
