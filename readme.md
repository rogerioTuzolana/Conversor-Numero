# Conversor de Número

O projecto baseou-se num Conversor de Sistemas de Numeração, um programa que converte números em função da  base ( entra e saída) , com a sua equivalência por extenso.

O progama  converte números na base (Binário, Decimal, Hexadecimal,  Octal,  Romano ) e também por Extenso.

# Clases && Modulação

Separamos o codigo fonte em  9 arquivos.

1-projectoJava.java » contem a funcão main e o metodo extraída do menuPrincipal e um blocos que permitem a passagem de argumento main no CMD.

2-Informacoes.java »contem informações para o usuário

3-arabeRomano » contem as conversões arabe<>romano e destacam-se os metodos conversaoArabe e conversaoRomano. 

4-Arquivo» destacam-se os modulos de importação e exportação de ficheiros com escrita e leitura pela biblíoteca IO.

5-Conversao» contem as conversõrs das bases (B,D,H e O).

6-Validacoes » contem os metodos que validam as bases, os numeros e vírgulas.

7-menuConverter » destaca-se um Menu_Converter onde foram chamadas os metodos extraída da classe Conversao,  Arquivo, menuPrincipal, arabeRomano, Extensaopro, etc.

8-Extensaopro » contem os métodos que convertem por extenso os números em binário, decimal, octal e hexadecimal.

9-menuPrincipal » contem um estrutura de selecção multipla que chama os metodos das classes Informacoes e menuConverter.