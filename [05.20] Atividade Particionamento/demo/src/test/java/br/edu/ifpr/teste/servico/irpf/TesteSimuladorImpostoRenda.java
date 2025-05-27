package br.edu.ifpr.teste.servico.irpf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import imposto.renda.SimuladorImpostoRenda;

public class TesteSimuladorImpostoRenda {

    //Caso -01. Alíquota Nula
    @Test
    public void deveCalcularAliquotaNula(){

    //Estruturas
        //DADO [PREPARAR]
        double valorEntrada = 1900;
        double saidaEsperada = 0;

        //QUANDO [AGIR]
        double resultadoCalculo = SimuladorImpostoRenda.calcularImposto(valorEntrada);

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, resultadoCalculo);
    }

    //Caso -02. Alíquota de 7,5%
    @Test
    public void deveCalcularAliquota7_5(){

    //Estruturas
        //DADO [PREPARAR]
        double valorEntrada = 2350;
        double saidaEsperada = 33.45;

        //QUANDO [AGIR]
        double resultadoCalculo = SimuladorImpostoRenda.calcularImposto(valorEntrada);

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, resultadoCalculo, 0.1); //Margem de erro de 0.1
    }

    //Caso -03. Alíquota de 15%
    @Test
    public void deveCalcularAliquota15(){

    //Estruturas
        //DADO [PREPARAR]
        double valorEntrada = 3300;
        double saidaEsperada = 140.20;

        //QUANDO [AGIR]
        double resultadoCalculo = SimuladorImpostoRenda.calcularImposto(valorEntrada);

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, resultadoCalculo, 0.1); //Margem de erro de 0.1
    }

    //Caso -04. Alíquota de 22,5%
    @Test
    public void deveCalcularAliquota22_5(){

    //Estruturas
        //DADO [PREPARAR]
        double valorEntrada = 4200;
        double saidaEsperada = 308.87;

        //QUANDO [AGIR]
        double resultadoCalculo = SimuladorImpostoRenda.calcularImposto(valorEntrada);

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, resultadoCalculo, 0.1); //Margem de erro de 0.1
    }

    //Caso -05. Alíquota de 27%
    @Test
    public void deveCalcularAliquota27_5(){

    //Estruturas
        //DADO [PREPARAR]
        double valorEntrada = 5000;
        double saidaEsperada = 505.64;

        //QUANDO [AGIR]
        double resultadoCalculo = SimuladorImpostoRenda.calcularImposto(valorEntrada);

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, resultadoCalculo, 0.1); //Margem de erro de 0.1
    }
}
