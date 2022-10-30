package domain;

import domain.documento.Documento;
import repository.ListaGerente;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Colaborador{
    private static Integer contador = 0;


    private static   List<Documento> documentos = new ArrayList<>();

    private static List<Documento> documentosArquivados = new ArrayList<>();

    public Gerente(String nome, String sobrenome, LocalDate dataDeNascimento, String CPF, String endereco) {
        super(contador++, nome, sobrenome, dataDeNascimento, CPF, endereco);
        ListaGerente.adicionar(this);
    }

    @Override
    public void criaDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento Aprovado pelo Gerente");


    }

    public void aprovarDocumento(Documento documento) {
        System.out.println("Documento aprovado e arquivado pelo Gerente: " + this.getNome());
        documentos.add(documento);

    }
}
