public class Main {
    public static void main(String[] args) {
        Cliente rafa = new Cliente();
        rafa.setNome("Rafael");

        Conta cc = new  ContaCorrente(rafa);
        cc.depositar(120);

        Conta poupanca = new ContaPoupanca(rafa);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
