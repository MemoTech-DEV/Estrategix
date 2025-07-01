package br.com.mycompany.calculadora;

import br.com.mnuprg.calculadora.visao.jFrTela;

public class Principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new jFrTela().setVisible(true));
    }
}
