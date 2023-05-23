import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		
		double c, f;
						
		System.out.println("####---- BEM VINDO AO PROGRAMA DE CONVERSOR DE TEMPERATURA ----####");
						
		System.out.println("INFORME A TEMPERATURA EM CELSIUS: ");
		c= scanner.nextDouble();
					
						 
		f = (c * 1.8 + 32);
		
		System.out.println("A TEMPERATURA EM FAHRENHEIT: " + f);
		
	}

}
