package atv_etapa1_questao11;

import java.util.Random;

public interface Investimento {

    Random random = new Random();

    double realizaInvestimento(Conta conta);

}
