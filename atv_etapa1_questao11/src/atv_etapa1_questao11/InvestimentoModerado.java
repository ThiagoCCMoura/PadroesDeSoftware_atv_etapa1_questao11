package atv_etapa1_questao11;

public class InvestimentoModerado implements Investimento{

    public double realizaInvestimento(Conta conta) {
        if ( random.nextBoolean() ){
            return conta.getSaldo() * 0.007;
        }
        return conta.getSaldo() * 0.025 ;
    }

}
