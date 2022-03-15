//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    static Scanner tec = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
//        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
//
//        Professor johnatan = new Professor();
//
//        johnatan.setNome("Johnatan");
//        johnatan.setIdade(30);
//        johnatan.setCpf("123.456.789-00");
//        johnatan.setGenero("Feminino");
//        johnatan.setTelefone("(47)0000-9999");
//        johnatan.setMatricula(1);
//        johnatan.setTurno("Mat/Vesp");
//        johnatan.setMateria("Banco de dados");
//        johnatan.setSalario(10000);
//
//        listaProfessores.add(johnatan);
//
//        String turma, nome, cpf, telefone, genero;
//        double nota1, nota2, nota3, media;
//        int idade, matricula;
//        String materia, turno;
//        double salario;
//
//        nome = "henrique";
//        cpf = "987.654.321-00";
//        telefone = "(47)9000-9999";
//        genero = "Masculino";
//        idade = 16;
//        matricula = 1;
//        turma = "PSIN 2021";
//        nota1 = 7.5;
//        nota2 = 8.5;
//        nota3 = 9.5;
//        media = (nota1 + nota2 + nota3) / 3;
//        Aluno henrique = new Aluno(nome, cpf, telefone, genero, idade, matricula, turma, nota1, nota2, nota3, media);
//        listaAlunos.add(henrique);
//
//        nome = "ester";
//        cpf = "321.654.987-00";
//        turma = "PSIN 2021";
//        Aluno ester = new Aluno(nome, cpf, turma);
//
//
//        johnatan.cadastrarNota(1, 10.0, ester);
//        listaAlunos.add(ester);
//
//        int encerrar = 1;
//        do {
//
//            System.out.println("--- MENU ---" +
//                    "\n1- Cadastrar" +
//                    "\n2- Editar" +
//                    "\n3_ Remover" +
//                    "\n4- Listar" +
//                    "\n5- Encerrar");
//            int opcao = tec.nextInt();
//
//            switch (opcao) {
//                case 1:
//
////                String materia, String turno, double salario
//                    System.out.print("Cadastrar" +
//                            "\n1- Professor" +
//                            "\n2- Aluno");
//                    opcao = tec.nextInt();
//                    System.out.print("\nInsira os dados: " +
//                            "\nNome: ");
//                    nome = tec.next();
//                    System.out.print("CPF: ");
//                    cpf = tec.next();
//                    System.out.print("Telefone: ");
//                    telefone = tec.next();
//                    System.out.print("Genero: ");
//                    genero = tec.next();
//                    System.out.print("Idade: ");
//                    idade = tec.nextInt();
//                    System.out.print("Matricula: ");
//                    matricula = tec.nextInt();
//                    switch (opcao) {
//                        case 1:
//                            System.out.print("Matéria: ");
//                            materia = tec.next();
//                            System.out.print("Turno: ");
//                            turno = tec.next();
//                            System.out.print("Salário: ");
//                            salario = tec.nextDouble();
//                            Professor professor = new Professor(nome, cpf, telefone,
//                                    genero, idade, matricula, materia, turno, salario);
//                            listaProfessores.add(professor);
//                            break;
//                        case 2:
//                            System.out.println("Turma: ");
//                            turma = tec.next();
//                            nota1 = 0.0;
//                            nota2 = 0.0;
//                            nota3 = 0.0;
//                            media = (nota1 + nota2 + nota3) / 3;
//                            Aluno aluno = new Aluno(nome, cpf, telefone, genero, idade, matricula, turma, nota1, nota2, nota3,
//                                    media);
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("--- Menu edição ---" +
//                            "\n1- Editar atributo" +
//                            "\n2- Editar uma pessoa");
//                    int opcao2 = tec.nextInt();
//                    switch (opcao2) {
//                        case 1:
//                            System.out.println("Editar" +
//                                    "\n1- Professor" +
//                                    "\n2- Aluno");
//                            opcao2 = tec.nextInt();
//                            System.out.println("Matricula: ");
//                            matricula = tec.nextInt();
//                            switch (opcao2) {
//                                case 1:
//                                    for (int i = 0; i < listaProfessores.size(); i++) {
//                                        if (listaProfessores.get(i).getMatricula() == matricula) {
//                                            System.out.println("Informe o que deseja editar: " +
//                                                    "\n1- Nome" +
//                                                    "\n2- Cpf" +
//                                                    "\n3- Telefone" +
//                                                    "\n4- Gênero" +
//                                                    "\n5- Idade" +
//                                                    "\n6- Matrícula" +
//                                                    "\n7- Matéria" +
//                                                    "\n8- Turno" +
//                                                    "\n9- Salário");
//                                            int opcao3 = tec.nextInt();
//                                            switch (opcao3) {
//                                                case 1:
//                                                    System.out.print("Informe o novo nome: ");
//                                                    listaProfessores.get(i).setNome(tec.next());
//                                                    break;
//                                                case 2:
//                                                    System.out.print("Informe o novo CPF: ");
//                                                    listaProfessores.get(i).setCpf(tec.next());
//                                                    break;
//                                                case 3:
//                                                    System.out.print("Informe o novo telefone: ");
//                                                    listaProfessores.get(i).setTelefone(tec.next());
//                                                    break;
//                                                case 4:
//                                                    System.out.print("Informe o novo gênero: ");
//                                                    listaProfessores.get(i).setGenero(tec.next());
//                                                    break;
//                                                case 5:
//                                                    System.out.print("Informe a nova idade: ");
//                                                    listaProfessores.get(i).setIdade(tec.nextInt());
//                                                    break;
//                                                case 6:
//                                                    System.out.print("Informe a nova matricula: ");
//                                                    listaProfessores.get(i).setMatricula(tec.nextInt());
//                                                    break;
//                                                case 7:
//                                                    System.out.print("Informe a nova matéria: ");
//                                                    listaProfessores.get(i).setMateria(tec.next());
//                                                    break;
//                                                case 8:
//                                                    System.out.print("Informe o novo turno: ");
//                                                    listaProfessores.get(i).setTurno(tec.next());
//                                                    break;
//                                                case 9:
//                                                    System.out.print("Informe o novo salário: ");
//                                                    listaProfessores.get(i).setSalario(tec.nextDouble());
//                                                    break;
//                                            }
//                                        }
//                                    }
//                                    break;
//                                case 2:
//                                    for (int i = 0; i < listaAlunos.size(); i++) {
//                                        if (listaAlunos.get(i).getMatricula() == matricula) {
//                                            System.out.println("Informe o que deseja editar: " +
//                                                    "\n1- Nome" +
//                                                    "\n2- Cpf" +
//                                                    "\n3- Telefone" +
//                                                    "\n4- Gênero" +
//                                                    "\n5- Idade" +
//                                                    "\n6- Matrícula" +
//                                                    "\n7- Turma" +
//                                                    "\n8- Nota 1" +
//                                                    "\n9- Nota 2" +
//                                                    "\n10- Nota 3");
//                                            int opcao4 = tec.nextInt();
//                                            switch (opcao4) {
//                                                case 1:
//                                                    System.out.print("Informe o novo nome: ");
//                                                    listaAlunos.get(i).setNome(tec.next());
//                                                    break;
//                                                case 2:
//                                                    System.out.print("Informe o novo CPF: ");
//                                                    listaAlunos.get(i).setCpf(tec.next());
//                                                    break;
//                                                case 3:
//                                                    System.out.print("Informe o novo telefone: ");
//                                                    listaAlunos.get(i).setTelefone(tec.next());
//                                                    break;
//                                                case 4:
//                                                    System.out.print("Informe o novo gênero: ");
//                                                    listaAlunos.get(i).setGenero(tec.next());
//                                                    break;
//                                                case 5:
//                                                    System.out.print("Informe a nova idade: ");
//                                                    listaAlunos.get(i).setIdade(tec.nextInt());
//                                                    break;
//                                                case 6:
//                                                    System.out.print("Informe a nova matricula: ");
//                                                    listaAlunos.get(i).setMatricula(tec.nextInt());
//                                                    break;
//                                                case 7:
//                                                    System.out.print("Informe a nova turma: ");
//                                                    listaAlunos.get(i).setTurma(tec.next());
//                                                    break;
//                                                case 8:
//                                                    System.out.print("Informe a nova nota 1: ");
//                                                    listaAlunos.get(i).setNota1(tec.nextDouble());
//                                                    listaAlunos.get(i).setMedia((listaAlunos.get(i).getNota1() + listaAlunos.get(i).getNota2() +
//                                                            listaAlunos.get(i).getNota3()) / 3);
//                                                    break;
//                                                case 9:
//                                                    System.out.print("Informe a nova nota 2: ");
//                                                    listaAlunos.get(i).setNota2(tec.nextDouble());
//                                                    listaAlunos.get(i).setMedia((listaAlunos.get(i).getNota1() + listaAlunos.get(i).getNota2() +
//                                                            listaAlunos.get(i).getNota3()) / 3);
//                                                    break;
//                                                case 10:
//                                                    System.out.print("Informe a nova nota 3: ");
//                                                    listaAlunos.get(i).setNota3(tec.nextDouble());
//                                                    listaAlunos.get(i).setMedia((listaAlunos.get(i).getNota1() + listaAlunos.get(i).getNota2() +
//                                                            listaAlunos.get(i).getNota3()) / 3);
//                                                    break;
//                                            }
//                                        }
//                                        break;
//                                    }
//                                    break;
//                            }
//                            break;
//                        case 2:
//                            System.out.println("Editar" +
//                                    "\n1- Professor" +
//                                    "\n2- Aluno");
//                            opcao = tec.nextInt();
//                            System.out.println("Matricula: ");
//                            matricula = tec.nextInt();
//                            switch(opcao){
//                                case 1:
//                                    for(int i =0; i<listaProfessores.size();i++){
//                                        if(listaProfessores.get(i).getMatricula() == matricula){
//                                                System.out.print("Informe o novo nome: ");
//                                                listaProfessores.get(i).setNome(tec.next());
//
//                                                System.out.print("Informe o novo CPF: ");
//                                                listaProfessores.get(i).setCpf(tec.next());
//
//                                                System.out.print("Informe o novo telefone: ");
//                                                listaProfessores.get(i).setTelefone(tec.next());
//
//                                                System.out.print("Informe o novo gênero: ");
//                                                listaProfessores.get(i).setGenero(tec.next());
//
//                                                System.out.print("Informe a nova idade: ");
//                                                listaProfessores.get(i).setIdade(tec.nextInt());
//
//                                                System.out.print("Informe a nova matricula: ");
//                                                listaProfessores.get(i).setMatricula(tec.nextInt());
//
//                                                System.out.print("Informe a nova matéria: ");
//                                                listaProfessores.get(i).setMateria(tec.next());
//
//                                                System.out.print("Informe o novo turno: ");
//                                                listaProfessores.get(i).setTurno(tec.next());
//
//                                                System.out.print("Informe o novo salário: ");
//                                                listaProfessores.get(i).setSalario(tec.nextDouble());
//                                        }
//                                    }
//                                    break;
//                                case 2:
//                                    for(int i =0;i<listaAlunos.size();i++){
//                                        if(listaAlunos.get(i).getMatricula() == matricula){
//
//                                            System.out.print("Informe o novo nome: ");
//                                            listaAlunos.get(i).setNome(tec.next());
//
//                                            System.out.print("Informe o novo CPF: ");
//                                            listaAlunos.get(i).setCpf(tec.next());
//
//                                            System.out.print("Informe o novo telefone: ");
//                                            listaAlunos.get(i).setTelefone(tec.next());
//
//                                            System.out.print("Informe o novo gênero: ");
//                                            listaAlunos.get(i).setGenero(tec.next());
//
//                                            System.out.print("Informe a nova idade: ");
//                                            listaAlunos.get(i).setIdade(tec.nextInt());
//
//                                            System.out.print("Informe a nova matricula: ");
//                                            listaAlunos.get(i).setMatricula(tec.nextInt());
//
//                                            System.out.print("Informe a nova turma: ");
//                                            listaAlunos.get(i).setTurma(tec.next());
//
//                                            System.out.print("Informe a nova nota 1: ");
//                                            listaAlunos.get(i).setNota1(tec.nextDouble());
//
//                                            System.out.print("Informe a nova nota 2: ");
//                                            listaAlunos.get(i).setNota2(tec.nextDouble());
//
//                                            System.out.print("Informe a nova nota 3: ");
//                                            listaAlunos.get(i).setNota3(tec.nextDouble());
//
//                                            listaAlunos.get(i).setMedia(
//                                                    (listaAlunos.get(i).getNota1() + listaAlunos.get(i).getNota2() +
//                                                            listaAlunos.get(i).getNota3()) / 3);
//
//                                        }
//                                    }
//                            }
//                            break;
//                    }
//                    break;
//                        case 3:
//                            System.out.println("Remover" +
//                                    "\n1- Professor" +
//                                    "\n2- Aluno");
//                            opcao = tec.nextInt();
//                            System.out.println("Matricula: ");
//                            matricula = tec.nextInt();
//                            switch (opcao) {
//                                case 1:
//                                    for (int i = 0; i < listaProfessores.size(); i++) {
//                                        if (listaProfessores.get(i).getMatricula() == matricula) {
//                                            System.out.println(listaProfessores.get(i).toString());
//                                            System.out.println("Deseja realmente remover este professor?" +
//                                                    "\n1- Sim" +
//                                                    "\n2- Não");
//                                            int delete = tec.nextInt();
//                                            if (delete == 1) {
//                                                listaProfessores.remove(i);
//                                            }
//                                            break;
//                                        }
//                                    }
//
//                                    break;
//                                case 2:
//                                    for (int i = 0; i < listaAlunos.size(); i++) {
//                                        if (listaAlunos.get(i).getMatricula() == matricula) {
//                                            System.out.println(listaAlunos.get(i).toString());
//                                            System.out.println("Deseja realmente remover este professor?" +
//                                                    "\n1- Sim" +
//                                                    "\n2- Não");
//                                            int delete = tec.nextInt();
//                                            if (delete == 1) {
//                                                listaAlunos.remove(i);
//                                            }
//                                        }
//                                    }
//                                    break;
//
//                            }
//                            break;
//                        case 4:
//                            System.out.println("Listar" +
//                                    "\n1- Professor" +
//                                    "\n2- Aluno");
//                            opcao = tec.nextInt();
//                            switch (opcao) {
//                                case 1:
//                                    for (int i = 0; i < listaProfessores.size(); i++) {
//                                        System.out.println(listaProfessores.get(i).toString());
//                                    }
//                                    break;
//                                case 2:
//                                    for (int i = 0; i < listaAlunos.size(); i++) {
//                                        System.out.println(listaAlunos.get(i).toString());
//                                    }
//                                    break;
//
//                            }
//                            break;
//                        case 5:
//                            encerrar = 0;
//                            break;
//                    }
//        }while (encerrar != 0) ;
//    }
//}
