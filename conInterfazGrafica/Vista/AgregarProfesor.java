package Vista;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.ProfesorDto;
import logica.Gestor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarProfesor extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtCodigo;
	private JTextField txtCategoria;
	private JTextField txtMaterias;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AgregarProfesor() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
        
		getContentPane().setLayout(null);
		
		JLabel lblAgregarProfesor = new JLabel("Agregar Profesor");
		lblAgregarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAgregarProfesor.setBounds(253, 20, 240, 38);
		getContentPane().add(lblAgregarProfesor);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(296, 89, 399, 32);
		getContentPane().add(txtNombre);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(296, 137, 399, 32);
		getContentPane().add(txtCedula);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(296, 185, 399, 32);
		getContentPane().add(txtCodigo);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(296, 233, 399, 32);
		getContentPane().add(txtCategoria);
		
		txtMaterias = new JTextField();
		txtMaterias.setColumns(10);
		txtMaterias.setBounds(296, 287, 399, 32);
		getContentPane().add(txtMaterias);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.setBounds(532, 345, 162, 38);
		getContentPane().add(btnAtras);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarProfesor();
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAgregar.setBounds(26, 345, 162, 38);
		getContentPane().add(btnAgregar);
		
		JLabel lblNmeroDeMaterias = new JLabel("Número de materias:");
		lblNmeroDeMaterias.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNmeroDeMaterias.setBounds(26, 281, 260, 38);
		getContentPane().add(lblNmeroDeMaterias);
		
		JLabel lblCategoria = new JLabel("Categoría:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCategoria.setBounds(26, 233, 254, 38);
		getContentPane().add(lblCategoria);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCodigo.setBounds(26, 185, 240, 38);
		getContentPane().add(lblCodigo);
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCedula.setBounds(26, 137, 240, 38);
		getContentPane().add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNombre.setBounds(26, 89, 240, 38);
		getContentPane().add(lblNombre);
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
	
	private void agregarProfesor() {
		ProfesorDto profesorDto = new ProfesorDto();
        profesorDto.setCodigoP(txtCodigo.getText());
        profesorDto.setCategoria(txtCategoria.getText());
        profesorDto.setMaterias_dictadas(Integer.parseInt(txtMaterias.getText()));
        profesorDto.setCedula(txtCedula.getText());
        profesorDto.setNombre(txtNombre.getText());
        
        gestor.guardar_Profesor(profesorDto);
		JOptionPane.showMessageDialog(this, "Profesor agregado con éxito");

	}
}
