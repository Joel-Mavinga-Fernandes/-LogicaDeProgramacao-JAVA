import java.util.Scanner;

//Um sistema de equações lineares do tipo: 
//, pode ser resolvido segundo mostrado abaixo : 
//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

public class LogicaSequencial7 {

	public static void main(String[] args) {
		
		Scanner sis = new Scanner (System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de a: ");
		a = sis.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = sis.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = sis.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = sis.nextDouble();
		
		System.out.println("Digite o valor de e: ");
		e = sis.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = sis.nextDouble();
		
		x = ((c*e) - (b*f)/(a*e) - (b*d));
		
		y = ((a*f) - (c*d)/(a*e) - (b*d));
		
		System.out.println(" O valor de X é: "+ x + "\n O valor de Y é: " + y);
		

		
		
		
		
		

	}

}
