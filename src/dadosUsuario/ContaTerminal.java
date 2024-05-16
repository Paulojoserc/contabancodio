package dadosUsuario;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	int numeroConta;
	String agenciaConta;
	String nomeCliente;
	double saldoConta;
	System.out.println("---------Criando conta---------");
	Scanner sc = new Scanner(System.in);
	System.out.print("Por favor, digite o número da Conta: ");
	numeroConta = sc.nextInt();
	System.out.print("Por favor, digite Agência: ");
	agenciaConta = sc.next();
	System.out.println("Por favor, digite o nome do Cliente: ");
	sc.next();
	nomeCliente = sc.nextLine();
	System.out.print("Por favor, digite o saldo da conta : ");
	saldoConta = sc.nextDouble();
	System.out.println("------Fim da criação de conta------");
	System.out.println();
	
	System.out.println("Olá "+ nomeCliente+" , obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque.");
	
	
	
	sc.close();
	
}
}
