import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Professor> listaProfessores = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        menu(listaProfessores, listaAlunos);
    }

    public static void menu(ArrayList<Professor> listaProfessores, ArrayList<Aluno> listaAlunos) {
        System.out.println("MENU:" +
                "\n1 - Cadastrar" +
                "\n2 - Editar" +
                "\n3 - Remover" +
                "\n4 - Listar" +
                "\n5 - Encerrar");
        int opcaoMenu = sc.nextInt();
        switch (opcaoMenu) {
            case 1: {
                int opcaoTipo = selecionaTipo("Cadastrar");
                switch (opcaoTipo) {
                    case 1:
                        listaProfessores.add(coletaDadosProfessor());
                        break;
                    case 2:
                        listaAlunos.add(coletaDadosAluno());
                        break;
                    case 3:
                        Turma.listaTurmas.add(coletaDadosTurma());
                        break;
                    case 4:
                        Materia.listaMaterias.add(coletaDadosMateria());
                        break;
                }
                break;
            }
            case 2: {
                int opcaoTipo = selecionaTipo("Editar");
                int opcaoEditar = selecionaEditar();
                int matricula = 0;
                int codigo = 0;
                if(opcaoTipo == 1 || opcaoTipo == 2){
                    matricula = coletaMatricula();
                }else if(opcaoTipo == 3 || opcaoTipo == 4){
                    codigo = coletaCodigo();
                }
                switch (opcaoTipo) {
                    case 1:
                        int indice = validaProfessor(listaProfessores, matricula);
                        if (indice != -1) {
                            switch (opcaoEditar) {
                                case 1:
                                    listaProfessores.set(indice, coletaDadosProfessor());
                                    break;
                                case 2:
                                    editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice, listaProfessores, listaAlunos);
                                    break;
                            }
                        }
                        break;
                    case 2:
                        indice = validaAluno(listaAlunos, matricula);
                        if (indice != -1) {
                            switch (opcaoEditar) {
                                case 1:
                                    listaAlunos.set(indice, coletaDadosAluno());
                                    break;
                                case 2:
                                    editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice, listaProfessores, listaAlunos);
                                    break;
                            }
                        }
                        break;
                }
                break;
            }
            case 3: {
                int opcaoTipo = selecionaTipo("Excluir");
                int matricula = coletaMatricula();
                switch (opcaoTipo) {
                    case 1:
                        int indice = validaProfessor(listaProfessores, matricula);
                        if (confirmaExcluir((Pessoa) listaProfessores.get(indice))) {
                            listaProfessores.remove(indice);
                        }
                        break;
                    case 2:
                        indice = validaAluno(listaAlunos, matricula);
                        if (confirmaExcluir((Pessoa) listaAlunos.get(indice))) {
                            listaAlunos.remove(indice);
                        }
                        break;
                }
                break;
            }
            case 4: {
                int opcaoTipo = selecionaTipo("Listar");
                switch (opcaoTipo) {
                    case 1:
                        for (Professor professor : listaProfessores) {
                            System.out.println(professor.toString());
                        }
                        break;
                    case 2:
                        for (Aluno aluno : listaAlunos) {
                            System.out.println(aluno.toString());
                        }
                        break;
                    case 3:
                        for(Turma turma : Turma.listaTurmas){
                            System.out.println(turma.toString());
                        }
                        break;
                    case 4:
                        for(Materia materia : Materia.listaMaterias){
                            System.out.println(materia.toString());
                        }
                        break;
                }
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
        }
        menu(listaProfessores, listaAlunos);
    }

    private static boolean confirmaExcluir(Pessoa pessoa) {
        System.out.println(pessoa.toString());
        System.out.println("Deseja realemente removê-lo?" +
                "\n1 - Sim" +
                "\n2 - Não");
        int deleta = sc.nextInt();
        if (deleta == 1) {
            return true;
        }
        return false;
    }

    private static int validaAluno(ArrayList<Aluno> listaAlunos, int matricula) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getMatricula() == matricula) {
                return i;
            }
        }
        return -1;
    }
    private static int validaTurma(int codigo) {
            for (int i = 0; i < Turma.listaTurmas.size(); i++) {
                if (Turma.listaTurmas.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
            return -1;
        }
    private static int validaMateria(int codigo) {
            for (int i = 0; i < Materia.listaMaterias.size(); i++) {
                if (Materia.listaMaterias.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
            return -1;
        }

    private static void editaAtributo(int atributo, int opcaoTipo, int indice, ArrayList<
            Professor> listaProfessores, ArrayList<Aluno> listaAlunos) {
        Pessoa pessoa = new Pessoa();
        if (opcaoTipo == 1) {
            pessoa = (Pessoa) listaProfessores.get(indice);
        } else if(opcaoTipo == 2){
            pessoa = (Pessoa) listaAlunos.get(indice);
        } else if(opcaoTipo == 3){

        }
        switch (atributo) {
            case 1:
                pessoa.setNome(sc.next());
                break;
            case 2:
                pessoa.setCpf(sc.next());
                break;
            case 3:
                pessoa.setTelefone(sc.next());
                break;
            case 4:
                pessoa.setGenero(sc.next());
                break;
            case 5:
                pessoa.setIdade(sc.nextInt());
                break;
            case 6:
                pessoa.setMatricula(sc.nextInt());
                break;
        }
        switch (atributo) {
            case 8:
                listaProfessores.get(indice).setTurno(sc.next());
                break;
            case 9:
                listaProfessores.get(indice).setSalario(sc.nextDouble());
                break;
        }
    }

    private static int selecionaAtributo(int opcaoTipo) {
        System.out.println("Qual atributo deseja editar?" +
                "\n1 - Nome" +
                "\n2 - CPF" +
                "\n3 - Telefone" +
                "\n4 - Gênero" +
                "\n5 - Idade" +
                "\n6 - Matrícula");
        if (opcaoTipo == 1) {
            System.out.println("7 - Matéria" +
                    "\n8 - Turno" +
                    "\n9 - Salário");
        } else {
            System.out.println("7 - Turma" +
                    "\n8 - Nota 1" +
                    "\n9 - Nota 2" +
                    "\n10 - Nota 3");
        }
        return sc.nextInt();
    }

    private static int selecionaEditar() {
        System.out.println("Editar:" +
                "\n1 - Todos os atributos" +
                "\n2 - Um atributo");
        return sc.nextInt();
    }

    private static int validaProfessor(ArrayList<Professor> listaProfessores, int matricula) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getMatricula() == matricula) {
                return i;
            }
        }
        return -1;
    }

    private static Aluno coletaDadosAluno() {
        Pessoa pessoa = coletaDadosPessoa();

        System.out.println("Conforme as turmas abaixo: ");
        listarTurmas();
        System.out.println("Informe o código da turma desejada: ");
        System.out.println("Turma: ");
        int codigo = sc.nextInt();
        int indice = 0;
        for(int i =0; i<Turma.listaTurmas.size();i++){
            if (codigo == Turma.listaTurmas.get(i).getCodigo()){
                indice = i;
            }
        }
        Aluno aluno = new Aluno(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(), pessoa.getIdade(), pessoa.getMatricula(), Turma.listaTurmas.get(indice));
        return aluno;
    }

    private static void listarTurmas(){
        for(int i=0; i<Turma.listaTurmas.size(); i++){
            Turma.listaTurmas.get(i).toString();
        }
    }

    private static void listarMaterias(){
        for(int i=0; i<Materia.listaMaterias.size(); i++){
            System.out.println(Materia.listaMaterias.get(i).toString());
        }
    }


    private static Professor coletaDadosProfessor() {
        ArrayList<Materia> listaMaterias = new ArrayList<>();
        Pessoa pessoa = coletaDadosPessoa();
        System.out.println("Conforme a lista de matérias: ");
        listarMaterias();
        System.out.println("Informe o código das matérias que deseja lecionar");
        char resp = 's';
        do{
            System.out.println("Código: ");
            int codigo = sc.nextInt();
            for (int i =0;i < Materia.listaMaterias.size(); i++){
                if(codigo == Materia.listaMaterias.get(i).getCodigo()){
                    listaMaterias.add(Materia.listaMaterias.get(i));
                }
            }
            System.out.println("Deseja adicionar mais uma?");
            resp = sc.next().charAt(0);
        }while(resp == 's' || resp == 'S');
        System.out.println("Turno: ");
        String turno = sc.next();
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        Professor professor = new Professor(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(), pessoa.getIdade(), pessoa.getMatricula(), turno, salario, listaMaterias);
        return professor;
    }

    private static Pessoa coletaDadosPessoa() {
        System.out.println("Insira os dados" +
                "\nNome: ");
        String nome = sc.next();
        System.out.println("CPF: ");
        String cpf = sc.next();
        System.out.println("Telefone: ");
        String telefone = sc.next();
        System.out.println("Genero: ");
        String genero = sc.next();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Matrícula: ");
        int matricula = sc.nextInt();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, genero, idade, matricula);
        return pessoa;
    }

    public static Turma coletaDadosTurma(){
        ArrayList<Materia> listaMaterias = new ArrayList<>();
        System.out.println("Insira os dados:" +
                "\nNome: ");
        String nome = sc.next();
        System.out.println("Código: ");
        int codigo = sc.nextInt();

        System.out.println("Conforme as matérias abaixo: ");
        listarMaterias();

        char resp = 'n';
        do{
            System.out.println("Informe o código das matérias que deseja inserir na turma");
            int codigo2 = sc.nextInt();
            for (int i =0;i < Materia.listaMaterias.size(); i++){
                if(codigo2 == Materia.listaMaterias.get(i).getCodigo()){
                    listaMaterias.add(Materia.listaMaterias.get(i));
                }
            }
            System.out.println("Deseja adicionar mais uma?");
            resp = sc.next().charAt(0);
        }while(resp == 'n' || resp == 'N');

        Turma turma = new Turma(nome, codigo, listaMaterias);
        return turma;
    }

    public static Materia coletaDadosMateria(){
        System.out.println("Insira os dados abaixo: " +
                "\nCódigo: ");
        int codigo = sc.nextInt();
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Área de atuação: ");
        String areaAtuacao = sc.next();

        Materia materia = new Materia(codigo, nome, areaAtuacao);
        return materia;
    }


    private static int selecionaTipo(String opcaoMenu) {
        System.out.println(opcaoMenu +
                "\n1 - Professor" +
                "\n2 - Aluno" +
                "\n3- Turmas" +
                "\n4- Matérias");
        return sc.nextInt();
    }

    private static int coletaMatricula() {
        System.out.println("Matrícula: ");
        return sc.nextInt();
    }
    private static int coletaCodigo() {
        System.out.println("Código: ");
        return sc.nextInt();
    }

}