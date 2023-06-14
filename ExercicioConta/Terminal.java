package ExercicioConta;

import java.time.LocalDate;

public class Terminal {
    
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.cliente = new Cliente();
        conta.cliente.setNomeCliente("Larissa");
        conta.cliente.setDataNascimento(LocalDate.of(1999, 6, 1));


        boolean sacar = conta.sacar(195.00);

        //se verdadeiro, saque realizado.
        if(sacar)
            System.out.println("Saldo apos saque: R$" + conta.getSaldo());
        else
            System.out.println("Saldo insuficiente");

        //cancelar
        String cancelar = conta.cancelar("Motivos pessoais");
        System.out.println(cancelar);

    }
}
