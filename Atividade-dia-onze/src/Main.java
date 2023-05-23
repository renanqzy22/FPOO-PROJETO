import  java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); 
	triangulos objtriangulos = new triangulos();
	
	System.out.println("Digite o lado1: ");
	objtriangulos.setLado1(scanner.nextInt());
	
	System.out.println("Digite o lado2: ");
	objtriangulos.setLado2(scanner.nextInt());
	
	System.out.println("Digite o lado3: ");
	objtriangulos.setLado3(scanner.nextInt());
	
	objtriangulos.Triangulos();

	}

}
