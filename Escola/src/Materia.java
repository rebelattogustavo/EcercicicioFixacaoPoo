import java.util.ArrayList;

public class Materia {

    static ArrayList<Materia> listaMaterias = new ArrayList<>();

    int codigo;
    String nome, areaAtuacao;

    public static ArrayList<Materia> getListaMaterias() { return listaMaterias; }

    public static void setListaMaterias(ArrayList<Materia> listaMaterias) { Materia.listaMaterias = listaMaterias; }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getAreaAtuacao() { return areaAtuacao; }

    public void setAreaAtuacao(String areaAtuacao) { this.areaAtuacao = areaAtuacao; }

    public Materia(int codigo, String nome, String areaAtuacao) { this.codigo = codigo;this.nome = nome;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }
}
