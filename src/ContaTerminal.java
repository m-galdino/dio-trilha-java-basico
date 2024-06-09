import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n").useLocale(Locale.US);

        try {
            System.out.println("Por favor, digite o número da conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência:");
            String numeroAgencia = scanner.next();

            System.out.println("Por favor, digite seu nome:");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite seu saldo:");
            double saldoCliente = scanner.nextDouble();

            System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo "+ saldoCliente +" já está disponível para saque.");

        } catch (InputMismatchException e) {
            System.out.println("Os campos número da conta e saldo da conta precisam ser numéricos!");
        } finally {
            scanner.close();
        }
    }
}
