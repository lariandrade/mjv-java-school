package ContaCorrente;

public enum TipoTransferencia {
    TED("Transferencia Eletronica Disponivel"),
    DOC("Documento de Ordem de Credito"),
    PIX("Pagamento Instantaneo");

    private String descricao;

    TipoTransferencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
