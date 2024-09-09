package Vista;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.EstudianteDto;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import logica.Gestor;

public class ListarEstudiantes extends JFrame{
	private Gestor gestor;
	private JFrame frame;
	//private JLabel lblListaEstudiantes;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ListarEstudiantes() {
		EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
		
		getContentPane().setLayout(null);
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(btnAtras);
			    ventanaActual.setVisible(false);
			}
		});
		btnAtras.setBounds(386, 416, 149, 46);
		getContentPane().add(btnAtras);
		
		JLabel lblListadoEstudiantes = new JLabel("Listado de estudiantes");
		lblListadoEstudiantes.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblListadoEstudiantes.setBounds(144, 10, 275, 53);
		getContentPane().add(lblListadoEstudiantes);
		
		listarEstudiantes();
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
	
	
	private void listarEstudiantes() {
		List<EstudianteDto> estudiantes = gestor.buscar_todos_estudiantes();
		StringBuilder texto = new StringBuilder();
		for(EstudianteDto estudiante : estudiantes) {
			texto.append(estudiante.toString()).append("\n\n");
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
