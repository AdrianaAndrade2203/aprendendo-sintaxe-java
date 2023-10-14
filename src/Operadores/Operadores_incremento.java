
public class Operadores_incremento {
    
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(numero);

        //Neste caso abaixo, apesar de ter sido informado o incremento ++, o sistema imprimiu sem
        //considerar esse incremento. Pois ele entende que primeiro esta imprimindo o numero, e o 
        //incremento será apenas depois. 

        System.out.println(numero ++);  //5

        System.out.println(numero); // aqui sim o sistema fez o incremento e se toronou 6

        //Para o incremento funcionar na função da impressão o correto seria: 

        System.out.println(++ numero); 
        

    }

}

