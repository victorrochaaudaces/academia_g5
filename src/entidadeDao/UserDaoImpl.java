/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadeDao;

import entidade.TipoPlan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entidade.User;
import java.sql.Statement;

/**
 *
 * @author victo
 */
public class UserDaoImpl implements UserDao {

    private Connection conn;
    private PreparedStatement prepareSql;
    private ResultSet resultado;

    @Override
    public void salvar(User user) throws Exception {
        String comando = "INSERT INTO  aluno_acad\n"
                + " ( nome, sobrenome, email, endereco, idade, rest_med, num_tel, peso, altura, cod_plan, senha)\n"
                + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando, Statement.RETURN_GENERATED_KEYS);
            prepareSql.setString(1, user.getNome());
            prepareSql.setString(2, user.getSobrenome());
            prepareSql.setString(3, user.getEmail());
            prepareSql.setString(4, user.getEndereco());
            prepareSql.setInt(5, user.getIdade());
            prepareSql.setString(6, user.getRest_med());
            prepareSql.setLong(7, user.getNum_tel());
            prepareSql.setDouble(8, user.getPeso());
            prepareSql.setDouble(9, user.getAltura());
            prepareSql.setInt(10, user.getTipoPlan().getCodPlan());
            prepareSql.setString(11, user.getSenha());
            prepareSql.executeUpdate();
            resultado = prepareSql.getGeneratedKeys();
            resultado.next();
            user.setMatricula(resultado.getInt(1));
        } catch (Exception e) {
            System.out.println("Erro ao salvar o cadastro do usuário: " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void alterar(User user) throws Exception {
//        metodo de alteração do cadastro
        String comando = "UPDATE aluno_acad SET\n"
                + "nome = ?, sobrenome = ?, email = ?, endereco = ?, idade = ?,\n"
                + "rest_med = ?, num_tel = ?, peso = ?, altura = ?, cod_plan = ?, senha = ? WHERE matricula = ?";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, user.getNome());
            prepareSql.setString(2, user.getSobrenome());
            prepareSql.setString(3, user.getEmail());
            prepareSql.setString(4, user.getEndereco());
            prepareSql.setInt(5, user.getIdade());
            prepareSql.setString(6, user.getRest_med());
            prepareSql.setLong(7, user.getNum_tel());
            prepareSql.setDouble(8, user.getPeso());
            prepareSql.setDouble(9, user.getAltura());
            prepareSql.setInt(10, user.getTipoPlan().getCodPlan());
            prepareSql.setString(11, user.getSenha());
            prepareSql.setInt(12, user.getMatricula());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o cadastro do usuário: " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void excluir(int matricula) throws Exception {
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement("DELETE FROM aluno_acad WHERE matricula = ?");
            prepareSql.setInt(1, matricula);
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao deletar o cadastro " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public User pesquisarporMatricula(int matricula) throws Exception {
        String sql = "SELECT a.matricula a_matricula, a.nome a_nome, p.nm_plan p_nm_plan, p.cod_plan p_cod_plan, a.*, p.*\n"
                + "from aluno_acad a join tipo_plan p \n"
                + "on a.cod_plan = p.cod_plan\n"
                + "WHERE matricula = ?";
        User user = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setInt(1, matricula);
            resultado = prepareSql.executeQuery();
            TipoPlan tipoPlan;
            if (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getLong("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                tipoPlan = new TipoPlan(
                        resultado.getInt("cod_plan"),
                        resultado.getString("nm_plan"),
                        resultado.getDouble("mensalidade")
                );
                user.setTipoPlan(tipoPlan);
                user.setSenha(resultado.getString("senha"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar cadastro pela matricula " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return user;
    }

    @Override
    public List<User> pesquisarporNome(String nome) throws Exception {
        User user;
        String sql = "SELECT a.*, p.*, p.cod_plan p_cod_plan FROM aluno_acad a \n"
                + "join tipo_plan p \n"
                + "on a.cod_plan = p.cod_plan \n"
                + "WHERE a.nome LIKE ?";
        List<User> users = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setString(1, "%" + nome + "%");
            resultado = prepareSql.executeQuery();
            TipoPlan tipoPlan;
            while (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getLong("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                tipoPlan = new TipoPlan(
                        resultado.getInt("p_cod_plan"),
                        resultado.getString("nm_plan"),
                        resultado.getDouble("mensalidade")
                );
                user.setTipoPlan(tipoPlan);
                user.setSenha(resultado.getString("senha"));
                users.add(user);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por nome " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return users;
    }

    @Override
    public User logar(String email, String senha) throws Exception {
        String sql = "select a.*, p.* \n"
                + "from aluno_acad a join tipo_plan p \n"
                + "on a.cod_plan = p.cod_plan \n"
                + "where a.email = ? and a.senha = ?;";
        User user = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setString(1, email);
            prepareSql.setString(2, senha);
            resultado = prepareSql.executeQuery();
            TipoPlan tipoPlan;
            if (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenome(resultado.getString("sobrenome"));
                user.setEmail(email);
                user.setSenha(senha);
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getLong("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                tipoPlan = new TipoPlan(
                        resultado.getInt("cod_plan"),
                        resultado.getString("nm_plan"),
                        resultado.getDouble("mensalidade")
                );
                user.setTipoPlan(tipoPlan);
            }
        } catch (Exception e) {
            System.out.println("Erro ao logar usuário " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return user;
    }

    @Override
    public List<User> pesquisarTodo() throws Exception {
        User user;
        String comando = "select a.*, p.* \n"
                + "from aluno_acad a join tipo_plan p\n"
                + "on a.cod_plan = p.cod_Plan;";
        List<User> users = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            resultado = prepareSql.executeQuery();
            TipoPlan tipoPlan;
            while (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getLong("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                tipoPlan = new TipoPlan(
                        resultado.getInt("cod_plan"),
                        resultado.getString("nm_plan"),
                        resultado.getDouble("mensalidade")
                );
                user.setTipoPlan(tipoPlan);
                user.setSenha(resultado.getString("senha"));
                users.add(user);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pegar dados dos alunos " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return users;
    }

}
