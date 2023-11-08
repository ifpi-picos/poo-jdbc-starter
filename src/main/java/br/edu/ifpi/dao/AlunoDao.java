package br.edu.ifpi.dao;

import java.util.List;
import br.edu.ifpi.entidades.Aluno;

public class AlunoDao implements Dao<Aluno> {

  public int cadastrar(Aluno aluno) {
    return 0;
  }

  public List<Aluno> consultarTodos() {
    return null;
  }

  @Override
  public int alterar(Aluno entidade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'alterar'");
  }

  @Override
  public int remover(Aluno entidade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remover'");
  }

}
