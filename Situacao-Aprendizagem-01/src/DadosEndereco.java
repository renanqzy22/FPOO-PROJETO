
public class DadosEndereco {

	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if(cep.isEmpty()) {
			System.out.println("CEP É OBRIGATÓRIO");
			System.exit(0);
		}else {}
			int tamanho = cep.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
			}else {
				this.cep = cep;	
		}
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		if(logradouro.isEmpty()) {
			System.out.println("LOGRADOURO É OBRIGATÓRIO");
			System.exit(0);
		}else {
			int tamanho = logradouro.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
			}else {
				this.logradouro = logradouro;	
			}
		}
		
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		if(bairro.isEmpty()) {
			System.out.println("BAIRRO É OBRIGATÓRIO");
			System.exit(0);
		}else {
				this.bairro = bairro;	
			}
		}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.isEmpty()) {
			System.out.println("NUMERO É OBRIGATÓRIO");
			System.exit(0);
		}else {
			this.numero = numero;	
		} 	
	}	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println("CIDADE É OBRIGATÓRIO");
			System.exit(0);
		}else {
				this.cidade = cidade;
		}
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if(estado.isEmpty()) {
			System.out.println("ESTADO É OBRIGATÓRIO");
			System.exit(0);
		}else {
			int tamanho = estado.length();
			if(tamanho == 2) {
				
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
				
			}else {
				
				this.estado = estado;
					
			}

		}

	}	
}
