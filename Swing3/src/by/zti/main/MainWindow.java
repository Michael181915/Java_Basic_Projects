package by.zti.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlHere;
	private JButton btnGetImage;
	private JButton btnGetFile;
	private Choice choice;
	private JLabel lblNewLabel;
	private JButton button;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenuItem menuSave;
	private JMenu mnNewMenu;
	private JMenuItem mnExit;
	private JScrollPane scrollPane;
	private JLabel imageLabel;

	public MainWindow(int width, int height) {
		setTitle("Просмотр изображений");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(901, 601);
		//setSize(width, height);
		getContentPane().setLayout(null);
		
		//JPanel panel1 = new JPanel(null);
		panel1 = new JPanel(null);
		panel2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 32, 866, 522);
		getContentPane().add(tabbedPane);
		setResizable(true);
		tabbedPane.addTab("Tab 1", panel1);
		panel1.setLayout(null);
		
		txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrEnterUrlHere.setText("Введите название ссылки URL");		
		txtrEnterUrlHere.setBounds(10, 45, 841, 438);
		panel1.add(txtrEnterUrlHere);
		
		//JButton btnGetImage = new JButton("\u041F\u043E\u043B\u0443\u0447\u0438\u0442\u044C \u0438\u0437\u043E\u0431\u0440\u0430\u0436\u0435\u043D\u0438\u0435");
		btnGetImage = new JButton("Получить изображение");
		//btnGetImage.addActionListener(e -> System.out.println("Изображение получено!"));
		btnGetImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println(Main.getImage());
					Main.setImage(new URL(txtrEnterUrlHere.getText()));
					System.out.println(Main.getImage());
				} catch (Exception e) {
					//e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Неверный URL-адрес или соединения с интернетом!");
				}
			}
		});//*/
		btnGetImage.setBounds(10, 11, 177, 23);
		panel1.add(btnGetImage);
		
		//JButton btnGetFile = new JButton("\u041F\u043E\u043B\u0443\u0447\u0438\u0442\u044C \u0444\u0430\u0439\u043B");
		btnGetFile = new JButton("Получить файл");
		btnGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Файл получен!");
				JFileChooser chouser = new JFileChooser();
				int reply = chouser.showOpenDialog(null);
				if(reply == JFileChooser.APPROVE_OPTION) {
					Main.setImage(chouser.getSelectedFile());
				}

				
				
				//System.out.println(reply);
				//Main.setImage(chouser.getSelectedFile());
				//System.out.println(chouser.getSelectedFile());
			}
		});
		btnGetFile.setBounds(197, 11, 151, 23);
		panel1.add(btnGetFile);
		tabbedPane.addTab("Tab 2", panel2);
		
		choice = new Choice();
		choice.setBounds(799, 10, 52, 20);
		panel2.add(choice);
		
		choice.add("png");
		choice.add("jpg");
		
		//JLabel lblNewLabel = new JLabel("\u0424\u043E\u0440\u043C\u0430\u0442 \u0438\u0437\u043E\u0431\u0440\u0430\u0436\u0435\u043D\u0438\u044F:");
		lblNewLabel = new JLabel("Формат изображения:");
		lblNewLabel.setBounds(661, 14, 132, 14);
		panel2.add(lblNewLabel);
		
		//JButton button = new JButton("\u041E\u0431\u043D\u043E\u0432\u043B\u0435\u043D\u0438\u0435 \u043A\u0430\u043D\u0432\u0430\u0441\u0430");
		//button.addActionListener(k -> System.out.println("Канвас обновлён!"));
		
		button = new JButton("Обновление канваса");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Main.getImage()==null) {
					JOptionPane.showMessageDialog(null, "Нет URL-адреса для просмотра изображения или соединения с интернетом!");
					return;}
				imageLabel.setIcon(new ImageIcon(Main.getImage()));
				imageLabel.updateUI();
				System.out.println("Канвас обновлён!");
			}
		});
		button.setBounds(10, 10, 191, 23);
		panel2.add(button);		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 841, 439);
		panel2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imageLabel = new JLabel("");
		panel.add(imageLabel, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 876, 21);
		getContentPane().add(menuBar);
		
		menuFile = new JMenu("Файл");
		menuBar.add(menuFile);
		
		menuSave = new JMenuItem("Сохранить изображение");
		menuSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chouser = new JFileChooser();
				int reply = chouser.showSaveDialog(null);
				if(reply == JFileChooser.APPROVE_OPTION) {
					//System.out.println(1);
					Main.saveImage(chouser.getSelectedFile(), choice.getSelectedItem());
					//System.out.println(choice.getSelectedItem());
				}
			}
		});
		menuFile.add(menuSave);
		
		mnNewMenu = new JMenu("Дополнительные возможности");
		menuBar.add(mnNewMenu);
		
		mnExit = new JMenuItem("Выход");
		mnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mnExit);
		
		//menuBar.updateUI();		
		setVisible(true); 
	}
}
