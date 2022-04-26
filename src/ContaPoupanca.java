public class ContaPoupanca extends Conta {

    void deposito(double valor) {
        if ((saldo - valor) < 0) {
            System.out.println("ERRO : Saldo ficara abaixo de 0.00");
        } else {
            saldo -= valor;
        }
    }

}
