package edgarItzak.libraryCRUD;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable bookTable;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		mainPanel.setBorder(BorderFactory.createTitledBorder("Library Manage System"));
		
		JButton btnNewButton_2 = new JButton("Add new book");
		btnNewButton_2.setBounds(400, 15, 151, 23);
		mainPanel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Show total sales");
		btnNewButton.setBounds(400, 49, 151, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBounds(10, 188, 570, 225);
		searchPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		searchPanel.setBorder(BorderFactory.createTitledBorder("Search books"));
		
		mainPanel.add(searchPanel);
		searchPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setBounds(16, 26, 33, 14);
		searchPanel.add(lblNewLabel);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"by title", "by author", "by category"}));
		comboBox.setBounds(67, 23, 84, 20);
		searchPanel.add(comboBox);
		
		JTextField searchInput = new JTextField();
		searchInput.setColumns(10);
		searchInput.setBounds(157,23,86,20);
		searchPanel.add(searchInput);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(249, 22, 65, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchPanel.add(btnNewButton_1);

		

	
		

		
		bookTable = new JTable();
		Object[][] data = {
			{"1", "Don Quijote de la Mancha", "Miguel de Cervantes", "1797", "Parody", "15.80", "20"}
		};
		String[] columNames = {
			"Id", "Title", "Author", "Publish date", "Category", "Price", "Stock"
		};
		bookTable.setModel(new DefaultTableModel(data, columNames));
		
		bookTable.getColumnModel().getColumn(0).setPreferredWidth(40);
		bookTable.getColumnModel().getColumn(1).setPreferredWidth(137);
		bookTable.getColumnModel().getColumn(2).setPreferredWidth(123);
		bookTable.getColumnModel().getColumn(6).setPreferredWidth(45);
		
		JScrollPane scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(10, 65, 548, 138);
		searchPanel.add(scrollPane);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setBounds(10, 42, 320, 135);
		mainPanel.add(dataPanel);
		dataPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(23, 5, 10, 14);
		dataPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title");
		lblNewLabel_2.setBounds(23, 22, 50, 14);
		dataPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Author");
		lblNewLabel_3.setBounds(23, 39, 53, 14);
		dataPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Publish date");
		lblNewLabel_4.setBounds(23, 56, 78, 14);
		dataPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Category");
		lblNewLabel_5.setBounds(23, 74, 76, 14);
		dataPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Price");
		lblNewLabel_6.setBounds(23, 89, 46, 14);
		dataPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Stock");
		lblNewLabel_8.setBounds(23, 105, 46, 14);
		dataPanel.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 2, 86, 20);
		dataPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 36, 86, 20);
		dataPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(94, 99, 86, 20);
		dataPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 81, 86, 20);
		dataPanel.add(textField_4);
		textField_4.setColumns(10);
		
		
		

		
		
		
		

		
		
	}

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setAlwaysOnTop(false);
		frame.setBounds(10,10,1000, 600);
		frame.setTitle("Library Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
