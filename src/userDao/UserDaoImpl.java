/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import user.User;

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
        String comando = "INSERT INTO  cad_usuario\n"
                + "( nome, sobrenome, email, endereco, idade, rest_med, num_tel, peso, altura, cod_plan, senha)\n"
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, user.getNome());
            prepareSql.setString(2, user.getSobrenmome());
            prepareSql.setString(3, user.getEmail());
            prepareSql.setString(4, user.getEndereco());
            prepareSql.setInt(5, user.getIdade());
            prepareSql.setString(6, user.getRest_med());
            prepareSql.setDouble(7, user.getNum_tel());
            prepareSql.setDouble(8, user.getPeso());
            prepareSql.setDouble(9, user.getAltura());
            prepareSql.setInt(10, user.getCod_plan());
            prepareSql.setString(11, user.getSenha());
            prepareSql.executeUpdate();
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
        String comando = "UPDATE cad_usuario SET\n"
                + "nome = ?, sobrenome = ?, email = ?, endereco = ?, idade = ?,\n"
                + "rest_med = ?, num_tel = ?, peso = ?, altura = ?, cod_plan = ?, senha = ? WHERE matricula = ?";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, user.getNome());
            prepareSql.setString(2, user.getSobrenmome());
            prepareSql.setString(3, user.getEmail());
            prepareSql.setString(4, user.getEndereco());
            prepareSql.setInt(5, user.getIdade());
            prepareSql.setString(6, user.getRest_med());
            prepareSql.setDouble(7, user.getNum_tel());
            prepareSql.setDouble(8, user.getPeso());
            prepareSql.setDouble(9, user.getAltura());
            prepareSql.setInt(10, user.getCod_plan());
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
            prepareSql = conn.prepareStatement("DELETE FROM cad_usuario WHERE matricula = ?");
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
        String sql = "SELECT * FROM cad_usuario WHERE matricula = ?";
        User user = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setInt(1, matricula);
            resultado = prepareSql.executeQuery();
            if (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenmome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getDouble("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                user.setCod_plan(resultado.getInt("cod_plan"));
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
        String sql = "SELECT * FROM cad_usuario WHERE nome LIKE ?";
        List<User> users = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setString(1, "%" + nome + "%");
            resultado = prepareSql.executeQuery();
            User user;
            while (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenmome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getDouble("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                user.setCod_plan(resultado.getInt("cod_plan"));
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
        String sql = "SELECT * FROM cad_usuario WHERE email = ? and senha = ?";
        User user = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(sql);
            prepareSql.setString(1, email);
            prepareSql.setString(2, senha);
            resultado = prepareSql.executeQuery();
            if (resultado.next()) {
                user = new User();
                user.setMatricula(resultado.getInt("matricula"));
                user.setNome(resultado.getString("nome"));
                user.setSobrenmome(resultado.getString("sobrenome"));
                user.setEmail(email);
                user.setSenha(senha);
                user.setEndereco(resultado.getString("endereco"));
                user.setIdade(resultado.getInt("idade"));
                user.setRest_med(resultado.getString("rest_med"));
                user.setNum_tel(resultado.getDouble("num_tel"));
                user.setPeso(resultado.getDouble("peso"));
                user.setAltura(resultado.getDouble("altura"));
                user.setCod_plan(resultado.getInt("cod_plan"));
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

}
