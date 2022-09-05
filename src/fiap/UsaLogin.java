package fiap;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class UsaLogin {

	public static void main(String[] args) {
		
		GUILogin frame = new GUILogin();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Toolkit pega a resolução da sua tela
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(0, 0);
		frame.setLocation(tela.width - frame.getSize().width  / 2, 
				(tela.height - frame.getSize().height / 2));
		frame.setVisible(true);
	}

}
