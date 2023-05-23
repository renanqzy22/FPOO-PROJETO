
public class atividade4 {
	
	int n1, r;
	
	public void Calculo() {
		if (n1 > 0) {
			r = n1 % 2;
		}if(r == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

	public int getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = (int) n1;
	}
	
}
