import java.util.Date;

public class TiposDeOperadores{
   
    public static void main(String[] args) throws Exception {

    //O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.

    String nome = "Nayane";
    int idade = 20;
    double peso = 55.5;
    char sexo = 'F';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();


    //Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).

    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    //O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

    String nomeCompleto = "LINGUAGEM " + "JAVA";

    System.out.println(nomeCompleto);

    String concatenacao ="?"; 

    concatenacao = 1+1+1+"1";

    concatenacao = 1+"1"+1+1;

    concatenacao = 1+"1"+1+"1";

    concatenacao = "1"+1+1+1;

    concatenacao = "1 "+(1+1+1);
    
    System.out.println(concatenacao);

    //Unários esses operadores, são aplicados juntamente com um outro operador aritmético
    //(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
    //(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
    //(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
    //(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
    //(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

  
    int numero = 5;
		
    //Imprimindo o numero negativo
    System.out.println(- numero);

    //incrementando numero em mais 1 numero, imprime 6
    numero ++;
    System.out.println(numero);

    //incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero ++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    //ordem de precedencia conta aqui
    System.out.println(++ numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);

    /*Operador Ternario 
    O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
    O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
    <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>*/

    int a, b;

    a = 5;
    b = 6;

    /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
       resultado = "verdadeiro";
       else
        resultado = "falso";
    */

    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String valor = (a==b) ? "verdadeiro" : "false";

    System.out.println(valor);  


    /* Operadores Relacionais
    Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.

    == Quando desejamos verificar se uma variável é IGUAL A outra.
    != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    < Quando desejamos verificar se uma variável é MENOR QUE outra.
    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.*/

    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
	   System.out.print("Numero 1 maior que numero 2");

    if(numero1 < numero2)
	   System.out.print("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
	   System.out.print("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
	   System.out.print("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
	   System.out.print("Numero 1 é diferente de numero 2");

       // ou faz de forma ternario 

    boolean simNao = numero1 == numero2;

    System.out.println("numero1 é igual a numeroDois ?" + simNao);


    String nomeUm = "Nayane";
    String nomeDois = "Nayane";
    
    System.out.println(nomeUm == nomeDois);

    /*
     Lógicos
    Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

    && Operador Lógico "E"
    || Operador Lógico "OU"    */
    
    boolean condicao1=true;

    boolean condicao2=false;

    /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
       expressões. 
    É como se estivesse escrito:
    "Se Condicao1 e Condicao2 forem verdadeiras, executar código"    */

    if(condicao1 && condicao2)
	   System.out.print("Os dois valores precisam ser verdadeiros"); 

    //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
	   System.out.print("Um dos valores precisa ser verdadeiro");

   }
}