import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
		atividade2 objatividade2 = new atividade2();
		atividade3 objatividade3 = new atividade3();
		atividade4 objatividade4 = new atividade4();
		atividade5 objatividade5 = new atividade5();
		
		/*atividade2*/
		
//		int n1,n2,n3;
//	
//		System.out.println("DIGITE O NUMERO 1");
//		n1 = scanner.nextInt();
//		
//		System.out.println("DIGITE O NUMERO 2");
//		n2 = scanner.nextInt();
//		
//		System.out.println("DIGITE O NUMERO 3");
//		n3 = scanner.nextInt();
//		
//		objatividade2.ExibirMaior(n1,n2,n3);
		
		
		/*atividade3*/
		
//		System.out.println("NOTA 1");
//		objatividade3.setN1(scanner.nextDouble());
//		System.out.println("NOTA 2");
//		objatividade3.setN2(scanner.nextDouble());
//		System.out.println("NOTA 3");
//		objatividade3.setN3(scanner.nextDouble());
//		System.out.println("NOTA 4");
//		objatividade3.setN4(scanner.nextDouble());
//		
//		if (objatividade3.Media2() >= 7) {
//			objatividade3.CalcularMedia1();
//		}else {
//			System.out.println("NOTA 5");
//		}
//		
//
	
		/*Atividade4*/
//		System.out.println("Informe o Numero");
//		objatividade4.setN1(scanner.nextDouble());
//		
//		objatividade4.Calculo();
		
		/*atividade5*/
		System.out.println("DIGITE NUMERO 1");
		objatividade5.setN1(scanner.nextInt());
		
		System.out.println("DIGITE NUMERO 2");
		objatividade5.setN2(scanner.nextInt());
		
		System.out.println("ESCOLHA UMA FORMA DE CALCULAR ( + , - , * , / )");
		objatividade5.setOp(scanner.nextInt());
		
		objatividade5.Calcular();
		
		System.out.println("RESULTADO: "+ objatividade5.getResultado());
		
	}

}
