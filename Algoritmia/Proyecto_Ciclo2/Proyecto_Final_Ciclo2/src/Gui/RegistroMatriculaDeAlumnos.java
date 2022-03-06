package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;

public class RegistroMatriculaDeAlumnos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnSalir;
	private JMenu mnMantenimiento;
	private JMenu mnRegistro;
	private JMenu mnConsulta;
	private JMenuItem mntmMAlumno;
	private JMenuItem mntmMCurso;
	private JMenu mnReporte;
	private JMenuItem mntmRAlumnoPendiente;
	private JMenuItem mntmRAlumnoVigente;
	private JMenuItem mntmRAlumnoCurso;
	private JMenuItem mntmRMatricula;
	private JMenuItem mntmRRetiro;
	private JMenuItem mntmCAlumno;
	private JMenuItem mntmCCurso;
	private JMenuItem mntmCMatricula;
	private JMenuItem mntmCRetiro;
	private Label lblFondo;
	private JMenuItem mntmSSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroMatriculaDeAlumnos frame = new RegistroMatriculaDeAlumnos();
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
	public RegistroMatriculaDeAlumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 596);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		mntmSSalir = new JMenuItem("Salir");
		mntmSSalir.addActionListener(this);
		mntmSSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnSalir.add(mntmSSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmMAlumno = new JMenuItem("Alumno");
		mntmMAlumno.addActionListener(this);
		mnMantenimiento.add(mntmMAlumno);
		
		mntmMCurso = new JMenuItem("Curso");
		mntmMCurso.addActionListener(this);
		mnMantenimiento.add(mntmMCurso);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmRMatricula = new JMenuItem("Matricula");
		mntmRMatricula.addActionListener(this);
		mnRegistro.add(mntmRMatricula);
		
		mntmRRetiro = new JMenuItem("Retiro");
		mntmRRetiro.addActionListener(this);
		mnRegistro.add(mntmRRetiro);
		
		mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		mntmCAlumno = new JMenuItem("Alumno");
		mntmCAlumno.addActionListener(this);
		mnConsulta.add(mntmCAlumno);
		
		mntmCCurso = new JMenuItem("Curso");
		mntmCCurso.addActionListener(this);
		mnConsulta.add(mntmCCurso);
		
		mntmCMatricula = new JMenuItem("Matricula");
		mntmCMatricula.addActionListener(this);
		mnConsulta.add(mntmCMatricula);
		
		mntmCRetiro = new JMenuItem("Retiro");
		mntmCRetiro.addActionListener(this);
		mnConsulta.add(mntmCRetiro);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmRAlumnoPendiente = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmRAlumnoPendiente.addActionListener(this);
		mnReporte.add(mntmRAlumnoPendiente);
		
		mntmRAlumnoVigente = new JMenuItem("Alumnos con matr\u00EDcula vigente\r\n");
		mntmRAlumnoVigente.addActionListener(this);
		mnReporte.add(mntmRAlumnoVigente);
		
		mntmRAlumnoCurso = new JMenuItem("Alumnos matriculados por curso");
		mntmRAlumnoCurso.addActionListener(this);
		mnReporte.add(mntmRAlumnoCurso);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmRAlumnoCurso) {
			actionPerformedMntmRAlumnoCurso(e);
		}
		if (e.getSource() == mntmRAlumnoVigente) {
			actionPerformedMntmRAlumnoVigente(e);
		}
		if (e.getSource() == mntmRAlumnoPendiente) {
			actionPerformedMntmRAlumnoPendiente(e);
		}
		if (e.getSource() == mntmCRetiro) {
			actionPerformedMntmCRetiro(e);
		}
		if (e.getSource() == mntmCMatricula) {
			actionPerformedMntmCMatricula(e);
		}
		if (e.getSource() == mntmCCurso) {
			actionPerformedMntmCCurso(e);
		}
		if (e.getSource() == mntmCAlumno) {
			actionPerformedMntmCAlumno(e);
		}
		if (e.getSource() == mntmRRetiro) {
			actionPerformedMntmRRetiro(e);
		}
		if (e.getSource() == mntmRMatricula) {
			actionPerformedMntmRMatricula(e);
		}
		if (e.getSource() == mntmMCurso) {
			actionPerformedMntmMCurso(e);
		}
		if (e.getSource() == mntmMAlumno) {
			actionPerformedMntmMAlumno(e);
		}
		if (e.getSource() == mntmSSalir) {
			actionPerformedMntmSSalir(e);
		}
	}
	protected void actionPerformedMntmSSalir(ActionEvent e) {
		System.exit(0);
	}
	
	protected void actionPerformedMntmMAlumno(ActionEvent e) {
		DialogoMantAlumno dc = new DialogoMantAlumno();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmMCurso(ActionEvent e) {
		DialogoMantCurso dc = new DialogoMantCurso();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmRMatricula(ActionEvent e) {
		DialogoRegMatricula dc = new DialogoRegMatricula();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmRRetiro(ActionEvent e) {
		DialogoRegRetiro dc = new DialogoRegRetiro();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmCAlumno(ActionEvent e) {
		DialogoConsAlumno dc = new DialogoConsAlumno();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
		
	}
	protected void actionPerformedMntmCCurso(ActionEvent e) {
		DialogoConsCurso dc = new DialogoConsCurso();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmCMatricula(ActionEvent e) {
		DialogoConsMatricula dc = new DialogoConsMatricula();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmCRetiro(ActionEvent e) {
		DialogoConsRetiro dc = new DialogoConsRetiro();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmRAlumnoPendiente(ActionEvent e) {
		DialogoReporPendiente dc = new 	DialogoReporPendiente();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmRAlumnoVigente(ActionEvent e) {
		DialogoReporVigente dc = new DialogoReporVigente();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmRAlumnoCurso(ActionEvent e) {
		DialogoReporPorCurso dc = new DialogoReporPorCurso();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
}
