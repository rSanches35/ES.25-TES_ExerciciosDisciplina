package br.teste.servico.senha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteSenha {

    //Critério -01. Caracteres Mínimos [8]
    @Test
    public void deveConterOitoCaracteres(){

    //Estruturas
        //DADO [PREPARAR]
        String senhaValida = "12345678";
        String senhaInvalida = "123456";

        //QUANDO [AGIR]
        ServicoSenha servicoSenha = new ServicoSenha();
        boolean resultadoValido = servicoSenha.obterValidacaoMinimoCaracteres(senhaValida);
        boolean resultadoInvalido = servicoSenha.obterValidacaoMinimoCaracteres(senhaInvalida);

        //ENTÃO [VERIFICAR]
        assertTrue(resultadoValido, "A senha deve ser Válida!");
        assertFalse(resultadoInvalido, "A senha deve ser Inválida!");
    }


    //Critério -02. Caractere Maiúsculo
    @Test
    public void deveConterCacarterMaiusculo(){

    //Estruturas
        //DADO [PREPARAR]
        String senhaValida = "Teste-senha";
        String senhaInvalida = "teste-senha";

        //QUANDO [AGIR]
        ServicoSenha servicoSenha = new ServicoSenha();
        boolean resultadoValido = servicoSenha.obterValidacaoCaractereMaiusculo(senhaValida);
        boolean resultadoInvalido = servicoSenha.obterValidacaoCaractereMaiusculo(senhaInvalida);

        //ENTÃO [VERIFICAR]
        assertTrue(resultadoValido, "A senha deve ser Válida!");
        assertFalse(resultadoInvalido, "A senha deve ser Inválida!");
    }


    //Critério -03. Caractere Minúsuclo
    @Test
    public void deveConterCacarterMinusculo(){

    //Estruturas
        //DADO [PREPARAR]
        String senhaValida = "tESTE-SENHA";
        String senhaInvalida = "TESTE-SENHA";

        //QUANDO [AGIR]
        ServicoSenha servicoSenha = new ServicoSenha();
        boolean resultadoValido = servicoSenha.obterValidacaoCaractereMinusculo(senhaValida);
        boolean resultadoInvalido = servicoSenha.obterValidacaoCaractereMinusculo(senhaInvalida);

        //ENTÃO [VERIFICAR]
        assertTrue(resultadoValido, "A senha deve ser Válida!");
        assertFalse(resultadoInvalido, "A senha deve ser Inválida!");
    }


    //Critério -04. Caractere Numérico
    @Test
    public void deveConterNumero(){

    //Estruturas
        //DADO [PREPARAR]
        String senhaValida = "senha123";
        String senhaInvalida = "senhaSemNumeros";

        //QUANDO [AGIR]
        ServicoSenha servicoSenha = new ServicoSenha();
        boolean resultadoValido = servicoSenha.obterValidacaoNumero(senhaValida);
        boolean resultadoInvalido = servicoSenha.obterValidacaoNumero(senhaInvalida);

        //ENTÃO [VERIFICAR]
        assertTrue(resultadoValido, "A senha deve ser Válida!");
        assertFalse(resultadoInvalido, "A senha deve ser Inválida!");
    }


    //Critério -05. Caractere Especial
    @Test
    public void deveConterCaractereEspecial(){

    //Estruturas
        //DADO [PREPARAR]
        String senhaValida = "Senha123%";
        String senhaInvalida = "Senha123";

        //QUANDO [AGIR]
        ServicoSenha servicoSenha = new ServicoSenha();
        boolean resultadoValido = servicoSenha.obterValidacaoCaractereEspecial(senhaValida);
        boolean resultadoInvalido = servicoSenha.obterValidacaoCaractereEspecial(senhaInvalida);

        //ENTÃO [VERIFICAR]
        assertTrue(resultadoValido, "A senha deve ser Válida!");
        assertFalse(resultadoInvalido, "A senha deve ser Inválida!");
    }

    //Critério -06. Caractere Espaço em Branco
    @Test
    public void naoDeveConterEspacoEmBranco(){

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]

        //ENTÃO [VERIFICAR]
    }
}
