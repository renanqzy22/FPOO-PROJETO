import java.util.Scanner;
public class MediaNomes {

	String[] nome= new String[10];
	Scanner objScanner= new Scanner(System.in);
	
	public void listarNomes() {
		
		for(int indice = 0; indice < nome.length; indice++) {
			System.out.println(" DIGITE 0 " + (indice + 1) + " º NOME: ");
			nome[indice] = objScanner.next();
			}
		System.out.println("LISTAGEM DE NOME: ");
		int indice = 0;
		while(indice < nome.length) {
			
			System.out.println((indice + 1) + "º NOME:" + nome[indice]);
			indice++;
		}
	}
}
