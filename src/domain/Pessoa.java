package domain;

import java.time.LocalDate;

public class Pessoa {
    private Integer identificador;
   private String nome;
   private String sobrenome;
   private Integer idade;
   private LocalDate dataDeNascimento;
   private String CPF;
   private String endereco;

    public Pessoa(Integer identificador, String nome, String sobrenome, LocalDate dataDeNascimento, String CPF, String endereco) {
        this.identificador = identificador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        this.idade = calcularIdade();
    }

    public Pessoa () {

    }

    public Integer calcularIdade() {
        this.idade = LocalDate.now().getYear() - dataDeNascimento.getYear();
        return this.idade;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", dataDeNascimento=" + dataDeNascimento +
                ", CPF='" + CPF + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
