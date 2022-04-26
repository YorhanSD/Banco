import java.util.Scanner;

public class Menu{

    Scanner scan = new Scanner(System.in);
    Conta conta = new Conta();
    ContaPoupanca cp = new ContaPoupanca();
    ContaCorrente corrente = new ContaCorrente();

    int menuNumero, encerrarPrograma;

    void menuCadastro() {
        System.out.println("\n=====Cadastro de Conta=====\n");

        System.out.println("(1) -> CADASTRO CONTA POUPANCA");
        System.out.println("(2) -> CADASTRO CONTA CORRENTE");
        System.out.println("(0) -> SAIR");

        System.out.print("\nDigite a opcao desejada : ");
    }

    void cadastroPoupanca() {

        System.out.println("=====CADASTRO CONTA POUPANCA=====");

        System.out.print("Digite o numero da conta : ");
        cp.numeroConta = scan.nextInt();

        System.out.print("Digite o numero do cliente : ");
        cp.numeroCliente = scan.nextInt();

        System.out.print("Digite a data da abertura : ");
        cp.dataAbertura = scan.next();

        System.out.print("Digite a sua data de aniversario : ");
        cp.dataAbertura = scan.next();

        System.out.print("Digite o valor que deseja depositar : ");
        conta.deposito(scan.nextDouble());

        System.out.print("Digite o valor que deseja sacar : ");
        conta.sacar(scan.nextDouble());
    }

    void cadastroCorrente() {

        System.out.println("=====CADASTRO CONTA CORRENTE=====");

        System.out.print("Digite o numero da conta : ");
        cp.numeroConta = scan.nextInt();

        System.out.print("Digite o numero do cliente : ");
        cp.numeroCliente = scan.nextInt();

        System.out.print("Digite a data da abertura : ");
        cp.dataAbertura = scan.next();

        System.out.print("Digite a sua data de aniversario : ");
        cp.dataAbertura = scan.next();

        System.out.print("Taxa mensal : ");
        corrente.taxaMensal = scan.nextDouble();

        System.out.print("Digite o valor que deseja depositar : ");
        conta.deposito(scan.nextDouble());

        System.out.print("Digite o valor que deseja sacar : ");
        conta.sacar(scan.nextDouble());

    }

}