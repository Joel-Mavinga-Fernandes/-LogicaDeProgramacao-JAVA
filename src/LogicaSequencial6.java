import java.util.Scanner;

//6-Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

public class LogicaSequencial6 {
	
	
	public static void main(String[] args) {
			
		
	
	
	Scanner pontos = new Scanner(System.in);
	System.out.println("Insira o valor de X1: ");
	int X1 = pontos.nextInt();
	
	System.out.println("Insira o valor de Y1: ");
	int Y1 = pontos.nextInt();
	
	System.out.println("Insira o valor de X2: ");
	int X2 = pontos.nextInt();
	
	System.out.println(" Insira o valor de Y2:");
	int Y2 = pontos.nextInt();
	
	Double d = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)-(Y2-Y1));
	
		System.out.println(" O valor do calculo é " + d);
		
		
		
		
	
	}

}
