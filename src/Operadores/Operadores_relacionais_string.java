public class Operadores_relacionais_string {

    public static void main(String[] args) {
        
        String nome1 = "Adriana";
        String nome2 = "Adriana";

        System.out.println(nome1 == nome2);

        //OBS: No caso da comparação ser entre Objetos, o ideal é usar o equals para essa comparação,
        // pois os operadores logicos não será eficaz. 
    }
    
}
