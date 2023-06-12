package Desafio01;

import java.sql.Date;

public class ContaCorrente {

    //dados da conta
    int numeroConta;
    int numeroAgencia;

   //dados do cliente
    String nomeCliente;
    Date dataNascimento;

    //Operações da conta
    double saldoConta;

	//método para sacar
    public void sacar(Double valor, Double saldoConta) {
	    saldoConta = saldoConta - valor;
        System.out.println("Saldo atual: " + saldoConta);
	}

    //método para transferir para outra conta
    public void transferir(int numeroConta, int numeroAgencia, double valor){
        System.out.println("Valor transferido");
    }
    
    //método para cancelar conta
    public void cancelar(int numeroConta, int numeroAgencia, String motivo){
        System.out.println("Conta cancelada");
    }

    //método para consulta extrato entre datas
    public void consultarExtrato(Date d1, Date d2){
        System.out.println("Extrato na data");
    }

    //método para consultar saldo
    public void consultarSaldo(){
        System.out.println("Saldo Atual: " + saldoConta);
    }
   
}