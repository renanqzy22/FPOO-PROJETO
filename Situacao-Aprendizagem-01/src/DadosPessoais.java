	
public class DadosPessoais {

	private String nome;
	private String sobreNome;
	private String dataNascimento;
	private String genero;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
		if(nome.isEmpty()) {
			System.out.println("NOME É OBRIGATÓRIO!!");
			System.exit(0);
		}else {}
			int tamanho = nome.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
			}else {
				this.nome = nome;	
		}
	
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		
		if(sobreNome.isEmpty()) {
			System.out.println("SOBRENOME É OBRIGATÓRIO!!");
			System.exit(0);

		}else {}
			int tamanho = sobreNome.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
			}else {
				this.sobreNome = sobreNome;
		}
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		
		if(dataNascimento.isEmpty()) {
			System.out.println("DATA DE NASCIMENTO É OBRIGATÓRIO!!");
			System.exit(0);
		}else {}
			int tamanho = dataNascimento.length();
			if(tamanho < 10) {
				System.out.println("MINIMO DE DEZ CARACTERES");
				System.exit(0);
			}else {
				this.dataNascimento = dataNascimento;
		}
		
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		
		if(genero.isEmpty()) {
			System.out.println("GENERO É OBRIGATÓRIO!!");
			System.exit(0);
		}else {
			if(genero.equalsIgnoreCase("feminino")) {
				this.genero = genero;
		}else {
			if(genero.equalsIgnoreCase("masculino")) {
				this.genero = genero;
		}else {	
			if(genero.equalsIgnoreCase("outros")) {
					this.genero = genero;
		}else {	
			System.out.println("APENAS MASCULINO, FEMININO E OUTROS");
				this.genero = genero;
		}
				
				}
			}
			
		}
	}
}
	
	
		
		
		
	

	
		
		
		
		
	
	