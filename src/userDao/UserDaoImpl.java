/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                + "( nome, sobrenome, email, endereco, idade, rest_med, num_tel, peso, altura, cod_plan)\n"
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
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
        String comando = "UPDATE cad_usuario SET\n"
                + "nome = ?, sobrenome = ?, email = ?, endereco = ?, idade = ?,\n"
                + "rest_med = ?, num_tel = ?, peso = ?, altura = ?, cod_plan = ? WHERE matricula = ?";
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
            prepareSql.setInt(11, user.getMatricula());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o cadastro do usuário: " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User pesquisarporId(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> pesquisarporNome(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
