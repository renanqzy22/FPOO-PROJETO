
public class atividade5 {
	
		private String Op;
		private int N1;
		private int N2;
		private int Resultado;
		
		
		public void Calcular() {
			switch(getOp()) {
			case "+":
			Resultado = getN1() + getN2();
			break;
			
			case "-" :
			Resultado = getN1() - getN2();
			break;
			 
			case "/" :
			Resultado = getN1() / getN2();
			break;
			
			case "*":
			Resultado = getN1() * getN2();
			break;
			
			
			}
		}
		
		
		
		public String getOp() {
			return Op;
		}
		public void setOp(String Op) {
			this.Op = Op;
		}
		public int getN1() {
			return N1;
		}
		public void setN1(int N1) {
			this.N1 = N1;
		}
		public int getN2() {
			return N2;
		}
		public void setN2(int N2) {
			this.N2 = N2;
		}
		public int getResultado() {
			return Resultado;
		}
		public void setResultado(int Resultado) {
			this.Resultado = Resultado;
		}
		
		

}
