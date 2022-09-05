package fiap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfLogin;
	private JLabel lbLogin;
	private JLabel lbSenha;

	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	
	public GUILogin() {
		iniciarlizarComponentes();
		definirEventos();
		
	}
	

	
	private void iniciarlizarComponentes() {
		//definindo o formulario
		this.setTitle("Login do Sistema"); //adiciona o title
		this.setBounds(0,0,300,200); // define o size
		this.setLayout(null); //Limpar os objetos
		
		//Criando objetos para o form
		tfLogin = new JTextField();
		pfSenha = new JPasswordField();
		lbSenha = new JLabel("Senha: ");
		lbLogin = new JLabel("Login: ");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		
		//Definindo size e position dos objetos
		lbLogin.setBounds(50, 30, 80, 25); // posicao inicial(x,y) // larg,altura
		tfLogin.setBounds(120, 30, 120, 25);
		
		lbSenha.setBounds(50, 75, 80, 25);
		pfSenha.setBounds(120, 75, 120, 25);
		
		btLogar.setBounds(40, 120, 100, 25);
		btCancelar.setBounds(145, 120, 100, 25);
		
		// Adicionando os objetos ao formulario 
		add(lbLogin);
		add(tfLogin);
		
		add(lbSenha);
		add(pfSenha);
		
		add(btLogar);
		add(btCancelar);
		
		
		
	}
	
	private void definirEventos() {
		
		btCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = 
						String.valueOf(pfSenha.getPassword());
				if (tfLogin.getText().equals("user01") && 
						senha.equals("123321")) {
					setVisible(false);
					
					JOptionPane.showMessageDialog
					(null, "Login efetuado com sucesso!!" );
				} else {
					JOptionPane.showMessageDialog
					(null, "Login ou senha Invalidos!!" );
					
					

				}
				
			}
		});
	}
	
	
	

}
