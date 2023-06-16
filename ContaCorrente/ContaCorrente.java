package ContaCorrente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private Cliente cliente;
    private Integer numeroConta;
    private Integer numeroAgencia;
    private Double saldo = 0.00;
    private boolean contaAtiva = true;

    List<Transacao> transacoes = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public void depositar(Double valor){
        if (valor < 0.00){
            System.out.println("Valor invalido.");
        }

        this.saldo = this.saldo + valor;
    }

    public void sacar(Double valor) {
        if (this.saldo < valor) {
            System.out.println("Saque negado!!");
        }

        this.saldo = this.saldo - valor;
       
    }

    public void transferir(ContaCorrente contaDestino, Double valor, TipoTransferencia tipo, String descricao, LocalDate data) {

        Transacao transacao = new Transacao();

        transacao.setNumeroAgencia(contaDestino.getNumeroAgencia());
        transacao.setNumeroConta(contaDestino.getNumeroConta());
        transacao.setValor(valor);
        transacao.setTipo(tipo);
        transacao.setDescricao(descricao);
        transacao.setData(data);
        transacoes.add(transacao);

        contaDestino.depositar(valor);

        this.saldo = this.saldo - valor;

    }

    public List<Transacao> consultarExtrato(LocalDate dataInicio, LocalDate dataFinal) {

       List<Transacao> transacoesFiltradas = new ArrayList<>();

        for (Transacao transacao : transacoes) {
             if (!transacao.getData().isBefore(dataInicio) && !transacao.getData().isAfter(dataFinal)) {
                 transacoesFiltradas.add(transacao);
            }
        }

        return transacoesFiltradas;

    }

    public Double consultarSaldo() {
        return this.saldo;
    }

    public String cancelar(String justificativa) {
        if (this.saldo != 0.00) {
            return cliente.getNome() + ", retire todo valor da conta para cancelar. "
                    + "Saldo disponivel: " + this.saldo;
        }

        this.contaAtiva = false;
        return "Conta desativada.";
    }

}