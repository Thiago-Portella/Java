import java.util.Scanner;

public class Numeros {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numero, novo, unidade, dezena, centena, resto;
	System.out.println("Digite um númerode três díjitos: ");
	numero = input.nextInt();
	centena = numero / 100;
	resto = numero % 100;
	dezena = resto / 10;
	unidade = resto % 10;
	novo = unidade * 100 + dezena * 10 + centena;
	System.out.println("O novo número é: " + novo);
}
}
