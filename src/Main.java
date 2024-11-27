public class Main {
    public static void main(String[] args) {

        Materia poo = new Materia("Programacao Orientada a Objetos", 10.0f, 9.0f, 0f);
        Materia par = new Materia("Paradigmas de Linguagens", 10.0f, 7.0f, 0f);
        Materia hom = new Materia("Homem e Sociedade", 10.0f, 6.0f, 0f);
        Materia geo = new Materia("Geometria Analitica", 10.0f, 2.0f, 0f);
        Materia est = new Materia("Estatistica e Probabilidade", 10.0f, 7.0f, 0f);
        Materia sql = new Materia("Banco de Dados", 8.5f, 10.0f, 0f);
        Materia aps = new Materia("APS Roblox", 9.0f, 9.0f, 0f);
        Materia alg = new Materia("Algebra Linear", 6.4f, 7.5f, 0f);
        Calculo calculo = new Calculo();


        System.out.println(calculo.avaliar(poo));
        System.out.println(calculo.avaliar(par));
        System.out.println(calculo.avaliar(hom));
        System.out.println(calculo.avaliar(geo));
        System.out.println(calculo.avaliar(est));
        System.out.println(calculo.avaliar(sql));
        System.out.println(calculo.avaliar(aps));
        System.out.println(calculo.avaliar(alg));

    }
}
