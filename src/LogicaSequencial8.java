import java.util.Scanner;
//8- O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//consumidor.

public class LogicaSequencial8 {
	
	public static void main(String[] args) {
		
		Scanner custc = new Scanner(System.in);
		System.out.println("insira o custo de fabrica: ");
		int cf = custc.nextInt();
		
		Double cc = cf + (100*0.28) + (100*0.45);
		
		System.out.println(" O cuto de consumo �: " +cc);
	} 

}
