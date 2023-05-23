import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 

		double c, f;
		
		System.out.println("####---- BEM VINDO AO PROGRAMA DE CONVERSOR DE TEMPERATURA ----####");
	
		System.out.println("INFORME A TEMPERATURA EM FAHRENHEIT: ");
		 f= scanner.nextDouble();
		 
		 c = (f - 32) / 1.8;
		 System.out.println("A TEMPERATURA EM CELSIUS: " + c);
	
	}
	
	
	

}
