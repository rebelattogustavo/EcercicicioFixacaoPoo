import java.util.ArrayList;
import java.util.Scanner;

public class MainPoli {
    static Scanner tec = new Scanner(System.in);
    static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("MENU:" +
                "\n1 - Cadastrar" +
                "\n2 - Editar" +
                "\n3 - Remover" +
                "\n4 - Listar" +
                "\n5 - Encerrar");
        int opcaoMenu = tec.nextInt();
        switch (opcaoMenu) {
            case 1: {
                int opcaoTipo = selecionaTipo("Cadastrar");
                if(opcaoTipo == 1 || opcaoTipo == 2){
                    listaPessoas.add(coletaDadosPessoa(opcaoTipo));
                }
                switch (opcaoTipo) {
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
                        int indice = validaPessoa(matricula);
                        if (indice != -1) {
                            switch (opcaoEditar) {
                                case 1:
                                    listaPessoas.set(indice, coletaDadosPessoa(opcaoTipo));
                                    break;
                                case 2:
                                    editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice);
                                    break;
                            }
                        }
                        break;
                    case 2:
                        indice = validaPessoa(matricula);
                        if (indice != -1) {
                            switch (opcaoEditar) {
                                case 1:
                                    listaPessoas.set(indice, coletaDadosPessoa(opcaoTipo));
                                    break;
                                case 2:
                                    editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice);
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
                
                int indice = validaPessoa(matricula);
                if (confirmaExcluir( listaPessoas.get(indice))) {
                    listaPessoas.remove(indice);
                }
                break;
            }
            case 4: {
                int opcaoTipo = selecionaTipo("Listar");
                switch (opcaoTipo) {
                    case 1:
                        listaPessoas.forEach(pessoa -> {
                            if(pessoa instanceof Professor){
                                System.out.println(pessoa);
                            }
                        });
                        break;
                    case 2:
                        listaPessoas.forEach(pessoa -> {
                            if(pessoa instanceof Aluno){
                                System.out.println(pessoa);
                            }
                        });
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
        menu();
    }

    private static boolean confirmaExcluir(Pessoa pessoa) {
        System.out.println(pessoa.toString());
        System.out.println("Deseja realemente removê-lo?" +
                "\n1 - Sim" +
                "\n2 - Não");
        int deleta = tec.nextInt();
        if (deleta == 1) {
            return true;
        }
        return false;
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

    private static void editaAtributo(int atributo, int opcaoTipo, int indice) {
        Pessoa pessoa = new Pessoa();
        pessoa = listaPessoas.get(indice);
       
        switch (atributo) {
            case 1:
                pessoa.setNome(tec.next());
                break;
            case 2:
                pessoa.setCpf(tec.next());
                break;
            case 3:
                pessoa.setTelefone(tec.next());
                break;
            case 4:
                pessoa.setGenero(tec.next());
                break;
            case 5:
                pessoa.setIdade(tec.nextInt());
                break;
            case 6:
                pessoa.setMatricula(tec.nextInt());
                break;
        }
        switch (atributo) {
            case 8:
                ((Professor)listaPessoas.get(indice)).setTurno(tec.next());
                break;
            case 9:
                ((Professor)listaPessoas.get(indice)).setSalario(tec.nextDouble());
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
        return tec.nextInt();
    }

    private static int selecionaEditar() {
        System.out.println("Editar:" +
                "\n1 - Todos os atributos" +
                "\n2 - Um atributo");
        return tec.nextInt();
    }

    private static int validaPessoa(int matricula) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getMatricula() == matricula) {
                return i;
            }
        }
        return -1;
    }
    

    private static void listarTurmas(){
        for(int i=0; i<Turma.listaTurmas.size(); i++){
            System.out.println(Turma.listaTurmas.get(i).toString());
        }
    }

    private static void listarMaterias(){
        for(int i=0; i<Materia.listaMaterias.size(); i++){
            System.out.println(Materia.listaMaterias.get(i).toString());
        }
    }

    private static Pessoa coletaDadosPessoa(int opcaoTipo) {
        System.out.println("Insira os dados" +
                "\nNome: ");
        String nome = tec.next();
        System.out.println("CPF: ");
        String cpf = tec.next();
        System.out.println("Telefone: ");
        String telefone = tec.next();
        System.out.println("Genero: ");
        String genero = tec.next();
        System.out.println("Idade: ");
        int idade = tec.nextInt();
        System.out.println("Matrícula: ");
        int matricula = tec.nextInt();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, genero, idade, matricula);
        
        switch (opcaoTipo){
            case 1:
                ArrayList<Materia> listaMaterias = new ArrayList<>();
                System.out.println("Conforme a lista de matérias: ");
                listarMaterias();
                System.out.println("Informe o código das matérias que deseja lecionar");
                char resp = 's';
                do{
                    System.out.println("Código: ");
                    int codigo = tec.nextInt();
                    for (int i =0;i < Materia.listaMaterias.size(); i++){
                        if(codigo == Materia.listaMaterias.get(i).getCodigo()){
                            listaMaterias.add(Materia.listaMaterias.get(i));
                        }else{
                            System.out.println("Matéria não encontrada!");
                            menu();
                        }
                    }
                    System.out.println("Deseja adicionar mais uma?");
                    resp = tec.next().charAt(0);
                }while(resp == 's' || resp == 'S');
                System.out.println("Turno: ");
                String turno = tec.next();
                System.out.println("Salário: ");
                double salario = tec.nextDouble();
                return new Professor(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(), pessoa.getIdade(), pessoa.getMatricula(), turno, salario, listaMaterias);
            case 2:
                System.out.println("Conforme as turmas abaixo: ");
                listarTurmas();
                System.out.println("Informe o código da turma desejada: ");
                System.out.println("Turma: ");
                int codigo = tec.nextInt();
                int indice = 0;
                for(int i =0; i<Turma.listaTurmas.size();i++){
                    if (codigo == Turma.listaTurmas.get(i).getCodigo()){
                        indice = i;
                    }else{
                        System.out.println("Turma não encontrada");
                        menu();
                    }
                }
                return new Aluno(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(), pessoa.getIdade(), pessoa.getMatricula(), Turma.listaTurmas.get(indice));
        }
        
        return pessoa;
    }

    public static Turma coletaDadosTurma(){
        ArrayList<Materia> listaMaterias = new ArrayList<>();
        System.out.println("Insira os dados:" +
                "\nNome: ");
        String nome = tec.next();
        System.out.println("Código: ");
        int codigo = tec.nextInt();

        System.out.println("Conforme as matérias abaixo: ");
        listarMaterias();

        char resp = 's';
        do{
            System.out.println("Informe o código das matérias que deseja inserir na turma");
            int codigo2 = tec.nextInt();
            for (int i =0;i < Materia.listaMaterias.size(); i++){
                if(codigo2 == Materia.listaMaterias.get(i).getCodigo()){
                    listaMaterias.add(Materia.listaMaterias.get(i));
                }else{
                    System.out.println("Matéria não encontrada!");
                    menu();
                }
            }
            System.out.println("Deseja adicionar mais uma?");
            resp = tec.next().charAt(0);
        }while(resp == 's' || resp == 'S');

        Turma turma = new Turma(nome, codigo, listaMaterias);
        return turma;
    }

    public static Materia coletaDadosMateria(){
        System.out.println("Insira os dados abaixo: " +
                "\nCódigo: ");
        int codigo = tec.nextInt();
        System.out.println("Nome: ");
        String nome = tec.next();
        System.out.println("Área de atuação: ");
        String areaAtuacao = tec.next();

        Materia materia = new Materia(codigo, nome, areaAtuacao);
        return materia;
    }


    private static int selecionaTipo(String opcaoMenu) {
        System.out.println(opcaoMenu +
                "\n1 - Professor" +
                "\n2 - Aluno" +
                "\n3- Turmas" +
                "\n4- Matérias");
        return tec.nextInt();
    }

    private static int coletaMatricula() {
        System.out.println("Matrícula: ");
        return tec.nextInt();
    }
    private static int coletaCodigo() {
        System.out.println("Código: ");
        return tec.nextInt();
    }
    
}
