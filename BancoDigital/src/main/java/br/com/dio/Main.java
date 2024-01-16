package br.com.dio;

import br.com.dio.model.Cliente;
import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Naruto Uzumaki");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(250);
        cc.transferir(100, poupanca);


        System.out.println("\n");
        cc.imprimirExtrato();
        System.out.println("\n");
        poupanca.imprimirExtrato();
    }

}