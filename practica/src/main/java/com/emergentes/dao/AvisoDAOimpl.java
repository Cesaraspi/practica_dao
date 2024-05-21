
package com.emergentes.dao;

import com.emergentes.modelo.Aviso;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AvisoDAOimpl extends ConexionDB implements AvisoDAO{
    
    @Override
    public void insert(Aviso aviso) throws Exception {
        this.conectar();
        String sql = "insert into posts(titulo,fecha,contenido) values (?,?,?)";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        
        
        ps.setString(1, aviso.getTitulo());
        ps.setString(2, aviso.getFecha());
        ps.setString(3, aviso.getContenido());
        
        ps.executeUpdate();
        this.desconectar();
       }

    @Override
    public void update(Aviso aviso) throws Exception {
        this.conectar();
        String sql = "update posts set titulo=?, fecha=?, contenido=? where id=?";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, aviso.getTitulo());
        ps.setString(2, aviso.getFecha());
        ps.setString(3, aviso.getContenido());
        ps.setInt(4, aviso.getId());
        
        ps.executeUpdate();
         this.desconectar();
       }
         

    @Override
    public void delete(int id) throws Exception {
       
        String sql = "delete from posts where id=?";
         this.conectar();
        PreparedStatement ps = this.conn.prepareStatement(sql);
        
        ps.setInt(1, id);
        ps.executeUpdate();
         this.desconectar();
    }

    @Override
    public List<Aviso> getAll() throws Exception {
        List<Aviso> lista = null;
       String sql = "select * from posts";
        this.conectar();
         PreparedStatement ps = this.conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
        lista = new ArrayList<Aviso>();
        while(rs.next()){
            Aviso avi = new Aviso();
            avi.setId(rs.getInt("id"));
            avi.setTitulo(rs.getString("titulo"));
            avi.setFecha(rs.getString("fecha"));
            avi.setContenido(rs.getString("contenido"));
             
            
            lista.add(avi);
            
        }
         this.desconectar();
        return lista;
        }

    @Override
    public Aviso getById(int id) throws Exception {
        Aviso avi = new Aviso();
        try{
       
       String sql = "select * from posts where id =?";
        this.conectar();
         PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
         while(rs.next()){
            
            avi.setId(rs.getInt("id"));
            
            avi.setTitulo(rs.getString("titulo"));
            avi.setFecha(rs.getString("fecha"));
            avi.setContenido(rs.getString("contenido"));
             
            
         }
          }catch (SQLException e){
            throw e;
        } finally{
            this.desconectar();
        }
            
        return avi;
        }
         }
    


    

