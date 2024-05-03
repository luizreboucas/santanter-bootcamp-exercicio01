package Domain;

import java.util.List;

import validatorsStrategies.DefaultValidator;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;
    private Boolean ativa;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.ativa = false;
    }

    public String mensagemCliente(){
        return "olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta número " + this.numero + " e seu saldo de R$" + this.saldo + " já está disponível para saque";
    }

    public Integer getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public Boolean contaValida(List<DefaultValidator> validacoes){
        validacoes.forEach(validacao -> {
            validacao.validate(this);
        });
        return true;
    }
}
