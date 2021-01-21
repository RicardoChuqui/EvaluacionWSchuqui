package ups.edu.ec.EvaluacionWSchuqui.cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ups.edu.ec.EvaluacionWSchuqui.clases.Cuenta;
import ups.edu.ec.EvaluacionWSchuqui.clases.Socio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;


public class VtnIngresarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNcuenta;
	private JTextField txtDNI;
	private JTextField txtCredito;
	private JTextField txtMplazo;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnIngresarCliente frame = new VtnIngresarCliente();
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
	public VtnIngresarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N-Cuenta");
		lblNewLabel.setBounds(30, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(30, 17, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Credito");
		lblNewLabel_2.setBounds(30, 87, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNcuenta = new JTextField();
		txtNcuenta.setBounds(101, 39, 154, 20);
		contentPane.add(txtNcuenta);
		txtNcuenta.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(101, 11, 154, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtCredito = new JTextField();
		txtCredito.setBounds(104, 84, 154, 20);
		contentPane.add(txtCredito);
		txtCredito.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarCliente();
			}
		});
		btnGuardar.setBounds(104, 168, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_3 = new JLabel("Meses Plazo");
		lblNewLabel_3.setBounds(30, 128, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		txtMplazo = new JTextField();
		txtMplazo.setBounds(101, 125, 154, 20);
		contentPane.add(txtMplazo);
		txtMplazo.setColumns(10);
	}

	protected void guardarCliente() {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		Socio s = new Socio();
		
		s.setCedulaSocio(txtDNI.getText());
		c.setIdCuenta(txtNcuenta.getText());
		c.setSaldo(Integer.parseInt(txtCredito.getText()));
		c.setMesesPlazo(Integer.parseInt(txtMplazo.getText()));

}	
}
