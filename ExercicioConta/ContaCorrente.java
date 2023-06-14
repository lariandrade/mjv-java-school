package ExercicioConta;

import java.sql.Date;

public class ContaCorrente {

    Cliente cliente;
    private Integer numeroConta;
    private Integer numeroAgencia;
    private Double saldo = 199.00;
    private boolean contaAtiva = true;

    public ContaCorrente() {
        cliente = new Cliente();
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public boolean getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public Double getSaldo() {
        return saldo;
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
            return cliente.getNomeCliente() + ", retire todo valor da conta para cancelar. "
                    + "Saldo disponivel: " + this.saldo;
        }

        this.contaAtiva = false;
        return "Conta desativada.";
    }

}