public class Conta {

    int numeroConta, numeroCliente;
    double saldo;
    String dataAbertura, dataAniversario;
    
    Conta(){
        saldo = 100;
    }
    void deposito(double valor) {
        saldo += valor;

        System.out.println("Voce depositou : " + valor);

        System.out.println("Seu deposito restante é de : " + saldo);
    }

    void sacar(double valor) {
       if((saldo - valor)>0){
        saldo -= valor;
        System.out.println("Voce sacou : " + valor);
        System.out.println("Seu saldo restante e de : " + saldo);
       }
       else{
        System.out.println("ERRO: Seu saldo não e suficiente para executar a operacao");
       }
    }
}
