import java.util.ArrayList;

public class Turma{

    static ArrayList<Turma> listaTurmas = new ArrayList<>();
    private ArrayList<Materia> listaMaterias = new ArrayList<>();

    String nome;
    int codigo;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Turma(String nome, int codigo, ArrayList<Materia> listaMaterias) {
        this.nome = nome;
        this.codigo = codigo;
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "listaMaterias=" + listaMaterias +
                ", nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
