import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: usar a classe scanner
        // Exibir as mensagens para os usuários
        // Obter os valores digitados pelo terminal usando scanner
        // Exibir a mensagem classe criada

        Scanner scanner = new Scanner(System.in);

        String nomeCliente, agencia;
       
        int numeroConta;
        
        double saldo;

        System.out.println("Olá, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite sua agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Agora digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar um conta em nosso banco, sua agencia é " + agencia + "," + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
