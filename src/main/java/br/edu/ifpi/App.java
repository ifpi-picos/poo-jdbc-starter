package br.edu.ifpi;

import java.sql.Connection;
import javax.swing.JOptionPane;
import br.edu.ifpi.dao.Conexao;
import br.edu.ifpi.dao.ProfessorDao;
import br.edu.ifpi.entidades.Professor;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Sistema de cursos online!");
        Connection conexao = Conexao.getConexao();
        ProfessorDao professorDao = new ProfessorDao(conexao);

        String nome = JOptionPane.showInputDialog("Nome: ");
        // String email = JOptionPane.showInputDialog("Email: ");

        Professor novoProfessor = new Professor(nome, null);

        int retorno = professorDao.cadastrar(novoProfessor);

        String mensagem = retorno > 0 ? "Sucesso!" : "Falhou!";

        JOptionPane.showMessageDialog(null, mensagem, "Retorno", JOptionPane.INFORMATION_MESSAGE);
    }
}
