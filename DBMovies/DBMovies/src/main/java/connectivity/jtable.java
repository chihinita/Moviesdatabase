/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectivity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chihinita
 */
public class jtable {
    public static ArrayList<Variables> getAllRecords() throws SQLException {
        ArrayList<Variables> arrayList = new ArrayList<>();
        try {
            ResultSet rs = qSelect.getData("select * from Movie");
            while (rs.next()) {
                Variables product = new Variables();
                product.setMovid(rs.getString("Movid"));
                product.setMovieName(rs.getString("MovieName"));
                product.setLeadActor(rs.getString("LeadActor"));
                product.setActress(rs.getString("Actress"));
                product.setYearOfRealse(rs.getString("YearOfRealse"));
                product.setDirectorName(rs.getString("DirectorName"));
                arrayList.add(product);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
