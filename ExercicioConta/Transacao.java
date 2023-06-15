package ExercicioConta;

import java.time.LocalDate;

public class Transacao {

    private LocalDate data;
    private String descricao;
    private Double valor;
    private TipoTransferencia tipo;
    private Integer numeroConta;
    private Integer numeroAgencia;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public TipoTransferencia getTipo() {
        return tipo;
    }
    public void setTipo(TipoTransferencia tipo) {
        this.tipo = tipo;
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
    
}
