package SimpleChat;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA {
	
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	
	public void go() {
		// Создание GUI (нет ничего связанного с сетью)
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(400,500);
		frame.setVisible(true);
	} // закрываем go

	private void setUpNetworking() {
		// Создание объектов Socket и PrintWriter (вызывается прямо перед выводом граф. интерфейса)
		// Используется localhost
		try {
			sock = new Socket("127.0.0.1", 5000);
			writer =new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch (IOException ex) {
			ex.printStackTrace();
		} 
	} // Закрываем setUpNetworking
	
	public class SendButtonListener implements ActionListener {
		//Здесь начинается непосредственная запись.
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}// Закрываем вложенный класс
	
	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
 
} // Закрываем внешний класс
