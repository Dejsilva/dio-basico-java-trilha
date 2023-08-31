package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 250.00;
		
		System.out.println("Olá seja bem vindo");
		System.out.println("Por favor,digite o seu nome :");
		nomeCliente = leia.next();
		System.out.println("Agora digite o numero de sua conta : ");
		numero = leia.nextInt();
		System.out.println("Por favor, digite o número da Agência !");
		agencia = leia.next();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso"
				+ " banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo " + saldo + " já está disponível para saque");
		

	}

}
