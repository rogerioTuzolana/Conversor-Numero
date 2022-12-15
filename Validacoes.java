package projecto_Java;

import java.util.*;

public class Validacoes {

    public static boolean vImportar(String f) {
        int cont = 0, caracter;
        for (int i = 0; i < f.length(); i++) {
            caracter = f.charAt(i);
            if (caracter == '.') {
                cont++;
            }
        }
        return (cont == 0) ? false : true;
    }

    //Caracter(.) Válido, verifica a quantidade de pontos no número

    public static boolean verPonto(String num) {
        int cont = 0, caracter;
        for (int i = 0; i < num.length(); i++) {
            caracter = num.charAt(i);
            if (caracter == '.') {
                cont++;
            }
        }
        return (cont <= 1);
    }

    //Verifica se o numero é real e separa em parte inteira e real 

    public static String verInteira(String num) {
        //Verifica se o numero é inteiro
        int caracter, tamanho;
        String numero = "";
        tamanho = num.length();
        for (int j = 0; j < tamanho; j++) {
            caracter = num.charAt(j);
            if (caracter != '.') {
                numero = numero + num.charAt(j);
            } else {
                j = tamanho;
            }
        }
        return numero;
    }

    public static String verReal(String num) {
        //Verifica se o numero é real
        int caracter;
        String numero = "";
        for (int i = 0; i < num.length(); i++) {
            caracter = num.charAt(i);
            if (caracter == '.') {
                for (int j = i + 1; j < num.length(); j++) {
                    numero = numero + num.charAt(j);
                }

            }
        }
        return numero;
    }

    //Analisar se a base e Valido

    public static boolean baseValido(char base) {
        return (base == 'B' || base == 'D' || base == 'H' || base == 'O' || base == 'R');
    }

    //Número Binário Válido

    public static boolean verB(String numero) {
        int i, caracter, aux = 0, tamanho, quant = 0;
        Scanner ler = new Scanner(System.in);
        tamanho = numero.length();
        for (i = 0; i < tamanho; i++) {
            caracter = numero.charAt(i);
            if (caracter == '1' || caracter == '0' || caracter == '.') {
                quant++;
            }
        }
        return (quant == tamanho);
    }

    //Analisar se o número e válido para uma determinada base

    public static boolean numeroValido(String num, char base) {
        return ((base == 'B') && verPonto(num) == true ? verB(num) : false) || (((base == 'D') && verPonto(num) == true) ? verD(num) : false) || ((base == 'O') ? verO(num) : false) || ((base == 'H') ? verH(num) : false) || ((base == 'R') ? verR(num) : false);
    }

    //Número Decimal Válido

    public static boolean verD(String numero) {
        String vetDecimal;
        int i, j, tamanho, tamanho2, cont = 0;
        vetDecimal = "0123456789.";

        tamanho = numero.length();
        tamanho2 = vetDecimal.length();
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho2; j++) {
                if (numero.charAt(i) == vetDecimal.charAt(j)) {
                    // Vai contar quando o numero estiver na var."0123456789"
                    cont++;
                }
            }
        }// Vai retornar verdade se o contador igualar o tamanho do número
        return (cont == tamanho);
    }

    // VALIDACAO DA BASE OCTAL 

    public static boolean verO(String numero) {
        String varOctal;
        int i, j, tamanho, tamanho2, cont = 0;
        varOctal = "01234567.";

        tamanho = numero.length();
        tamanho2 = varOctal.length();
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho2; j++) {
                if (numero.charAt(i) == varOctal.charAt(j)) {
                    // Vai contar quando o numero estiver na var."01234567"
                    cont++;
                }
            }
        }//Vai retornar verdade se o contador igualar o tamanho do número
        return (cont == tamanho);
    }

    public static boolean verH(String numero) {
        String varHexadecimal;
        int i, j, tamanho, tamanho2, cont = 0;
        varHexadecimal = "012345679ABCDEF.";
        tamanho = numero.length();
        tamanho2 = varHexadecimal.length();
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho2; j++) {
                if (numero.charAt(i) == varHexadecimal.charAt(j)) {
                    // Vai contar quando o numero estiver na var."01234567"
                    cont++;
                }
            }
        }//Vai retornar verdade se o contador igualar o tamanho do número
        return (cont == tamanho);
    }

    public static boolean verR(String numero) {
        String varRomano;
        int i, j, tamanho, tamanho2, cont = 0;
        varRomano = "IVXLCDM.";
        tamanho = numero.length();
        tamanho2 = varRomano.length();
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho2; j++) {
                if (numero.charAt(i) == varRomano.charAt(j)) {
                    // Vai contar quando o numero estiver na var."01234567"
                    cont++;
                }
            }
        }//Vai retornar verdade se o contador igualar o tamanho do número
        return (cont == tamanho);
    }

}
