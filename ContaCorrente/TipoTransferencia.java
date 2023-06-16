package ContaCorrente;

public enum TipoTransferencia {
    TED("Transferência Eletrônica Disponível"),
    DOC("Documento de Ordem de Crédito"),
    PIX("Pagamento Instantâneo");

    private String descricao;

    TipoTransferencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
