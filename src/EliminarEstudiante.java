import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarEstudiante extends JFrame{

	private JFrame frame;
	private JTextField txtCedulaEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarEstudiante window = new EliminarEstudiante();
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
	public EliminarEstudiante() {
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

}
