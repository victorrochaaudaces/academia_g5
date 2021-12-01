/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeDao;

import entidade.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor.rocha
 */
public class FuncionarioDaoImpl implements FuncionarioDao {

    private Connection conn;
    private PreparedStatement prepareSql;
    private ResultSet resultado;

    @Override
    public void salvar(Funcionario funcionario) throws Exception {
        String comando = "INSERT INTO funcionario_acad\n"
                + " (nome, sobrenome, cpf, endereco, email, idade, telefone, senha, cargo) VALUES\n"
                + " (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, funcionario.getNome());
            prepareSql.setString(2, funcionario.getSobrenome());
            prepareSql.setLong(3, funcionario.getCpf());
            prepareSql.setString(4, funcionario.getEndereco());
            prepareSql.setString(5, funcionario.getEmail());
            prepareSql.setInt(6, funcionario.getIdade());
            prepareSql.setLong(7, funcionario.getTelefone());
            prepareSql.setString(8, funcionario.getSenha());
            prepareSql.setString(9, funcionario.getCargo());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar funcionário " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void alterar(Funcionario funcionario) throws Exception {
        String comando = "UPDATE funcionario_acad SET\n"
                + "nome = ?, sobrenome = ?, cpf = ?, endereco = ?, email = ?,\n"
                + "idade = ?, telefone = ?, senha = ?, cargo = ? WHERE id = ?";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, funcionario.getNome());
            prepareSql.setString(2, funcionario.getSobrenome());
            prepareSql.setLong(3, funcionario.getCpf());
            prepareSql.setString(4, funcionario.getEndereco());
            prepareSql.setString(5, funcionario.getEmail());
            prepareSql.setInt(6, funcionario.getIdade());
            prepareSql.setLong(7, funcionario.getTelefone());
            prepareSql.setString(8, funcionario.getSenha());
            prepareSql.setString(9, funcionario.getCargo());
            prepareSql.setInt(10, funcionario.getId());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao alterar os dados do funcionário " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement("DELETE FROM funcionario_acad WHERE id = ?");
            prepareSql.setInt(1, id);
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao deletar cadastro de funcionário " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public Funcionario pesquisarPorId(int id) throws Exception {
        String comando = "SELECT * FROM funcionario_acad WHERE id = ?";
        Funcionario funcionario = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setInt(1, id);
            resultado = prepareSql.executeQuery();
            if (resultado.next()) {
                funcionario = new Funcionario();
                funcionario.setId(resultado.getInt("id"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setSobrenome(resultado.getString("sobrenome"));
                funcionario.setCpf(resultado.getLong("cpf"));
                funcionario.setEndereco(resultado.getString("endereco"));
                funcionario.setEmail(resultado.getString("email"));
                funcionario.setIdade(resultado.getInt("idade"));
                funcionario.setTelefone(resultado.getLong("telefone"));
                funcionario.setSenha(resultado.getString("senha"));
                funcionario.setCargo(resultado.getString("cargo"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar funcionário por I " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return funcionario;
    }

    @Override
    public List<Funcionario> pesquisarPorNome(String nome) throws Exception {
        Funcionario funcionario;
        String comando = "SELECT * FROM funcionario_acad WHERE nome LIKE ?";
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, "%" + nome + "%");
            resultado = prepareSql.executeQuery();
            while (resultado.next()) {
                funcionario = new Funcionario();
                funcionario.setId(resultado.getInt("id"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setSobrenome(resultado.getString("sobrenome"));
                funcionario.setCpf(resultado.getLong("cpf"));
                funcionario.setEndereco(resultado.getString("endereco"));
                funcionario.setEmail(resultado.getString("email"));
                funcionario.setIdade(resultado.getInt("idade"));
                funcionario.setTelefone(resultado.getLong("telefone"));
                funcionario.setSenha(resultado.getString("senha"));
                funcionario.setCargo(resultado.getString("cargo"));
                funcionarios.add(funcionario);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar funcionários por nome " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return funcionarios;
    }

    @Override
    public Funcionario logar(String email, String senha) throws Exception {
        String comando = "SELECT * FROM funcionario_acad WHERE email = ? and senha = ?";
        Funcionario funcionario = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, email);
            prepareSql.setString(2, senha);
            resultado = prepareSql.executeQuery();
            if (resultado.next()) {
                funcionario = new Funcionario();
                funcionario.setId(resultado.getInt("id"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setSobrenome(resultado.getString("sobrenome"));
                funcionario.setCpf(resultado.getLong("cpf"));
                funcionario.setEndereco(resultado.getString("endereco"));
                funcionario.setEmail(resultado.getString("email"));
                funcionario.setIdade(resultado.getInt("idade"));
                funcionario.setTelefone(resultado.getLong("telefone"));
                funcionario.setSenha(resultado.getString("senha"));
                funcionario.setCargo(resultado.getString("cargo"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao logar funcionário " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return funcionario;
    }

}
