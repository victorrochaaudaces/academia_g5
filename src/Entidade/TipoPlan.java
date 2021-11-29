/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author victo
 */
public class TipoPlan {
    private Integer codPlan;
    private String nomePlan;
    private double mensalidade;
    
    public TipoPlan() {
        
    }
    
    public TipoPlan(String nomePlan, double mensalidade) {
        this.nomePlan = nomePlan;
        this.mensalidade = mensalidade;
    }
    
    public TipoPlan(Integer codPlan,String nomePlan, double mensalidade) {
        this.codPlan = codPlan;
        this.nomePlan = nomePlan;
        this.mensalidade = mensalidade;
    }

    public Integer getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(Integer codPlan) {
        this.codPlan = codPlan;
    }

    public String getNomePlan() {
        return nomePlan;
    }

    public void setNomePlan(String nomePlan) {
        this.nomePlan = nomePlan;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
            
}
