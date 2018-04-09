/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.syspedidos.dao.UsuarioDaoImp;
import pe.edu.upeu.syspedidos.interfaces.UsuarioDAO;
import pe.edu.upeu.syspedidos.util.Conexion;

/**
 *
 * @author alum.fial1
 */
public class Test {
    static UsuarioDAO ao = new UsuarioDaoImp();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conex();
        valida();
    }
  static void conex(){
  if(Conexion.getConexion()!=null){
      System.out.println("Si");
  }else{
      System.out.println("No");
  }
  }
  static void valida(){
      List<Map<String,Object>> datos = new ArrayList<>();
   if(ao.validarUsuario("emilyc", "123")!=null){
       System.out.println(ao.validarUsuario("emilyc", "123"));
   }else{
       System.out.println("No");
   }
  }
}
