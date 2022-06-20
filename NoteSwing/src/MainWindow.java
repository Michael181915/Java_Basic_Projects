import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;

public class MainWindow extends JFrame {
	private TutorListModel model;
	private JList<String> list;
	private JButton remove_btn;
	private JButton add_btn;
	private JButton removelist_btn;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(506, 480);
		setResizable(false);
		//setVisible(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 300, 430);
		getContentPane().add(scrollPane);
		
		model = new TutorListModel();
		
		list = new JList<String>(model);
		scrollPane.setViewportView(list);
		
		remove_btn = new JButton("Удалить элемент");
		remove_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<String> objects = list.getSelectedValuesList();
				for(String s: objects) {
					model.removeElement(s);
					list.updateUI();
				}
				list.updateUI();
			}
		});
		remove_btn.setBounds(320, 11, 173, 23);
		getContentPane().add(remove_btn);
		
		add_btn = new JButton("Добавить элемент");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("Введите строку здесь: ");
				model.addElement(s);
				list.updateUI();
			}
		});
		add_btn.setBounds(320, 45, 173, 23);
		getContentPane().add(add_btn);
		
		/*removelist_btn = new JButton("Удалить список");
		removelist_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.getSelectedIndex()==-1) {return;}
				//model.removeElement(list.getSelectedValue());
				model.removeElement(list.getSelectedIndex());
				list.updateUI();
			}
		});		
		removelist_btn.setBounds(320, 81, 173, 23);
		getContentPane().add(removelist_btn);*/
		
		setVisible(true);
		list.updateUI();
	}
	
	public void addElement(String s) {
		model.addElement(s);
	}
	
	public void removeElement(int index) {
		model.removeElement(index);
	}
	
	public void updateUI() {
		list.updateUI();
	}
}
