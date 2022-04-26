import java.util.Scanner;

public class DigitaConta {
    public static void main(String[] args) throws Exception {

        int menuNumero, encerrarPrograma;

        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        menu.menuCadastro();

        menuNumero = scan.nextInt();

        if (menuNumero != 0) {

            do {
                menu.cadastroPoupanca();

                System.out.println("Deseja encerrar o programa : ");
                System.out.print("(0) -> SAIR (1) -> CONTINUAR)");
                encerrarPrograma = scan.nextInt();

                if (encerrarPrograma == 0){
                    menuNumero = 0;
                }
                else{
                    menu.cadastroCorrente();

                    System.out.println("Deseja encerrar o programa : ");
                    System.out.print("(0) -> SAIR (1) -> CONTINUAR)");
                    encerrarPrograma = scan.nextInt();
    
                    if (encerrarPrograma == 0)
                    menuNumero = 0;
                }
                
            } while (menuNumero > 0);

        }
        System.out.println("Programa encerrado");
    }
}
