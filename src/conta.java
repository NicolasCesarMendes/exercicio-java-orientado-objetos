
public class conta {

    // Atributos privados
    private Integer numero;
    private Double saldo;
    private Double limite;
    private cliente titular;

    // Construtores
    public conta() {

    }

    public conta(Integer numero, Double saldo, Double limite, cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.titular = titular;
    }

    // Métodos gerais
    public void depositar(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("\nDepósito realizado com sucesso! Valor: R$ " + valor);
        } else {
            System.out.println("\nValor de depósito inválido!");
        }
    }

    public Boolean sacar(Double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;

            System.out.println("\nSaque realizado com sucesso! Valor: R$ " + valor);

            return true;
        } else {
            System.out.println("\nSaldo insuficiente.");

            return false;
        }
    }

    public Boolean transferir(Double valor, conta contaDestino) {

        if (contaDestino != this || contaDestino != null) {
            System.out.println("\nTranferência em Andamento...");

            if (sacar(valor)) {
                System.out.println("Titular Conta Origem: " + this.getTitular().getNome());

                contaDestino.depositar(valor);
                System.out.println("Titular Conta Destino: " + this.getTitular().getNome());

                System.out.println("\nTranferência realizada com sucesso! Valor: R$ " + valor);

                return true;
            }
        }

        System.out.println("\nTranferência inválida.");

        return false;        
    }

    public void exibirDados() {
        System.out.println("\nDados da conta:");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
        System.out.println("Titular:");
        System.out.println("Nome: " + this.titular.getNome());
        System.out.println("Documento: " + this.titular.getDocumento());
        System.out.println("Data de nascimento: " + this.titular.getDataNascimento());
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
}
