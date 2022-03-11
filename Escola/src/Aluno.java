public class Aluno extends Pessoa{
    private String turma;
    private double nota1, nota2, nota3, media;

    public Aluno(){

    }
    public Aluno(String nome, String cpf, String turma){
        super(nome, cpf);
        this.turma = turma;

    }

    public Aluno(String nome, String cpf, String telefone, String genero, int idade, int matricula, String turma, double nota1, double nota2, double nota3, double media) {
        super(nome, cpf, telefone, genero, idade, matricula);
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return super.toString()+"Aluno{" +
                "turma='" + turma + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                '}';
    }
}
