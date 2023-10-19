public class Aúdio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;
    private int classificacao;

    public Aúdio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducao = 1000000000;
        this.curtidas = 9000000;
        this.classificacao = 0;
    }

    public void curtir() {
        curtidas++;
    }

    public void reproduzir() {
        totalReproducao++;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

