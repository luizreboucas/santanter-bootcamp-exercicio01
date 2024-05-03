import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Domain.ContaTerminal;
import validatorsStrategies.DefaultValidator;
import validatorsStrategies.ValidaAgenciaComMenosDeTresNumeros;
import validatorsStrategies.ValidaContaSemNome;
import validatorsStrategies.ValidaSaldoMenorQueZero;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("digite o número da conta");
        Scanner scanner = new Scanner(System.in);
        Integer conta = scanner.nextInt();
        System.out.println("muito bem! agora digite a sua agência");
        String agencia = scanner.next();
        System.out.println("qual valor deseja depositar inicialmente?");
        Double saldo = scanner.nextDouble();
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        ContaTerminal contaCriada = new ContaTerminal(conta,agencia,nome, saldo);
        var validacao1 = new ValidaContaSemNome();
        var validacao2 = new ValidaAgenciaComMenosDeTresNumeros();
        var validacao3 = new ValidaSaldoMenorQueZero();
        List<DefaultValidator> validacoes = Arrays.asList(validacao1, validacao2, validacao3);
        if(contaCriada.contaValida(validacoes)){
            System.out.println(contaCriada.mensagemCliente());
        }
        System.out.println("fim do programa");
    }
}
