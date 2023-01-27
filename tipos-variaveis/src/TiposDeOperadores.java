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

    }
}