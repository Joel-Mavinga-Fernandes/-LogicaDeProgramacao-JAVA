import java.util.Scanner;
//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
public class LogicaSequencial4 {


	public static void main(String[] args) {
		
		Scanner sis = new Scanner (System.in);
		
		int A, B, C; 
		
		System.out.println("Por favor digite o valor de A: ");
		A = sis.nextInt();
		
		System.out.println("Por favor digite o valor de B: ");
		B = sis.nextInt();
		
		System.out.println("Por favor digite o valor de C: ");
		C = sis.nextInt();
		
	double R = Math.pow((A+B),2);
	
	double S = Math.pow(B+C, 2);
	
	double D = (R+S)/2;
	
	System.out.println(" O valor de D é: "+ D);
	
	
	
		
		
		
		
		

	}

}
