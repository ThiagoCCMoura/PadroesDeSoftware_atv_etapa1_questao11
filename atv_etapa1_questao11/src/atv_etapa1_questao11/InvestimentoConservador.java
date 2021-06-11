package atv_etapa1_questao11;


public class InvestimentoConservador {

    public double realizaInvestimento(Conta conta) {
        return conta.getSaldo() * 0.008;
    }

}
