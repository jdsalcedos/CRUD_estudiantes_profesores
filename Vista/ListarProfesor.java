package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarProfesor extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarProfesor window = new ListarProfesor();
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
	public ListarProfesor() {
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
