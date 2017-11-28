
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FuncionesSistemaNotas {
    final static String URL_BASEDEDATOS = "jdbc:derby://localhost:1527/Sistemanotas";
    final static String USUARIO = "juan";
    final static String PASSWORD = "juan";
    
    public static String obtenerNombreProfesor(String codProfesor) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT PRO_APE, PRO_NOM from PROFESOR where PRO_COD = '"+codProfesor+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String apellido = rs.getString("PRO_APE");
                String nombre = rs.getString("PRO_NOM");
                return nombre + " " + apellido;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerCorreoProfesor(String codProfesor) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT PRO_COR from PROFESOR where PRO_COD = '"+codProfesor+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String correo = rs.getString("PRO_COR");
                return correo;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerPaginaProfesor(String codProfesor) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT PRO_PAG from PROFESOR where PRO_COD = '"+codProfesor+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String pagina = rs.getString("PRO_PAG");
                return pagina;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerPaginaProfesor(String pagina) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE PROFESOR SET PRO_PAG = ? WHERE PRO_COD = '100'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, pagina);
            pstmt.executeUpdate();
            //pstmt = conn.prepareStatement(query);
            //pstmt.setString(5, pagina);
            //pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
   
    public static String establecerNombreProfesor(String nombre) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE PROFESOR SET PRO_NOM = ? WHERE PRO_COD = '100'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
            //pstmt = conn.prepareStatement(query);
            //pstmt.setString(5, pagina);
            //pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerApellidoProfesor(String apellido) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE PROFESOR SET PRO_APE = ? WHERE PRO_COD = '100'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, apellido);
            pstmt.executeUpdate();
            //pstmt = conn.prepareStatement(query);
            //pstmt.setString(5, pagina);
            //pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerCorreoProfesor(String correo) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE PROFESOR SET PRO_COR = ? WHERE PRO_COD = '100'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, correo);
            pstmt.executeUpdate();
            //pstmt = conn.prepareStatement(query);
            //pstmt.setString(5, pagina);
            //pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerNombreCurso(String cursocod) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT ASI_NOM from ASIGNATURA where ASI_COD = '"+cursocod+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String cursonom = rs.getString("ASI_NOM");
                return cursonom;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerFacultadCurso(String cursocod) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT ASI_FAC from ASIGNATURA where ASI_COD = '"+cursocod+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String cursofac = rs.getString("ASI_FAC");
                return cursofac;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerEspecialidadCurso(String cursocod) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT ASI_ESP from ASIGNATURA where ASI_COD = '"+cursocod+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String cursoesp = rs.getString("ASI_ESP");
                return cursoesp;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerPlanCurso(String cursocod) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT ASI_PLAN from ASIGNATURA where ASI_COD = '"+cursocod+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String cursoplan = rs.getString("ASI_PLAN");
                return cursoplan;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerNombreCurso(String nomcurso) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE ASIGNATURA SET ASI_NOM = ? WHERE ASI_COD = '1002'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nomcurso);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerFacultadCurso(String faccurso) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE ASIGNATURA SET ASI_FAC = ? WHERE ASI_COD = '1002'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, faccurso);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerEspecialidadCurso(String espcurso) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE ASIGNATURA SET ASI_ESP = ? WHERE ASI_COD = '1002'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, espcurso);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerPlanCurso(String plancurso) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE ASIGNATURA SET ASI_PLAN = ? WHERE ASI_COD = '1002'";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, plancurso);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static ObservableList<Alumno> obtenerListaalumnos() {

        try {

            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;

            /* Preparamos la conexion hacia la base de datos */
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);

            /* Preparamos la sentencia SQL a ejecutar */
            String query = "SELECT ALU_COD, ALU_NOM, ALU_APE FROM ALUMNO ";

            pstmt = conn.prepareStatement(query);

            /* Ejecutamos la sentencia SQL */
            rs = pstmt.executeQuery();

            /* Obtenemos los datos seleccionados */
            ObservableList<Alumno> listaalumnos = FXCollections.observableArrayList();

            while (rs.next()) {

                String codigo = rs.getString("ALU_COD");
                String nombre = rs.getString("ALU_NOM");
                String apellido = rs.getString("ALU_APE");
                

                Alumno alumno = new Alumno(codigo, nombre, apellido);
                listaalumnos.add(alumno);
            }

            return listaalumnos;

        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }
    
    public static String establecerAlumno(String cod,String nom,String ape) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "INSERT INTO ALUMNO (ALU_COD,ALU_NOM,ALU_APE) VALUES (?,?,?)";            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, cod);
            pstmt.setString(2, nom);
            pstmt.setString(3, ape);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String obtenerPeso(String notacod) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "SELECT GAE_PESO from GRUPO_ASIGNATURA_EVALUACION where GAE_EVA = '"+notacod+"'";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String cursoplan = rs.getString("GAE_PESO");
                return cursoplan;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String establecerPeso(String notacod, double pes) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);            
            String query = "UPDATE GRUPO_ASIGNATURA_EVALUACION SET GAE_PESO = ? WHERE GAE_EVA = ?";           
            pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, pes);
            pstmt.setString(2, notacod);
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static ObservableList<NotaAlumno> obtenerNotasalumnos() {

        try {

            ResultSet rs = null,rs2 = null, rs3 = null;
            Connection conn = null;
            PreparedStatement pstmt = null,pstmt2= null, pstmt3 = null;
            String query2,query3;

            /* Preparamos la conexion hacia la base de datos */
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);

            /* Preparamos la sentencia SQL a ejecutar */
            String query = "SELECT ALU_COD, ALU_NOM, ALU_APE FROM ALUMNO ";

            pstmt = conn.prepareStatement(query);

            /* Ejecutamos la sentencia SQL */
            rs = pstmt.executeQuery();

            /* Obtenemos los datos seleccionados */
            ObservableList<NotaAlumno> listanotas = FXCollections.observableArrayList();

            while (rs.next()) {

                String codigo = rs.getString("ALU_COD");
                String nombre = rs.getString("ALU_NOM");
                String apellido = rs.getString("ALU_APE");
                
                query2 = "SELECT EVA_COD FROM EVALUACION ";
                pstmt2 = conn.prepareStatement(query2);
                rs2 = pstmt2.executeQuery();
                int i=0;
                int not[]={0,0,0,0,0};
                while (rs2.next()){
                    String evaluacion = rs2.getString("EVA_COD");
                    query3 = "SELECT NOT_NOT FROM NOTA WHERE NOT_ALU=? AND NOT_SEC='2' AND NOT_ASI='1002' AND NOT_SEM='2017-2' AND NOT_EVA=?";
                    pstmt3 = conn.prepareStatement(query3);
                    pstmt3.setString(1, codigo);
                    pstmt3.setString(2, evaluacion);
                    rs3 = pstmt3.executeQuery();                    
                    while (rs3.next()){
                        int nota = rs3.getInt("NOT_NOT");
                        not[i]=nota;
                    }
                    i++;                   
                }             
                NotaAlumno notaalumno = new NotaAlumno(codigo, nombre, apellido,not[0],not[1],not[2],not[3],not[4]);
                listanotas.add(notaalumno);
            }

            return listanotas;

        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }
}

