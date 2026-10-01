public class conta {

    // Atributos privados

    private Integer numero;
    private Double saldo;
    private Double limite;
    private cliente titular;

    // Construtores

    public conta () {

    }

    public conta (Integer numero, Double saldo, Double limite, cliente titular) { 
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.titular = titular;
    }

    // Métodos Getters e Setters

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return this.limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public cliente getTitular() {
        return this.titular;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    // Métodos gerais

    public void depositar(Integer valor) {
        this.saldo += valor;
    }

    public boolean sacar(Integer valor) {
        if (valor > saldo || valor > limite) {
            System.out.println("\nSaldo insuficiente.");

            return false;
        }
        else {
            this.saldo -= valor;
            this.limite -= valor;

            return true;
        }        
    }

    public boolean transferir(Integer valor, conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);

        return true;
    }

    public void exibirDados() {
        System.out.println("\nNúmero: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Titular: " + titular);
    }
}
