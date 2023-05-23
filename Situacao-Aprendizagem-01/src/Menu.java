import java.util.Scanner;

public class Menu {


DadosPessoais objDadosPessoais;
DadosContato objDadosContato;
DadosEndereco objDadosEndereco;

public void ExibirMenu() {
Scanner scanner = new Scanner(System.in);

int opcao = 0;

while(opcao != 5) {
	
	System.out.println("OLA , ESCOLHA UMA DA OPÇÕES ABAIXO: ");
	System.out.println("1 - DADOS PESSOAIS ");
	System.out.println("2 - DADOS DE CONTATO ");
	System.out.println("3 - DADOS DE ENDEREÇO ");
	System.out.println("4 - EXIBIR DADOS ");
	System.out.println("5 - SAIR ");
	
	opcao = scanner.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.println("BEM-VINDO(A) ETAPA DADOS PESSOAIS: ");
		
		System.out.println("INFORME UM NOME: ");
		objDadosPessoais = new DadosPessoais();
		objDadosPessoais.setNome(scanner.next());
		
		System.out.println("INFORME UM SOBRENOME: ");
		objDadosPessoais.setSobreNome(scanner.next());
		
		System.out.println("INFORME UMA DATA DE NASCIMENTO: ");
		objDadosPessoais.setDataNascimento(scanner.next());
		
		System.out.println("INFORME UM GENERO (masculino, feminino e outros): ");
		objDadosPessoais.setGenero(scanner.next());
		break;
		
	case 2:
		System.out.println("BEM-VINDO(A) ETAPA DADOS CONTATO: ");
		
		System.out.println("INFORME O TELEFONE");
		objDadosContato = new DadosContato();
		objDadosContato.setTelefone(scanner.next());
		
		System.out.println("INFORME O EMAIL");
		objDadosContato.setEmail(scanner.next());
		break;
		
	case 3:
		System.out.println("BEM-VINDO(A) ETAPA DADOS ENDEREÇO: ");
		
		System.out.println("INFORME O CEP");
		objDadosEndereco = new DadosEndereco();
		objDadosEndereco.setCep(scanner.next());
		
		System.out.println("INFORME O LOGRADOURO");
		objDadosEndereco.setLogradouro(scanner.next());
		
		System.out.println("INFORME O NUMERO");
		objDadosEndereco.setNumero(scanner.next());
		
		System.out.println("INFORME O BAIRRO");
		objDadosEndereco.setBairro(scanner.next());
		
		System.out.println("INFORME A CIDADE");
		objDadosEndereco.setCidade(scanner.next());
		
		System.out.println("INFORME O ESTADO");
		objDadosEndereco.setEstado(scanner.next());
		break;
		
	case 4:
		System.out.println("EXIBIR DADOS: ");
		
		//DADOS PESSOAIS
		System.out.println("NOME : " + objDadosPessoais.getNome());
		System.out.println("SOBRENOME : " + objDadosPessoais.getSobreNome());
		System.out.println("DATA DE NASCIMENTO : " + objDadosPessoais.getDataNascimento());
		System.out.println("GENERO : " + objDadosPessoais.getGenero());
		
		//DADOS CONTATO
		System.out.println("TELEFONE: " + objDadosContato.getTelefone());
		System.out.println("EMAIL: " + objDadosContato.getEmail());
		
		//DADOS ENDEREÇO
		System.out.println("CEP : " + objDadosEndereco.getCep());
		System.out.println("LOGRADOURO : " + objDadosEndereco.getLogradouro());
		System.out.println("NUMERO: " + objDadosEndereco.getNumero());
		System.out.println("BAIRRO: " + objDadosEndereco.getBairro());
		System.out.println("CIDADE: " + objDadosEndereco.getCidade());
		System.out.println("ESTADO: " + objDadosEndereco.getEstado());
		break;
		
	case 5:
		System.out.println(" OBRIGADO POR ACESSAR O SITE  ");
		break;
		
	default:
		System.out.println(" OPÇÃO INVALIDA ");
		break;
	
			}	
		}
	}
}
