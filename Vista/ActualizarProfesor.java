package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActualizarProfesor extends JFrame{

	private JFrame frame;
	private JTextField txtMaterias;
	private JTextField txtCategoria;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCedula;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ActualizarProfesor() {
		getContentPane().setLayout(null);
		
		JLabel lblActualizarProfesor = new JLabel("Actualizar profesor");
		lblActualizarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblActualizarProfesor.setBounds(254, 21, 250, 38);
		getContentPane().add(lblActualizarProfesor);
		
		JLabel lblCedulaDelProfesor = new JLabel("Cédula del profesor a actualizar:");
		lblCedulaDelProfesor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCedulaDelProfesor.setBounds(35, 90, 425, 38);
		getContentPane().add(lblCedulaDelProfesor);
		
		JLabel lblNombre = new JLabel("Nuevo nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNombre.setBounds(35, 138, 240, 38);
		getContentPane().add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Nuevo código:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCodigo.setBounds(35, 186, 305, 38);
		getContentPane().add(lblCodigo);
		
		JLabel lblCategoria = new JLabel("Nueva categoría:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCategoria.setBounds(35, 234, 339, 38);
		getContentPane().add(lblCategoria);
		
		JLabel lblNuevasMaterias = new JLabel("Nuevo número de materias dictadas:");
		lblNuevasMaterias.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNuevasMaterias.setBounds(35, 282, 453, 38);
		getContentPane().add(lblNuevasMaterias);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnActualizar.setBounds(35, 346, 162, 38);
		getContentPane().add(btnActualizar);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(541, 346, 162, 38);
		getContentPane().add(btnAtras);
		
		txtMaterias = new JTextField();
		txtMaterias.setColumns(10);
		txtMaterias.setBounds(497, 282, 206, 32);
		getContentPane().add(txtMaterias);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(403, 234, 301, 32);
		getContentPane().add(txtCategoria);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(403, 186, 301, 32);
		getContentPane().add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(403, 138, 301, 32);
		getContentPane().add(txtNombre);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(481, 90, 223, 32);
		getContentPane().add(txtCedula);
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

}
