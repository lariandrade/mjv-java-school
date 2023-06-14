package ExercicioConta;

import java.sql.Date;

public class ContaCorrente {

    Cliente cliente;
    Integer numeroConta;
    Integer numeroAgencia;
    Double saldo;
    boolean contaAtiva = true;

    public ContaCorrente() {
        cliente = new Cliente();
    }

    public boolean sacar(Double valor) {
        if (this.saldo < valor) {
            return false;
        }

        this.saldo = this.saldo - valor;
        return true;
    }

    // método para transferir para outra conta
    public void transferir(int numeroConta, int numeroAgencia, double valor) {
    }

    // método para consulta extrato entre datas
    public void consultarExtrato(Date d1, Date d2) {
    }

    // método para consultar saldo
    public Double consultarSaldo() {
        return this.saldo;
    }

        // método para cancelar conta
    public String cancelar(String justificativa) {
        if (this.saldo != 0.00) {
            return cliente.nomeCliente + ", retire todo valor da conta para cancelar. "
            + "Saldo disponivel: " + this.saldo;
        }

        this.contaAtiva = false;
        return "Conta desativada.";
    }

}