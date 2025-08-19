import java.util.Scanner;

public class contaTerminal {
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("por favor digite o numero da conta ");
        int numeroconta = scanner.nextInt();
        scanner.nextLine();


        System.out.println("por favor, digite o numero da agencia ");
        String numeroagencia = scanner.nextLine();

        System.out.println("digite o nome do cliente" );
        String nomecliente = scanner.nextLine();

        System.out.println("deposite um valor ");

        double valorDeposito = scanner.nextDouble();


        System.out.println("Olá " + nomecliente +" , obrigado por criar uma conta em nosso banco, sua agência é " 
        +numeroagencia+ " conta " +numeroconta + " e seu saldo "+valorDeposito +" já está disponível para saque");




        
    }
}
