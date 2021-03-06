package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejercicio1.Consultor;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 314, 239);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultor a,b,c;
				
				a = new Consultor();
				b = new Consultor(555,25,"Emeterio");
				c=  new Consultor(369, 75, "Loana", 13);
				
				//Objeto 1
				txtS.append("Codigo: " + a.getCodigo()+"\n");
				txtS.append("Nombre: " + a.getNombre()+"\n");
				txtS.append("Horas de trabajo: " + a.getHorasTrab()+"\n");
				txtS.append("Tarifa por hora: " + a.getTarifHoras()+"\n"+"\n");
				
				txtS.append("Sueldo Bruto: " + a.calcularSueldoBruto()+"\n");
				txtS.append("Descuento AFP: " + a.calcularDescuentoAFP()+"\n");
				txtS.append("Descuento EPS:  " + a.calcularDescuentoEPS()+"\n");
				txtS.append("Sueldo Neto: " + a.calcularSueldoNeto()+"\n"+"\n");
				
				
				//Objeto 2
				txtS.append("Codigo:  " + b.getCodigo()+"\n");
				txtS.append("Nombre:  " + b.getNombre()+"\n");
				txtS.append("Horas de trabajo: " + b.getHorasTrab()+"\n");
				txtS.append("Tarifa por hora:  " + b.getTarifHoras()+"\n"+"\n");
				
				txtS.append("Sueldo Bruto: " + b.calcularSueldoBruto()+"\n");
				txtS.append("Descuento AFP: " + b.calcularDescuentoAFP()+"\n");
				txtS.append("Descuento EPS:  " + b.calcularDescuentoEPS()+"\n");
				txtS.append("Sueldo Neto: " + b.calcularSueldoNeto()+"\n"+"\n");
				
				
				//Objeto 3
				txtS.append("Codigo: " + c.getCodigo()+"\n");
				txtS.append("Nombre:  " + c.getNombre()+"\n");
				txtS.append("Horas de trabajo: " + c.getHorasTrab()+"\n");
				txtS.append("Tarifa por hora: " + c.getTarifHoras()+"\n"+"\n");
				
				txtS.append("Sueldo Bruto: " + c.calcularSueldoBruto()+"\n");
				txtS.append("Descuento AFP: " + c.calcularDescuentoAFP()+"\n");
				txtS.append("Descuento EPS:  " + c.calcularDescuentoEPS()+"\n");
				txtS.append("Sueldo Neto: " + c.calcularSueldoNeto()+"\n"+"\n");
				
				//Contador de objetos y Sueldo neto acumulado
				txtS.append("Contador: " + a.getContador()+"\n");
				txtS.append("Suma Sueldos:  " + a.getSumaSueldos()+"\n");
				txtS.append("AFP:  " + a.getAfp()+"\n");
				txtS.append("EPS:  " + a.getEps()+"\n"+"\n");
			}
		});
		btnProcesar.setBounds(335, 13, 89, 23);
		contentPane.add(btnProcesar);
	}

}
