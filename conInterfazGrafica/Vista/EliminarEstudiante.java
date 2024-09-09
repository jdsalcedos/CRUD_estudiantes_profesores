package Vista;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import logica.Gestor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarEstudiante extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	private JTextField txtCedulaEliminar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public EliminarEstudiante() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
		getContentPane().setLayout(null);
		
		JLabel lblEliminarEstudiante = new JLabel("Eliminar estudiante");
		lblEliminarEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblEliminarEstudiante.setBounds(207, 10, 250, 38);
		getContentPane().add(lblEliminarEstudiante);
		
		JLabel lblCdulaDelEstudiante = new JLabel("Cédula del estudiante a eliminar:");
		lblCdulaDelEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCdulaDelEstudiante.setBounds(10, 78, 398, 38);
		getContentPane().add(lblCdulaDelEstudiante);
		
		txtCedulaEliminar = new JTextField();
		txtCedulaEliminar.setColumns(10);
		txtCedulaEliminar.setBounds(425, 78, 223, 32);
		getContentPane().add(txtCedulaEliminar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarEstudiante();
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnEliminar.setBounds(10, 147, 162, 38);
		getContentPane().add(btnEliminar);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(486, 147, 162, 38);
		getContentPane().add(btnAtras);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void eliminarEstudiante() {
		gestor.borrar_Estudiante(txtCedulaEliminar.getText());
		JOptionPane.showMessageDialog(this, "Estudiante eliminado con éxito");
	}
}
