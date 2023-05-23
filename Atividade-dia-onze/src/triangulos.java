
public class triangulos {
	
	int Lado1,Lado2,Lado3;
	
	
	public void Triangulos(){
		
		if((getLado1() == getLado2()) && (getLado2() == getLado3())) {
			System.out.print(" é um triangulo equilatero");
			System.exit(0);
			}
		if((getLado1() == getLado2()) && (getLado2() != getLado3())) {
			System.out.print(" é um triangulo isósceles");
			System.exit(0);
			}
		if((getLado1() != getLado2()) && (getLado2() != getLado3())) {
			System.out.print(" é um triangulo escaleno");
			System.exit(0);
			}
		}
		
	public int getLado1() {
		return Lado1;
	}


	public void setLado1(int Lado1) {
		this.Lado1 = Lado1;
	}


	public int getLado2() {
		return Lado2;
	}


	public void setLado2(int Lado2) {
		this.Lado2 = Lado2;
	}


	public int getLado3() {
		return Lado3;
	}


	public void setLado3(int Lado3) {
		this.Lado3 = Lado3;
	}
}
