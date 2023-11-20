import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinasMinistradas;
// Construtor do profesor 
    public Professor() {
        this.disciplinasMinistradas = new ArrayList<>();
    }

    public void addDisciplinaMinistrada(Disciplina disciplina) {
        this.disciplinasMinistradas.add(disciplina);
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    // Adicionando método para imprimir informações sobre o professor
    public void imprimir() {
        System.out.println("Professor: " + getNome());
        System.out.println("Disciplinas ministradas:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}
