package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblX0;
	private JTextField txtX1;
	private JTextField txtX2;
	private JLabel lblX_1;
	private JTextField txtX3;
	private JLabel lblX_2;
	private JTextField txtX4;
	private JLabel lblNewLabel_1;
	private JTextField txtE;
	private JLabel lblNewLabel_2;
	private JTextField txtMi;
	private JLabel lblResposta;
	private JTextField textField_2;
	private JTextField txtX0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMtodoDeGaussseidel = new JLabel("M\u00E9todo de Gauss-Seidel");
		lblMtodoDeGaussseidel.setBounds(140, 11, 144, 14);
		contentPane.add(lblMtodoDeGaussseidel);
		
		lblX0 = new JLabel("x^0(Transposta) = ");
		lblX0.setBounds(10, 46, 115, 14);
		contentPane.add(lblX0);
		
		txtX0 = new JTextField();
		txtX0.setBounds(117, 43, 77, 20);
		contentPane.add(txtX0);
		txtX0.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("x^1 = ");
		lblNewLabel.setBounds(10, 74, 55, 14);
		contentPane.add(lblNewLabel);
		
		txtX1 = new JTextField();
		txtX1.setColumns(10);
		txtX1.setBounds(46, 71, 47, 20);
		contentPane.add(txtX1);
		
		JLabel lblX = new JLabel("x^2 = ");
		lblX.setBounds(10, 102, 55, 14);
		contentPane.add(lblX);
		
		txtX2 = new JTextField();
		txtX2.setColumns(10);
		txtX2.setBounds(46, 99, 47, 20);
		contentPane.add(txtX2);
		
		lblX_1 = new JLabel("x^3 = ");
		lblX_1.setBounds(10, 130, 55, 14);
		contentPane.add(lblX_1);
		
		txtX3 = new JTextField();
		txtX3.setColumns(10);
		txtX3.setBounds(46, 127, 47, 20);
		contentPane.add(txtX3);
		
		lblX_2 = new JLabel("x^4 = ");
		lblX_2.setBounds(10, 158, 55, 14);
		contentPane.add(lblX_2);
		
		txtX4 = new JTextField();
		txtX4.setColumns(10);
		txtX4.setBounds(46, 155, 47, 20);
		contentPane.add(txtX4);
		
		lblNewLabel_1 = new JLabel("E = ");
		lblNewLabel_1.setBounds(225, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtE = new JTextField();
		txtE.setColumns(10);
		txtE.setBounds(253, 71, 77, 20);
		contentPane.add(txtE);
		
		lblNewLabel_2 = new JLabel("MaxItera\u00E7\u00F5es = ");
		lblNewLabel_2.setBounds(225, 112, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMi = new JTextField();
		txtMi.setColumns(10);
		txtMi.setBounds(316, 109, 47, 20);
		contentPane.add(txtMi);
		
		lblResposta = new JLabel("Resposta :");
		lblResposta.setBounds(140, 216, 62, 14);
		contentPane.add(lblResposta);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 213, 77, 20);
		contentPane.add(textField_2);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(140, 182, 89, 23);
		contentPane.add(btnCalcular);
	}
}
