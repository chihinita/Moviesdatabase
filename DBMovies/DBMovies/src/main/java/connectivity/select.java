/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author chihinita
 */
public class select {
    public static ResultSet getData(String query) {
        try {
            Connection con = Connectivity.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

   // public static String getId() {
     //   int id = 1;
       // try {
         //   ResultSet rs = Select.getData("select max(ID) from orders");
           // if (rs.next()) {
             //   id = rs.getInt("1");
               // id = id + 1;
            //}
        //} catch (Exception e) {
          //  JOptionPane.showMessageDialog(null, e);
        //}
        //return String.valueOf(id);
    //}

    public static ResultSet getMovie(String Movid) {
        
       try {
            ResultSet rs = select.getData("select MovieName,LeadActor,Actress,YearOfRealse,DirectorName from Movie where Movid='" +Movid+  "'");
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
}
}

