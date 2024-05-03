package validatorsStrategies;

import Domain.ContaTerminal;

public class ValidaContaSemNome implements DefaultValidator{

    @Override
    public void validate(ContaTerminal conta) {
        if(conta.getNomeCliente() == "") throw new RuntimeException("o nome do cliente deve ser preenchido");
    }
    
}
