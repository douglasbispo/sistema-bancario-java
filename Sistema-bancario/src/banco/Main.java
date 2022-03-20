package sistemaBancario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(Locale.US);
		ArrayList<Conta> listConta = new ArrayList<Conta>();
		Conta conta = null;

		int menu = 0;

		do {
			System.out.println("_______________MENU_______________");
			System.out.print("Digite [1] para criar uma conta\r\n" + "Digite [2] para o ver o saldo de uma conta\r\n"
					+ "Digite [3] para sacar\r\n" + "Digite [4] para depositar\r\n"
					+ "Ou digite qualquer outro número para finalizar: ");
			menu = leitor.nextInt();
			System.out.println("");

			switch (menu) {
			case 1:
				System.out.print("Nome: ");
				String nomeTitular = leitor.next();
				System.out.print("saldo: ");
				double saldo = leitor.nextDouble();

				conta = new Conta(nomeTitular, saldo, Conta.getProximoNumero());
				listConta.add(conta);

				System.out.println("O número da conta é: " + conta.getNumero() + "\r\n");
				break;
			case 2:
				System.out.print("Digite o número da conta: ");
				int numero = leitor.nextInt();
				System.out.println("");
				for (int i = 0; i < listConta.size(); i++) {
					if (listConta.get(i).getNumero() == numero) {
						if (listConta.get(i) instanceof Conta) {
							conta = (Conta) listConta.get(i);
							System.out.println("SALDO DA CONTA");
							System.out.println("Nome do titular: " + listConta.get(i).getNomeTitular());
							System.out.println("O saldo da conta é: R$" + listConta.get(i).getSaldo());
							System.out.println("Número: " + listConta.get(i).getNumero() + "\r\n");
						}
					}
				}
				break;
			case 3:
				System.out.print("Digite o número da conta: ");
				numero = leitor.nextInt();
				System.out.println("");
				for (int i = 0; i < listConta.size(); i++) {
					if (listConta.get(i).getNumero() == numero) {
						if (listConta.get(i) instanceof Conta) {
							conta = (Conta) listConta.get(i);
							if (listConta.get(i).getSaldo() == 0) {
								System.out.println("Você não pode efetuar o saque! \r\n");
								System.out.println("");
							} else {
								System.out.print("Digite o valor do saque: ");
								double valor = leitor.nextDouble();
								System.out.println("");
								if (conta.saque(valor) == true) {
									System.out.println("SAQUE EFETUADO COM SUCESSO! \r\n");
									System.out.println("Seu Saldo agora é:  R$" + listConta.get(i).getSaldo() + "\r\n");

								} else {
									System.out.println("SAQUE NÃO EFETUADO! \r\n");
								}
							}
						}
					}
				}
				break;
			case 4:
				System.out.print("Digite o número da conta: ");
				numero = leitor.nextInt();
				System.out.println("");
				for (int i = 0; i < listConta.size(); i++) {
					if (listConta.get(i).getNumero() == numero) {
						if (listConta.get(i) instanceof Conta) {
							conta = (Conta) listConta.get(i);
							System.out.print("Digite o valor do deposito: ");
							double valor = leitor.nextDouble();
							System.out.println("");
							if (valor <= 0) {
								System.out.println("Esse valor não pode ser depositado! \r\n");
							} else {
								conta.Deposito(valor);
								System.out.println("DEPOSITO EFETUADO COM SUCESSO!");
								System.out.println("Seu saldo agora é: R$ " + listConta.get(i).getSaldo() + "\r\n");
							}
						}
					}
				}
				break;
			}
		} while (menu >= 1 && menu <= 4);
		leitor.close();

	}

}
