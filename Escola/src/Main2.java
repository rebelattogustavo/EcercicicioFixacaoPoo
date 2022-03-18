import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        menuPrincipal(listaProfessores, listaAlunos);
    }

    public static void menuPrincipal(ArrayList<Professor> listaProfessores, ArrayList<Aluno> listaAlunos){
        System.out.println("--- MENU PRINCIPAL ---" +
                "\n1- Cadastrar" +
                "\n2- Editar" +
                "\n3- Remover" +
                "\n4- Listar" +
                "\n5- Encerrar");
        int opcao = tec.nextInt();

        switch(opcao){
            case 1:
                int tipoOpcao = selecionar("Cadastrar: ");
                switch(tipoOpcao){
                    case 1:
                            listaProfessores.add(cadastrarProfessor());
                        break;
                    case 2:
                        listaAlunos.add(cadastrarAluno());
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public static Pessoa cadastroPessoa(){

        System.out.println("Informe os dados: " +
                "\nNome: ");
        String nome = tec.next();
        System.out.println("CPF: ");
        String cpf = tec.next();
        System.out.println("Telefone: ");
        String telefone = tec.next();
        System.out.println("Gênero: ");
        String genero = tec.next();
        System.out.println("Idade: ");
        int idade = tec.nextInt();
        System.out.println("Matricula: ");
        int matricula = tec.nextInt();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, genero, idade, matricula);
        return pessoa;
    }


    public static Professor cadastrarProfessor(){
        Pessoa pessoa = cadastroPessoa();

        System.out.println("Materia: ");
        String materia = tec.next();
        System.out.println("Turno: ");
        String turno = tec.next();
        System.out.println("Salário: ");
        double salario = tec.nextDouble();

        Professor professor = new Professor(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(),
                pessoa.getIdade(), pessoa.getMatricula(), materia, turno, salario);

        return professor;
    }

    public static Aluno cadastrarAluno(){
        Pessoa pessoa =  cadastroPessoa();

        System.out.println("Turma: ");
        String turma = tec.next();

        Aluno aluno = new Aluno(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(),
                pessoa.getIdade(), pessoa.getMatricula(), turma, 0.0,0.0, 0.0, 0.0);

        return aluno;
    }

    public static int selecionar(String menuOpcao){
        System.out.println(menuOpcao +
                "\n1- Professor" +
                "\n2- Aluno");
        return tec.nextInt();

    }


}
