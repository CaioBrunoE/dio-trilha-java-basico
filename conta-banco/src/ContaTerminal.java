import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Qual o seu nome !");
        nomeCliente =  sc.nextLine();


        System.out.println("Por favor, digite o número da Agência !");
        agencia =  sc.nextLine();


        System.out.println("Número da conta !");
        numero =  sc.nextInt();

        System.out.println("Qual seu saldo !");
        saldo =  sc.nextDouble();



        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente,agencia,numero, saldo );

        sc.close();
    }
}