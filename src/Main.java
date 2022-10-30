import domain.*;
import domain.documento.Documento;
import repository.ListaFuncionario;
import repository.ListaGerente;
import repository.ListaPessoa;
import repository.ListaSupervisor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Funcionario funcionario1 = new Funcionario("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Funcionario funcionario2 = new Funcionario("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Funcionario funcionario3 = new Funcionario("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");

        Supervisor supervisor = new Supervisor("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Supervisor supervisor1 = new Supervisor("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Supervisor supervisor2 = new Supervisor("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");

        Gerente gerente = new Gerente("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Gerente gerente1 = new Gerente("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");
        Gerente gerente2 = new Gerente("Marlon","Rech", LocalDate.of(1993,8,3), "8921478", "Rua Juvenal Macedo");


        //System.out.println(funcionario);
        //System.out.printf(ListaPessoa.retornarTodos().toString());
        //funcionario.criaDocumento(new Documento(1, 2, "kkk"));
        //funcionario.criaDocumento(new Documento(1,3, "sadfasdas"));
        //funcionario.criaDocumento(new Documento(1, 4, "jisodoisa"));


        System.out.println("Bem vindo ao DevInDocs");

        boolean sair = true;

        while(sair) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.print(" 1 - Cadastrar Documento (Funcionario)\n 2 - Cadastrar Documento (Supervisor) \n 3 - Cadastrar Documento (Gerente) \n 4 - Pedir Aprovação do Documento \n 5 - Rejeitar Documento \n 6 - Arquivar Documento \n 7 - Lista de todos os funcionarios \n 8 - Sair \n Entre a opção escolhida: "  );
            Scanner scan = new Scanner(System.in);
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro documento como Funcionario: ");
                    System.out.print("Digite o identificador do responsavel: ");
                    int idResponsavel = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o identificador do criador: ");
                    int idCriador = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o link do documento: ");
                    String linkDocumento = scan.nextLine();
                    funcionario.criaDocumento(new Documento(idResponsavel,idCriador,linkDocumento));
                    break;

                case 2:
                    System.out.println("Cadastro documento como Supervisor: ");
                    System.out.print("Digite o identificador do responsavel: ");
                    int idResponsavel1 = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o identificador do criador: ");
                    int idCriador1 = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o link do documento: ");
                    String linkDocumento1 = scan.nextLine();
                    supervisor.criaDocumento(new Documento(idResponsavel1,idCriador1,linkDocumento1));
                    break;

                case 3:
                    System.out.println("Cadastro documento como Gerente: ");
                    System.out.print("Digite o identificador do responsavel: ");
                    int idResponsavel2 = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o identificador do criador: ");
                    int idCriador2 = Integer.parseInt(scan.nextLine());
                    System.out.print("Digite o link do documento: ");
                    String linkDocumento2 = scan.nextLine();
                    gerente.criaDocumento(new Documento(idResponsavel2,idCriador2,linkDocumento2));
                    break;


                case 4:
                    System.out.println("APROVAR DOCUMENTO");
                    System.out.print("Qual é o ID do aprovador: ");
                    int idDoAprovador = Integer.parseInt(scan.nextLine());
                    System.out.print("Qual é o identificador do Documento: ");
                    int idDoDocumento = Integer.parseInt(scan.nextLine());
                    funcionario.pedirAprovacaoDocumento(idDoAprovador, idDoDocumento);
                    break;

                case 5:
                    System.out.println("REJEITAR DOCUMENTO");
                    System.out.print("Qual é o ID do aprovador: ");
                    int idDoAprovador2 = Integer.parseInt(scan.nextLine());
                    System.out.print("Qual é o identificador do Documento: ");
                    int idDoDocumento2 = Integer.parseInt(scan.nextLine());
                    funcionario.rejeitarDocumento(idDoAprovador2, idDoDocumento2);
                    break;

                case 6:
                    System.out.println("APROVAR E ARQUIVAR DOCUMENTO");
                    System.out.print("Qual é o ID do aprovador: ");
                    int idDoAprovador1 = Integer.parseInt(scan.nextLine());
                    System.out.print("Qual é o identificador do Documento: ");
                    int idDoDocumento1 = Integer.parseInt(scan.nextLine());
                    supervisor.enviarDocumentoGerente(idDoAprovador1,idDoDocumento1);
                    break;

                case 7:
                    System.out.println("LISTA DE TODOS OS FUNCIONARIOS");
                    System.out.println(ListaFuncionario.retornarTodos().toString());
                    System.out.println("LISTA DE TODOS OS SUPERVISORES");
                    System.out.println(ListaSupervisor.retornarTodos().toString());
                    System.out.println("LISTA DE TODOS OS GERENTES");
                    System.out.println(ListaGerente.retornarTodos().toString());

                    break;

                case 8:
                    sair = false;
                    break;
            }

            System.out.print("Deseja Encerrar?" +
                    "\n 1 - Sim" +
                    "\n 2 - Não" +
                    "\n Entre a opção escolhida: ");

            Integer encerrar = scan.nextInt();

            switch (encerrar) {
                case 1:
                    sair = false;
                    break;

                case 2:
                    sair = true;
            }

        }

    }
}