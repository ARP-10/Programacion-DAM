package U12;

import java.sql.*;

class Ejemplo1{
    public static void main(String[] args){
        String bbdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String user = "estudiante";
        String pass = "1234";
        try{
            Connection con = DriverManager.getConnection(bbdd, user, pass);

            // Consultas: SELECT
            // Método: ResultSet executeQuery(String sql)
            // Devuelve un objeto tipo ResultSet que contiene el resultado del comando SELECT y que permitirá su procesamiento
            String sql = "SELECT nombreDirector, edadDirector FROM director";

            // CreateStatement: ejecuta sentencias SQL estáticas
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombreDirector");
                int edad = rs.getInt("edadDirector");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }

            // PrepareStatement: ejecuta consultas parametrizadas.
            String sql2 = "SELECT nombreActor FROM actor WHERE nacionalidadActor = ?";
            PreparedStatement pstmt = con.prepareStatement(sql2);

            pstmt.setInt(1, 2);

            ResultSet rs2 = pstmt.executeQuery();


            System.out.println("Actores con nacionalidad 2: ");
            while (rs2.next()) {
                String nombre = rs2.getString("nombreActor");
                System.out.println("Nombre: " + nombre);
            }

            // Actualizaciones: INSERT, UPDATE, DELETE
            // Método: int executeUpdate(String sql)
            // Ejecuta la consulta de actualización en la bbdd y devuelve un int indicando el nº de registros que se han visto afectados
            String sql3 = "INSERT into director(nombreDirector, edadDirector, nacionalidadDirector, salarioDirector) VALUES (?,?,?,?)";
            PreparedStatement pstmt2 = con.prepareStatement(sql3);

            pstmt2.setString(1, "Pedro Almodovar");
            pstmt2.setInt(2, 70);
            pstmt2.setInt(3, 3);
            pstmt2.setDouble(4, 200000);

            int n = pstmt2.executeUpdate();

            System.out.println("Registros alterados: " + n);

            String sql4 = "UPDATE director SET salarioDirector = 500000  WHERE nombreDirector = 'George Lucas'";

            Statement stmt2 = con.createStatement();

            n = stmt2.executeUpdate(sql4);

            System.out.println("Registros alterados: " + n);


            String sql5 = "DELETE FROM director WHERE nombreDirector='Pedro Almodovar'";
            n = stmt.executeUpdate(sql5);
 
            System.out.println("Registros alterados: " + n);

            con.close();
        } catch(SQLException e){
            System.out.println("No se ha podido establecer la conexión: " + e);
        }
    }
}