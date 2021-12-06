import java.util.Scanner;

public class DescontoImposto {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double salario, salarioDesconto;
	System.out.println("Informe o seu salário para saber o desconto do imposto de renda:");
	salario = input.nextDouble();
	if (salario <= 1000.00) {
		System.out.println("Seu salário é menor que R$1000,00. Está isento do imposto de renda.");
	} else if (salario > 1000.00 && salario <= 2500.00) {
		salarioDesconto = (salario* 12.05) / 100;
		System.out.println("Seu salário sofreu um desconto de 12,5%: R$" + salarioDesconto + ". O resultado final foi: R$" + (salario - salarioDesconto));
	} else if (salario > 2500.00 && salario <= 5000.00) {
		salarioDesconto = (salario* 25.00) / 100;
		System.out.println("Seu salário sofreu um desconto de 25%: R$" + salarioDesconto + ". O resultado final foi: R$" + (salario - salarioDesconto));
	} else {
		System.out.println("Você recebe mais que R$5000,00. Seu salário sofreu um desconto fixo de R$1300,00. Salário final: R$" + (salario - 1300.00));
	}
}
}
