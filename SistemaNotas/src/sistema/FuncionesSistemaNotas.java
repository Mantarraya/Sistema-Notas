package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
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
            String query = "SELECT PRO_APE, PRO_NOM from PROFESOR where PRO_COD = '" + codProfesor + "'";
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
            String query = "SELECT PRO_COR from PROFESOR where PRO_COD = '" + codProfesor + "'";
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
            String query = "SELECT PRO_PAG from PROFESOR where PRO_COD = '" + codProfesor + "'";
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
            String query = "SELECT ASI_NOM from ASIGNATURA where ASI_COD = '" + cursocod + "'";
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
            String query = "SELECT ASI_FAC from ASIGNATURA where ASI_COD = '" + cursocod + "'";
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
            String query = "SELECT ASI_ESP from ASIGNATURA where ASI_COD = '" + cursocod + "'";
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
            String query = "SELECT ASI_PLAN from ASIGNATURA where ASI_COD = '" + cursocod + "'";
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

    public static String establecerAlumno(String cod, String nom, String ape) {

        try {
            ResultSet rs = null, rs2 = null, rs3 = null, rs4 = null;
            Connection conn = null;
            PreparedStatement pstmt = null, pstmt2 = null, pstmt3 = null, pstmt4 = null, pstmt5 = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "INSERT INTO ALUMNO (ALU_COD,ALU_NOM,ALU_APE) VALUES (?,?,?) ";
            String query2 = "INSERT INTO NOTA (NOT_ALU, NOT_ASI, NOT_SEC, NOT_SEM, NOT_EVA, NOT_NOT) VALUES "
                    + "(?, '1002', '2', '2017-2', '1', 0),"
                    + "(?, '1002', '2', '2017-2', '2', 0),"
                    + "(?, '1002', '2', '2017-2', '3', 0),"
                    + "(?, '1002', '2', '2017-2', '4', 0),"
                    + "(?, '1002', '2', '2017-2', '5', 0)";
            pstmt = conn.prepareStatement(query);
            pstmt2 = conn.prepareStatement(query2);
            pstmt.setString(1, cod);
            pstmt.setString(2, nom);
            pstmt.setString(3, ape);
            pstmt2.setString(1, cod);
            pstmt2.setString(2, cod);
            pstmt2.setString(3, cod);
            pstmt2.setString(4, cod);
            pstmt2.setString(5, cod);
            pstmt.executeUpdate();
            pstmt2.executeUpdate();
            String query5 = "INSERT INTO MATRICULA (MAT_ALU, MAT_ASI, MAT_SEC, MAT_SEM, MAT_PRO) VALUES (?, '1002', '2', '2017-2', '100')";
            pstmt5 = conn.prepareStatement(query5);
            pstmt5.setString(1, cod);
            pstmt5.executeUpdate();
            String query3 = "SELECT AST_FEC FROM ASISTENCIA WHERE AST_ALU = '15200900' ";
            pstmt3 = conn.prepareStatement(query3);
            rs3 = pstmt3.executeQuery();
            while (rs3.next()) {
                String sesion = rs3.getString("AST_FEC");
                String query4 = "INSERT INTO ASISTENCIA (AST_ALU,AST_ASI,AST_SEC,AST_SEM,AST_FEC,AST_REG) VALUES"
                        + "(?, '1002', '2', '2017-2', ?, false)";
                pstmt4 = conn.prepareStatement(query4);
                pstmt4.setString(1, cod);
                pstmt4.setString(2, sesion);
                pstmt4.executeUpdate();
            }
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
            String query = "SELECT GAE_PESO from GRUPO_ASIGNATURA_EVALUACION where GAE_EVA = '" + notacod + "'";
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

    public static String establecerNota(String notacod, String alumnocod, int not) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "UPDATE NOTA SET NOT_NOT = ? WHERE NOT_ALU=? AND NOT_SEC='2' AND NOT_ASI='1002' AND NOT_SEM='2017-2' AND NOT_EVA=?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, not);
            pstmt.setString(2, alumnocod);
            pstmt.setString(3, notacod);
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static ObservableList<NotaAlumno> obtenerNotasalumnos() {

        try {

            ResultSet rs = null, rs2 = null, rs3 = null;
            Connection conn = null;
            PreparedStatement pstmt = null, pstmt2 = null, pstmt3 = null;
            String query2, query3;

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
                int i = 0;
                int not[] = {0, 0, 0, 0, 0};
                while (rs2.next()) {
                    String evaluacion = rs2.getString("EVA_COD");
                    query3 = "SELECT NOT_NOT FROM NOTA WHERE NOT_ALU=? AND NOT_SEC='2' AND NOT_ASI='1002' AND NOT_SEM='2017-2' AND NOT_EVA=?";
                    pstmt3 = conn.prepareStatement(query3);
                    pstmt3.setString(1, codigo);
                    pstmt3.setString(2, evaluacion);
                    rs3 = pstmt3.executeQuery();
                    while (rs3.next()) {
                        int nota = rs3.getInt("NOT_NOT");
                        not[i] = nota;
                    }
                    i++;
                }
                NotaAlumno notaalumno = new NotaAlumno(codigo, nombre, apellido, not[0], not[1], not[2], not[3], not[4]);
                listanotas.add(notaalumno);
            }

            return listanotas;

        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }

    public static ObservableList<String> obtenerSesiones() {

        try {

            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;

            /* Preparamos la conexion hacia la base de datos */
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);

            /* Preparamos la sentencia SQL a ejecutar */
            String query = "SELECT AST_FEC FROM ASISTENCIA WHERE AST_ALU = '15200900' ";

            pstmt = conn.prepareStatement(query);

            /* Ejecutamos la sentencia SQL */
            rs = pstmt.executeQuery();

            /* Obtenemos los datos seleccionados */
            ObservableList<String> sesiones = FXCollections.observableArrayList();
            while (rs.next()) {
                String sesion = rs.getString("AST_FEC");
                sesiones.add(sesion);
            }
            return sesiones;
        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }

    // Juan Tomairo
    public static int obtenerNotaEvaluacionAlumno(String codAlumno, String codEvaluacion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "SELECT NOT_NOT FROM NOTA WHERE NOT_ALU=? AND NOT_SEC='2' AND NOT_ASI='1002' AND NOT_SEM='2017-2' AND NOT_EVA=?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, codAlumno);
            pstmt.setString(2, codEvaluacion);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int nota = rs.getInt("NOT_NOT");
                return nota;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static String establecerSesion(String sesion) {

        try {

            ResultSet rs = null, rs2 = null;
            Connection conn = null;
            PreparedStatement pstmt = null, pstmt2 = null;
            String query2, query3;

            /* Preparamos la conexion hacia la base de datos */
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);

            /* Preparamos la sentencia SQL a ejecutar */
            String query = "SELECT ALU_COD FROM ALUMNO ";

            pstmt = conn.prepareStatement(query);

            /* Ejecutamos la sentencia SQL */
            rs = pstmt.executeQuery();

            /* Obtenemos los datos seleccionados */
            while (rs.next()) {

                String codigo = rs.getString("ALU_COD");
                query2 = "INSERT INTO ASISTENCIA (AST_ALU,AST_ASI,AST_SEC,AST_SEM,AST_FEC,AST_REG) VALUES\n"
                        + "(?, '1002', '2', '2017-2', ?, false) ";
                pstmt2 = conn.prepareStatement(query2);
                pstmt2.setString(1, codigo);
                pstmt2.setString(2, sesion);
                pstmt2.executeUpdate();

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }

    public static ObservableList<Asistencia> obtenerListaAsistencia(String sesion) {

        try {

            ResultSet rs = null, rs2 = null;
            Connection conn = null;
            PreparedStatement pstmt = null, pstmt2 = null;

            /* Preparamos la conexion hacia la base de datos */
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);

            /* Preparamos la sentencia SQL a ejecutar */
            String query = "SELECT ALU_COD,ALU_NOM,ALU_APE FROM ALUMNO ";

            pstmt = conn.prepareStatement(query);

            /* Ejecutamos la sentencia SQL */
            rs = pstmt.executeQuery();

            /* Obtenemos los datos seleccionados */
            ObservableList<Asistencia> listaasistencia = FXCollections.observableArrayList();
            while (rs.next()) {

                String codigo = rs.getString("ALU_COD");
                String nombre = rs.getString("ALU_NOM");
                String apellido = rs.getString("ALU_APE");
                String query2 = "SELECT AST_REG FROM ASISTENCIA WHERE AST_ALU = ? AND  AST_FEC = ? ";
                pstmt2 = conn.prepareStatement(query2);
                pstmt2.setString(1, codigo);
                pstmt2.setString(2, sesion);

                rs2 = pstmt2.executeQuery();

                while (rs2.next()) {
                    boolean asis = rs2.getBoolean(1);
                    Asistencia asistencia = new Asistencia(codigo, nombre + " " + apellido, asis);
                    listaasistencia.add(asistencia);
                }

            }
            return listaasistencia;
        } catch (Exception e) {
            System.out.println(e);
        }

        /* Si no encontro ningun dato, retornamos null */
        return null;

    }

    public static String establecerAsistencia(String alucod, boolean reg, String sesion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "UPDATE ASISTENCIA SET AST_REG = ? WHERE AST_ALU= ? AND AST_FEC = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setBoolean(1, reg);
            pstmt.setString(2, alucod);
            pstmt.setString(3, sesion);
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    // Juan Tomairo
    public static int obtenerNumeroAprobados(String codEvaluacion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "SELECT COUNT(*) AS total from NOTA WHERE NOT_EVA = ? and NOT_NOT >= 11";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, codEvaluacion);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int cantAprobados = rs.getInt("total");
                return cantAprobados;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // Juan Tomairo
    public static int obtenerNumeroDesaprobados(String codEvaluacion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "SELECT COUNT(*) AS total from NOTA WHERE NOT_EVA = ? and NOT_NOT < 11";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, codEvaluacion);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int cantDesaprobados = rs.getInt("total");
                return cantDesaprobados;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // Juan Tomairo
    public static double obtenerMedia(String codEvaluacion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "SELECT NOT_NOT from NOTA WHERE NOT_EVA = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, codEvaluacion);

            rs = pstmt.executeQuery();

            int nA = obtenerNumeroAprobados(codEvaluacion);
            int nD = obtenerNumeroDesaprobados(codEvaluacion);

            double[] arrNota = new double[nA + nD];

            int i = 0;
            while (rs.next()) {

                int nota = rs.getInt("NOT_NOT");

                arrNota[i] = nota;
                i++;

            }

            return getMedia(arrNota);

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // Juan Tomairo
    public static double obtenerMediana(String codEvaluacion) {

        try {
            ResultSet rs = null;
            Connection conn = null;
            PreparedStatement pstmt = null;
            conn = DriverManager.getConnection(URL_BASEDEDATOS, USUARIO, PASSWORD);
            String query = "SELECT NOT_NOT from NOTA WHERE NOT_EVA = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, codEvaluacion);

            rs = pstmt.executeQuery();

            int nA = obtenerNumeroAprobados(codEvaluacion);
            int nD = obtenerNumeroDesaprobados(codEvaluacion);

            double[] arrNota = new double[nA + nD];

            int i = 0;
            while (rs.next()) {

                int nota = rs.getInt("NOT_NOT");

                arrNota[i] = nota;
                i++;

            }

            return getMedian(arrNota);

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static double getMedia(double[] data) {
        double sum = 0.0;

        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        double average = sum / data.length;;
        return average;
    }

    public static double getMedian(double[] m) {

        Arrays.sort(m);
        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2.0;
        }
    }

}
