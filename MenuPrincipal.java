package projecto_Java;

import java.util.Scanner;

public class MenuPrincipal {

    //Menu do programa
    public static void menu() {
        char opcao;
        Scanner ler = new Scanner(System.in);
        System.out.printf("\t\t\t**SISTEMA DE CONVERSAO**\n\t\t\t---------------------\n\t\t\t-  1-Ajuda          -\n\t\t\t-  2-Converter      -\n\t\t\t-  3-Informacao     -\n\t\t\t-  4-Sair           -\n\t\t\t---------------------\n\t\t\tOpcao: ");
        opcao = ler.next().charAt(0);
        switch (opcao) {
            case '1':
                //Ajuda
                limpatela();
                Informacoes.ajuda();
                break;
            case '2':
                //Converter
                limpatela();
                MenuConverter.Menu_Converter();
                break;
            case '3':
                //Informacao
                limpatela();
                Informacoes.informacao();
                break;
            case '4':
                for (int i = 0; i < 6; i++) {
                    limpatela();
                }
                System.out.println("\t\t\tFIM DO PROGRAMA!!!");
                break;
            default:
                limpatela();
                menu();

        }
    }

    public static void limpatela() {
        int aux = 35;
        for (int i = 0; i < aux; i++) {
            System.out.print("\n");
        }

    }
}
