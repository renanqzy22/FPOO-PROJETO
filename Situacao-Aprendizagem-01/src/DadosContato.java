
public class DadosContato {

	private String telefone;
	private String email;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone.isEmpty()) {
			System.out.println("NUMERO DE TELEFONE É OBRIGATÓRIO ");
			System.exit(0);
			}else {
			
			int tamanho = telefone.length();	
			if(tamanho== 15) {
				
				System.out.println("MINIMO E MAXIMO DE 15 CARACTERES ");
				System.exit(0);
				
			
			}else {
				
				this.telefone = telefone;
			}
	}
}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println("EMAIL É OBRIGATÓRIO");
			System.exit(0);
		}else {
			this.email = email;
		}
	}
}
	
	
	
	

