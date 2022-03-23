//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
//        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
//
//        Professor johnatan = new Professor();
//        johnatan.setNome("Johnatan");
//        johnatan.setIdade(30);
//        johnatan.setCpf("123.456.789-00");
//        johnatan.setGenero("Masculino");
//        johnatan.setTelefone("(47)99999-0000");
//        johnatan.setMatricula(1);
//        johnatan.setTurno("Mat / Ves");
//        johnatan.setMateria("Banco de Dados");
//        johnatan.setSalario(10000);
//        listaProfessores.add(johnatan);
//
//        String nome, cpf, telefone, genero;
//        int idade, matricula;
//        String turma;
//        double nota1, nota2, nota3, media;
//        String materia, turno;
//        double salario;
//
//        int encerrar = 1;
//
//        nome = "Henrique";
//        cpf = "987.654.321-00";
//        telefone = "(47)90000-9999";
//        genero = "Masculino";
//        idade = 16;
//        matricula = 1;
//        turma = "PSIN 2021";
//        nota1 = 7.5;
//        nota2 = 8.5;
//        nota3 = 9.5;
//        media = (nota1 + nota2 + nota3) / 3;
//        Aluno henrique = new Aluno(nome, cpf, telefone, genero, idade, matricula,
//                turma, nota1, nota2, nota3, media);
//        listaAlunos.add(henrique);
//
//        nome = "Ester";
//        cpf = "321.654.987-00";
//        turma = "PSIN 2021";
//        Aluno ester = new Aluno(nome, cpf, turma);
//
//        johnatan.cadastrarNota(1, 10.0, ester);
//
//        listaAlunos.add(ester);
//        do {
//            System.out.println("MENU:" +
//                    "\n1 - Cadastrar" +
//                    "\n2 - Editar" +
//                    "\n3 - Remover" +
//                    "\n4 - Listar" +
//                    "\n5 - Encerrar");
//            int opcaoMenu = sc.nextInt();
//            switch (opcaoMenu) {
//                case 1: {
//                    System.out.println("Cadastrar:" +
//                            "\n1 - Professor" +
//                            "\n2 - Aluno");
//                    int opcaoTipo = sc.nextInt();
//                    System.out.println("Insira os dados" +
//                            "\nNome: ");
//                    nome = sc.next();
//                    System.out.println("CPF: ");
//                    cpf = sc.next();
//                    System.out.println("Telefone: ");
//                    telefone = sc.next();
//                    System.out.println("Genero: ");
//                    genero = sc.next();
//                    System.out.println("Idade: ");
//                    idade = sc.nextInt();
//                    System.out.println("Matrícula: ");
//                    matricula = sc.nextInt();
//                    switch (opcaoTipo) {
//                        case 1:
//                            System.out.println("Matéria: ");
//                            materia = sc.next();
//                            System.out.println("Turno: ");
//                            turno = sc.next();
//                            System.out.println("Salário: ");
//                            salario = sc.nextDouble();
//                            Professor professor = new Professor(nome, cpf, telefone,
//                                    genero, idade, matricula, materia, turno, salario);
//                            listaProfessores.add(professor);
//                            break;
//                        case 2:
//                            System.out.println("Turma: ");
//                            turma = sc.next();
//                            nota1 = 0.0;
//                            nota2 = 0.0;
//                            nota3 = 0.0;
//                            media = (nota1 + nota2 + nota3) / 3;
//                            Aluno aluno = new Aluno(nome, cpf, telefone,
//                                    genero, idade, matricula, turma, nota1, nota2,
//                                    nota3, media);
//                            listaAlunos.add(aluno);
//                            break;
//                    }
//                    break;
//                }
//                case 2: {
//                    System.out.println("Editar:" +
//                            "\n1 - Professor" +
//                            "\n2 - Aluno");
//                    int opcaoTipo = sc.nextInt();
//                    System.out.println("Qual a matrícula do " + ((opcaoTipo == 1) ? "professor" : "aluno") + "?");
//                    matricula = sc.nextInt();
//                    switch (opcaoTipo) {
//                        case 1:
//                            for (int i = 0; i < listaProfessores.size(); i++) {
//                                if (listaProfessores.get(i).getMatricula() == matricula) {
//                                    System.out.println("Editar:" +
//                                            "\n1 - Todos os atributos" +
//                                            "\n2 - Um atributo");
//                                    int opcaoEditar = sc.nextInt();
//                                    switch (opcaoEditar) {
//                                        case 1:
//                                            System.out.println("Insira os dados" +
//                                                    "\nNome: ");
//                                            nome = sc.next();
//                                            System.out.println("CPF: ");
//                                            cpf = sc.next();
//                                            System.out.println("Telefone: ");
//                                            telefone = sc.next();
//                                            System.out.println("Genero: ");
//                                            genero = sc.next();
//                                            System.out.println("Idade: ");
//                                            idade = sc.nextInt();
//                                            System.out.println("Matrícula: ");
//                                            matricula = sc.nextInt();
//                                            System.out.println("Matéria: ");
//                                            materia = sc.next();
//                                            System.out.println("Turno: ");
//                                            turno = sc.next();
//                                            System.out.println("Salário: ");
//                                            salario = sc.nextDouble();
//                                            Professor professor = new Professor(nome, cpf, telefone,
//                                                    genero, idade, matricula, materia, turno, salario);
//                                            listaProfessores.set(i, professor);
//                                            break;
//                                        case 2:
//                                            System.out.println("Qual atributo deseja editar?" +
//                                                    "\n1 - Nome" +
//                                                    "\n2 - CPF" +
//                                                    "\n3 - Telefone" +
//                                                    "\n4 - Gênero" +
//                                                    "\n5 - Idade" +
//                                                    "\n6 - Matrícula" +
//                                                    "\n7 - Matéria" +
//                                                    "\n8 - Turno" +
//                                                    "\n9 - Salário");
//                                            int atributo = sc.nextInt();
//                                            switch (atributo) {
//                                                case 1:
//                                                    nome = sc.next();
//                                                    listaProfessores.get(i).setNome(nome);
//                                                    break;
//                                                case 2:
//                                                    cpf = sc.next();
//                                                    listaProfessores.get(i).setCpf(cpf);
//                                                    break;
//                                                case 3:
//                                                    telefone = sc.next();
//                                                    listaProfessores.get(i).setTelefone(telefone);
//                                                    break;
//                                                case 4:
//                                                    genero = sc.next();
//                                                    listaProfessores.get(i).setGenero(genero);
//                                                    break;
//                                                case 5:
//                                                    idade = sc.nextInt();
//                                                    listaProfessores.get(i).setIdade(idade);
//                                                    break;
//                                                case 6:
//                                                    matricula = sc.nextInt();
//                                                    listaProfessores.get(i).setMatricula(matricula);
//                                                    break;
//                                                case 7:
//                                                    materia = sc.next();
//                                                    listaProfessores.get(i).setMateria(materia);
//                                                    break;
//                                                case 8:
//                                                    turno = sc.next();
//                                                    listaProfessores.get(i).setTurno(turno);
//                                                    break;
//                                                case 9:
//                                                    salario = sc.nextDouble();
//                                                    listaProfessores.get(i).setSalario(salario);
//                                                    break;
//                                            }
//                                            break;
//                                    }
//                                    break;
//                                }
//                            }
//                            break;
//                        case 2:
//                            for (int i = 0; i < listaAlunos.size(); i++) {
//                                if (listaAlunos.get(i).getMatricula() == matricula) {
//                                    System.out.println("Editar:" +
//                                            "\n1 - Todos os atributos" +
//                                            "\n2 - Um atributo");
//                                    int opcaoEditar = sc.nextInt();
//                                    switch (opcaoEditar) {
//                                        case 1:
//                                            System.out.println("Insira os dados" +
//                                                    "\nNome: ");
//                                            nome = sc.next();
//                                            System.out.println("CPF: ");
//                                            cpf = sc.next();
//                                            System.out.println("Telefone: ");
//                                            telefone = sc.next();
//                                            System.out.println("Genero: ");
//                                            genero = sc.next();
//                                            System.out.println("Idade: ");
//                                            idade = sc.nextInt();
//                                            System.out.println("Matrícula: ");
//                                            matricula = sc.nextInt();
//                                            System.out.println("Turma: ");
//                                            turma = sc.next();
//                                            nota1 = 0.0;
//                                            nota2 = 0.0;
//                                            nota3 = 0.0;
//                                            media = (nota1 + nota2 + nota3) / 3;
//                                            Aluno aluno = new Aluno(nome, cpf, telefone,
//                                                    genero, idade, matricula, turma, nota1, nota2,
//                                                    nota3, media);
//                                            listaAlunos.set(i, aluno);
//                                            break;
//                                        case 2:
//                                            System.out.println("Qual atributo deseja editar?" +
//                                                    "\n1 - Nome" +
//                                                    "\n2 - CPF" +
//                                                    "\n3 - Telefone" +
//                                                    "\n4 - Gênero" +
//                                                    "\n5 - Idade" +
//                                                    "\n6 - Matrícula" +
//                                                    "\n7 - Turma" +
//                                                    "\n8 - Nota 1" +
//                                                    "\n9 - Nota 2" +
//                                                    "\n10 - Nota 3");
//                                            int atributo = sc.nextInt();
//                                            switch (atributo) {
//                                                case 1:
//                                                    nome = sc.next();
//                                                    listaAlunos.get(i).setNome(nome);
//                                                    break;
//                                                case 2:
//                                                    cpf = sc.next();
//                                                    listaAlunos.get(i).setCpf(cpf);
//                                                    break;
//                                                case 3:
//                                                    telefone = sc.next();
//                                                    listaAlunos.get(i).setTelefone(telefone);
//                                                    break;
//                                                case 4:
//                                                    genero = sc.next();
//                                                    listaAlunos.get(i).setGenero(genero);
//                                                    break;
//                                                case 5:
//                                                    idade = sc.nextInt();
//                                                    listaAlunos.get(i).setIdade(idade);
//                                                    break;
//                                                case 6:
//                                                    matricula = sc.nextInt();
//                                                    listaAlunos.get(i).setMatricula(matricula);
//                                                    break;
//                                                case 8:
//                                                    listaProfessores.get(0).cadastrarNota(1, sc.nextInt(), listaAlunos.get(i));
//                                                    break;
//                                                case 9:
//                                                    listaProfessores.get(0).cadastrarNota(2, sc.nextInt(), listaAlunos.get(i));
//                                                    break;
//                                                case 10:
//                                                    listaProfessores.get(0).cadastrarNota(3, sc.nextInt(), listaAlunos.get(i));
//                                                    break;
//                                            }
//                                            break;
//                                    }
//                                    break;
//                                }
//                            }
//                            break;
//                    }
//                    break;
//                }
//                case 3: {
//                    System.out.println("Remover:" +
//                            "\n1 - Professor" +
//                            "\n2 - Aluno");
//                    int opcaoTipo = sc.nextInt();
//                    System.out.println("Matrícula: ");
//                    matricula = sc.nextInt();
//                    switch (opcaoTipo) {
//                        case 1:
//                            for (int i = 0; i < listaProfessores.size(); i++) {
//                                if (listaProfessores.get(i).getMatricula() == matricula) {
//                                    System.out.println(listaProfessores.get(i).toString());
//                                    System.out.println("Deseja realemente remover este professor?" +
//                                            "\n1 - Sim" +
//                                            "\n2 - Não");
//                                    int deleta = sc.nextInt();
//                                    if (deleta == 1) {
//                                        listaProfessores.remove(i);
//                                    }
//                                    break;
//                                }
//                            }
//                            break;
//                        case 2:
//                            for (int i = 0; i < listaAlunos.size(); i++) {
//                                if (listaAlunos.get(i).getMatricula() == matricula) {
//                                    System.out.println(listaAlunos.get(i).toString());
//                                    System.out.println("Deseja realemente remover este aluno?" +
//                                            "\n1 - Sim" +
//                                            "\n2 - Não");
//                                    int deleta = sc.nextInt();
//                                    if (deleta == 1) {
//                                        listaAlunos.remove(i);
//                                    }
//                                    break;
//                                }
//                            }
//                            break;
//                    }
//                    break;
//                }
//                case 4: {
//                    System.out.println("Listar:" +
//                            "\n1 - Professor" +
//                            "\n2 - Aluno");
//                    int opcaoTipo = sc.nextInt();
//                    switch (opcaoTipo) {
//                        case 1:
//                            /*for (int i = 0; i < listaProfessores.size(); i++) {
//                                System.out.println(listaProfessores.get(i).toString());
//                            }*/
//                            for (Professor professor : listaProfessores) {
//                                System.out.println(professor.toString());
//                            }
//                            break;
//                        case 2:
//                            /*for (int i = 0; i < listaAlunos.size(); i++) {
//                                System.out.println(listaAlunos.get(i).toString());
//                            }*/
//                            for (Aluno aluno : listaAlunos) {
//                                System.out.println(aluno.toString());
//                            }
//                            break;
//                    }
//                    break;
//                }
//                case 5: {
//                    encerrar = 0;
//                    break;
//                }
//            }
//        } while (encerrar != 0);
//    }
//}