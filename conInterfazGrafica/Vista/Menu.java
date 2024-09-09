package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;

public class Menu extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTextoBienvenida = new JLabel("SISTEMA DE GESTIÓN");
		lblTextoBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblTextoBienvenida.setBounds(163, 28, 302, 34);
		frame.getContentPane().add(lblTextoBienvenida);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(473, 249, 135, 42);
		frame.getContentPane().add(btnSalir);
		
		JComboBox cboxSeleccionarOpcion = new JComboBox();
		cboxSeleccionarOpcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cboxSeleccionarOpcion.setBounds(37, 102, 244, 59);
		frame.getContentPane().add(cboxSeleccionarOpcion);
		cboxSeleccionarOpcion.addItem("Listar estudiantes");
		cboxSeleccionarOpcion.addItem("Actualizar estudiante");
		cboxSeleccionarOpcion.addItem("Agregar estudiante");
		cboxSeleccionarOpcion.addItem("Eliminar estudiante");
		cboxSeleccionarOpcion.addItem("Listar profesores");
		cboxSeleccionarOpcion.addItem("Actualizar profesor");
		cboxSeleccionarOpcion.addItem("Agregar profesor");
		cboxSeleccionarOpcion.addItem("Eliminar profesor");
		
		JButton btnBuscarOpcion = new JButton("Seleccionar");
		btnBuscarOpcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcion=(String)cboxSeleccionarOpcion.getSelectedItem();
				switch(opcion) {
				case "Listar estudiantes":
					ventanaListarEstudiantes();
					break;
				case "Actualizar estudiante":
					ventanaActualizarEstudiante();
					break;
				case "Agregar estudiante":
					//ventanaActual.setVisible(false);
					ventanaAgregarEstudiantes();;
					break;
				case "Eliminar estudiante":
					ventanaEliminarEstudiante();;
					break;
				case "Listar profesores":
					ventanaListarProfesor();;
					break;
				case "Actualizar profesor":
					ventanaActualizarProfesor();
					break;
				case "Agregar profesor":
					ventanaAgregarProfesor();
					break;
				case "Eliminar profesor":
					ventanaEliminarProfesor();
					break;
				}
					
			}
		});
		btnBuscarOpcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscarOpcion.setBounds(363, 102, 218, 59);
		frame.getContentPane().add(btnBuscarOpcion);
	}
	
	private static void ventanaListarEstudiantes() {
        ListarEstudiantes ventanaListE = new ListarEstudiantes();
        ventanaListE.setSize(570, 520); // Establece un tamaño predeterminado de 800x600
        ventanaListE.setVisible(true);
    }
	private static void ventanaAgregarEstudiantes() {
		AgregarEstudiantes ventanaAgreE = new AgregarEstudiantes();
        ventanaAgreE.setSize(734, 448); // Establece un tamaño predeterminado de 800x600
        ventanaAgreE.setVisible(true);
    }
	private static void ventanaEliminarEstudiante() {
		EliminarEstudiante ventanaEliE = new EliminarEstudiante();
        ventanaEliE.setSize(690, 240); // Establece un tamaño predeterminado de 800x600
        ventanaEliE.setVisible(true);
    }
	private static void ventanaActualizarEstudiante() {
		ActualizarEstudiante ventanaActE = new ActualizarEstudiante();
        ventanaActE.setSize(760, 460); // Establece un tamaño predeterminado de 800x600
        ventanaActE.setVisible(true);
    }
	private static void ventanaListarProfesor() {
		ListarProfesor ventanaListP = new ListarProfesor();
        ventanaListP.setSize(570, 520); // Establece un tamaño predeterminado de 800x600
        ventanaListP.setVisible(true);
    }
	private static void ventanaAgregarProfesor() {
		AgregarProfesor ventanaAgreP = new AgregarProfesor();
        ventanaAgreP.setSize(734, 448); // Establece un tamaño predeterminado de 800x600
        ventanaAgreP.setVisible(true);
    }
	private static void ventanaEliminarProfesor() {
		EliminarProfesor ventanaEliP = new EliminarProfesor();
        ventanaEliP.setSize(690, 240); // Establece un tamaño predeterminado de 800x600
        ventanaEliP.setVisible(true);
    }
	private static void ventanaActualizarProfesor() {
		ActualizarProfesor ventanaActP = new ActualizarProfesor();
        ventanaActP.setSize(760, 460); // Establece un tamaño predeterminado de 800x600
        ventanaActP.setVisible(true);
    }
	
}
