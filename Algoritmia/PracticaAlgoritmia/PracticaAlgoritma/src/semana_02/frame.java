package semana_02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Pelota;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
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
				
				Pelota a = new Pelota("A30","Chibolita",250,360,60,25);
				
				
				//Mostrar datos							
				txtS.append("C?digo: " + a.getCodigo()+"\n");
				txtS.append("Marca: " + a.getMarca()+"\n");
				txtS.append("Peso en gramos: " + a.getPesoGramos()+"\n");
				txtS.append("Presion en libras: "+a.getPresionLibras()+"\n");
				txtS.append("Diametro en cent?metros:"+(a.getDiamCentim()+1)+"\n");
				txtS.append("Precio : "+(a.getPrecio()-(a.getPrecio()*0.25))+"\n");
				
				//Imprimir m?todos
				txtS.append("Volumen de la pelota: " + a.calcularVolumen()+"\n");
				txtS.append("El descuento es: " + a.calcularDesc()+"\n");
				txtS.append("El importe a pagar es : " + a.calcularImporte()+"\n");
				txtS.append("La concatenacion es : " + a.concatenacion()+"\n");
				
			}
		});
		btnProcesar.setBounds(335, 13, 89, 23);
		contentPane.add(btnProcesar);
	}

}
