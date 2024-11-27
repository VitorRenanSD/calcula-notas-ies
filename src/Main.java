public class Main {
    public static void main(String[] args) {

        Materia materia = new Materia("POO", 10.0f, 2.0f, 5f);
        Calculo calculo = new Calculo();


        System.out.println(calculo.avaliar(materia));
        
    }
}
