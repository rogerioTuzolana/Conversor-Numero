package projecto_Java;

import java.util.*;

public class Extensaopro {
    // extenso do hexadecimal

    public static String exthex(String num) {
        int cont = num.length();
        String n = "";
        //Avalia cada caracter a sua correspondência por extenso 
        for (int i = 0; i < cont; i++) {
            if (num.charAt(i) == '0') {

                n = n + " Zero ";
            }
            if (num.charAt(i) == '1') {
                n = n + " Um ";
            }
            if (num.charAt(i) == '2') {

                n = n + " Dois ";
            }
            if (num.charAt(i) == '3') {

                n = n + " Três ";
            }
            if (num.charAt(i) == '4') {
                n = n + " Quatro ";
            }
            if (num.charAt(i) == '5') {
                n = n + " Cinco ";
            }
            if (num.charAt(i) == '6') {
                n = n + " Seis ";
            }
            if (num.charAt(i) == '7') {
                n = n + " Sete ";
            }
            if (num.charAt(i) == '8') {
                n = n + " Oito ";
            }
            if (num.charAt(i) == '9') {
                n = n + " Nove ";
            }
            if (num.charAt(i) == 'A') {
                n = n + " A ";
            }
            if (num.charAt(i) == 'B') {
                n = n + " B ";
            }
            if (num.charAt(i) == 'C') {
                n = n + " C ";
            }
            if (num.charAt(i) == 'D') {
                n = n + " D ";
            }
            if (num.charAt(i) == 'E') {
                n = n + " E ";
            }
            if (num.charAt(i) == 'F') {
                n = n + " F ";
            }
            if (num.charAt(i) == '.') {
                n = n + "Vírgula";
            }

        }

        return n;
    }

    //EXTENSO DOS OCTAL
    public static String extOctal(String num) {
        String n = "";
        int cont = num.length();

        //Avalia cada caracter a sua correspondência por extenso 
        for (int i = 0; i < cont; i++) {
            if (num.charAt(i) == '0') {
                n = n + " Zero ";
            }
            if (num.charAt(i) == '1') {
                n = n + " Um ";
            }
            if (num.charAt(i) == '2') {
                n = n + " Dois ";
            }
            if (num.charAt(i) == '3') {
                n = n + " Tres ";
            }
            if (num.charAt(i) == '4') {
                n = n + " Quatro ";
            }
            if (num.charAt(i) == '5') {
                n = n + " Cinco ";
            }
            if (num.charAt(i) == '6') {
                n = n + " Seis ";
            }
            if (num.charAt(i) == '7') {
                n = n + " Sete ";
            }
            if (num.charAt(i) == '.') {
                n = n + " Virgula ";
            }
        }

        return n;
    }
    //FIM..

    // EXTENSO DOS BINARIOS
    public static String extbin(String num) {

        int cont = num.length();
        String zero = " Zero ";
        String um = " Um ";
        String numero = "";
        for (int i = 0; i < cont; i++) {
            if (num.charAt(i) == '0') {
                numero = numero + zero;
            } else {
                if (num.charAt(i) == '1') {
                    numero = numero + um;
                } else {
                    if (num.charAt(i) == '.') {
                        numero = numero + " virgula ";
                    }
                }
            }
        }
        return numero;
    }

    //FIM....
    // por extenso dos decimais
    public static String Extensodecimal(String numero) {
        String numInt = "", numReal = "";
        numInt = Validacoes.verInteira(numero);
        numReal = Validacoes.verReal(numero);

        return (numReal.equals("")) ? Extdecimal(numInt) : Extdecimal(numInt) + " Virgula " + Extdecimal(numReal);
    }
    // inicio

    public static String Dascentenas(int num) {
        String unidades[] = {"zero", "Um", "Dois ", "Tres ", "Quatro ", "Cinco ", "Seis ", "Sete ", "Oito ", "Nove "};
        String dezenas[] = {"Dez", "Onze", "Doze", "Treze", "Catorze", "Quinze", "Dezaceis", "Dezacete", "Dezoito", "Dezanove"};
        String dezenas2[] = {" ", " ", "Vinte", "Trinta", "Quarenta", "Cinqueta", "Sesenta", "Setenta", "Oitenta", "Noventa"};
        String centenas[] = {"", "Cem", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setesentos", "Oitocentos", "Novecentos"};
        String milenos[] = {"Mil"};
        String milenar = "Mil";
        String p1 = "";
        if (num > 99 && num < 1000) {
            int vercent = (num / 100);//recebe 230/100 ficara 2
            int dec = num % 100;//recbe por ex:.230%100 ficara 30
            int dec1 = dec / 10;//recebe 30/10  ficara 3
            int unid = dec % 10;//recbe neste caso 0
            if (vercent >= 1 && vercent <= 9) {
                if (vercent == 1) {
                    if (dec == 0) {
                        p1 = centenas[vercent];
                    } else {
                        if (dec >= 1 && dec <= 9) {
                            p1 = centenas[vercent] + "to e " + unidades[dec];
                        } else {
                            if (dec >= 10 && dec <= 19) {
                                p1 = centenas[vercent] + "to e " + dezenas[dec - 10];
                            } else {
                                if (dec >= 20 && dec <= 99) {
                                    if (unid == 0) {
                                        p1 = centenas[vercent] + "to e " + dezenas2[dec1];
                                    } else {
                                        if (unid >= 1 && unid <= 9) {
                                            p1 = centenas[vercent] + "to e " + dezenas2[dec1] + " e " + unidades[unid];
                                        }
                                    }
                                }
                            }
                        }
                    }

                } else {
                    if (dec == 0) {
                        p1 = centenas[vercent];
                    } else {
                        if (dec >= 1 && dec <= 9) {

                            p1 = centenas[vercent] + " e " + unidades[dec];
                        } else {
                            if (dec >= 10 && dec <= 19) {

                                p1 = centenas[vercent] + " e " + dezenas[dec - 10];
                            } else {
                                if (dec >= 20 && dec <= 99) {
                                    if (unid == 0) {

                                        p1 = centenas[vercent] + " e " + dezenas2[dec1];
                                    } else {
                                        if (unid >= 1 && unid <= 9) {
                                            p1 = centenas[vercent] + " e " + dezenas2[dec1] + " e " + unidades[unid];
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }

        }

        return p1;
    }

    //fim...
    public static String Extdecimal(String numero) {

        String retorno2 = "";

        int num = 0;
        {
            num = Integer.parseInt(numero.toString());
            int mile, ult;
            int mile1;
            int cent, dec, unid;
            int cent2, dec1;
            // fim...

            int vercent;

            //descrisao dos vetores que guardam as undades
            String unidades[] = {"zero", "Um", "Dois ", "Tres ", "Quatro ", "Cinco ", "Seis ", "Sete ", "Oito ", "Nove "};
            String dezenas[] = {"Dez", "Onze", "Doze", "Treze", "Catorze", "Quinze", "Dezaceis", "Dezacete", "Dezoito", "Dezanove"};
            String dezenas2[] = {" ", " ", "Vinte", "Trinta", "Quarenta", "Cinqueta", "Sesenta", "Setenta", "Oitenta", "Noventa"};
            String centenas[] = {"", "Cem", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setesentos", "Oitocentos", "Novecentos"};
            String milenos[] = {"Mil"};
            String milenar = "Mil";
            //fim...
            String conju;

            // cover sao de zero a 9
            if (num >= 0 && num <= 9) {
                vercent = num;
                //System.out.print(unidades[vercent]);
                retorno2 = unidades[vercent];
            }
            //fim

            // verifiacar se um dado numero e uma unidades2 ou seja de 10 19
            if (num >= 10 && num <= 19) {
                vercent = (num - 10);

                retorno2 = dezenas[vercent];
            }
            //fim...

            //verificacao da dezena
            if (num >= 20 && num <= 99) {
                vercent = num / 10;
                dec = num % 10;
                if (dec == 0) {

                    retorno2 = dezenas2[vercent];
                } else {
                    retorno2 = dezenas2[vercent] + " e " + unidades[dec];
                }
            }
            //fim..

            //verificar se um determinado numero e uma centena de  
            // verifiacao das centenas 
            if (num > 99 && num < 1000) {
                vercent = (num / 100);//recebe 230/100 ficara 2
                dec = num % 100;//recbe por ex:.230%100 ficara 30
                dec1 = dec / 10;//recebe 30/10  ficara 3
                unid = dec % 10;//recbe neste caso 0

                if (vercent >= 1 && vercent <= 9) {
                    if (vercent == 1) {
                        if (dec == 0) {
                            retorno2 = centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = centenas[vercent] + "to e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = centenas[vercent] + "to e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {
                                            retorno2 = centenas[vercent] + "to e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                retorno2 = centenas[vercent] + "to e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        if (dec == 0) {
                            retorno2 = centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {

                                retorno2 = centenas[vercent] + " e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {

                                    retorno2 = centenas[vercent] + " e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {

                                            retorno2 = centenas[vercent] + " e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                retorno2 = centenas[vercent] + " e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

            }

            //fim.............
            // CONVERSAO DE 10000 OU SEJA O LIMITE
            if (num == 100000000) {
                // System.out.println("DEZ MIL");
                retorno2 = "UM MILHAO";
            }
            //FIM......

            if (num >= 999 && num < 10000) {
                // SUPONHAMOS QUE TEMOS COMO VALOR DE num=1251
                mile = num / 1000;//o primeiro digito 1251 retira 1
                mile1 = num % 1000;//parte das centenas 251
                dec = mile1;// recebe 251
                dec1 = mile1 / 100; //recebe 2
                cent = dec % 100;//recebe 51
                unid = cent / 10;//recebe 5
                ult = cent % 10;//recebe 1
                if (mile == 1) {
                    if (mile1 == 0) {
                        //System.out.print(milenar);
                        retorno2 = milenar;
                    } else {
                        if (dec >= 1 && dec <= 9) {
                            //System.out.print(milenar+" e "+unidades[dec]);
                            retorno2 = milenar + " e " + unidades[dec];
                        } else {
                            if (dec >= 10 && dec <= 19) {
                                //System.out.print(milenar+" e "+dezenas[dec-10]);
                                retorno2 = milenar + " e " + dezenas[dec - 10];
                            } else {
                                if (dec > 19 && dec <= 99) {
                                    if (ult == 0) {
                                        //System.out.print(milenar+" e "+dezenas2[unid]);
                                        retorno2 = milenar + " e " + dezenas2[unid];
                                    } else {
                                        //System.out.print(milenar+" e "+dezenas2[unid]+" e "+unidades[ult]);
                                        retorno2 = milenar + " e " + dezenas2[unid] + " e " + unidades[ult];
                                    }

                                } else {
                                    if (dec >= 100 && dec < 1000) {
                                        if (dec == 100) {
                                            //System.out.print(milenar+" e "+centenas[dec1]);
                                            retorno2 = milenar + " e " + centenas[dec1];
                                        } else {
                                            if (dec > 100 && dec <= 999) {
                                                if (cent >= 1 && cent <= 9) {
                                                    //System.out.print(milenar+" e "+centenas[dec1]+"to e "+unidades[cent]);
                                                    retorno2 = milenar + " e " + centenas[dec1] + "to e " + unidades[cent];
                                                } else {
                                                    if (cent >= 10 && cent <= 19) {
                                                        //System.out.print(milenar+" e "+centenas[dec1]+"to e "+dezenas[cent-10]);
                                                        retorno2 = milenar + " e " + centenas[dec1] + "to e " + dezenas[cent - 10];
                                                    } else {
                                                        if (cent > 19 && cent < 100) {
                                                            if (ult == 0) {//System.out.print(milenar+" e "+centenas[dec1]+"to  e "+dezenas2[unid]);
                                                                retorno2 = milenar + " e " + centenas[dec1] + "to  e " + dezenas2[unid];
                                                            } else {
                                                                //System.out.print(milenar+" e "+centenas[dec1]+"  e "+dezenas2[unid]+" e "+unidades[ult]);
                                                                retorno2 = milenar + " e " + centenas[dec1] + "  e " + dezenas2[unid] + " e " + unidades[ult];
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }//
                                }
                            }
                        }
                    }
                    // coversao dos numero 2000 ate 9999
                } else {
                    if (mile >= 2 && mile <= 9) {
                        if (mile1 == 0) {
                            retorno2 = unidades[mile] + milenar;
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = unidades[mile] + milenar + " e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = unidades[mile] + milenar + " e " + dezenas[dec - 10];
                                } else {
                                    if (dec > 19 && dec <= 99) {
                                        if (ult == 0) {
                                            // System.out.print(unidades[mile]+milenar+" e "+dezenas2[unid]);
                                            retorno2 = unidades[mile] + milenar + " e " + dezenas2[unid];
                                        } else {
                                            // System.out.print(unidades[mile]+milenar+" e "+dezenas2[unid]+" e "+unidades[ult]);
                                            retorno2 = unidades[mile] + milenar + " e " + dezenas2[unid] + " e " + unidades[ult];
                                        }

                                    } else {
                                        if (dec >= 100 && dec < 1000) {
                                            if (dec == 100) {
                                                //System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]);
                                                retorno2 = unidades[mile] + milenar + " e " + centenas[dec1];
                                            } else {
                                                if (dec > 100 && dec <= 999) {
                                                    if (cent >= 1 && cent <= 9) {
                                                        //  System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]+"to e "+unidades[cent]);
                                                        retorno2 = unidades[mile] + milenar + " e " + centenas[dec1] + "to e " + unidades[cent];
                                                    } else {
                                                        if (cent >= 10 && cent <= 19) {
                                                            //System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]+" e "+dezenas[cent-10]);
                                                            retorno2 = unidades[mile] + milenar + " e " + centenas[dec1] + " e " + dezenas[cent - 10];
                                                        } else {
                                                            if (cent > 19 && cent < 100) {
                                                                if (ult == 0) {//System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]+"  e "+dezenas2[unid]);
                                                                    retorno2 = unidades[mile] + milenar + " e " + centenas[dec1] + "  e " + dezenas2[unid];
                                                                } else {
                                                                    if (dec1 == 1) {
                                                                        //System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]+"to  e "+dezenas2[unid]+" e "+unidades[ult]);
                                                                        retorno2 = unidades[mile] + milenar + " e " + centenas[dec1] + "to  e " + dezenas2[unid] + " e " + unidades[ult];
                                                                    } else {
                                                                        //System.out.print(unidades[mile]+milenar+" e "+centenas[dec1]+"  e "+dezenas2[unid]+" e "+unidades[ult]);
                                                                        retorno2 = unidades[mile] + milenar + " e " + centenas[dec1] + "  e " + dezenas2[unid] + " e " + unidades[ult];
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }

                    }
                }

            }

            if (num > 10000 && num < 20000) {
                //por exemplo se tivermos 12345
                int pri = num / 1000;//retira  12
                int sec = num % 1000; //retira 345
                vercent = (sec / 100);//recebe 230/100 ficara 2
                dec = sec % 100;//recbe por ex:.230%100 ficara 30
                dec1 = dec / 10;//recebe 30/10  ficara 3
                unid = dec % 10;//recbe neste caso 0

                if (vercent >= 1 && vercent <= 9) {
                    if (vercent == 1) {
                        if (dec == 0) {
                            retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + "to e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + "to e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {
                                            retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + "to e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                //System.out.print(dezenas[pri-10]+milenar+" e "+centenas[vercent]+"to e "+dezenas2[dec1]+" e "+unidades[unid]);
                                                retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + "to e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        if (dec == 0) {
                            retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + " e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + " e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {
                                            retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + " e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                retorno2 = dezenas[pri - 10] + milenar + " e " + centenas[vercent] + " e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

            }
            //CONVERSAO DOS NUMEROS DE 100000 ATE 999999
            if (num >= 100000 && num <= 999999) {
                int parte1 = num / 1000;
                int parte2 = num % 1000;
                String a = Dascentenas(parte1);
                String b = Dascentenas(parte2);
                retorno2 = a + milenar + " e " + b;
            }//FIM..
            if (num >= 20000 && num < 100000) {
                //por exemplo se tivermos 23452
                int pri = num / 1000;//retira  12
                int pri2 = pri / 10;//retira 1
                int pri3 = pri % 10;//retira 2
                int sec = num % 1000; //retira 345
                vercent = (sec / 100);//recebe 230/100 ficara 2
                dec = sec % 100;//recbe por ex:.230%100 ficara 30
                dec1 = dec / 10;//recebe 30/10  ficara 3
                unid = dec % 10;//recbe neste caso 0

                if (vercent >= 1 && vercent <= 9) {
                    if (vercent == 1) {
                        if (dec == 0) {
                            retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + "to e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + "to e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {
                                            retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + "to e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + "to e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        if (dec == 0) {
                            retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent];
                        } else {
                            if (dec >= 1 && dec <= 9) {
                                retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + " e " + unidades[dec];
                            } else {
                                if (dec >= 10 && dec <= 19) {
                                    retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + " e " + dezenas[dec - 10];
                                } else {
                                    if (dec >= 20 && dec <= 99) {
                                        if (unid == 0) {
                                            retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + " e " + dezenas2[dec1];
                                        } else {
                                            if (unid >= 1 && unid <= 9) {
                                                retorno2 = dezenas2[pri2] + " e " + unidades[pri3] + milenar + " e " + centenas[vercent] + " e " + dezenas2[dec1] + " e " + unidades[unid];
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

            }
            //fim...

        }

        System.out.print("");
        return retorno2;
    }
    ///FIM...
}
