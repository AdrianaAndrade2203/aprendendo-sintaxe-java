
public class Operadores_ternarios {

    public static void main(String[] args) {
        
        int a, b, c, d;

        a = 10;
        b = 10;
        c = 12;
        d = 13;

        String resultado =  " ";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

          System.out.println(resultado);

     // Ulilizando de operdores ternarios:
         
    String resultado2 = c==d ?"verdadeiro" : "falso";

    System.out.println(resultado2); 

    }
    
}

