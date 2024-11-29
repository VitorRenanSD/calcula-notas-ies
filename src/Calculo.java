public class Calculo {
    private Double notaMin = 6.75;
    private Double notaMinExame = 4.75;


    // Default constructor
    public Calculo() {}
    // Constructor
    public Calculo(Double notaMin, Double notaMinExame) {
        this.notaMin = notaMin;
        this.notaMinExame = notaMinExame;
    }

    // Metodo que calcula a media
    public Double calcularMedia(Materia materia) {
        return (materia.getNp1() + materia.getNp2()) / 2.0;
    }

    // Metodo que verifica se o aluno passou sem exame
    public boolean passouDireto(Materia materia) {
        return calcularMedia(materia) >= this.notaMin;
    }

    // Metodo que verifica se o aluno passou com exame
    public boolean passouNoExame(Materia materia) {
        if (materia.getExame() == 0.0f) {
            throw new IllegalArgumentException("Não passou de forma direta em " + materia.getNome() + ", nota de exame faltando no cadastro");
        }
        double mediaComExame = (calcularMedia(materia) + materia.getExame()) / 2.0;
        return mediaComExame >= this.notaMinExame;
    }

    // Metodo principal pra avaliar a situacao do aluno
    public String avaliar(Materia materia) {
        Double media = calcularMedia(materia);

        if (passouDireto(materia)) {
            return "Aprovado em " + materia.getNome() + ". Média: " + media;
        } else if (materia.getExame() == 0.0f) {
            return "Recuperação de " + materia.getNome() + ". Necessário realizar prova de exame.";
        } else if (passouNoExame(materia)) {
            double mediaFinal = (media + materia.getExame()) / 2.0;
            return "Aprovado em " + materia.getNome() + " no exame. Média final: " + mediaFinal;
        } else {
            return "Reprovado em " + materia.getNome() + " mesmo após exame.";
        }
    }
}
