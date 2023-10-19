public class Métodos {
	public static void main(String[] args) {
        Aúdio musica = new Aúdio("Vida Loka parte 1 - Racionais", 420); // Criar uma instância de áudio
        musica.curtir(); // Curtir a música
        musica.reproduzir(); // Reproduzir a música
        musica.reproduzir(); // Reproduzir a música novamente

        musica.setClassificacao(5); // Definir uma classificação para a música

        System.out.println("Título: " + musica.getTitulo());
        System.out.println("Duração: " + musica.getDuracao() + " segundos");
        System.out.println("Total de reprodução: " + musica.getTotalReproducao() + " vezes");
        System.out.println("Curtidas: " + musica.getCurtidas());
        System.out.println("Classificação: " + musica.getClassificacao());
    }
}
 