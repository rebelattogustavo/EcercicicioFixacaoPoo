public class Pessoa {
    private String nome, cpf, telefone, genero;
    private int idade, matricula;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String telefone, String genero, int idade, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
        this.matricula = matricula;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome= " + nome +
                "\nCPF= " + cpf +
                "\nTelefone= " + telefone +
                "\nGênero= " + genero +
                "\nIdade= " + idade +
                "\nMatrícula= " + matricula;
    }
}
