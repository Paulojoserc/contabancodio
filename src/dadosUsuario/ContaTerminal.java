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
	System.out.print("Por favor, digite o n�mero da Conta: ");
	numeroConta = sc.nextInt();
	System.out.print("Por favor, digite Ag�ncia: ");
	agenciaConta = sc.next();
	System.out.println("Por favor, digite o nome do Cliente: ");
	sc.next();
	nomeCliente = sc.nextLine();
	System.out.print("Por favor, digite o saldo da conta : ");
	saldoConta = sc.nextDouble();
	System.out.println("------Fim da cria��o de conta------");
	System.out.println();
	
	System.out.println("Ol� "+ nomeCliente+" , obrigado por criar uma conta em nosso banco, sua ag�ncia � "+agenciaConta+", conta "+numeroConta+" e seu saldo "+saldoConta+" j� est� dispon�vel para saque.");
	
	
	
	sc.close();
	
}
}
