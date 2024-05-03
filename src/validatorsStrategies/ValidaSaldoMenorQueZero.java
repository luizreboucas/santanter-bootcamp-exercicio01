package validatorsStrategies;

import Domain.ContaTerminal;

public class ValidaSaldoMenorQueZero implements DefaultValidator{

    @Override
    public void validate(ContaTerminal conta) {
        if (conta.getSaldo() < 0) throw new RuntimeException("não pode criar conta com saldo negativo");
    }
    
}
