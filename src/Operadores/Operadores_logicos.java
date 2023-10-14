public class Operadores_logicos {

    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false; 

        //Operadores && (E). Neste caso as duas condições precisam ser verdadeiras. 

        if(condicao1 && condicao2){
            System.out.println( "As duas condições são verdadeiras");
        }
        else{
            System.out.println( "As condiçoes não são verdadeiras");

        //Operadores || (OU). Neste caso  uma duas condições precisam ser verdadeiras. 
    
        if(condicao1 || condicao2){
            System.out.println( "Uma das condições são verdadeiras");
        }
        else{
            System.out.println( "Nenhuma condiçoes não são verdadeiras");
        }
        }
    }
    
}
