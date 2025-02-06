import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Criando um objeto da classe Scanner para receber os valores pelo terminal 
        Scanner scanner = new Scanner(System.in);

        //Imprimindo a mensagem para o usuário e recebendo o numero da conta
        System.out.println("Digite o número da conta: (ex: 1234)");
        int numero = scanner.nextInt();  // armazenando o valor do número da conta. 

        //Imprimindo a mensagem para o usuário e recebendo a agência
        System.out.println("Digite a agência: (ex: 345-34) ");
        String agencia = scanner.next();  // armazenando o valor da agência. 


        // Imprimindo a mensagem para o usuário e recebendo o nome; 
        System.out.println("Informe seu nome: (ex: Fernando Monte Preto) ");
        String nome = scanner.next(); // armazenando o valor do nome informado. 


        // imprimindo a mensagem para o usuário e recebendo o saldo. 
        System.out.println("Informe o saldo: (ex: 1000.00)");
        double saldo  = scanner.nextDouble(); // armazenando o valor do saldo; 


        // imprimindo as informações da conta 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$: %s já está disponível para saque", nome, agencia, numero, saldo);


        //fechando o objeto scanner. 
        scanner.close();
        

    }
}
