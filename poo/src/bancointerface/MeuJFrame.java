package bancointerface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuJFrame extends JFrame implements ActionListener{
	JButton meubotao;
	
	
	public MeuJFrame() {
		meubotao = new JButton("Meu Botão");
		meubotao.setBounds(20, 20, 100, 30);
		meubotao.addActionListener(this);
		meubotao.addActionListener(new MeuActionListener());
		
		getContentPane().setLayout(null);
		getContentPane().add(meubotao);
		setBounds(100,100,300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MeuJFrame();
	}
	
	class MeuActionListener implements ActionListener{
		
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei no botao");
		
	}
	
	}
	
	
}
