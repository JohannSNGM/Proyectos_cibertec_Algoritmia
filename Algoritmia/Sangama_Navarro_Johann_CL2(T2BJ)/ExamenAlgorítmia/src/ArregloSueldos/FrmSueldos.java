package ArregloSueldos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import ArregloSueldos.ArregloSueldos;

public class FrmSueldos extends JFrame {

	private JPanel contentPane;
	private JTextField txtSueldo;
	private JTextArea txtS;
	
	ArregloSueldos ea = new ArregloSueldos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSueldos frame = new FrmSueldos();
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
	public FrmSueldos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setBounds(36, 22, 46, 14);
		contentPane.add(lblSueldo);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(82, 19, 86, 20);
		contentPane.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 414, 172);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero;
				numero = Integer.parseInt(txtSueldo.getText());
				ea.adicionar(numero);		
			}
		});
		btnAdicionar.setBounds(211, 11, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
				for(int i=0;i<ea.tamanio();i++){
					txtS.append("n["+i+"]"+ea.obtener(i)+"\n");
				}
				
			}
		});
		btnMostrar.setBounds(211, 45, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				ea.reemplazarUltimoSueldoMenorQue1000();
				if(ea.posicionUltimoSueldoMenorQue1000()!=-1){
					mensaje("Ultimo sueldo menor que 1000 eliminado correctamente");
					}else{
						mensaje("No hay numero menor a 1000");
					}
			}
		});
		btnReemplazar.setBounds(322, 11, 102, 23);
		contentPane.add(btnReemplazar);
		
		JButton btnIncrementar = new JButton("Incrementar");
		btnIncrementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje("Incremento realizado");
				txtS.setText("");
				txtS.append("Sueldos que han sido incrementados " + ea.incrementarSueldosMenoresQue1200()+"\n");

			}
		});
		btnIncrementar.setBounds(322, 45, 102, 23);
		contentPane.add(btnIncrementar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ea.eliminarUltimoSueldoMenorQue1000();
				if(ea.posicionUltimoSueldoMenorQue1000()!=-1){
				mensaje("Ultimo sueldo menor que 1000 eliminado correctamente");
				}else{
					mensaje("No hay numero menor a 1000");
				}
			
			}
		});
		btnEliminar.setBounds(335, 259, 89, 23);
		contentPane.add(btnEliminar);
	}
	void imprimir(){
		imprimir("");
	}
	
	void imprimir(String s){
		txtS.append(s+"\n");
	}
	
	void listar(){
		txtS.setText("");
		for(int i=0;i<ea.tamanio();i++){
			imprimir("n["+i+"]: "+ ea.obtener(i));
		}
	}
	
	void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
		
}
