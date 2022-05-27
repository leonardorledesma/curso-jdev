package classes;

import java.util.Arrays;
import java.util.Objects;
/*Esta classe disciplina servira para todos os objetos de notas  e materias*/
public class Disciplina {

    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNota(){
        double somatotal = 0;
        for (int pos = 0; pos < nota.length; pos++){
            somatotal += nota[pos];
        }
        return somatotal / nota.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return Arrays.equals(nota, that.nota) && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(disciplina);
        result = 31 * result + Arrays.hashCode(nota);
        return result;
    }

    @Override
    public String toString() {
        return "classes.Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
