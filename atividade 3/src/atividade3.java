import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		
		double t, v, l, d;

		System.out.println("####---- BEM VINDO AO PROGRAMA ----####");
		
		System.out.println("INFORME O TEMPO GASTO: ");
		 t= scanner.nextDouble();
		 
		 System.out.println("INFORME A VELOCIDADE: ");
		 v= scanner.nextDouble();
		 
		d = t * v;
	
		 l = (d / 12);
		 System.out.println("A DISTANCIA PERCORRIDA É " + d);
			
		 System.out.println("OS LITROS GASTOS " + l);
		
	}

}
