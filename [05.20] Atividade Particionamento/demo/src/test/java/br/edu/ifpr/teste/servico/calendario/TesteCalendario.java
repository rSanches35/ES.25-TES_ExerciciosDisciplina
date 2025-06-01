package br.edu.ifpr.teste.servico.calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import paranavai.calendario.Calendario;

public class TesteCalendario {

    //Caso -01. P:0- Mês atual
    @Test
    public void imprimeMesAtual() throws IOException {

    //Estruturas
        //DADO [PREPARAR]
        Path path = Paths.get("src\\test\\resources\\calendario", "junho2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();
        String junho2025 = calendario.getCalendario();

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, junho2025);
    }



    //Caso -02. P:1- Valor não inteiro [ERRO]
    @Test
    public void parametro1NaoInteiroERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("Ano");
        });
    }

    //Caso -03. P:1- Valor inferior a 1 [ERRO]
    @Test
    public void parametro1inferiorERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("0");
        });
    }

    //Caso -04. P:1- Ano informado
    @Test
    public void imprimeAnoInformado() throws IOException {

    //Estruturas
        //DADO [PREPARAR]
        Path path = Paths.get("src\\test\\resources\\calendario", "ano2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();
        String ano2025 = calendario.getCalendario("2025");

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, ano2025);
    }

    //Caso -05. P:1- Valor superior a 9999 [ERRO]
    @Test
    public void parametro1superiorERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("0");
        });
    }



    //Caso -06. P:2- Valor não inteiro [ERRO]
    @Test
    public void parametro2NaoInteiroERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("2025, Mês");
        });
    }

    //Caso -07. P:2- Valor inferior a 1 [ERRO]
    @Test
    public void parametro2inferiorERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("0, 2025");
        });
    }

    //Caso -08. P:2- Mês informado
    @Test
    public void imprimeMesInformado() throws IOException {

    //Estruturas
        //DADO [PREPARAR]
        Path path = Paths.get("src\\test\\resources\\calendario", "maio2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();
        String maio2025 = calendario.getCalendario("05", "2025");

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, maio2025);
    }

    //Caso -09. P:2- Valor superior a 12 [ERRO]
    @Test
    public void parametro2superiorERRO() throws IOException {

    //Estruturas
        //DADO [PREPARAR]

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();

        //ENTÃO [VERIFICAR]
        assertThrows(IllegalArgumentException.class, () -> {
            calendario.getCalendario("13, 2025");
        });
    }

    //Caso -10. P:2- Setembro de 1752 [Caso Especial]
    @Test
    public void imprimeSetembro1752CasoEspecial() throws IOException {

    //Estruturas
        //DADO [PREPARAR]
        Path path = Paths.get("src\\test\\resources\\calendario", "setembro1752.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        //QUANDO [AGIR]
        Calendario calendario = new Calendario();
        String setembro1752 = calendario.getCalendario("09", "1752");

        //ENTÃO [VERIFICAR]
        assertEquals(saidaEsperada, setembro1752);
    }
}
