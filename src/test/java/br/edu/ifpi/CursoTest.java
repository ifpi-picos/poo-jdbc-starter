package br.edu.ifpi;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import br.edu.ifpi.enums.StatusCurso;

public class CursoTest {

  Curso cursoPadrao = null;


  @Before
  public void setup() {
    cursoPadrao =
        new Curso("Padrão", StatusCurso.ABERTO, 80, new Professor("Professor", 1, "89999"));
  }

  @Test
  public void cursoAbertoDeveAceitarMatriculaDeAluno() {
    Aluno aluno = new Aluno("Aluno", 0, "899999");
    assertTrue(cursoPadrao.getAlunos().size() == 0);
    cursoPadrao.realizaMatricula(aluno);
    assertTrue(cursoPadrao.getAlunos().size() == 1);
  }

  @Test
  public void cursoFechadoDeveRecusarMatriculaDeAluno() {
    Aluno aluno = new Aluno("Aluno", 0, "899999");
    cursoPadrao.setStatus(StatusCurso.FECHADO);
    cursoPadrao.realizaMatricula(aluno);
    assertTrue(cursoPadrao.getAlunos().size() == 0);
  }

}
