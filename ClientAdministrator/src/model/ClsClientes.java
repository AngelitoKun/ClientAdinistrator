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
public class ClsClientes extends Connect{

    private int idCliente;
    private String nomCliente;
    private String apellCliente;
    private long numCliente;
    private String emailCliente;
    private String domCliente;
    
    public ClsClientes() {
        super();
        this.idCliente = idCliente;
        this.nomCliente = nomCliente;
        this.apellCliente = apellCliente;
        this.numCliente = numCliente;
        this.domCliente = domCliente;
    }
    
    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the apellCliente
     */
    public String getApellCliente() {
        return apellCliente;
    }

    /**
     * @param apellCliente the apellCliente to set
     */
    public void setApellCliente(String apellCliente) {
        this.apellCliente = apellCliente;
    }

    /**
     * @return the numCliente
     */
    public long getNumCliente() {
        return numCliente;
    }

    /**
     * @param numCliente the numCliente to set
     */
    public void setNumCliente(long numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * @return the emailCliente
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     * @param emailCliente the emailCliente to set
     */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    /**
     * @return the domCliente
     */
    public String getDomCliente() {
        return domCliente;
    }

    /**
     * @param domCliente the domCliente to set
     */
    public void setDomCliente(String domCliente) {
        this.domCliente = domCliente;
    }
    
    //Método que guarda a los clientes
    public void saveCliente(ClsClientes cliente){
        try{
            PreparedStatement st = connect.prepareStatement("INSERT INTO tb_clientes (nomCliente, apellCliente, numCliente, domCliente)"
                + " VALUES (?,?,?,?)");
            st.setString(1, cliente.getNomCliente());
            st.setString(2, cliente.getApellCliente());
            st.setLong(3, cliente.getNumCliente());
            st.setString(4, cliente.getDomCliente());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
