package Data_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Configuración de los datos de XAMPP
    private static final String URL = "jdbc:mysql://localhost:3306/poo";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // En XAMPP va vacío sin espacios

    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Conectar a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos POO!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a MySQL: " + e.getMessage());
        }
        return conexion;
    }
}

//java.sql.Connection con = Data_base.Conexion.conectar();