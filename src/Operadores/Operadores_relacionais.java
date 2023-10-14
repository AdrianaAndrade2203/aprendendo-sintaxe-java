

public class Operadores_relacionais {

    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println( " A Nossa Condição é verdadeira");
        }
        else{
            System.out.println("Condição é falsa");
        }

        System.out.println( " numero1 é " + numero1 + " igual a numero2, que é " + numero2 + " ? " + simNao);
    
        simNao = numero1 != numero2;

        System.out.println( " numero1 é " + numero1 + " diferente de numero2, que é " + numero2 + " ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println( " numero1 é " + numero1 + " maior do que numero2, que é " + numero2 + " ? " + simNao);

    }
    
}
