public class Professor extends Pessoa{
    private String materia, turno;
    private double salario;


    public void cadastrarNota(int av, double nota, Aluno aluno){
        switch (av){
            case 1:
                aluno.setNota1(nota);
                break;
            case 2:
                aluno.setNota2(nota);
                break;
            case 3:
                aluno.setNota3(nota);
                break;
        }
    }

    public Professor(){

    }

    public Professor(String nome, String cpf, String telefone, String genero, int idade, int matricula, String materia, String turno, double salario) {
        super(nome, cpf, telefone, genero, idade, matricula);
        this.materia = materia;
        this.turno = turno;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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
        return super.toString()+"Professor{" +
                "materia='" + materia + '\'' +
                ", turno='" + turno + '\'' +
                ", salario=" + salario +
                '}';
    }
}
