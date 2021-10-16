/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Angelito 7u7
 */
public class ClsPlanes extends Connect{
    
    public ClsPlanes(){
        super();
    }

    /**
     * @return the idPlan
     */
    public int getIdPlan() {
        return idPlan;
    }

    /**
     * @param idPlan the idPlan to set
     */
    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    /**
     * @return the tipoPlan
     */
    public String getTipoPlan() {
        return tipoPlan;
    }

    /**
     * @param tipoPlan the tipoPlan to set
     */
    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    /**
     * @return the precPlan
     */
    public double getPrecPlan() {
        return precPlan;
    }

    /**
     * @param precPlan the precPlan to set
     */
    public void setPrecPlan(double precPlan) {
        this.precPlan = precPlan;
    }

    /**
     * @return the descrPlan
     */
    public String getDescrPlan() {
        return descrPlan;
    }

    /**
     * @param descrPlan the descrPlan to set
     */
    public void setDescrPlan(String descrPlan) {
        this.descrPlan = descrPlan;
    }
    
    private int idPlan;
    private String tipoPlan;
    private double precPlan;
    private String descrPlan;
    
    public void savePlan(ClsPlanes plan){
        try{
            PreparedStatement st = connect.prepareStatement("INSERT INTO tb_planes (tipoPlan, precPlan, descrPlan)"
                + " VALUES (?,?,?)");
            st.setString(1, plan.getTipoPlan());
            st.setDouble(2, plan.getPrecPlan());
            st.setString(3, plan.getDescrPlan());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
