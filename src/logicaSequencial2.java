import java.util.Scanner;

public class logicaSequencial2 {
	//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	public static void main(String[] args) {
	int idadD; int idadA =0; int idadM = 0;
	Scanner sis = new Scanner(System.in);
	System.out.println("Por favor Digite a sua idade em dias");
	idadD = sis.nextInt();
	
	idadA =  idadD/365;
	idadM =  idadD/30;
	
	
	System.out.println("A sua idade em anos �: " +idadA );
	System.out.println("A sua idade em meses �: " +idadM );
	System.out.println("A sua idade em dias �: " +idadD );
	
		
	}
}
