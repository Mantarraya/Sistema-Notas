package sistema;

import java.util.Observable;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import static sistema.FuncionesSistemaNotas.*;

public class SistemaCursoController {

    @FXML
    private TabPane tabPane;

    @FXML
    private Label outputNombreProfesor;

    @FXML
    private Label outputCodigo;

    @FXML
    private Label outputCorreo;

    @FXML
    private Label outputPagWeb;

    @FXML
    private TextField inputNombreProfesor;

    @FXML
    private TextField inputApellidoProfesor;

    @FXML
    private TextField inputCorreoProfesor;

    @FXML
    private TextField inputPagWebProfesor;

    @FXML
    private Label outputNombreAsignatura;

    @FXML
    private Label outputEspecialidad;

    @FXML
    private Label outputFacultad;

    @FXML
    private Label outputCodigoAsignatura;

    @FXML
    private Label outputPlanAcademico;

    @FXML
    private TextField inputNombreAsignatura;

    @FXML
    private TextField inputCodigoAsignatura;

    @FXML
    private TextField inputFacultad;

    @FXML
    private TextField inputPlanAcademico;

    @FXML
    private TextField inputEspecialidad;

    @FXML
    private Label outputControlLectura;

    @FXML
    private Label outputLaboratorio;

    @FXML
    private Label outputProyecto;

    @FXML
    private Label outputExamenParcial;

    @FXML
    private Label outputExamenFinal;

    @FXML
    private TextField inputControlLectura;

    @FXML
    private TextField inputLaboratorio;

    @FXML
    private TextField inputExamenParcial;

    @FXML
    private TextField inputExamenFinal;

    @FXML
    private TextField inputProyecto;

    @FXML
    private TableView<Alumno> tableAlumnos;

    @FXML
    private TableColumn<Alumno, String> columnCodigo;

    @FXML
    private TableColumn<Alumno, String> columnNombre;

    @FXML
    private TableColumn<Alumno, String> columnApellido;

    @FXML
    private TextField inputCodigoAlumno;

    @FXML
    private TextField inputNombreAlumno;

    @FXML
    private TextField inputApellidoAlumno;

    @FXML
    private TableView<NotaAlumno> tableNotas;

    @FXML
    private TableColumn<NotaAlumno, String> columnCodigoNota;

    @FXML
    private TableColumn<NotaAlumno, String> columnNombreNota;

    @FXML
    private TableColumn<NotaAlumno, String> columnApellidoNota;

    @FXML
    private TableColumn<NotaAlumno, Integer> columnControl;

    @FXML
    private TableColumn<NotaAlumno, Integer> columnLaboratorio;

    @FXML
    private TableColumn<NotaAlumno, Integer> columnProyecto;

    @FXML
    private TableColumn<NotaAlumno, Integer> columnExamenParcial;

    @FXML
    private TableColumn<NotaAlumno, Integer> columnExamenFinal;

    @FXML
    private TextField inputNotaControl;

    @FXML
    private TextField inputNotaProyecto;

    @FXML
    private TextField inputNotaExamenParcial;

    @FXML
    private TextField inputNotaLaboratorio;

    @FXML
    private ComboBox<String> comboAlumnos;

    @FXML
    private TextField inputNotaExamenFinal;

    @FXML
    private PieChart pieChart;

    @FXML
    private ComboBox<String> comboEvaluacion;

    @FXML
    private Label outputCantidad;

    @FXML
    private Label outputMedia;

    @FXML
    private Label outputMediana;

    @FXML
    void editarDatosAsignaturaAction(ActionEvent event) {

        System.out.println("Pestaña Editar Asignatura Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(5);

    }

    @FXML
    void mostrarInicioAction(ActionEvent event) {

        System.out.println("Pestaña Inicio Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(0);

    }

    @FXML
    void registrarAlumnoAction(ActionEvent event) {

        // Obtenemos los valores de entrada del nuevo Alumno
        String codigoAlumno = inputCodigoAlumno.getText();
        String nombreAlumno = inputNombreAlumno.getText();
        String apellidoAlumno = inputApellidoAlumno.getText();
        establecerAlumno(codigoAlumno, nombreAlumno, apellidoAlumno);
        // Agregamos el nuevo  en la base de datos
        System.out.println("\n->->-> Registrando los datos del nuevo alumno en la tabla de Alumnos de la base de datos ... <-<-<-\n");
        //... COMPLETAR
        /*
            registrarAlumnoNuevo(codigoAlumno, nombreAlumno, ....);
         */

        // Regresamos a la pestaña de Alumnos
        mostrarAlumnosAction(event);

    }

    @FXML
    void registrarNotasAlumnoAction(ActionEvent event) {

        // Obtenemos los valores de entrada del nuevo Alumno
        String notaControl = inputNotaControl.getText();
        String notaLaboratorio = inputNotaLaboratorio.getText();
        String apellnotaProyecto = inputNotaProyecto.getText();
        String notaExamenParcial = inputNotaExamenFinal.getText();
        String notaExamenFinal = inputNotaExamenFinal.getText();

        //COMPLETAR
        // Obtener la opcion seleccionada del combo box
        // Agregamos el nuevo  en la base de datos
        System.out.println("\n->->-> Registrando las notas del alumno en la base de datos ... <-<-<-\n");
        //... COMPLETAR
        /*
        
         ...
         */

        // Regresamos a la pestaña de Alumnos
        mostrarNotasAction(event);

    }

    @FXML
    void actualizarDatosProfesorAction(ActionEvent event) {

        String nombreProfesor = inputNombreProfesor.getText();
        String apellidoProfesor = inputApellidoProfesor.getText();
        String correoProfesor = inputCorreoProfesor.getText();
        String pagWebProfesor = inputPagWebProfesor.getText();

        establecerNombreProfesor(nombreProfesor);
        establecerApellidoProfesor(apellidoProfesor);
        establecerCorreoProfesor(correoProfesor);
        establecerPaginaProfesor(pagWebProfesor);
        System.out.println("\nNombre Profesor: " + nombreProfesor);
        System.out.println("Apellido Profesor: " + apellidoProfesor);
        System.out.println("Correo Profesor: " + correoProfesor);
        System.out.println("Pagina Web Profesor: " + pagWebProfesor);
        outputNombreProfesor.setText(obtenerNombreProfesor("100"));
        outputCorreo.setText(obtenerCorreoProfesor("100"));
        outputPagWeb.setText(obtenerPaginaProfesor("100"));
        outputCodigo.setText("100");
        // Actualizamos los datos del profesor en la base de datos
        System.out.println("\n->->-> Actualizando los datos del profesor en base la base de datos ... <-<-<-\n");
        //...

        // Regresamos a la pestaña Pagina Personal
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(1);
        mostrarPagPersonalAction(event);

    }

    @FXML
    void actualizarDatosEvaluacionAction(ActionEvent event) {

        // Obtenemos los valores de entrada de la Asignatura
        String controlLectura = inputControlLectura.getText();
        String laboratorio = inputLaboratorio.getText();
        String proyecto = inputProyecto.getText();
        String examenParcial = inputExamenParcial.getText();
        String examenFinal = inputExamenFinal.getText();

        establecerPeso("1", Double.parseDouble(controlLectura));
        establecerPeso("2", Double.parseDouble(laboratorio));
        establecerPeso("3", Double.parseDouble(proyecto));
        establecerPeso("4", Double.parseDouble(examenParcial));
        establecerPeso("5", Double.parseDouble(examenFinal));

        // Actualizamos los datos del profesor en la base de datos
        System.out.println("\n->->-> Actualizando los datos de Evaluaciones en la base de datos ... <-<-<-\n");
        //... COMPLETAR
        /*
            actualizarAsignatura(nombreAsignatura, codigo, ....);
         */

        // Regresamos a la pestaña Pagina Evaluaciones
        mostrarEvaluacionesAction(event);
    }

    @FXML
    void actualizarDatosAsignaturaAction(ActionEvent event) {

        // Obtenemos los valores de entrada de la Asignatura
        String nombreAsignatura = inputNombreAsignatura.getText();
        String codigoAsignatura = inputCodigoAsignatura.getText();
        String facultad = inputFacultad.getText();
        String especialidad = inputEspecialidad.getText();
        String planAcademico = inputPlanAcademico.getText();

        System.out.println("\nNombre Asignatura: " + nombreAsignatura);
        System.out.println("Codigo Profesor: " + codigoAsignatura);
        System.out.println("Facultad: " + facultad);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Plan Academico: " + planAcademico);

        // Actualizamos los datos del profesor en la base de datos
        System.out.println("\n->->-> Actualizando los datos de la Asignatura en la base de datos ... <-<-<-\n");

        establecerNombreCurso(nombreAsignatura);
        establecerFacultadCurso(facultad);
        establecerEspecialidadCurso(especialidad);
        establecerPlanCurso(planAcademico);
        mostrarAsignaturaAction(event);

        outputNombreAsignatura.setText(obtenerNombreCurso("1002"));
        outputEspecialidad.setText(obtenerEspecialidadCurso("1002"));
        outputFacultad.setText(obtenerFacultadCurso("1002"));
        outputPlanAcademico.setText(obtenerPlanCurso("1002"));
        outputCodigoAsignatura.setText("1002");

    }

    @FXML
    void editarDatosProfesorAction(ActionEvent event) {

        System.out.println("Pestaña Editar Profesor Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(4);

    }

    @FXML
    void registrarAlumnoNuevoAction(ActionEvent event) {

        System.out.println("Pestaña Registrar Alumno Nuevo Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(11);

    }

    @FXML

    void mostrarRegistroNotasAction(ActionEvent event) {

        System.out.println("Pestaña Registrar Notas ALumno Nuevo Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(12);

        // Combo BOX
        ObservableList<String> options
                = FXCollections.observableArrayList(
                        "100 - Francisco Fabian",
                        "101 - Jose Perez",
                        "102 - Jose Bejarano",
                        "103 - Johnny Lopez",
                        "104 -Jean Sullon");
        comboAlumnos.setItems(options);

    }

    @FXML
    void editarDatosEvaluacionAction(ActionEvent event) {

        System.out.println("Pestaña Editar Evaluaciones Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(10);

    }

    @FXML
    void mostrarAsignaturaAction(ActionEvent event) {

        System.out.println("Pestaña Asignatura Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(2);

        System.out.println("\n->->-> Obteniendo los datos de la Asignatura de la base de datos ... <-<-<-\n");
        // Obtenemos los datos de la Asignatura de la base de datos        
        outputNombreAsignatura.setText(obtenerNombreCurso("1002"));
        outputEspecialidad.setText(obtenerEspecialidadCurso("1002"));
        outputFacultad.setText(obtenerFacultadCurso("1002"));
        outputPlanAcademico.setText(obtenerPlanCurso("1002"));
        outputCodigoAsignatura.setText("1002");
    }

    @FXML
    void mostrarEstadisticasAction(ActionEvent event) {

        System.out.println("Pestaña Estadisticas Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(3);

        // Combo BOX de evaluaciones
        ObservableList<String> options
                = FXCollections.observableArrayList("Control de lectura", "Laboratorio",
                        "Proyecto", "Examen Parcial", "Examen Final");

        comboEvaluacion.setItems(options);

        comboEvaluacion.getSelectionModel().selectFirst();

    }

    @FXML
    void mostrarGraficoEstadisticaAction(ActionEvent event) {

        // COMPLETAR
        // Obtener las cantidades de alumnos aprobados y desaprobados desde la base de datos
        // 0 -> Contro, 1 -> Laboratorio, 2 -> Proyecto, 3 -> Examen Parcial, 4 -> Examen Final
        int opcionSelecionada = comboEvaluacion.getSelectionModel().getSelectedIndex();
        System.out.println();

        Random randomGenerator = new Random();
        int numAprobados = randomGenerator.nextInt(20); // obtenerNumeroAprobados(opcionSelecionada+1);
        int numDesprobados = randomGenerator.nextInt(20); // obtenerNumeroDesaprobados(opcionSelecionada+1);

        // Grafica de las estadisticas
        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("Desaprobados", numDesprobados),
                        new PieChart.Data("Aprobados", numAprobados));

        pieChart.setData(pieChartData);

        // COMPLETAR
        //Calcular la cantidad de alumnos, media y mediana de una respectiva evaluacion
        if (opcionSelecionada == 0) {
            //outputCantidad.setText();
            //outputMedia.setText();
        } else if (opcionSelecionada == 1) {
            //outputCantidad.setText();
            //outputMedia.setText();
        } else if (opcionSelecionada == 2) {
            //outputCantidad.setText();
            //outputMedia.setText();
        } else if (opcionSelecionada == 3) {
            //outputCantidad.setText();
            //outputMedia.setText();
        } else if (opcionSelecionada == 4) {
            //outputCantidad.setText();
            //outputMedia.setText();
        }

    }

    @FXML
    void mostrarPagPersonalAction(ActionEvent event) {

        System.out.println("Pestaña Pagina Personal Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(1);

        System.out.println("\n->->-> Obteniendo los datos personales del profesor de la base de datos ... <-<-<-\n");
        outputNombreProfesor.setText(obtenerNombreProfesor("100"));
        outputCorreo.setText(obtenerCorreoProfesor("100"));
        outputPagWeb.setText(obtenerPaginaProfesor("100"));
        outputCodigo.setText("100");

    }

    @FXML
    void mostrarAlumnosAction(ActionEvent event) {

        System.out.println("Pestaña Alumnos Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(6);

        System.out.println("\n->->-> Obteniendo todos los datos de los alumnos de la base de datos ... <-<-<-\n");

        // COMPLETAR
        ObservableList<Alumno> listaAlumnos = FXCollections.observableArrayList();
        listaAlumnos = obtenerListaalumnos();

        /*ObservableList<Alumno> listaAlumnos = FXCollections.observableArrayList(
                new Alumno("100", "Francisco", "Fabian"),
                new Alumno("101", "Jose", "Perez"),
                new Alumno("102", "Jose", "Bejarano"),
                new Alumno("103", "Johnny", "Lopez"),
                new Alumno("104", "Jean", "Sullon")
        );*/
        columnCodigo.setCellValueFactory(new PropertyValueFactory<Alumno, String>("codigo"));
        columnNombre.setCellValueFactory(new PropertyValueFactory<Alumno, String>("nombres"));
        columnApellido.setCellValueFactory(new PropertyValueFactory<Alumno, String>("apellidos"));

        tableAlumnos.setItems(listaAlumnos);

    }

    @FXML
    void mostrarAsistenciaAction(ActionEvent event) {

        System.out.println("Pestaña Asistencia Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(7);

    }

    @FXML
    void mostrarEvaluacionesAction(ActionEvent event) {

        System.out.println("Pestaña Evaluaciones Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(8);

        System.out.println("\n->->-> Obteniendo los oesis de las evaluaciones de la base de datos ... <-<-<-\n");
        // Obtenemos los datos del profesor de la base de datos
        // COMPLETAR

        outputControlLectura.setText(obtenerPeso("1"));
        outputLaboratorio.setText(obtenerPeso("2"));
        outputProyecto.setText(obtenerPeso("3"));
        outputExamenParcial.setText(obtenerPeso("4"));
        outputExamenFinal.setText(obtenerPeso("5"));

    }

    @FXML
    void mostrarNotasAction(ActionEvent event) {

        System.out.println("Pestaña Notas Seleccionada");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(9);

        System.out.println("\n->->-> Obteniendo todos los datos de los notas de los alumnos de la base de datos ... <-<-<-\n");

        // COMPLETAR
        /*
        
        ObservableList<Alumno> listaAlumnos = FXCollections.observableArrayList();
        listaAlumnos = obtenerListaAlumnos();        
        
         */
        ObservableList<NotaAlumno> listaNotaAlumnos = FXCollections.observableArrayList(
                new NotaAlumno("100", "Francisco", "Fabian", 10, 11, 12, 13, 14),
                new NotaAlumno("101", "Jose", "Perez", 14, 13, 12, 15, 14),
                new NotaAlumno("102", "Jose", "Bejarano", 11, 11, 20, 13, 12),
                new NotaAlumno("103", "Johnny", "Lopez", 12, 16, 12, 13, 14),
                new NotaAlumno("104", "Jean", "Sullon", 19, 15, 12, 18, 20)
        );

        columnCodigoNota.setCellValueFactory(new PropertyValueFactory<NotaAlumno, String>("codigo"));
        columnNombreNota.setCellValueFactory(new PropertyValueFactory<NotaAlumno, String>("nombres"));
        columnApellidoNota.setCellValueFactory(new PropertyValueFactory<NotaAlumno, String>("apellidos"));
        columnControl.setCellValueFactory(new PropertyValueFactory<NotaAlumno, Integer>("notaControl"));
        columnLaboratorio.setCellValueFactory(new PropertyValueFactory<NotaAlumno, Integer>("notaLaboratorio"));
        columnProyecto.setCellValueFactory(new PropertyValueFactory<NotaAlumno, Integer>("notaProyecto"));
        columnExamenParcial.setCellValueFactory(new PropertyValueFactory<NotaAlumno, Integer>("notaExamenParcial"));
        columnExamenFinal.setCellValueFactory(new PropertyValueFactory<NotaAlumno, Integer>("notaExamenFinal"));

        tableNotas.setItems(listaNotaAlumnos);

    }

    @FXML
    void salirAction(ActionEvent event) {

        System.out.println("Cerra Sesion");
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

}
