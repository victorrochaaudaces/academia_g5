/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package userDao;

import java.util.List;
import user.User;

/**
 *
 * @author victo
 */
public interface UserDao {
    
    public abstract void salvar(User user) throws Exception;
    
    public abstract void alterar(User user) throws Exception;
    
    void excluir(int id) throws Exception;

    User pesquisarporId(int id) throws Exception;
    
    List<User> pesquisarporNome( String nome) throws Exception;
}
