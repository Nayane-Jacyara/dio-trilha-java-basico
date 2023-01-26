public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos de variaveis 
        //estudem a class String que representa texto de aplicacao 

        String meuNome = "Nayane Jacyara";

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int NUMERO = 5;

       // colocando o final no comeco da variavel nao podera altera o valor sempre vai ser fixo 

        System.out.println(NUMERO);
}
}
