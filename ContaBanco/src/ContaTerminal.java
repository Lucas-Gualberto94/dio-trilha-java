import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();


        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.next();


        System.out.println("Por favor, digite o seu nome e sobrenome !");
        scanner.nextLine();
        String nomeCompleto = scanner.nextLine()
;

         System.out.println("Por favor, digite o saldo !");
         float saldo = scanner.nextFloat();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCompleto, saldo);


   System.out.println("\nDetalhes da conta bancária:");
   System.out.println("Olá " + conta.getNomeCompleto() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo de " + conta.getSaldo() + " já está disponível para saque");

  
    }     
       
}
