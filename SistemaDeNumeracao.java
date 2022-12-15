/**
 *
 * @author Edson, Júlio, Rogério, Yuri
 */
package projecto_Java;

import java.lang.ArrayIndexOutOfBoundsException;
import java.util.*;
import static projecto_Java.MenuConverter.origem;

public class SistemaDeNumeracao {

    public static void main(String[] args) {
        try {
            String nome, convertido;
            nome = args[0];

            if (nome.equals("menu")) {
                MenuPrincipal.limpatela();
                MenuPrincipal.menu();

            } else if (args[0].equals("converter")) {

                String origem, destino, numero, conv;

                numero = args[1];
                origem = args[2];
                destino = args[3];

                char origemC, destinoC;
                origemC = origem.charAt(0);
                destinoC = destino.charAt(0);
                if (destinoC == 'R') {
                    conv = ArabeRomano.conversaoArabe(numero, origemC, destinoC);
                    System.out.println("\t\t\tConversao: " + conv);
                } else {
                    if (origemC == 'R') {
                        conv = ArabeRomano.conversaoRomano(numero, origemC, destinoC);
                        System.out.println("\t\t\tConversao: " + conv);
                    } else {
                        conv = Conversao.converter(numero, origemC, destinoC);
                        System.out.print("\t\t\tConversao: " + conv+" = ");

                            if (origemC == 'B' && destinoC == 'H' || origemC == 'D' && destinoC == 'H' || origemC == 'O' && destinoC == 'H' || origemC == 'H' && destinoC == 'H') {
                                System.out.println(Extensaopro.exthex(conv));
                            }
                            if (origemC == 'B' && destinoC == 'D' || origemC == 'O' && destinoC == 'D' || origemC == 'H' && destinoC == 'D' || origemC == 'D' && destinoC == 'D') {
                                System.out.println(Extensaopro.Extensodecimal(conv));
                            }
                            if (origemC == 'B' && destinoC == 'O' || origemC == 'D' && destinoC == 'O' || origemC == 'H' && destinoC == 'O' || origemC == 'O' && destinoC == 'O') {
                                System.out.println(Extensaopro.extOctal(conv));
                            }
                            if (origemC == 'D' && destinoC == 'B' || origemC == 'O' && destinoC == 'B' || origemC == 'H' && destinoC == 'B' || origemC == 'B' && destinoC == 'B') {
                                System.out.println(Extensaopro.extbin(conv));
                            }

                            if (origemC == 'D' && destinoC=='R') {

                                if (destinoC == 'R') {
                                    convertido = ArabeRomano.conversaoArabe(numero, origemC, destinoC);
                                    //Verifica as base para converter por extenso.
                                    System.out.println(Extensaopro.Extensodecimal(numero));
                                }
                                if (destinoC == 'D') {
                                    convertido = numero;
                                    //Verifica as base para converter por extenso.
                                    System.out.println(Extensaopro.Extensodecimal(convertido));
                                }
                            } else {

                                if (origemC=='R'&& destinoC == 'D') {
                                    convertido = ArabeRomano.conversaoRomano(numero, origemC, destinoC);
                                    //Verifica as base para converter por extenso.
                                    System.out.println(Extensaopro.Extensodecimal(convertido));
                                }
                                if (destinoC == 'R') {
                                    convertido = ArabeRomano.conversaoRomano(numero, origemC, destinoC);
                                    //Verifica as base para converter por extenso.
                                    System.out.println(Extensaopro.Extensodecimal(convertido));
                                }
                            }
                    }
                }
            } else if (args[0].equals("ajuda")) {
                System.out.println("\n\t\t\t<< Para ir no menu principal escreva <menu>como paramentro. \n\t\t\t\t**Ex: java pacote.nomePrograma <menu> \n\n\t\t\t<< Para mais informacoes escreva <ajuda> substituir o <menu> >>\n\n\t\t\t<< Para converter um numero na linha de comando de uma base tens que seguir os seguintes espacos: \n\t\t\t\t**escreva pacote.nomeProgra <converter> numero baseOrigem baseDestino >>\n\n\t\t\t<< As bases devem ser maiusculo ex:(B)\n\n\t\t\t<<Os numeros binarios sao 0 e 1 \n\n\t\t\t<< Decimais vai de 0 a 9 \n\n\t\t\t<< Numero octal vai de 0 ate 7 \n\n\t\t\t<< Hexadecimal vai de 0 a 9 e de A ate F  ");

            } else if (true) {
                System.out.println("\n\t\t\t<< Para ir no menu principal escreva <menu>como paramentro. \n\t\t\t\t**Ex: java pacote.nomePrograma <menu> \n\n\t\t\t<< Para mais informacoes escreva <ajuda> substituir o <menu> >>\n\n\t\t\t<< Para converter um numero na linha de comando de uma base tens que seguir os seguintes espacos: \n\t\t\t\t**escreva pacote.nomeProgra <converter> numero baseOrigem baseDestino >>\n\n\t\t\t<< As bases devem ser maiusculo ex:(B)\n\n\t\t\t<<Os numeros binarios sao 0 e 1 \n\n\t\t\t<< Decimais vai de 0 a 9 \n\n\t\t\t<< Numero octal vai de 0 ate 7 \n\n\t\t\t<< Hexadecimal vai de 0 a 9 e de A ate F  ");

            }

        } catch (ArrayIndexOutOfBoundsException erro1) {
            System.out.println("\n\t\t\t<< Para ir no menu principal escreva <menu>como paramentro. \n\t\t\t\t**Ex: java pacote.nomePrograma <menu> \n\n\t\t\t<< Para mais informacoes escreva <ajuda> substituir o <menu> >>\n\n\t\t\t<< Para converter um numero na linha de comando de uma base tens que seguir os seguintes espacos: \n\t\t\t\t**escreva pacote.nomeProgra <converter> numero baseOrigem baseDestino >>\n\n\t\t\t<< As bases devem ser maiusculo ex:(B)\n\n\t\t\t<<Os numeros binarios sao 0 e 1 \n\n\t\t\t<< Decimais vai de 0 a 9 \n\n\t\t\t<< Numero octal vai de 0 ate 7 \n\n\t\t\t<< Hexadecimal vai de 0 a 9 e de A ate F  ");

        }
    }
}
