
package projecto_Java;

public class Informacoes {

    static char op;

    public static void ajuda() {
        System.out.println("\t\t\t----------------------------------------------\n\t\t\t- 1-As bases devem ser maiusculo exemplo:(B).-\n\t\t\t- 2-Os numeros binarios sao 0 e 1            -\n\t\t\t- 3-Decimais vai de 0 a 9                    -\n\t\t\t- 4-Numero octal vai de 0 ate 7              -\n\t\t\t- 5-Hexadecimal vai de 0 a 9 e de A ate F    -\n\t\t\t----------------------------------------------");
        System.out.print("\n\t\t\t1-Voltar: ");
        op = MenuConverter.ler.next().charAt(0);
        if (op == '1') {
            MenuPrincipal.limpatela();
            MenuPrincipal.menu();
        } else {
            MenuPrincipal.limpatela();
        }
        ajuda();
    }

    public static void informacao() {
        System.out.println("\t\t\t-------------------------------------------\n\t\t\t-Programa \"Conversor de sistema númerico\".\n\t\t\t-Projecto de Fundamentos de programação\n\t\t\tDensevolvido por Edson,Julio,Rogerio e Yuri.\n");
        System.out.print("\n\t\t\t1-Voltar: ");
        op = MenuConverter.ler.next().charAt(0);
        if (op == '1') {
            MenuPrincipal.limpatela();
            MenuPrincipal.menu();
        } else {
            MenuPrincipal.limpatela();
        }
        informacao();
    }
}
