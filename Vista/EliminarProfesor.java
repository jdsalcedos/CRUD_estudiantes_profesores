package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarProfesor extends JFrame{

	private JFrame frame;
	private JTextField txtCedulaEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarProfesor window = new EliminarProfesor();
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
	public EliminarProfesor() {
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

}
