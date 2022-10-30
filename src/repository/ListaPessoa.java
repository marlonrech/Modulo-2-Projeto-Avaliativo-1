package repository;

import domain.Funcionario;
import domain.Gerente;
import domain.Pessoa;
import domain.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {
    public static List<Pessoa> pessoas = new ArrayList<>();

    public static void adicionar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }


    public static Pessoa retornar (Integer id) {
        return pessoas.get(id);
    }

    public static List<Pessoa> retornarTodos() {
      return pessoas;
    };




}
