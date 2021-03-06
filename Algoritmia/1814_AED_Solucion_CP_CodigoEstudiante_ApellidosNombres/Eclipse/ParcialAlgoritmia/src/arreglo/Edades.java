package arreglo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloEdades;

public class Edades extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	
	ArregloEdades ae = new ArregloEdades();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edades frame = new Edades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Edades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 62, 390, 188);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero;
				numero = Integer.parseInt(txtValor.getText());
				
				// ae.adicionarEdad(numero);
				
				txtS.setText("La suma de las edades de los mayores de edad es: " + ae.sumaMayores()+"\n");
				txtS.append("La posici?n de la tercera edad m?ltiplo de 10 es: " + ae.posicionEdad()+"\n");
				
				
				// ae.eliminarEdad();
				// ae.reemplazarEdad();
				ae.incrementarEdad();
				txtS.append(ae.mostrar() + "");
				// ae.remplazar();
				
			}
		});
		btnProcesar.setBounds(323, 21, 89, 23);
		contentPane.add(btnProcesar);
		
		txtValor = new JTextField();
		txtValor.setBounds(89, 22, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(22, 25, 46, 14);
		contentPane.add(lblValor);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero;
				
				numero = Integer.parseInt(txtValor.getText());
				
				ae.adicionarEdad(numero);
			}
		});
		btnAdicionar.setBounds(201, 21, 89, 23);
		contentPane.add(btnAdicionar);
		
		
	}
}