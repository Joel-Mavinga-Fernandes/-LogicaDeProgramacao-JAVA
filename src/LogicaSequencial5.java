import java.util.Scanner;

//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
public class LogicaSequencial5 {

	public static void main(String[] args) {
		
		Scanner sis = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = sis.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = sis.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = sis. nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.println(" A m�dia �: "+ media);
		

	}

}
