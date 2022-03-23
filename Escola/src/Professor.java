import java.util.ArrayList;

public class Professor extends Pessoa {

    private ArrayList<Materia> listaMaterias = new ArrayList<>();
    private String turno;
    private double salario;

    public Professor() {

    }

    public Professor(String nome, String cpf, String telefone, String genero, int idade, int matricula, String turno, double salario, ArrayList<Materia> listaMaterias) {
        super(nome, cpf, telefone, genero, idade, matricula);
        this.turno = turno;
        this.salario = salario;
        this.listaMaterias = listaMaterias;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "turno='" + turno + '\'' +
                ", salario=" + salario +
                ", listaMaterias=" + listaMaterias +
                '}';
    }
}
