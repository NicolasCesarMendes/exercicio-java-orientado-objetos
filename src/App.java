import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        cliente clienteNicolas = new cliente("Nícolas",
                                 "444.444.444-44",
                            "23/10/2000");

        conta contaNicolas = new conta(89419,
                                      5000.00,
                                     2000.00,
                                             clienteNicolas);

        cliente clienteJoao = new cliente("João",
                                 "131.313.131-31",
                            "05/10/1994");

        conta contaJoao = new conta(13013,
                                      1300.00,
                                     200.00,
                                             clienteJoao);

        cliente clienteEnzo = new cliente("Enzo",
                                 "676.767.676-76",
                            "23/01/2001");

        conta contaEnzo = new conta(67067,
                                      6000.00,
                                     300.00,
                                             clienteEnzo);

        ArrayList<conta> contas = new ArrayList<>();

        contas.add(contaNicolas);
        contas.add(contaJoao);
        contas.add(contaEnzo);

        System.out.println("\nDados das contas: ");

        for (int i = 0; i < 3; i++) {
            contas.get(i).exibirDados();
        }
                                             
        System.out.println("\nSaldo do Nícolas inicial: R$ " + contaNicolas.getSaldo());

        contaNicolas.depositar(150.0);
        System.out.println("\nSaldo do Nícolas após depósito: R$ " + contaNicolas.getSaldo());
        
        contaNicolas.sacar(250.0);
        System.out.println("\nSaldo do Nícolas após saque: R$ " + contaNicolas.getSaldo());
        
        System.out.println("\nSaldo do Enzo antes da transferência: R$ " + contaEnzo.getSaldo());
        contaNicolas.transferir(500.0, contaEnzo);
        System.out.println("\nSaldo do Nícolas após a transferência: R$ " + contaNicolas.getSaldo());
        System.out.println("\nSaldo do Enzo depois da transferência: R$ " + contaEnzo.getSaldo());

        System.out.println("\nDados das contas: ");

        for (int i = 0; i < 3; i++) {
            contas.get(i).exibirDados();
        }
    }
}
