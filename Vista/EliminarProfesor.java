package Vista;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import logica.Gestor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarProfesor extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	private JTextField txtCedulaEliminar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public EliminarProfesor() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
		getContentPane().setLayout(null);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(504, 147, 162, 38);
		getContentPane().add(btnAtras);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnEliminar.setBounds(28, 147, 162, 38);
		getContentPane().add(btnEliminar);
		
		JLabel lblCedulaProfesor = new JLabel("Cédula del profesor a eliminar:");
		lblCedulaProfesor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCedulaProfesor.setBounds(28, 78, 398, 38);
		getContentPane().add(lblCedulaProfesor);
		
		txtCedulaEliminar = new JTextField();
		txtCedulaEliminar.setColumns(10);
		txtCedulaEliminar.setBounds(443, 78, 223, 32);
		getContentPane().add(txtCedulaEliminar);
		
		JLabel lblEliminarProfesor = new JLabel("Eliminar profesor");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarProfesor();
			}
		});
		lblEliminarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblEliminarProfesor.setBounds(225, 10, 250, 38);
		getContentPane().add(lblEliminarProfesor);
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

	private void eliminarProfesor() {
		gestor.borrar_Profesor(txtCedulaEliminar.getText());
		JOptionPane.showMessageDialog(this, "Profesor eliminado con éxito");
	}
}
