package br.teste.servico.avaliacao;

public class ServicoImposto {

    //Método Geral
    public static double calcularAliquota(double valorEntrada){

        //Caso -01. Alíquota Nula
        if (valorEntrada <= 1903.98){ return 0;}

        //Caso -02. Alíquota de 7,5%
        else if (valorEntrada <= 2826.65){ return ((valorEntrada * 0.075) -142.80);}

        //Caso -03. Alíquota de 15%
        else if (valorEntrada <= 3751.05){ return ((valorEntrada * 0.15) -354.80);}

        //Caso -04. Alíquota de 22,5%
        else if (valorEntrada <= 4664.68){ return ((valorEntrada * 0.225) -636.13);}

        //Caso -05. Alíquota de 27,5%
        else { return ((valorEntrada * 0.275) -869.36);}
    }
}
