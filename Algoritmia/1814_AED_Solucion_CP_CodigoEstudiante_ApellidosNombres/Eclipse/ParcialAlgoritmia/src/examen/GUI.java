package examen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 414, 185);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		
		
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Vigilante a,b; 
				
				a = new Vigilante();
				b = new Vigilante();
				
				a.setDni(72716175);
				a.setNombre("Johann");
				a.setPuestTrab("Supervisor");
				a.setSueldo(80000);
				
				b.setDni(07357006);
				b.setNombre("Loana");
				b.setPuestTrab("Agente");
				b.setSueldo(50000);
				
				txtS.append("El DNI del empleado es  " + a.getDni()+"\n");
				txtS.append("El nombre del empleado es " + a.getNombre()+"\n");
				txtS.append("El tipo de trabajo e: " + a.getPuestTrab()+"\n");
				txtS.append("Su sueldo es de: " + a.getSueldo()+(a.getSueldo()*0.20)+"\n");
				txtS.append("El rango del sueldo del empleado es  " + a.rangoSueldo()+"\n");
				txtS.append("El sueldo neto del empleado es  " + a.sueldoNeto()+"\n");
				txtS.append("El descuento del empleado es  " + a.descuento()+"\n"+"\n");
				
				txtS.append("El DNI del empleado es  " + b.getDni()+"\n");
				txtS.append("El nombre del empleado es " + b.getNombre()+"\n");
				txtS.append("El tipo de trabajo e: " + b.getPuestTrab()+"\n");
				txtS.append("Su sueldo es de: " + b.getSueldo()+(b.getSueldo()*0.10)+"\n");
				txtS.append("El rango del sueldo del empleado es  " + b.rangoSueldo()+"\n");
				txtS.append("El sueldo neto del empleado es  " + b.sueldoNeto()+"\n");
				txtS.append("El descuento del empleado es  " + b.descuento()+"\n");
				
			}
		});
		
		
		btnProcesar.setBounds(335, 26, 89, 23);
		contentPane.add(btnProcesar);

		
	}
	
	
}
