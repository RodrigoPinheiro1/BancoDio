package BancoClass;

public class main {

    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("rodrigo");

        Conta cc = new ContaCorrente(rodrigo);
        Conta poupanca = new ContaPoupanca(rodrigo);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.investir(-100, cc);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}


