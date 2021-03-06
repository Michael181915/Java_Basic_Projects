package by.zti.main;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class MainWindow extends JFrame {
	private JTable table;
	private JScrollPane scrollPane;
	private JButton add_btn;
	private JButton rmv_btn;
	private PersonModel model;

	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);		
		setSize(554, 479);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 377, 429);
		getContentPane().add(scrollPane);
		
		model = new PersonModel();
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		add_btn = new JButton("???????? ??????");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = new Person();
				person.setName(JOptionPane.showInputDialog("??????? ???"));
				person.setSurname(JOptionPane.showInputDialog("??????? ???????"));
				Main.persons.add(person);
				table.updateUI();
			}
		});
		add_btn.setBounds(397, 8, 146, 23);
		getContentPane().add(add_btn);
		
		rmv_btn = new JButton("??????? ??????");
		rmv_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow()==-1 || Main.persons.size()>0){return;}
				Main.persons.remove(table.getSelectedRow());
				table.updateUI();
			}
		});
		rmv_btn.setBounds(397, 42, 146, 23);
		getContentPane().add(rmv_btn);
		setVisible(true);
	}
}
