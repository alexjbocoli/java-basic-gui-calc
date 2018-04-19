import java.awt.GridLayout; //Layout
import java.awt.event.ActionEvent; //Tratamento de eventos
import java.awt.event.ActionListener; //Tratamento de eventos

import javax.swing.JFrame; //Janela
import javax.swing.JLabel; //R�tulo
import javax.swing.JOptionPane; //Janela de mensagem de resposta
import javax.swing.JTextField; //Caixa de Texto
import javax.swing.JButton; //Bot�o
public class Calculadora implements ActionListener{ //Implementa a interface ActionListener
	private JFrame janela; //Janela
	private JLabel num1; //R�tulo
	private JLabel num2; //R�tulo
	private JTextField campoNum1; //Caixa de Texto
	private JTextField campoNum2; //Caixa de Texto
	private JButton plus; //Bot�o
	private JButton minus; //Bot�o
	private JButton times; //Bot�o
	private JButton div; //Bot�o
	
	/**
	 * Construtor da calculadora
	 */
	public Calculadora(){
		janela = new JFrame("Calculadora"); //Janela
		num1 = new JLabel("N�mero 1: "); //R�tulo
		campoNum1 = new JTextField(); //Caixa de Texto
		num2 = new JLabel("N�mero 2: "); //R�tulo
		campoNum2 = new JTextField(); //Caixa de Texto
		
		plus = new JButton("+"); //Bot�o
		plus.addActionListener(this); //Tratamento de eventos
		minus = new JButton("-"); //Bot�o
		minus.addActionListener(this); //Tratamento de eventos
		times = new JButton("*"); //Bot�o
		times.addActionListener(this); //Tratamento de eventos
		div = new JButton("/"); //Bot�o
		div.addActionListener(this); //Tratamento de eventos
		
		buildWindow();
	}
	
	/**
	 * Monta a janela da calculadora
	 */
	private void buildWindow(){
		janela.setSize(260,110); //Dimens�es XY da janela
		janela.setLayout(new GridLayout(2,4)); //Layout
		janela.add(num1); //R�tulo
		janela.add(campoNum1); //Caixa de Texto
		janela.add(num2); //R�tulo
		janela.add(campoNum2); //Caixa de Texto
		janela.add(plus); //Bot�o
		janela.add(minus); //Bot�o
		janela.add(times); //Bot�o
		janela.add(div); //Bot�o
	}
	
	/**
	 * Torna a janela vis�vel
	 */
	public void showWindow(){
		janela.setVisible(true); //Visibilidade da janela
	}

	/**
	 * Sobreposi��o do m�todo abstrato "actionPerformed" da interface "ActionListener"
	 */
	@Override
	public void actionPerformed(ActionEvent e) { //Implementa��o do m�todo abstrato da interface ActionListener
		String num1 = campoNum1.getText(); //Obter dados da caixa de texto
		String num2 = campoNum2.getText(); //Obter dados da caixa de texto
		float dig1 = Float.parseFloat(num1);
	    float dig2 = Float.parseFloat(num2);
			
	    if(e.getSource() == plus){
			float soma = dig1 + dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da soma � " + soma); //Janela de mensagem de resposta
		}
		if(e.getSource() == minus){
			float subtracao = dig1 - dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da subtra��o � " + subtracao); //Janela de mensagem de resposta
		}
		if(e.getSource() == times){
			float multiplicacao = dig1 * dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da multiplica��o � " + multiplicacao); //Janela de mensagem de resposta
		}
		if(e.getSource() == div){
			float divisao = dig1 / dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da divis�o � " + divisao); //Janela de mensagem de resposta
		}
	}
}

