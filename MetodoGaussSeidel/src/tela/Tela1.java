package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Calculos;
import classes.Conversoes;
import classes.RecebendoDados;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblX0;
	private JTextField txtX11;
	private JTextField txtX12;
	private JTextField txtX13;
	private JTextField txtX14;
	private JLabel lblNewLabel_1;
	private JTextField txtE;
	private JLabel lblNewLabel_2;
	private JTextField txtMi;
	private JLabel lblResposta;
	private JTextField txtResposta;
	private JTextField txtX0;

	/**
	 * Launch the application.
	 */
	
	RecebendoDados dados = new RecebendoDados();
	Conversoes conversores = new Conversoes();
	Calculos calculos = new Calculos();
	
	private JTextField txtX21;
	private JLabel label;
	private JTextField txtX22;
	private JLabel label_1;
	private JTextField txtX23;
	private JLabel label_2;
	private JTextField txtX24;
	private JLabel lblx;
	private JTextField txtX31;
	private JLabel lblx_3;
	private JTextField txtX32;
	private JLabel lblx_8;
	private JTextField txtX33;
	private JLabel lblx_10;
	private JTextField txtX34;
	private JLabel lblx_11;
	private JTextField txtX44;
	private JLabel lblx_9;
	private JTextField txtX43;
	private JLabel lblx_7;
	private JTextField txtX42;
	private JLabel lblx_1;
	private JTextField txtX41;
	private JLabel lblx_2;
	private JTextField txtN1;
	private JLabel lblx_4;
	private JTextField txtN2;
	private JLabel lblx_5;
	private JTextField txtN3;
	private JLabel lblx_6;
	private JTextField txtN4;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_10;
	private JLabel label_11;
	
	
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
		setBounds(100, 100, 665, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMtodoDeGaussseidel = new JLabel("M\u00E9todo de Gauss-Seidel");
		lblMtodoDeGaussseidel.setBounds(257, 11, 144, 14);
		contentPane.add(lblMtodoDeGaussseidel);
		
		lblX0 = new JLabel("x^0(Transposta) = ");
		lblX0.setBounds(10, 46, 115, 14);
		contentPane.add(lblX0);
		
		
		txtX0 = new JTextField();
		txtX0.setBounds(122, 43, 67, 20);
		contentPane.add(txtX0);
		txtX0.setColumns(10);
		txtX0.setText("0,0,0,0");
		
		JLabel lblNewLabel = new JLabel("<html>x<sub>1</sub></html> ");
		lblNewLabel.setBounds(59, 104, 15, 14);
		contentPane.add(lblNewLabel);
		
		txtX11 = new JTextField();
		txtX11.setColumns(10);
		txtX11.setBounds(10, 101, 39, 20);
		contentPane.add(txtX11);
		txtX11.setText("0");
		
		txtX12 = new JTextField();
		txtX12.setColumns(10);
		txtX12.setBounds(10, 129, 39, 20);
		contentPane.add(txtX12);
		txtX12.setText("0");
		
		txtX13 = new JTextField();
		txtX13.setColumns(10);
		txtX13.setBounds(10, 157, 39, 20);
		contentPane.add(txtX13);
		txtX13.setText("0");
		
		txtX14 = new JTextField();
		txtX14.setColumns(10);
		txtX14.setBounds(10, 185, 39, 20);
		contentPane.add(txtX14);
		txtX14.setText("0");
		
		lblNewLabel_1 = new JLabel("E = ");
		lblNewLabel_1.setBounds(337, 132, 31, 14);
		contentPane.add(lblNewLabel_1);
		
		txtE = new JTextField();
		txtE.setColumns(10);
		txtE.setBounds(365, 129, 77, 20);
		contentPane.add(txtE);
		txtE.setText("0");
		
		lblNewLabel_2 = new JLabel("MaxItera\u00E7\u00F5es = ");
		lblNewLabel_2.setBounds(337, 174, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMi = new JTextField();
		txtMi.setColumns(10);
		txtMi.setBounds(428, 171, 47, 20);
		contentPane.add(txtMi);
		txtMi.setText("0");
		
		lblResposta = new JLabel("Resposta :");
		lblResposta.setBounds(489, 132, 62, 14);
		contentPane.add(lblResposta);
		
		txtResposta = new JTextField();
		txtResposta.setColumns(10);
		txtResposta.setBounds(562, 129, 77, 20);
		contentPane.add(txtResposta);
		
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//setando os numeros na classe de dados
				dados.setTransposta(txtX0.getText());
				
				dados.setX11(Float.parseFloat(txtX11.getText()));
				dados.setX12(Float.parseFloat(txtX12.getText()));
				dados.setX13(Float.parseFloat(txtX13.getText()));
				dados.setX14(Float.parseFloat(txtX14.getText()));
				
				dados.setX21(Float.parseFloat(txtX21.getText()));
				dados.setX22(Float.parseFloat(txtX22.getText()));
				dados.setX23(Float.parseFloat(txtX23.getText()));
				dados.setX24(Float.parseFloat(txtX24.getText()));
				
				dados.setX31(Float.parseFloat(txtX31.getText()));
				dados.setX32(Float.parseFloat(txtX32.getText()));
				dados.setX33(Float.parseFloat(txtX33.getText()));
				dados.setX34(Float.parseFloat(txtX34.getText()));
				
				dados.setX41(Float.parseFloat(txtX41.getText()));	
				dados.setX42(Float.parseFloat(txtX42.getText()));
				dados.setX43(Float.parseFloat(txtX43.getText()));
				dados.setX44(Float.parseFloat(txtX44.getText()));
				
				dados.setN1(Float.parseFloat(txtN1.getText()));
				dados.setN2(Float.parseFloat(txtN2.getText()));
				dados.setN3(Float.parseFloat(txtN3.getText()));
				dados.setN4(Float.parseFloat(txtN4.getText()));
				
				dados.setMaxI(Integer.parseInt(txtMi.getText()));
				dados.setE(Float.parseFloat(txtE.getText()));
				
				calculos.criandoVetorCalculo();
				
				
			}
		});
		btnCalcular.setBounds(489, 98, 103, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblinserirOsNmeros = new JLabel("(Inserir os n\u00FAmeros entre virgula)");
		lblinserirOsNmeros.setBounds(199, 46, 192, 14);
		contentPane.add(lblinserirOsNmeros);
		
		txtX21 = new JTextField();
		txtX21.setColumns(10);
		txtX21.setBounds(74, 101, 39, 20);
		contentPane.add(txtX21);
		txtX21.setText("0");
		
		label = new JLabel("<html>x<sub>1</sub></html> ");
		label.setBounds(59, 132, 15, 14);
		contentPane.add(label);
		
		txtX22 = new JTextField();
		txtX22.setColumns(10);
		txtX22.setBounds(74, 129, 39, 20);
		contentPane.add(txtX22);
		txtX22.setText("0");
		
		label_1 = new JLabel("<html>x<sub>1</sub></html> ");
		label_1.setBounds(59, 160, 15, 14);
		contentPane.add(label_1);
		
		txtX23 = new JTextField();
		txtX23.setColumns(10);
		txtX23.setBounds(74, 157, 39, 20);
		contentPane.add(txtX23);
		txtX23.setText("0");
		
		label_2 = new JLabel("<html>x<sub>1</sub></html> ");
		label_2.setBounds(59, 188, 15, 14);
		contentPane.add(label_2);
		
		txtX24 = new JTextField();
		txtX24.setColumns(10);
		txtX24.setBounds(74, 185, 39, 20);
		contentPane.add(txtX24);
		txtX24.setText("0");
		
		lblx = new JLabel("<html>x<sub>2</sub></html> ");
		lblx.setBounds(123, 104, 15, 14);
		contentPane.add(lblx);
		
		txtX31 = new JTextField();
		txtX31.setColumns(10);
		txtX31.setBounds(138, 101, 39, 20);
		contentPane.add(txtX31);
		txtX31.setText("0");
		
		lblx_3 = new JLabel("<html>x<sub>2</sub></html> ");
		lblx_3.setBounds(123, 132, 15, 14);
		contentPane.add(lblx_3);
		
		txtX32 = new JTextField();
		txtX32.setColumns(10);
		txtX32.setBounds(138, 129, 39, 20);
		contentPane.add(txtX32);
		txtX32.setText("0");
		
		lblx_8 = new JLabel("<html>x<sub>2</sub></html> ");
		lblx_8.setBounds(123, 160, 15, 14);
		contentPane.add(lblx_8);
		
		txtX33 = new JTextField();
		txtX33.setColumns(10);
		txtX33.setBounds(138, 157, 39, 20);
		contentPane.add(txtX33);
		txtX33.setText("0");
		
		lblx_10 = new JLabel("<html>x<sub>2</sub></html> ");
		lblx_10.setBounds(123, 188, 15, 14);
		contentPane.add(lblx_10);
		
		txtX34 = new JTextField();
		txtX34.setColumns(10);
		txtX34.setBounds(138, 185, 39, 20);
		contentPane.add(txtX34);
		txtX34.setText("0");
		
		lblx_11 = new JLabel("<html>x<sub>3</sub></html> ");
		lblx_11.setBounds(187, 188, 15, 14);
		contentPane.add(lblx_11);
		
		txtX44 = new JTextField();
		txtX44.setColumns(10);
		txtX44.setBounds(202, 185, 39, 20);
		contentPane.add(txtX44);
		txtX44.setText("0");
		
		lblx_9 = new JLabel("<html>x<sub>3</sub></html> ");
		lblx_9.setBounds(187, 160, 15, 14);
		contentPane.add(lblx_9);
		
		txtX43 = new JTextField();
		txtX43.setColumns(10);
		txtX43.setBounds(202, 157, 39, 20);
		contentPane.add(txtX43);
		txtX43.setText("0");
		
		lblx_7 = new JLabel("<html>x<sub>3</sub></html> ");
		lblx_7.setBounds(187, 132, 15, 14);
		contentPane.add(lblx_7);
		
		txtX42 = new JTextField();
		txtX42.setColumns(10);
		txtX42.setBounds(202, 129, 39, 20);
		contentPane.add(txtX42);
		txtX42.setText("0");
		
		lblx_1 = new JLabel("<html>x<sub>3</sub></html> ");
		lblx_1.setBounds(187, 104, 15, 14);
		contentPane.add(lblx_1);
		
		txtX41 = new JTextField();
		txtX41.setColumns(10);
		txtX41.setBounds(202, 101, 39, 20);
		contentPane.add(txtX41);
		txtX41.setText("0");
		
		lblx_2 = new JLabel("<html>x<sub>4</sub>=</html> ");
		lblx_2.setBounds(251, 104, 20, 14);
		contentPane.add(lblx_2);
		
		txtN1 = new JTextField();
		txtN1.setColumns(10);
		txtN1.setBounds(278, 101, 39, 20);
		contentPane.add(txtN1);
		txtN1.setText("0");
		
		lblx_4 = new JLabel("<html>x<sub>4</sub>=</html> ");
		lblx_4.setBounds(251, 132, 20, 14);
		contentPane.add(lblx_4);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(278, 129, 39, 20);
		contentPane.add(txtN2);
		txtN2.setText("0");
		
		lblx_5 = new JLabel("<html>x<sub>4</sub>=</html> ");
		lblx_5.setBounds(251, 160, 20, 14);
		contentPane.add(lblx_5);
		
		txtN3 = new JTextField();
		txtN3.setColumns(10);
		txtN3.setBounds(278, 157, 39, 20);
		contentPane.add(txtN3);
		txtN3.setText("0");
		
		lblx_6 = new JLabel("<html>x<sub>4</sub>=</html> ");
		lblx_6.setBounds(251, 188, 20, 14);
		contentPane.add(lblx_6);
		
		txtN4 = new JTextField();
		txtN4.setColumns(10);
		txtN4.setBounds(278, 185, 39, 20);
		contentPane.add(txtN4);
		txtN4.setText("0");
		
		label_3 = new JLabel("<html>x<sub>1</sub></html> ");
		label_3.setBounds(20, 79, 15, 14);
		contentPane.add(label_3);
		
		label_4 = new JLabel("<html>x<sub>2</sub></html> ");
		label_4.setBounds(85, 79, 15, 14);
		contentPane.add(label_4);
		
		label_10 = new JLabel("<html>x<sub>3</sub></html> ");
		label_10.setBounds(149, 79, 15, 14);
		contentPane.add(label_10);
		
		label_11 = new JLabel("<html>x<sub>4</sub></html> ");
		label_11.setBounds(212, 79, 15, 14);
		contentPane.add(label_11);
	}
}
