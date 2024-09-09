package Vista;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.EstudianteDto;
import dto.ProfesorDto;
import logica.Gestor;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ListarProfesor extends JFrame{
	private Gestor gestor;
	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ListarProfesor() {
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
		btnAtras.setBounds(370, 416, 149, 46);
		getContentPane().add(btnAtras);
		
		JLabel lblListadoProfesores = new JLabel("Listado de profesores");
		lblListadoProfesores.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblListadoProfesores.setBounds(128, 10, 275, 53);
		getContentPane().add(lblListadoProfesores);
		
		listarProfesores();
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
	
	private void listarProfesores() {
		List<ProfesorDto> profesores = gestor.buscar_todos_profesores();
		StringBuilder texto = new StringBuilder();
		for(ProfesorDto profesor : profesores) {
			texto.append(profesor.toString()).append("\n\n");
		}
		JTextArea textArea = new JTextArea(texto.toString());
	    textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    textArea.setEditable(false); 
	    textArea.setLineWrap(true); 
	    textArea.setWrapStyleWord(true); 
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.add(textArea, BorderLayout.CENTER);
	    panel.setBounds(10, 60, 420, 350); 


	    getContentPane().add(panel, BorderLayout.CENTER);
	}

}
