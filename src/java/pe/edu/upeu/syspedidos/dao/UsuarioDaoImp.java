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
import java.util.ArrayList;
import java.util.HashMap;
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
    private static final String SQL_VALIDA = "SELECT p.nombres, p.apellidos, u.idusuario, u.nom_user, r.nom_rol" +
    "  FROM usuario as u, rol as r, persona p" +
    "  where p.idpersona= u.idpersona and" +
    "  u.idrol = r.idrol" +
    "  and u.nom_user = ? and" +
    "  u.clave = ? and estado = '1'";
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
    public List<Map<String,Object>> validarUsuario(String user, String clave) {
        List<Map<String,Object>> datos = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_VALIDA);
            ps.setString(1, user);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while(rs.next()){
               map.put("nom", rs.getString("nombres"));
               map.put("apell", rs.getString("apellidos"));
               map.put("iduser", rs.getInt("idusuario"));
               map.put("user", rs.getString("nom_user"));
               map.put("rol", rs.getString("nom_rol"));
               datos.add(map);
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
       return datos;
    }
    
}
