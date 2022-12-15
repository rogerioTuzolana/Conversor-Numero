package projecto_Java;

import java.io.IOException;
import java.util.*;

public class MenuConverter {

    static Scanner ler = new Scanner(System.in);
    static char origem, destino, opcao;
    static String numero, convertido, importacao;

    //Menu Conerter
    public static void Menu_Converter() {

        System.out.printf("\n\t\t\t----------------------------\n\t\t\t-  1-Conversao(B,D,H,O)    -\n\t\t\t-  2-Conversao(R,Arabe(D)) -\n\t\t\t-  3-Converter com arquivo -\n\t\t\t-  4-Voltar                -\n\t\t\t----------------------------\n\t\t\tOpcao?_");
        opcao = ler.next().charAt(0);
        switch (opcao) {
            case '1':
                //Conversao(B,D,H,O)
                //1.1 Base
                do {
                    System.out.printf("\n\t\t\tDigite a base origem: ");
                    origem = ler.next().charAt(0);
                    if (origem == 'R') {
                        System.out.print("\n\t\t\tAtt (B,D,O,H): ");
                    }

                } while (!Validacoes.baseValido(origem) || origem == 'R');
                //Número (analisar a repetição na entrada de dados)
                do {
                    System.out.printf("\n\t\t\tDigite o numero a converter: ");
                    numero = ler.next();
                    if (origem == 'R') {
                        System.out.print("\t\t\tAtt (B,D,O,H): \n");
                    }
                } while (!Validacoes.numeroValido(numero, origem) || origem == 'R');

                do {
                    System.out.printf("\n\t\t\tDigite a base destino: ");
                    destino = ler.next().charAt(0);
                } while (!Validacoes.baseValido(destino));
                //Numero convertido
                //Caso tenha erro o try permite tentar novamente
                try {
                    System.out.printf("\n\t\t\tConversao: ");

                    convertido = Conversao.converter(numero, origem, destino);
                    System.out.print(convertido + " = ");
                } //Catch captura erro e armazena numa variável ex "err2"
                //Depois da captura foi feito uma recursividade Menu_Converter() para pedir os dados novamente.
                catch (NumberFormatException err1) {
                    MenuPrincipal.limpatela();
                    System.out.println("\t\t\tNúmero extremamente grande\n");
                    Menu_Converter();

                }
                //Verifica as base para converter por extenso.
                if (origem == 'B' && destino == 'H' || origem == 'D' && destino == 'H' || origem == 'O' && destino == 'H' || origem == 'H' && destino == 'H') {
                    System.out.print(Extensaopro.exthex(convertido));
                }
                if (origem == 'B' && destino == 'D' || origem == 'O' && destino == 'D' || origem == 'H' && destino == 'D' || origem == 'D' && destino == 'D') {
                    System.out.print(Extensaopro.Extensodecimal(convertido));
                }
                if (origem == 'B' && destino == 'O' || origem == 'D' && destino == 'O' || origem == 'H' && destino == 'O' || origem == 'O' && destino == 'O') {
                    System.out.print(Extensaopro.extOctal(convertido));
                }
                if (origem == 'D' && destino == 'B' || origem == 'O' && destino == 'B' || origem == 'H' && destino == 'B' || origem == 'B' && destino == 'B') {
                    System.out.print(Extensaopro.extbin(convertido));
                }
                System.out.printf("\n\n\t\t\t---------------------\n\t\t\t- 1-Continuar       -\n\t\t\t- ()-Menu Principal -\n\t\t\t---------------------\n\t\t\tOpção?_");
                opcao = ler.next().charAt(0);
                if (opcao == '1') {
                    MenuPrincipal.limpatela();
                    Menu_Converter();
                } else {
                    MenuPrincipal.limpatela();
                    MenuPrincipal.menu();
                }
                break;

            case '2':
                //Conversao(R,Arabe(D))
                do {
                    System.out.printf("\t\t\tDigite a base origem(R ou D): ");
                    origem = ler.next().charAt(0);
                    MenuPrincipal.limpatela();
                    if (origem != 'R' || origem != 'D') {
                        System.out.print("\t\t\tAtt (R ou D): \n");
                    }
                } while (!Validacoes.baseValido(origem) || (origem == 'B' || origem == 'H' || origem == 'O'));
                //Número (analisar a repetição na entrada de dados)
                do {
                    System.out.printf("\t\t\tDigite o numero a converter: ");
                    numero = ler.next();
                } while (!Validacoes.numeroValido(numero, origem));
                do {
                    System.out.printf("\t\t\tDigite a base destino(R ou D): ");
                    destino = ler.next().charAt(0);
                    MenuPrincipal.limpatela();
                    if (origem != 'R' || origem != 'D') {
                        System.out.print("\t\t\tAtt (R ou D): \n");
                    }
                } while (!Validacoes.baseValido(destino) || (destino == 'B' || destino == 'H' || destino == 'O'));

                //Converte o numero em romano e arabe
                System.out.printf("\t\t\tConversão: ");
                if (origem == 'D') {

                    if (destino == 'R') {
                        convertido = ArabeRomano.conversaoArabe(numero, origem, destino);
                        System.out.print(convertido + " = ");
                        //Verifica as base para converter por extenso.
                        System.out.println(Extensaopro.Extensodecimal(numero));
                    }
                    if (destino == 'D') {
                        convertido = numero;
                        System.out.print(convertido + " = ");
                        //Verifica as base para converter por extenso.
                        System.out.println(Extensaopro.Extensodecimal(convertido));
                    }
                } else {

                    if (destino == 'D') {
                        convertido = ArabeRomano.conversaoRomano(numero, origem, destino);
                        System.out.print(convertido + " = ");
                        //Verifica as base para converter por extenso.
                        System.out.println(Extensaopro.Extensodecimal(convertido));
                    }
                    if (destino == 'R') {
                        convertido = ArabeRomano.conversaoRomano(numero, origem, destino);
                        System.out.print(numero + " = ");
                        //Verifica as base para converter por extenso.
                        System.out.println(Extensaopro.Extensodecimal(convertido));
                    }
                }
                System.out.printf("\n\t\t\t---------------------\n\t\t\t- 1-Continuar       -\n\t\t\t- ()-Menu Principal -\n\t\t\t---------------------\n\t\t\tOpção?_");
                opcao = ler.next().charAt(0);
                if (opcao == '1') {
                    MenuPrincipal.limpatela();
                    Menu_Converter();
                } else {
                    MenuPrincipal.limpatela();
                    MenuPrincipal.menu();
                }
                break;

            case '3':
                //Chama o metodo de importacao e exportacao
                MenuPrincipal.limpatela();
                Arquivo.ficheiro();
                Arquivo.exportar();

                if (Validacoes.vImportar(Arquivo.importacao)) {
                    System.out.println("\t\t\tArquivo guardado\n\n");
                }
                System.out.printf("\t\t\t1-Voltar_");
                opcao = ler.next().charAt(0);
                if (opcao == '1') {
                    MenuPrincipal.limpatela();
                    Menu_Converter();
                }

                break;
            case '4':
                MenuPrincipal.limpatela();
                MenuPrincipal.menu();
                break;
            default:
                MenuPrincipal.limpatela();
                Menu_Converter();

        }
    }

}
