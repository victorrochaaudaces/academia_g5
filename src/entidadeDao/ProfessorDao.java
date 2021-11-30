/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeDao;

import entidade.Professor;
import java.util.List;

/**
 *
 * @author victor.rocha
 */
public interface ProfessorDao {
    
        public abstract void salvar(Professor professor) throws Exception;

    public abstract void alterar(Professor professor) throws Exception;
    
    void excluir(int codProf) throws Exception;

    Professor pesquisarPorId(int codProf) throws Exception;

    List<Professor> pesquisarPorNome(String nmProf) throws Exception;
}
