/*
 * <<Edson Xauvunge>>.
 * <<Júlio Da Costa>>.
 * <<Rogério Tuzolana>>.
 * <<Yuri Rego>>.
 */
package projecto_Java;

import java.util.*;

public class ArabeRomano {

    public static String conversaoArabe(String num, char sOrigem, char sDestino) {

        String numInt = "", numReal = "", numeroI = "", numeroR = "";
        numInt = numInt + Validacoes.verInteira(num);
        numeroI = converterArabe(numInt);
        numReal = numReal + Validacoes.verReal(num);
        if (!numReal.equals("")) {
            numeroR = converterArabe(numReal);
        }
        return (numReal.equals("")) ? numeroI : numeroI + "." + numeroR;
    }

    public static String converterArabe(String num) {
        //declaração de variaveis
        int numero, n;
        int sobra = 0;
        String roma = "";
        numero = Integer.parseInt(num);
        // n = numero; //guarda o valor digitado
        //para 1000 ->M
        if (numero < 4000) {
            while (numero >= 1000) {
                roma += "M";
                numero -= 1000;
            }
            //para 900 ->CM
            while (numero >= 900) {
                roma += "CM";
                numero -= 900;
            }
            //para 500 -> D
            while (numero >= 500) {
                roma += "D";
                numero -= 500;
            }
            //para 400 -> CD
            while (numero >= 400) {
                roma += "CD";
                numero -= 400;
            }
            //para 100 -> C
            while (numero >= 100) {
                roma += "C";
                numero -= 100;
            }
            //para 90 -> XC
            while (numero >= 90) {
                roma += "XC";
                numero -= 90;
            }
            //para 50 -> L
            while (numero >= 50) {
                roma += "L";
                numero -= 50;
            }
            //para 40 -> XL
            while (numero >= 40) {
                roma += "XL";
                numero -= 40;
            }
            //para 10 -> X
            while (numero >= 10) {
                roma += "X";
                numero -= 10;
            }
            //para 9 -> IX
            while (numero >= 9) {
                roma += "IX";
                numero -= 9;
            }
            //para 5 -> V
            while (numero >= 5) {
                roma += "V";
                numero -= 5;
            }
            //para 4 -> IV
            while (numero >= 4) {
                roma += "IV";
                numero -= 4;
            }
            //para 1 -> I
            while (numero >= 1) {
                roma += "I";
                numero -= 1;
            }
        }
        return roma;
    }

    public static String conversaoRomano(String num, char sOrigem, char sDestino) {

        String numInt = "", numReal = "", numeroI = "", numeroR = "";
        numInt = numInt + Validacoes.verInteira(num);
        numeroI = converterRomano(numInt);
        numReal = numReal + Validacoes.verReal(num);
        if (!numReal.equals("")) {
            numeroR = converterRomano(numReal);
        }
        return (numReal.equals("")) ? numeroI : numeroI + "." + numeroR;
    }

    public static String converterRomano(String numero) {
        String rom = numero;
        int i, j, num = 0, vlr = 0;
        int arabes[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String tam[] = new String[4000];
        String romanos[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}, romano = "";
        for (j = 1; j < 4000; j++) {
            num = j;
            for (i = 0; i < 13; i++) {
                if (num >= arabes[i]) {
                    while (num >= arabes[i]) {
                        romano += romanos[i];
                        tam[j] = romano;
                        num -= arabes[i];
                    }
                }
            }
            romano = "";
        }
        for (i = 1; i < 4000; i++) {
            if (rom.equals(tam[i])) {
                vlr = i;
            }
        }

        return "" + vlr;
    }

}
