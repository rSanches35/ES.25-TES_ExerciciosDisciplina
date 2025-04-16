package br.teste.servico.senha;

public class ServicoSenha {

    //Critério -01. Caracteres Mínimos [8]
    public boolean obterValidacaoMinimoCaracteres(String senhaOriginal){

        if( senhaOriginal.length() >= 8){ return true;}
        else { return false;}
    }


    //Critério -02. Caractere Maiúsculo
    public boolean obterValidacaoCaractereMaiusculo(String senhaOriginal){

        for(int i = 0; i < senhaOriginal.length(); i ++){

            if(Character.isUpperCase(senhaOriginal.charAt(i))){ return true;}
        }
        return false;
    }


    //Critério -03. Caractere Minúsuclo
    public boolean obterValidacaoCaractereMinusculo(String senhaOriginal){

        for(int i = 0; i < senhaOriginal.length(); i ++){

            if(Character.isLowerCase(senhaOriginal.charAt(i))){ return true;}
        }
        return false;
    }


    //Critério -04. Caractere Numérico
    public boolean obterValidacaoNumero(String senhaOriginal){

        for(int i = 0; i < senhaOriginal.length(); i ++){

            if(Character.isDigit(senhaOriginal.charAt(i))){ return true;}
        }
        return false;
    }


    //Critério -05. Caractere Especial
    public boolean obterValidacaoCaractereEspecial(String senhaOriginal){

        for(int i = 0; i < senhaOriginal.length(); i ++){

            if(!Character.isLetterOrDigit(senhaOriginal.charAt(i))){ return true;}
        }
        return false;
    }


    //Critério -06. Caractere Espaço em Branco
    public boolean obterValidacaoCaractereEspaco(String senhaOriginal){

        return false;
    }
}
