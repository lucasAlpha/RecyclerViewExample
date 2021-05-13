package lucas.sampaio.leite.com.recyclerview;

public class Selecao {

    private String nome;
    private String continente;
    private int image;

    public Selecao(String nome, String continente, int image) {
        this.nome = nome;
        this.continente = continente;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Selecao{" +
                "nome='" + nome + '\'' +
                ", continente='" + continente + '\'' +
                ", image=" + image +
                '}';
    }
}
