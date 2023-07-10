public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = false;

        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

//Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
        System.out.print("fim");
    }

}
