package domain;

import domain.documento.Documento;
import repository.ListaFuncionario;
import repository.ListaGerente;
import repository.ListaSupervisor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Colaborador{
    private static Integer contador = 0;
    private static List<Documento> documentos = new ArrayList<>();
    private static List<Documento> documentosReprovados = new ArrayList<Documento>();

    public Supervisor(String nome, String sobrenome, LocalDate dataDeNascimento, String CPF, String endereco) {
        super(contador++, nome, sobrenome, dataDeNascimento, CPF, endereco);
        ListaSupervisor.adicionar(this);
    }

    @Override
    public void criaDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento Aprovado pelo Supervisor");

    }

    public void aprovarDocumentoSupervisor(Documento documento) {
        System.out.println("Documento Aprovado pelo Supervisor: " + this.getNome());
        documentos.add(documento);
    }

    public void rejeitarDocumentoSupervisor(Documento documento) {
        System.out.println("Documento rejeitado pelo supervisor: " + this.getNome());
        documentosReprovados.add(documento);
    }



    public void enviarDocumentoGerente(Integer idAprovador, Integer idDocumento) {
        try {
            Gerente aprovador = ListaGerente.retornar(idAprovador);
            aprovador.aprovarDocumento(documentos.get(idDocumento));
        }catch (Exception e) {
            throw e;
        }

    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}

