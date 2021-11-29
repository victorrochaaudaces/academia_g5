/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadeDao;

import Entidade.TipoPlan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class TipoPlanDaoImpl implements TipoPlanDao {

    private Connection conn;
    private PreparedStatement prepareSql;
    private ResultSet resultado;

    @Override
    public void salvar(TipoPlan tipoPlan) throws Exception {
        String comando = "INSERT INTO tipo_plan (nm_plan, mensalidade) VALUES (?, ?)";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, tipoPlan.getNomePlan());
            prepareSql.setDouble(2, tipoPlan.getMensalidade());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar um novo tipo de plano: " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void alterar(TipoPlan tipoPlan) throws Exception {
        String comando = "UPDATE tipo_plan SET nm_plan = ?, mensalidade = ? WHERE cod_plan = ?";
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, tipoPlan.getNomePlan());
            prepareSql.setDouble(2, tipoPlan.getMensalidade());
            prepareSql.setInt(3, tipoPlan.getCodPlan());
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar os dados do plano " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public void excluir(int codPlan) throws Exception {
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement("DELETE FROM tipo_plan WHERE cod_plan = ?");
            prepareSql.setInt(1, codPlan);
            prepareSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao deletar plano " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
        }
    }

    @Override
    public TipoPlan pesquisarPorCodPlan(int codPlan) throws Exception {
        String comando = "SELECT * FROM tipo_plan WHERE cod_plan = ?";
        TipoPlan tipoPlan = null;
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setInt(1, codPlan);
            resultado = prepareSql.executeQuery();
            if (resultado.next()) {
                tipoPlan = new TipoPlan();
                tipoPlan.setCodPlan(resultado.getInt("cod_plan"));
                tipoPlan.setNomePlan(resultado.getString("nm_plan"));
                tipoPlan.setMensalidade(resultado.getDouble("mensalidade"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar plano por código " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return tipoPlan;
    }

    @Override
    public List<TipoPlan> pesquisarPorNome(String nomePlan) throws Exception {
        String comando = "SELECT * FROM tipo_plan WHERE nm_plan LIKE ?";
        List<TipoPlan> tipoPlans = new ArrayList<>();
        try {
            conn = ConnectionDb.ConDb();
            prepareSql = conn.prepareStatement(comando);
            prepareSql.setString(1, "%" + nomePlan + "%");
            resultado = prepareSql.executeQuery();
            TipoPlan tipoPlan;
            while(resultado.next()) {
                tipoPlan = new TipoPlan();
                tipoPlan.setCodPlan(resultado.getInt("cod_plan"));
                tipoPlan.setNomePlan(resultado.getString("nm_plan"));
                tipoPlan.setMensalidade(resultado.getDouble("mensalidade"));
                tipoPlans.add(tipoPlan);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar plano pelo nome " + e.getMessage());
        } finally {
            conn.close();
            prepareSql.close();
            resultado.close();
        }
        return tipoPlans;
    }

}
