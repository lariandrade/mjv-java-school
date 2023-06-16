package ContaCorrente;

import java.time.LocalDate;
import java.util.List;

public class Terminal {

    public static void main(String[] args) {

        // Cadastro dos clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Larissa");
        cliente1.setDataNascimento(LocalDate.of(1999, 6, 1));

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Gleyson");
        cliente2.setDataNascimento(LocalDate.of(1994, 3, 11));

        // Abrindo as contas

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setCliente(cliente1);
        conta1.setNumeroAgencia(111);
        conta1.setNumeroConta(2345);
        conta1.setContaAtiva(true);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setCliente(cliente2);
        conta2.setNumeroAgencia(111);
        conta2.setNumeroConta(1462);
        conta2.setContaAtiva(true);

        // Metodos
        conta1.depositar(500.00);
        conta2.depositar(700.00);

        conta1.sacar(100.00);
        System.out.println(conta1.consultarSaldo());

        conta1.transferir(conta2, 10.00,
                TipoTransferencia.PIX,
                "Transferencia 1",
                LocalDate.of(2023, 6, 12));

        conta1.transferir(conta2, 10.00,
                TipoTransferencia.DOC,

                "Transferencia 2", LocalDate.now());

        System.out.println(conta2.consultarSaldo());

        List<Transacao> extratoFiltrado = conta1.consultarExtrato(LocalDate.of(2023, 6, 12), LocalDate.now());

        if (!extratoFiltrado.isEmpty()) {
            int contador = 1;

            for (Transacao transacao : extratoFiltrado) {
                System.out.println("Dados do extrato " + contador + ": ");
                System.out.println("Data: " + transacao.getData());
                System.out.println("Tipo: " + transacao.getTipo().getDescricao());
                System.out.println("Valor: " + transacao.getValor());
                System.out.println("Descricao: " + transacao.getDescricao());
                        
                contador++;
            }
        }

        String cancelar = conta1.cancelar("Motivos pessoais");
        System.out.println(cancelar);

    }
}
