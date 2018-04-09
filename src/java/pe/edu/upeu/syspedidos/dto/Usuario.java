/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.syspedidos.dto;

/**
 *
 * @author alum.fial1
 */
public class Usuario {
    private int iduser;
    private int idrol;
    private int idper;
    private String nom_user;
    private String clave;
    private String estado;

    public Usuario() {
    }

    public Usuario(int idrol, int idper, String nom_user, String clave) {
        this.idrol = idrol;
        this.idper = idper;
        this.nom_user = nom_user;
        this.clave = clave;
    }

    public Usuario(int iduser, int idrol, int idper, String nom_user, String clave, String estado) {
        this.iduser = iduser;
        this.idrol = idrol;
        this.idper = idper;
        this.nom_user = nom_user;
        this.clave = clave;
        this.estado = estado;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdper() {
        return idper;
    }

    public void setIdper(int idper) {
        this.idper = idper;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
