package projecto_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Arquivo {

    static char origem[], destino[];
    static int tamanho;
    static String numero[], extensao, convertido[], importacao;
    static Scanner leia = new Scanner(System.in);

    public static boolean importar(String f) throws IOException {
        if (Validacoes.vImportar(f) == false) {
            f = f + ".num";
        }
        try {
            //Escrita do ficheiro
            FileWriter arquivo = new FileWriter("C:/Users/julio manuel/Desktop/" + f);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            //Lê a quantidade de números a converter
            System.out.printf("\t\t\t<<Quantidade de numeros a converter: >>");
            tamanho = leia.nextInt();
            origem = new char[tamanho];
            destino = new char[tamanho];
            numero = new String[tamanho];
            for (int i = 0; i < tamanho; i++) {
                //Leitura da base do numero a ser convertido
                System.out.printf("\t\t\t" + (i + 1) + "-Origem: ");
                origem[i] = leia.next().charAt(0);
                //Verifica se a base existe
                while (!Validacoes.baseValido(origem[i])) {
                    origem[i] = leia.next().charAt(0);
                }
                //Número a converter
                System.out.printf("\t\t\t" + (i + 1) + "-Numero: ");
                numero[i] = leia.next();
                while (!Validacoes.numeroValido(numero[i], origem[i])) {
                    numero[i] = leia.next();
                }
                //Base a ser convertido
                System.out.print("\t\t\t" + (i + 1) + "-Destino: ");
                destino[i] = leia.next().charAt(0);
                //Verifica se a base a ser convertida existe.
                while (!Validacoes.baseValido(destino[i])) {
                    destino[i] = leia.next().charAt(0);
                }
            }
            //Escreve os dados no arquivo(.txt)
            for (int i = 0; i < tamanho; i++) {
                escrever.write("(" + numero[i] + ")" + origem[i] + "=(?)" + destino[i]);
                //Depois da primeira impressão o newLine quebra linha
                escrever.newLine();
            }
            //Depois da escrevta fecha-se todas as conexões.
            escrever.close();
            arquivo.close();

            //Leitura do ficheiro
            String conteudo = "";
            FileReader ler = new FileReader("C:/Users/julio manuel/Desktop/" + f);
            BufferedReader Bler = new BufferedReader(ler);
            MenuPrincipal.limpatela();
            System.out.print("\t\t\t1-Ver o ficheiro\n\t\t\t_Continuar\n\t\t\topcao:\n\t\t\t");
            MenuConverter.opcao = MenuConverter.ler.next().charAt(0);
            if (MenuConverter.opcao == '1') {
                //ready lê enquanto tiver linhas.
                MenuPrincipal.limpatela();
                while (Bler.ready()) {
                    //lê a proxima linha
                    conteudo = Bler.readLine();
                    System.out.println("\t\t\t" + conteudo);
                }
                ler.close();
                Bler.close();

            }

            return true;
        } //Catch capta o tipo de erro e recebe instruções para evitar a paragem do programa
        catch (Exception e1) {
            System.out.println("\n\t\t\tErro de excepcao: ");
            ficheiro();
            return false;
        }

    }

    public static void exportar() {

        System.out.print("\n\t\t\tDigite o nome do ficheiro para exportar e a sua extensao exemplo(.txt): ");
        extensao = leia.next();
        if (Validacoes.vImportar(extensao) == false) {
            extensao = extensao + ".num";
        }

        try {
            FileWriter arq = new FileWriter("C:/Users/julio manuel/Desktop/" + extensao);
            BufferedWriter mostrar = new BufferedWriter(arq);
            //Escreve os dados no arquivo(.txt)
            for (int i = 0; i < tamanho; i++) {

                if (origem[i] == 'D' && destino[i] == 'R') {
                    mostrar.write("(" + numero[i] + ")" + origem[i] + "=(" + ArabeRomano.conversaoArabe(numero[i], origem[i], destino[i]) + ")" + destino[i]);
                    String n = numero[i];
                    mostrar.write("=" + Extensaopro.Extensodecimal(n));
                } else {
                    if (origem[i] == 'R' && destino[i] == 'D') {
                        String num = ArabeRomano.conversaoRomano(numero[i], origem[i], destino[i]);
                        mostrar.write("(" + numero[i] + ")" + origem[i] + "=(" + ArabeRomano.conversaoRomano(numero[i], origem[i], destino[i]) + ")" + destino[i]);
                        mostrar.write("=" + Extensaopro.Extensodecimal(num));

                    } else {
                        mostrar.write("(" + numero[i] + ")" + origem[i] + "=(" + Conversao.converter(numero[i], origem[i], destino[i]) + ")" + destino[i]);
                        if (origem[i] == 'B' && destino[i] == 'H' || origem[i] == 'D' && destino[i] == 'H' || origem[i] == 'O' && destino[i] == 'H') {
                            String n = Conversao.converter(numero[i], origem[i], destino[i]) + ")" + destino[i];
                            mostrar.write("=" + Extensaopro.exthex(n));
                        }
                        if (origem[i] == 'B' && destino[i] == 'D' || origem[i] == 'O' && destino[i] == 'D' || origem[i] == 'H' && destino[i] == 'D') {
                            String n = Conversao.converter(numero[i], origem[i], destino[i]);
                            mostrar.write("=" + Extensaopro.Extensodecimal(n));

                        }
                        if (origem[i] == 'B' && destino[i] == 'O' || origem[i] == 'D' && destino[i] == 'O' || origem[i] == 'H' && destino[i] == 'O') {
                            String n = Conversao.converter(numero[i], origem[i], destino[i]) + ")" + destino[i];
                            mostrar.write("=" + Extensaopro.extOctal(n));
                        }
                        if (origem[i] == 'D' && destino[i] == 'B' || origem[i] == 'O' && destino[i] == 'B' || origem[i] == 'H' && destino[i] == 'B') {
                            String n = Conversao.converter(numero[i], origem[i], destino[i]) + ")" + destino[i];
                            mostrar.write("=" + Extensaopro.extbin(n));
                        }
                    }
                }
                //Depois da primeira impressão o newLine quebra linha
                mostrar.newLine();
            }
            //Depois de escrever, fecha-se todas as conexões.
            mostrar.close();
            arq.close();

            //Leitura do ficheiro
            String conteudo = "";
            FileReader ler = new FileReader("C:/Users/julio manuel/Desktop/" + extensao);
            BufferedReader Bler = new BufferedReader(ler);
            MenuPrincipal.limpatela();
            System.out.print("\t\t\t1-Ver o ficheiro\n\t\t\t_Continuar\n\t\t\topcao:\n\t\t\t");
            MenuConverter.opcao = MenuConverter.ler.next().charAt(0);
            if (MenuConverter.opcao == '1') {
                //ready permite escrever enquanto tiver linhas.
                MenuPrincipal.limpatela();
                while (Bler.ready()) {
                    //lê a proxima linha
                    conteudo = Bler.readLine();

                    System.out.println("\t\t\t" + conteudo);
                }
                ler.close();
                Bler.close();
            }
        } catch (Exception e2) {
            System.out.println("\t\t\tErro de excepcao: ");

        }
    }

    public static void ficheiro() {
        try {
            System.out.printf("\t\t\tDigite o nome do ficheiro para importar e a sua extensao exemplo(.txt): ");
            do {
                boolean v = true;

                importacao = leia.next();
                //Verifica se o nome do ficheiro tem extensão, caso não tenha ela pede para ler novamente.
                if (true == Validacoes.vImportar(importacao) || false == importar(importacao)) {
                    //Importa o conteudo lido no ficheiro 
                    importar(importacao);
                }
            } while (false);

        } catch (IOException ex) {
            ficheiro();
        }

    }
}
