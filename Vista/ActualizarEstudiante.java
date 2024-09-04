package Vista;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.EstudianteDto;
import logica.Gestor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActualizarEstudiante extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	private JTextField txtNuevaMatricula;
	private JTextField txtNuevoCreditos;
	private JTextField txtNuevoCodigo;
	private JTextField txtCedula;
	private JTextField txtNuevoNombre;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ActualizarEstudiante() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
		getContentPane().setLayout(null);
		
		txtNuevaMatricula = new JTextField();
		txtNuevaMatricula.setColumns(10);
		txtNuevaMatricula.setBounds(398, 278, 301, 32);
		getContentPane().add(txtNuevaMatricula);
		
		txtNuevoCreditos = new JTextField();
		txtNuevoCreditos.setColumns(10);
		txtNuevoCreditos.setBounds(398, 236, 301, 32);
		getContentPane().add(txtNuevoCreditos);
		
		txtNuevoCodigo = new JTextField();
		txtNuevoCodigo.setColumns(10);
		txtNuevoCodigo.setBounds(398, 188, 301, 32);
		getContentPane().add(txtNuevoCodigo);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(476, 92, 223, 32);
		getContentPane().add(txtCedula);
		
		txtNuevoNombre = new JTextField();
		txtNuevoNombre.setColumns(10);
		txtNuevoNombre.setBounds(398, 140, 301, 32);
		getContentPane().add(txtNuevoNombre);
		
		JLabel lblNombre = new JLabel("Nuevo nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNombre.setBounds(30, 140, 240, 38);
		getContentPane().add(lblNombre);
		
		JLabel lblCdulaDelEstudiante = new JLabel("Cédula del estudiante a actualizar:");
		lblCdulaDelEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCdulaDelEstudiante.setBounds(30, 92, 425, 38);
		getContentPane().add(lblCdulaDelEstudiante);
		
		JLabel lblCodigo = new JLabel("Nuevo código estudiantil:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCodigo.setBounds(30, 188, 305, 38);
		getContentPane().add(lblCodigo);
		
		JLabel lblCreditos = new JLabel("Nuevo numero de créditos:");
		lblCreditos.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCreditos.setBounds(30, 236, 339, 38);
		getContentPane().add(lblCreditos);
		
		JLabel lblMatricula = new JLabel("Nueva matrícula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblMatricula.setBounds(30, 284, 240, 38);
		getContentPane().add(lblMatricula);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarEstudiante();
			}
		});
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnActualizar.setBounds(30, 348, 162, 38);
		getContentPane().add(btnActualizar);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(536, 348, 162, 38);
		getContentPane().add(btnAtras);
		
		JLabel lblActualizarEstudiante = new JLabel("Actualizar estudiante");
		lblActualizarEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblActualizarEstudiante.setBounds(249, 23, 250, 38);
		getContentPane().add(lblActualizarEstudiante);
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

	private void actualizarEstudiante() {
		EstudianteDto estudianteDto = new EstudianteDto();
		estudianteDto.setCedula(txtCedula.getText());
        estudianteDto.setCreditos(Integer.parseInt(txtNuevoCreditos.getText()));
        estudianteDto.setMatricula(Integer.parseInt(txtNuevaMatricula.getText()));
        estudianteDto.setCodigoE(txtNuevoCodigo.getText());
        estudianteDto.setNombre(txtNuevoNombre.getText());
        
        gestor.update_Estudiante(estudianteDto);
        JOptionPane.showMessageDialog(this, "Estudiante actualizado con éxito");
	}
}
