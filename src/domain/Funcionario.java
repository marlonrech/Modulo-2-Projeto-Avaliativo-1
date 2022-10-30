package domain;

import domain.documento.Documento;
import repository.ListaFuncionario;
import repository.ListaPessoa;
import repository.ListaSupervisor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Colaborador {
    private static Integer contador = 0;
    private List<Documento> documentos = new ArrayList<>();

    private List<Documento> documentosRejeitados = new ArrayList<>();
    public Funcionario(String nome, String sobrenome, LocalDate dataDeNascimento, String CPF, String endereco) {
        super(contador++, nome, sobrenome, dataDeNascimento, CPF, endereco);
        ListaFuncionario.adicionar(this);
    }

    @Override
    public void criaDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento criado por funcionario");
        System.out.println(documento);
        System.out.println(documentos);


    };

    public void pedirAprovacaoDocumento(Integer idAprovador, Integer idDocumento) {
        try{
            Supervisor aprovador = ListaSupervisor.retornar(idAprovador);
            aprovador.aprovarDocumentoSupervisor(documentos.get(idDocumento));
        }catch (Exception e) {
            throw e;
        }

    }

    public void rejeitarDocumento(Integer idAprovador, Integer idDocumento) {
        try {
            Supervisor aprovador = ListaSupervisor.retornar(idAprovador);
            aprovador.rejeitarDocumentoSupervisor(documentos.get(idDocumento));
        } catch (Exception e) {
            throw e;
        }

    }
}
