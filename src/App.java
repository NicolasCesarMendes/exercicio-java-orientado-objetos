public class App {
    public static void main(String[] args) throws Exception {
        cliente euMesmo = new cliente("Nícolas",
                                 "444.444.444.444-44",
                            "05/10/1994");

        conta minhaConta = new conta(89419,
                                      50.00,
                                     100.00,
                                             euMesmo);

        System.out.println("Número da conta original: ");
        System.out.println(minhaConta.getNumero());
        System.out.println("Número da conta após atualização: ");
        minhaConta.setNumero(65331);
        System.out.println(minhaConta.getNumero());
        System.out.println("Nome do cliente via objeto de conta: ");
        System.out.println(minhaConta.getTitular().getNome());
    }
}
