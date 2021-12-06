import java.util.Scanner;

public class Conbustivel {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double distancia, velocidade, tempo, litros;
	System.out.println("Informe o tempo gasto na viagem");
	tempo = input.nextDouble();
	System.out.println("Agora, informe sua velocidade média durante o percurso: ");
	velocidade = input.nextDouble();
distancia = velocidade * tempo;
litros = distancia / 12;
System.out.println("Durante a viagem, você gastou " + litros + " litros de conbustível.");
}
}
