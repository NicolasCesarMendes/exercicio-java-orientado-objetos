public class cliente {

    // Atributos privados

    private String nome;
    private String documento;
    private String dataNascimento;

    // Construtores

    public cliente () {

    }

    public cliente (String nome, String documento, String dataNascimento) { 
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }

    // Métodos Getters e Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}