import java.awt.GridLayout; //Layout
import java.awt.event.ActionEvent; //Tratamento de eventos
import java.awt.event.ActionListener; //Tratamento de eventos

import javax.swing.JFrame; //Janela
import javax.swing.JLabel; //Rótulo
import javax.swing.JOptionPane; //Janela de mensagem de resposta
import javax.swing.JTextField; //Caixa de Texto
import javax.swing.JButton; //Botão
public class Calculadora implements ActionListener{ //Implementa a interface ActionListener
	private JFrame janela; //Janela
	private JLabel num1; //Rótulo
	private JLabel num2; //Rótulo
	private JTextField campoNum1; //Caixa de Texto
	private JTextField campoNum2; //Caixa de Texto
	private JButton plus; //Botão
	private JButton minus; //Botão
	private JButton times; //Botão
	private JButton div; //Botão
	
	/**
	 * Construtor da calculadora
	 */
	public Calculadora(){
		janela = new JFrame("Calculadora"); //Janela
		num1 = new JLabel("Número 1: "); //Rótulo
		campoNum1 = new JTextField(); //Caixa de Texto
		num2 = new JLabel("Número 2: "); //Rótulo
		campoNum2 = new JTextField(); //Caixa de Texto
		
		plus = new JButton("+"); //Botão
		plus.addActionListener(this); //Tratamento de eventos
		minus = new JButton("-"); //Botão
		minus.addActionListener(this); //Tratamento de eventos
		times = new JButton("*"); //Botão
		times.addActionListener(this); //Tratamento de eventos
		div = new JButton("/"); //Botão
		div.addActionListener(this); //Tratamento de eventos
		
		buildWindow();
	}
	
	/**
	 * Monta a janela da calculadora
	 */
	private void buildWindow(){
		janela.setSize(260,110); //Dimensões XY da janela
		janela.setLayout(new GridLayout(2,4)); //Layout
		janela.add(num1); //Rótulo
		janela.add(campoNum1); //Caixa de Texto
		janela.add(num2); //Rótulo
		janela.add(campoNum2); //Caixa de Texto
		janela.add(plus); //Botão
		janela.add(minus); //Botão
		janela.add(times); //Botão
		janela.add(div); //Botão
	}
	
	/**
	 * Torna a janela visível
	 */
	public void showWindow(){
		janela.setVisible(true); //Visibilidade da janela
	}

	/**
	 * Sobreposição do método abstrato "actionPerformed" da interface "ActionListener"
	 */
	@Override
	public void actionPerformed(ActionEvent e) { //Implementação do método abstrato da interface ActionListener
		String num1 = campoNum1.getText(); //Obter dados da caixa de texto
		String num2 = campoNum2.getText(); //Obter dados da caixa de texto
		float dig1 = Float.parseFloat(num1);
	    float dig2 = Float.parseFloat(num2);
			
	    if(e.getSource() == plus){
			float soma = dig1 + dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da soma é " + soma); //Janela de mensagem de resposta
		}
		if(e.getSource() == minus){
			float subtracao = dig1 - dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da subtração é " + subtracao); //Janela de mensagem de resposta
		}
		if(e.getSource() == times){
			float multiplicacao = dig1 * dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da multiplicação é " + multiplicacao); //Janela de mensagem de resposta
		}
		if(e.getSource() == div){
			float divisao = dig1 / dig2;
			JOptionPane.showMessageDialog(janela, "O resultado da divisão é " + divisao); //Janela de mensagem de resposta
		}
	}
}

