import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o código da agência: ");
		String codigoAgencia = sc.nextLine();
		System.out.println("Informe o nome do Cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Informe saldo: ");
		double saldo = sc.nextDouble();

		System.out.println(
				"Olá, " + nomeCliente.toUpperCase() + " obrigado por criar uma conta em nosso banco, sua agência é "
						+ codigoAgencia + " conta é " + numeroConta + " e o seu saldo " + saldo
						+ " já está disponível para saque");

		sc.close();
	}
}
