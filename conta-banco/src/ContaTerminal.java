import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numero = scan.nextInt();
        scan.nextLine(); //consumir linha pra nao dar erro.
        
        System.out.println("Por favor, digite a sua Agencia!");
        agencia = scan.nextLine();
        
        System.out.println("Por favor, digite o nome do usuário!");
        nomeCliente = scan.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scan.nextFloat();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
