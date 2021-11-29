/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entidadeDao;

import java.util.List;
import Entidade.User;

/**
 *
 * @author victo
 */
public interface UserDao {

    public abstract void salvar(User user) throws Exception;

    public abstract void alterar(User user) throws Exception;

    void excluir(int matricula) throws Exception;

    User pesquisarporMatricula(int matricula) throws Exception;

    List<User> pesquisarporNome(String nome) throws Exception;

    User logar(String email, String senha) throws Exception;
}
