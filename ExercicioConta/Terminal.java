package ExercicioConta;

import java.time.LocalDate;

public class Terminal {
    
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.cliente = new Cliente();
        conta.cliente.nomeCliente = "Larissa";
        conta.cliente.dataNascimento = LocalDate.of(1999, 6, 1);
        conta.saldo = 100.00;

        boolean sacar = conta.sacar(100.00);

        //se verdadeiro, saque realizado.
        if(sacar)
            System.out.println(conta.saldo);
        else
            System.out.println("Saldo insuficiente");

        //cancelar
        String cancelar = conta.cancelar("Motivos pessoais");
        System.out.println(cancelar);

    }
}
