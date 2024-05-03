package validatorsStrategies;

import Domain.ContaTerminal;

public class ValidaAgenciaComMenosDeTresNumeros implements DefaultValidator{

    @Override
    public void validate(ContaTerminal conta) {
        if(conta.getAgencia().length() < 3) throw new RuntimeException("número de agência inválido");
    }
    
}
