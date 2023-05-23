import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		double N1, N2;
						
		System.out.println("####---- ATIVIDADE DIA 28 atividade 1 ----####");
						
		System.out.println("INFORME UM NUMERO PARA O VALOR 1: ");
		N1 = scanner.nextDouble();
		
		System.out.println("INFORME UM NUMERO PARA O VALOR 2: ");
		N2 = scanner.nextDouble();
					
		if(N1 > N2) {
			System.out.println("O MAIOR VALOR É:"+ N1);
		}else {
			if(N2 > N1) {
				System.out.println("O MAOIR VALOR É: " + N2);
	
			}
		}
	}	
}
