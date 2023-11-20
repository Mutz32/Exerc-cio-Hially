public class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    // Construtor
    public Telefone() {
        // Construtor padrão
    }

    // Métodos para manipulação do atributo 'tipo'
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // Métodos para manipulação do atributo 'ddd'
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdd() {
        return ddd;
    }

    // Métodos para manipulação do atributo 'numero'
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
