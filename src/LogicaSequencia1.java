import java.util.*;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

public class LogicaSequencia1 {
	public static void main(String[] args) {
		Scanner tempo = new Scanner(System.in);
		System.out.print("Insira o n�nmero de Anos: ");
		int anos = tempo.nextInt();
		
		System.out.print("Insira o n�nmero de meses: ");
		int meses = tempo.nextInt();
		
		System.out.print("Insira o n�nmero de dias: ");
		int dias = tempo.nextInt();
		
		int idadeemDias = (anos * 365 + meses * 30 + dias);
		
		System.out.println("A sua idae em dias �: "+idadeemDias);
		
	}
}
