/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeDao;

import entidade.Funcionario;
import java.util.List;

/**
 *
 * @author victor.rocha
 */
public interface FuncionarioDao {

    public abstract void salvar(Funcionario funcionario) throws Exception;

    public abstract void alterar(Funcionario funcionario) throws Exception;

    void excluir(int id) throws Exception;

    Funcionario pesquisarPorId(int id) throws Exception;

    List<Funcionario> pesquisarPorNome(String nome) throws Exception;

    Funcionario logar(String email, String senha) throws Exception;

}
