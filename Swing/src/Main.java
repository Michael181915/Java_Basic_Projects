import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		Window window = new Window();
		window.setVisible(true);
		window.setSize(800, 600);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 11, 374, 239);
		window.setLayout(null);
		window.add(scrollPane);
		JTextArea textArea = new JTextArea();
		String a = "���������, ������� ����, ������ �������, ������� �����������, ��������� �������, �����";
		textArea.append(a);
		scrollPane.setViewportView(textArea);
	}

}
