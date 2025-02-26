package banco.digital;

public class Main {
    public static void main(String[] args) {
        Cliente nagi = new Cliente();
        nagi.setNome("Nagi");

        Conta cc = new ContaCorrente(nagi);
        Conta poupanca = new ContaPoupanca(nagi);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}