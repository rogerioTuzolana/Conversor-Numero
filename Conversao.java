
package projecto_Java;
import java.util.*;
import java.lang.NumberFormatException;

import static java.lang.Math.pow;
public class Conversao {
    
    public static String octalDecimal(String num){
        int numero,numero1, restoI=0,restoR=0,octalI=0,tamanho;
        double i=0;float octalR=0;
        //Verifica se o numero é inteiro
       String numInt="";
        numInt=Validacoes.verInteira(num);
        //Parte Inteira Octal para decimal (i) é o da base 2, começa do 0 até o tamanho do número
        numero=Integer.parseInt(numInt);
        while(numero>0){
        restoI=numero%10;
        octalI=(int) (restoI*pow(8,i)+octalI);
        i++;
        numero=numero/10;
        }
        //Parte Real Octal para decimal (i) é o da base 2, começa do 0 até o tamanho do número
        String numReal="";
        numReal=Validacoes.verReal(num);
        if(numReal!=""){
        numero1=Integer.parseInt(numReal);
        tamanho=-numReal.length();
        while(numero1>0){
        restoR=numero1%10;
        octalR=(float) (restoR*pow(2,tamanho)+octalR);
        tamanho++;
        numero1=numero1/10;
        }
        }
        String juntaS="",real="";int caracter;
        juntaS=juntaS+octalR;
        for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           real=real+juntaS.charAt(t);
                       }
                    }
                }
        String num1="",num2=".";
        num1=num1+octalI;
        num2=num2+real;
  
    return (octalR>0)? num1+num2:num1;
    }
    public static String hexaDecimal(String num){
        String numero;
        numero=hexparaBinario(num);
        num=binarioDecimal(numero);
        return num;
    }
    public static String HexaOctal(String num){
        String numero;
        //A variavel recebe o numero passado na função de hexadecimal para binaria
        numero=hexparaBinario(num);
        //A variavel num recebe a conversão de binario para octal
        num=binarOctal(numero);
        return num;
    }
    
    public static String octalHexa(String num){
        String numero;
        //A variavel recebe o numero passado na função de octal para binaria
        numero=octalBinario(num);
        num=binarioHexa(numero);
        return num;
    }
    public static String binarOctal(String num){
        //A variavel num vai receber conversão de binário para decimal.
        String numero;
        numero=binarioDecimal(num);
        ArrayList <Integer> oct=new ArrayList<>();
        //Decimal para Octal
        int numero1,resto=0,i=0;
        
        //Parte Inteira
        String octal1="",numInt="";
        numInt=Validacoes.verInteira(numero);
        numero1=Integer.parseInt(numInt);
        while(numero1>0){
        resto=numero1%8;
        //ArrayList inteiro recebe os numeros octal e organiza
        oct.add(i,resto);
        numero1=numero1/8;
        }
        //Variavel string recebe os numeros octal dentro do ArrayList
        for(i=0;i<oct.size();i++){
            octal1=octal1+oct.get(i);
        }
        //Parte Real Decimal para octal numReal recebe a concatenação de 0. + o valor que é chamado pela recursividade
        String octal2="",numReal="0.";
        numReal=numReal+Validacoes.verReal(numero);
        double seReal;
        seReal=Double.parseDouble(numReal); 
        //Verificação Real
        
        double numero2=0;int caracter,it=0;
        String juntaS="",ver="",inteiroZero="0.";int r=0;
            int n2;
            numero2=Double.parseDouble(numReal);
            
            while(r<5){
                //A variavel it faz casting para receber a parte inteira no número e a v. octal guara a coversão
                numero2=numero2*8;
                it=(int)numero2;
                octal2=octal2+it;
                juntaS=juntaS+numero2;
                //Verificação que valida a multipl. num*8 para que próxima iteração a parte inteira seje ser Zero
                for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           inteiroZero=inteiroZero+juntaS.charAt(t);
                       }
                    }
                }
                numero2=Double.parseDouble(inteiroZero);
                //Verificação que valida depois de zera a parte int se a parte real é zero para que pare prematuramente a condição do while(r<0) 
                for(int j=0;j<inteiroZero.length();j++){
                    caracter=inteiroZero.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<inteiroZero.length();t++){
                           ver=ver+inteiroZero.charAt(t); 
                       }
                    }
                }
                n2=Integer.parseInt(ver);
                inteiroZero="0.";
                juntaS="";
                ver="";
                if(n2==0)
                    r=6;
                else
                    r++;   
            }
        String numReal1="",numInt1="";
        numReal1=""+octal1+"."+octal2;
        numInt1=""+octal1;
        return (seReal>0)? numReal1:numInt1;
    }
    
    public static String binarioHexa(String num){
        String numero;
        numero=binarioDecimal(num);
        ArrayList <Integer> hex=new ArrayList<>();
        //Decimal para Hexadecimal
        int numero1,resto=0,i=0;
        //Parte Inteira
        String hexa1="",numInt="";
        numInt=Validacoes.verInteira(numero);
        numero1=Integer.parseInt(numInt);
        while(numero1>0){
        resto=numero1%16;
        //ArrayList inteiro recebe os numeros hexa e organiza
        hex.add(i,resto);
        numero1=numero1/16;
        }
        
        //Variavel string recebe os numeros hexas dentro do ArrayList
        for(i=0;i<hex.size();i++){
            if(hex.get(i)==10)
            hexa1=hexa1+'A';
            else
                if(hex.get(i)==11)
                hexa1=hexa1+'B';
            else
                if(hex.get(i)==12)
                hexa1=hexa1+'C';
            else
                if(hex.get(i)==13)
                hexa1=hexa1+'D';
            else
                if(hex.get(i)==14)
                hexa1=hexa1+'E';
            else
                if(hex.get(i)==15)
                hexa1=hexa1+'F';
            else
            hexa1=hexa1+hex.get(i);
        }

        //Parte Real Decimal para hexal numReal recebe a concatenação de 0. + o valor que é chamado pela recursividade
        String hexa2="",numReal="0.";
        numReal=numReal+Validacoes.verReal(numero);
        double seReal;
        seReal=Double.parseDouble(numReal);
        //Verificação Real
        double numero2=0;int caracter,it=0;
        String juntaS="",ver="",inteiroZero="0.";int r=0;
            int n2;
            numero2=Double.parseDouble(numReal);
            while(r<5){
                //A variavel it faz casting para receber a parte inteira no número e a v. hexal guarda a conversão
                numero2=numero2*16;
                it=(int)numero2;
                
                if(it==10){hexa2=hexa2+'A'; }
                else
                    if(it==11){hexa2=hexa2+'B';}
                else
                    if(it==12){hexa2=hexa2+'C';}
                else
                    if(it==13){hexa2=hexa2+'D';}
                else
                    if(it==14){hexa2=hexa2+'E';}
                else
                    if(it==15){hexa2=hexa2+'F';}
                else{hexa2=hexa2+it;}
                
                juntaS=juntaS+numero2;
                //Verificação que valida a multipl. num*16 para que próxima iteração a parte inteira seje ser Zero
                for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           inteiroZero=inteiroZero+juntaS.charAt(t);
                       }
                    }
                }
                numero2=Double.parseDouble(inteiroZero);
                //Verificação que valida depois de zera a parte int se a parte real é zero para que pare prematuramente a condição do while(r<0) 
                for(int j=0;j<inteiroZero.length();j++){
                    caracter=inteiroZero.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<inteiroZero.length();t++){
                           ver=ver+inteiroZero.charAt(t); 
                       }
                    }
                }
                n2=Integer.parseInt(ver);
                inteiroZero="0.";
                juntaS="";
                ver="";
                if(n2==0)
                    r=6;
                else
                    r++;   
            }
        String numReal1="",numInt1="";
        numReal1=""+hexa1+"."+hexa2;
        numInt1=""+hexa1;
        return (seReal>0)? numReal1:numInt1;
    }
    
    public static String decimalHexa(String num){
        ArrayList <Integer> hex=new ArrayList<>();
        //Decimal para Octal
        int numero1,resto=0,i=0;
        //Parte Inteira
        String hexa1="",numInt="";
        numInt=Validacoes.verInteira(num);
        numero1=Integer.parseInt(numInt);
        while(numero1>0){
        resto=numero1%16;
        //ArrayList inteiro recebe os numeros hexa e organiza
        hex.add(i,resto);
        numero1=numero1/16;
        }
        //Variavel string recebe os numeros hexas dentro do ArrayList
        for(i=0;i<hex.size();i++){
            if(hex.get(i)==10)
            hexa1=hexa1+'A';
            if(hex.get(i)==11)
            hexa1=hexa1+'B';
            if(hex.get(i)==12)
            hexa1=hexa1+'C';
            if(hex.get(i)==13)
            hexa1=hexa1+'D';
            if(hex.get(i)==14)
            hexa1=hexa1+'E';
            if(hex.get(i)==15)
            hexa1=hexa1+'F';
            else
            hexa1=hexa1+hex.get(i);
        }
        //Parte Real Decimal para hexal numReal recebe a concatenação de 0. + o valor que é chamado pela recursividade
        String hexa2="",numReal="0.";
        numReal=numReal+Validacoes.verReal(num);
        
        //Verificação Real
        double numero2=0;int caracter,it=0;
        String juntaS="",ver="",inteiroZero="0.";int r=0;
            int n2;
            numero2=Double.parseDouble(numReal);
            while(r<14){
                //A variavel it faz casting para receber a parte inteira no número e a v. hexal guarda a conversão
                numero2=numero2*16;
                it=(int)numero2;
                
                if(it==10){hexa2=hexa2+'A'; }
                else
                    if(it==11){hexa2=hexa2+'B';}
                else
                    if(it==12){hexa2=hexa2+'C';}
                else
                    if(it==13){hexa2=hexa2+'D';}
                else
                    if(it==14){hexa2=hexa2+'E';}
                else
                    if(it==15){hexa2=hexa2+'F';}
                else{hexa2=hexa2+it;}
                
                juntaS=juntaS+numero2;
                //Verificação que valida a multipl. num*16 para que próxima iteração a parte inteira seje ser Zero
                for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           inteiroZero=inteiroZero+juntaS.charAt(t);
                       }
                    }
                }
                numero2=Double.parseDouble(inteiroZero);
                //Verificação que valida depois de zera a parte int se a parte real é zero para que pare prematuramente a condição do while(r<0) 
                for(int j=0;j<inteiroZero.length();j++){
                    caracter=inteiroZero.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<inteiroZero.length();t++){
                           ver=ver+inteiroZero.charAt(t); 
                       }
                    }
                }
                n2=Integer.parseInt(ver);
                inteiroZero="0.";
                juntaS="";
                ver="";
                if(n2==0)
                    r=6;
                else
                    r++;   
            }
        
        String numReal1="",numInt1="";
        numReal1=""+hexa1+"."+hexa2;
        numInt1=""+hexa1;
        return (numero2>0)? numReal1:numInt1;
    }
    public static String decimalOctal(String num){
        ArrayList <Integer> oct=new ArrayList<>();
        //Decimal para Octal
        int numero1,resto=0,i=0;   
        //Parte Inteira
        String octal1="",numInt="";
        numInt=Validacoes.verInteira(num);
        numero1=Integer.parseInt(numInt);
        while(numero1>0){
        resto=numero1%8;
        //ArrayList inteiro recebe os numeros octal e organiza
        oct.add(i,resto);
        numero1=numero1/8;
        }
        //Variavel string recebe os numeros octal dentro do ArrayList
        for(i=0;i<oct.size();i++){
            octal1=octal1+oct.get(i);
        }
        //Parte Real Decimal para octal numReal recebe a concatenação de 0. + o valor que é chamado pela recursividade
        String octal2="",numReal="0.";
        numReal=numReal+Validacoes.verReal(num);
        //Verificação Real
        double numero2=0;int caracter,it=0;
        String juntaS="",ver="",inteiroZero="0.";int r=0;
            int n2;
            numero2=Double.parseDouble(numReal);
            
            while(r<5){
                //A variavel it faz casting para receber a parte inteira no número e a v. octal guara a coversão
                numero2=numero2*8;
                it=(int)numero2;
                octal2=octal2+it;
                juntaS=juntaS+numero2;
                //Verificação que valida a multipl. num*8 para que próxima iteração a parte inteira seje ser Zero
                for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           inteiroZero=inteiroZero+juntaS.charAt(t);
                       }
                    }
                }
                numero2=Double.parseDouble(inteiroZero);
                //Verificação que valida depois de zera a parte int se a parte real é zero para que pare prematuramente a condição do while(r<0) 
                for(int j=0;j<inteiroZero.length();j++){
                    caracter=inteiroZero.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<inteiroZero.length();t++){
                           ver=ver+inteiroZero.charAt(t); 
                       }
                    }
                }
                n2=Integer.parseInt(ver);
                inteiroZero="0.";
                juntaS="";
                ver="";
                if(n2==0)
                    r=6;
                else
                    r++;   
            }
        String numReal1="",numInt1="";
        numReal1=""+octal1+"."+octal2;
        numInt1=""+octal1;
        return (numero2>0)? numReal1:numInt1;
    }
    public static String decimalBinario(String num){    
        ArrayList <Integer> bin=new ArrayList<>();
        //Decimal para Binário
        int numero1,resto=0,i=0;
        //Parte Inteira
        String binario1="",numInt="";
        numInt=Validacoes.verInteira(num);
        numero1=Integer.parseInt(numInt);
        while(numero1>0){
        resto=numero1%2;
        //ArrayList inteiro recebe os numeros binarios e organiza
        bin.add(i,resto);
        numero1=numero1/2;
        }
        //Variavel string recebe os numeros binario dentro do ArrayList
        for(i=0;i<bin.size();i++){
            binario1=binario1+bin.get(i);
        }
        //Parte Real Decimal para Binario numReal recebe a concatenação de 0. + o valor que é chamado pela recursividade
        String binario2="",numReal="0.";
        numReal=numReal+Validacoes.verReal(num);
        //Verificação Real
        double numero2=0;int caracter,it=0;
        String juntaS="",inteiroZero="0.";int r=0;
            numero2=Double.parseDouble(numReal);            
            while(r<5){
                numero2=numero2*2;
                it=(int)numero2;
                binario2=binario2+it;
                juntaS=juntaS+numero2;
                for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           inteiroZero=inteiroZero+juntaS.charAt(t);
                       }
                    }
                }
                numero2=Double.parseDouble(inteiroZero);
                inteiroZero="0.";
                juntaS="";
             r++;   
            }
        String numReal1="",numInt1="";
        numReal1=""+binario1+"."+binario2;
        numInt1=""+binario1;
        return (numero2>0)? numReal1:numInt1;
    }
    public static String hexIRBinario(String num){
   ArrayList <String> B = new ArrayList();
   int tamanho,c;String junta="";
   tamanho=num.length();
   for(int i=0; i<tamanho; i++){
       c=num.charAt(i);
       if(c=='0'){
       B.add("0000");
       }
       if(c=='1'){
       B.add("0001");
       }
       if(c=='2'){
       B.add("0010");
       }
       if(c=='3'){
       B.add("0011");
       }
       if(c=='4'){
       B.add("0100");
       }
       if(c=='5'){
       B.add("0101");
       }
       if(c=='6'){
       B.add("0110");
       }
       if(c=='7'){
       B.add("0111");
       }
       if(c=='8'){
       B.add("1000");
       }
       if(c=='9'){
       B.add("1001");
       }
       if(c=='A'){
       B.add("1010");
       }
       if(c=='B'){
       B.add("1011");
       }
       if(c=='C'){
       B.add("1100");
       }
       if(c=='D'){
       B.add("1101");
       }
       if(c=='E'){
       B.add("1110");
       }
       if(c=='F'){
       B.add("1111");
       }
   }
   for(int i=0;i<B.size();i++){
       junta=junta+B.get(i);
   }
    return junta;   
   }
    public static String hexparaBinario(String num){
        String numInt="",numReal="",inteiro="",real="";
        numInt=Validacoes.verInteira(num);
        inteiro=hexIRBinario(numInt);
        numReal=numReal+Validacoes.verReal(num);
        real=hexIRBinario(numReal);
        if(real!="")
            return inteiro+"."+real;
            return inteiro;   
    }
    public static String octalIRBinario(String num){
   ArrayList <String> B = new ArrayList();
   int tamanho,c;String junta="";
   tamanho=num.length();
   for(int i=0; i<tamanho; i++){
       c=num.charAt(i);
       if(c=='0'){
       B.add("000");
       }
       if(c=='1'){
       B.add("001");
       }
       if(c=='2'){
       B.add("010");
       }
       if(c=='3'){
       B.add("011");
       }
       if(c=='4'){
       B.add("100");
       }
       if(c=='5'){
       B.add("101");
       }
       if(c=='6'){
       B.add("110");
       }
       if(c=='7'){
       B.add("111");
       }
   }
   for(int i=0;i<B.size();i++){
       junta=junta+B.get(i);
   }
    return junta;   
   }
    public static String octalBinario(String num){
        String numInt="",numReal="",inteiro="",real="";
        numInt=Validacoes.verInteira(num);
        inteiro=octalIRBinario(numInt);
        numReal=numReal+Validacoes.verReal(num);
        real=octalIRBinario(numReal);
        return(real!="")?inteiro+"."+real:inteiro;
        
    }
    
    public static String binarioIDecimal(String num){
        //Ajuda 
        //Verifica se o numero é inteiro
        String numInt="",numeroI;
        long numero,restoI,decimalI=0,i=0;
        numInt=Validacoes.verInteira(num);
        //Parte Inteira Binário para decimal (i) é o da base 2, começa do 0 até o tamanho do número
        try{
        numero=Long.parseLong(numInt);
        while(numero>0){
        restoI=numero%10;
        decimalI=(long) (restoI*pow(2,i)+decimalI);
        i++;
        numero=numero/10;
        }
        }
        catch(NumberFormatException e1){
            System.out.println("\t\t\tNúmero extremamente grande");
            MenuConverter.Menu_Converter();
        }
        numeroI=""+decimalI;
        return numeroI;
        
    }
    public static String binarioDecimal(String num){
        long numero,numero1, restoI=0,restoR=0,decimalI=0,tamanho;
        double i=0;double decimalR=0;
        //Verifica se o numero é inteiro
        String numInt="";
        numInt=Validacoes.verInteira(num);
        //Parte Inteira Binário para decimal (i) é o da base 2, começa do 0 até o tamanho do número
        numero=Long.parseLong(numInt);
        while(numero>0){
        restoI=numero%10;
        decimalI=(long) (restoI*pow(2,i)+decimalI);
        i++;
        numero=numero/10;
        }

        //Parte Real Binário para decimal (i) é o da base 2, começa do 0 até o tamanho do número
        String numReal="";
        int seReal=0;
        numReal=Validacoes.verReal(num);
        if(numReal!=""){
                numero1=Integer.parseInt(numReal);
                seReal=Integer.parseInt(numReal);
                tamanho=-numReal.length();
                while(numero1>0){
                restoR=numero1%10;
                decimalR=(double) (restoR*pow(2,tamanho)+decimalR);
                tamanho++;
                numero1=numero1/10;
                }
            
        }
        String juntaS="",real="";int caracter;
        juntaS=juntaS+decimalR;
        for(int j=0;j<juntaS.length();j++){
                    caracter=juntaS.charAt(j);
                    if(caracter=='.'){
                       for(int t=j+1;t<juntaS.length();t++){
                           real=real+juntaS.charAt(t);
                        }
                    }
                    
        }
        
        String num1="",num2=".";
        num1=num1+decimalI;
        num2=num2+real;
        
    return (seReal>0)? num1+num2:num1;
    }
    public static String converter(String num, char sOrigem, char sDestino){
       if ((sOrigem=='B')&&(sDestino=='D')){
            return  binarioDecimal(num);
       }
       if ((sOrigem=='D')&&(sDestino=='B')){
            return  decimalBinario(num);
       }
        if((sOrigem=='O')&&(sDestino=='D')){
            return octalDecimal(num);
        }
       
       if((sOrigem=='H')&&(sDestino=='B')){
           return hexparaBinario(num);
       }
       if((sOrigem=='O')&&(sDestino=='B')){
           return octalBinario(num);
       }
       if((sOrigem=='D')&&(sDestino=='O')){
           return decimalOctal(num);
       }
       if((sOrigem=='D')&&(sDestino=='H')){
           return decimalHexa(num);
       }
       if((sOrigem=='B')&&(sDestino=='O')){
           return binarOctal(num);
       }
       if((sOrigem=='B')&&(sDestino=='H')){
           return binarioHexa(num);
       }
       if((sOrigem=='H')&&(sDestino=='O')){
           return HexaOctal(num);
       }
       if((sOrigem=='O')&&(sDestino=='H')){
           return octalHexa(num);
       }
       if((sOrigem=='H')&&(sDestino=='D')){
           return hexaDecimal(num);
       }
       return num;
    }}
