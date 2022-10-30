package domain;

import domain.documento.Documento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Pessoa {


    private List<Documento> documentos = new ArrayList<>();
    public Colaborador(Integer identificador, String nome, String sobrenome, LocalDate dataDeNascimento, String CPF, String endereco) {
       super(identificador, nome,sobrenome,dataDeNascimento,CPF,endereco);
    }


    public void criaDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento Criado");
    }

}
