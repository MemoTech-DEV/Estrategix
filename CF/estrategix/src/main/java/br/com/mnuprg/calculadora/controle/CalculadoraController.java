package br.com.mnuprg.calculadora.controle;

import br.com.mycompany.calculadora.enums.EnumOperacao;

public class CalculadoraController {

    private double total;
    private boolean primeiraOperacao = true;

    public CalculadoraController() {
        total = 0.0;
    }

    /**
     * Executa a operação indicada.
     * @param operacao   EnumOperacao (SOMA, SUBTRACAO, DIVISAO, MULTIPLICACAO)
     * @param valor      número informado pelo usuário
     * @return           novo total OU null se divisão por zero
     */
    public Double realizaOperacao(EnumOperacao operacao, Double valor) {

        // primeira chamada: apenas carrega o total com o primeiro número
        if (primeiraOperacao) {
            total = valor;
            primeiraOperacao = false;
            return total;
        }

        switch (operacao) {
            case SOMA:
                total += valor;
                break;

            case SUBTRACAO:
                total -= valor;
                break;

            case MULTIPLICACAO:
                total *= valor;
                break;

            case DIVISAO:
                if (valor != 0) {
                    total /= valor;
                } else {
                    return null;            // sinaliza erro de divisão por zero
                }
                break;
        }
        return total;
    }

    public Double getTotal() {
        return total;
    }

    public void zerar() {
        total = 0.0;
        primeiraOperacao = true;
    }
}
