/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeDao;

import Entidade.Funcionario;
import Entidade.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor.rocha
 */
public class ProfessorDaoImpl implements ProfessorDao {

    private Connection conn;
    private PreparedStatement prepareSql;
    private ResultSet resultado;

    @Override
    public void salvar(Professor professor) throws Exception {
        String comando = "INSERT INTO prof (nm_prof, id_func, area) values (?, ?, ?)";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, professor.getNmProf());
            prepareSql.setInt(2, professor.getFuncionario().getId());
            prepareSql.setString(3, professor.getArea());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar um novo professor " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void alterar(Professor professor) throws Exception {
        String comando = "UPDATE prof SET nm_prof = ?, id_func = ?, area = ? WHERE cod_prof = ?";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, professor.getNmProf());
            prepareSql.setInt(2, professor.getFuncionario().getId());
            prepareSql.setString(3, professor.getArea());
            prepareSql.setInt(4, professor.getCodProf());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao alterar dados do professor " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void excluir(int codProf) throws Exception {
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement("DELETE FROM prof WHERE cod_prof = ?");
            prepareSql.setInt(1, codProf);
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao deletar cadastro do professor " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public Professor pesquisarPorId(int codProf) throws Exception {
        String comando = "select p.cod_prof, p.nm_prof, p.area, f.nome, f.sobrenome, f.cargo, f.id\n"
                + "from prof p join funcionario_acad f\n"
                + "on p.id_func = f.id\n"
                + "where cod_prof = ? ";
        Professor professor = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setInt(1, codProf);
            resultado = prepareSql.executeQuery();
            Funcionario funcionario;
            if (resultado.next()) {
                professor = new Professor();
                professor.setCodProf(resultado.getInt("cod_prof"));
                professor.setNmProf(resultado.getString("nm_prof"));
                funcionario = new Funcionario(
                        resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        resultado.getInt("id")
                );
                professor.setFuncionario(funcionario);
                professor.setArea(resultado.getString("area"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar professor por id " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return professor;
    }

    @Override
    public List<Professor> pesquisarPorNome(String nmProf) throws Exception {
        Professor professor;
        String comando = "select p.cod_prof, p.nm_prof, p.area, f.nome, f.sobrenome, f.cargo, f.id\n"
                + "from prof p join funcionario_acad f\n"
                + "on p.id_func = f.id\n"
                + "where p.nm_prof LIKE";
        List<Professor> professores = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, "%" + nmProf + "%");
            resultado = prepareSql.executeQuery();
            Funcionario funcionario;
            while (resultado.next()) {
                professor = new Professor();
                professor.setCodProf(resultado.getInt("cod_prof"));
                professor.setNmProf(resultado.getString("nm_prof"));
                funcionario = new Funcionario(
                        resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        resultado.getInt("id")
                );
                professor.setFuncionario(funcionario);
                professor.setArea(resultado.getString("area"));
                professores.add(professor);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar professor por nome " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return professores;
    }

}
