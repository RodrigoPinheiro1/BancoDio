package BancoClass;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato BancoClass.Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}

