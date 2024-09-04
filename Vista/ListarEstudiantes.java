package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class ListarEstudiantes extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarEstudiantes window = new ListarEstudiantes();
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
	public ListarEstudiantes() {
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
		
		JLabel lblNewLabel = new JLabel("Listado de estudiantes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(144, 10, 275, 53);
		getContentPane().add(lblNewLabel);
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
