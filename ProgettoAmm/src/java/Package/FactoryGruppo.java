/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Enrico
 */
public class FactoryGruppo {
    private static FactoryGruppo singleton;

    public static FactoryGruppo getInstance() {
        if (singleton == null) {
            singleton = new FactoryGruppo();
        }
        return singleton;
    }
    
    private String connStringa;
    
    public void setconnStringa(String s) {
        this.connStringa = s;
    }

    public String getconnStringa() {
        return this.connStringa;
    }

    private FactoryGruppo() {
    }

    public Gruppi getGruppiById(int id) {
        //ripescaggio Gruppi
        try {
            Connection conn = DriverManager.getConnection(connStringa, "Garau", "Garau"); //username e password 

            String query = " select * from gruppi " + " where id = ? ";
            String query2 = "select * from ListaMembri" + "join id_listaUtenti on listaUtentiGroup.id_listaUtenti=id_gruppi " + " where id_listaUtenti = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            PreparedStatement stmt2 = conn.prepareStatement(query2);

            stmt.setInt(1, id);
            stmt2.setInt(2, id);
           
            ResultSet res = stmt.executeQuery();
            ResultSet res2 = stmt2.executeQuery();

            if (res.next()) {
                Gruppi current = new Gruppi();
                
                current.setid(res.getInt("id_gruppi"));
                current.setidAdmin(res.getInt("idAdmin"));
                current.setNome(res.getString("Nome"));
                
                current.setid(res2.getInt("id_listaUtenti"));
                
                
                stmt.close();
                conn.close();
                stmt2.close();
                conn.close();
                return current;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    
   
    public ArrayList<Gruppi> getGruppi() {
        
       ArrayList<Gruppi> ListaDeiGruppi = new ArrayList<>();
            try {
            Connection conn = DriverManager.getConnection(connStringa, "Garau", "Garau"); //username e password del database

            String query = " select * from gruppi " ; 
            PreparedStatement stmt = conn.prepareStatement(query);

            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                
                Gruppi current = new Gruppi();
                
                current.setid(res.getInt("id"));
                current.setidAdmin(res.getInt("idAdmin"));
                current.setNome(res.getString("Nome"));

                ListaDeiGruppi.add(current);
                
            }
            
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return ListaDeiGruppi;


    }

}
