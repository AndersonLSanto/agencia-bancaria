package Programa;

import Utilitarios.Utils;

public class Conta {

	private static int contadorDeContas = 1;

	private int numeroConta;
	private Cliente cliente;
	private Double saldo = 0.0;

	public Conta(Cliente cliente) {
		this.numeroConta = contadorDeContas;
		this.cliente = cliente;
		contadorDeContas += 1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		
		return "\nNumero da conta: " + this.getNumeroConta() +
				"\nNome: " + this.cliente.getNome() + 
				"\nCPF: " + this.cliente.getCpf() +
				"\nEmail: " + this.cliente.getEmail() + 
				"\nSaldo: "+ Utils.doubleToString(this.getSaldo()) + 
				"\n";
	}

	public void depositar(Double valor) {

		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu deposito foi realizado com sucesso");
		} else {
			System.out.println("Não foi possivel realizar o deposito");
		}
	}

	public void sacar(Double valor) {

		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque foi realizado com sucesso");
		} else {
			System.out.println("Não foi possivel realizar o saque");
		}
		//Explicação do código:

// valor > 0: Verifica se o valor a ser transferido é maior que zero, garantindo que seja uma transferência válida.

// this.getSaldo() >= valor: Verifica se o saldo da conta de origem é suficiente para cobrir o valor a ser transferido.

// setSaldo(getSaldo() - valor): Se as condições acima forem atendidas, o valor é subtraído do saldo
// da conta de origem usando o método setSaldo.

// contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;: O valor transferido é somado ao saldo da conta
// de destino diretamente. Isso é uma prática que expõe o campo saldo diretamente, o que pode violar princípios
//de encapsulamento. Em vez disso, seria mais apropriado usar um método setSaldo na classe Conta para modificar o saldo.

	}

	public void transferir(Conta contaParaDeposito, Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);

			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			System.out.println("Transferencia realiza com sucesso");
		} else {
			System.out.println("Não foi possivel realizar a transferencia");
		}
	}

}

// Explicação passo a passo:

// valor > 0: Verifica se o valor é maior que zero. Isso garante que o valor
// a ser retirado seja positivo, pois não faz sentido retirar um valor negativo ou zero.
// this.getSaldo() >= valor: Verifica se o saldo da conta é maior ou igual ao valor que se deseja retirar.
// Isso é uma precaução para garantir que o saldo seja suficiente para cobrir a retirada.
// setSaldo(getSaldo() - valor): Se as condições acima forem verdadeiras, então a retirada é permitida. 
// O saldo da conta é atualizado subtraindo o valor desejado.
// Então, em resumo, esse bloco de código está realizando uma verificação para garantir que a retirada seja
// válida antes de efetivamente subtrair o valor do saldo da conta. Isso é comum em operações bancárias para garantir 
//que não ocorram retiradas inválidas que deixariam o saldo negativo. Se as condições são atendidas, o saldo é atualizado,
// caso contrário, nenhuma ação é tomada.

// Então, resumindo, a linha de código setSaldo(getSaldo() + valor); representa
// a operação de aumentar o
// saldo de uma conta bancária ao adicionar um determinado valor.
// Este tipo de operação é típico em transações de depósito, onde o cliente está
// adicionando dinheiro à conta.
// O método getter (getSaldo()) obtém o saldo atual, o valor do depósito é
// somado a esse saldo e, em seguida,
// o método setter (setSaldo) atualiza o saldo da conta com o novo valor.
