/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.syspedidos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.syspedidos.dto.Usuario;
import pe.edu.upeu.syspedidos.interfaces.UsuarioDAO;
import pe.edu.upeu.syspedidos.util.Conexion;

/**
 *
 * @author alum.fial1
 */
public class UsuarioDaoImp implements UsuarioDAO{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private static final String SQL_VALIDA = "SELECT *FROM usuario WHERE nom_user = ? and clave = ? and estado = '1'";
    @Override
    public int create(Usuario c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Usuario c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, Object>> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarUsuario(String user, String clave) {
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_VALIDA);
            ps.setString(1, user);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while(rs.next()){
                x = 1;
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
       return x;
    }
    
}
