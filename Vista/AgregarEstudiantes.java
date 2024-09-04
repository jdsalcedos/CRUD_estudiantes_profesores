package Vista;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.EstudianteDto;
import logica.Gestor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarEstudiantes extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtCodigo;
	private JTextField txtCreditos;
	private JTextField txtMatricula;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AgregarEstudiantes() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
		
		getContentPane().setLayout(null);
		
		JLabel lblAgregarEstudiante = new JLabel("Agregar estudiante");
		lblAgregarEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAgregarEstudiante.setBounds(248, 30, 240, 38);
		getContentPane().add(lblAgregarEstudiante);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNombre.setBounds(21, 99, 240, 38);
		getContentPane().add(lblNombre);
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCedula.setBounds(21, 147, 240, 38);
		getContentPane().add(lblCedula);
		
		JLabel lblCodigo = new JLabel("Código estudiantil:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCodigo.setBounds(21, 195, 240, 38);
		getContentPane().add(lblCodigo);
		
		JLabel lblCreditos = new JLabel("Numero de créditos:");
		lblCreditos.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCreditos.setBounds(21, 243, 254, 38);
		getContentPane().add(lblCreditos);
		
		JLabel lblMatricula = new JLabel("Matrícula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblMatricula.setBounds(21, 291, 240, 38);
		getContentPane().add(lblMatricula);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(291, 99, 399, 32);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(291, 147, 399, 32);
		getContentPane().add(txtCedula);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(291, 195, 399, 32);
		getContentPane().add(txtCodigo);
		
		txtCreditos = new JTextField();
		txtCreditos.setColumns(10);
		txtCreditos.setBounds(291, 243, 399, 32);
		getContentPane().add(txtCreditos);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(291, 291, 399, 32);
		getContentPane().add(txtMatricula);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(527, 355, 162, 38);
		getContentPane().add(btnAtras);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarEstudiante();
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAgregar.setBounds(21, 355, 162, 38);
		getContentPane().add(btnAgregar);
		
		
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
	
	private void agregarEstudiante() {
		EstudianteDto estudianteDto = new EstudianteDto();
		estudianteDto.setCedula(txtCedula.getText());
		estudianteDto.setCreditos(Integer.parseInt(txtCreditos.getText()));
		estudianteDto.setMatricula(Integer.parseInt(txtMatricula.getText()));
		estudianteDto.setCodigoE(txtCodigo.getText());
		estudianteDto.setNombre(txtNombre.getText());
		
		gestor.guardar_Estudiante(estudianteDto);
		JOptionPane.showMessageDialog(this, "Estudiante agregado con éxito");
	}

}
