import java.util.Scanner;

//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

public final class LogicaSequencial3 {
	public static void main(String[] args) {
		
		Scanner sis = new Scanner (System.in);
		int tempoS, tempoM, tempoH, tS;
		
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		tempoS = sis.nextInt();
		
		tempoM = tempoS/60;
		
		tempoH = tempoM/60;
		
		tS = tempoS%60; 
		
		System.out.println("O tempo de dura��o do evento em horas �: "+ tempoH + " \nem minutos �: "+ tempoM + "\nem segundo "+ tS);
		
		
		
		
		
		
		
	}
	
	

}
