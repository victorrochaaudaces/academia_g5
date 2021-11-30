/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entidadeDao;

import entidade.TipoPlan;
import java.util.List;

/**
 *
 * @author victo
 */
public interface TipoPlanDao {

    public abstract void salvar(TipoPlan tipoPlan) throws Exception;

    public abstract void alterar(TipoPlan tipoPlan) throws Exception;

    void excluir(int codPlan) throws Exception;

    TipoPlan pesquisarPorCodPlan(int codPlan) throws Exception;

    List<TipoPlan> pesquisarPorNome(String nomePlan) throws Exception;
    
    List<TipoPlan> pesquisarTodo()throws Exception;
}
