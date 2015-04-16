package com.pack.mylib.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField isbn;
	private JTextField book_name;
	private JTextField author_name;
	private JTextField publisher_name;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField copies;

		public Welcome() {
		setTitle("welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 635, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 635, 386);
		panel.add(tabbedPane);
		
		JPanel issue = new JPanel();
		issue.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Issue", null, issue, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		issue.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 222, 173));
		panel_2.setBounds(0, 0, 630, 358);
		issue.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book No");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(198, 49, 73, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblStudentId = new JLabel("Issued To");
		lblStudentId.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblStudentId.setBounds(198, 88, 73, 14);
		panel_2.add(lblStudentId);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblDate.setBounds(198, 123, 46, 14);
		panel_2.add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(334, 46, 105, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(334, 85, 105, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(334, 121, 105, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnIssue.setBounds(334, 158, 89, 23);
		panel_2.add(btnIssue);
		
		JPanel returned = new JPanel();
		returned.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("Return", null, returned, null);
		returned.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblBookId.setBounds(176, 91, 74, 14);
		returned.add(lblBookId);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblDate_1.setBounds(176, 140, 46, 14);
		returned.add(lblDate_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(290, 89, 123, 20);
		returned.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(290, 138, 123, 20);
		returned.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturn.setBounds(290, 186, 89, 23);
		returned.add(btnReturn);
		
		JPanel books = new JPanel();
		books.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("Books", null, books, null);
		books.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblName.setBounds(178, 96, 46, 14);
		books.add(lblName);
		
		isbn = new JTextField();
		isbn.setBounds(278, 50, 131, 20);
		books.add(isbn);
		isbn.setColumns(10);
		
		JButton books_submit = new JButton("Submit");
		books_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for add isbn, book,author,publisher
				if(isbn.getText().equals(" ")||book_name.getText().equals(" ")||copies.getText().equals(" ") ||author_name.getText().equals(" ") ||publisher_name.getText().equals(" "))
				{
					System.out.println("fill the form first");
				}
				else
				{
					
				}
			}
		});
		books_submit.setFont(new Font("Calibri", Font.PLAIN, 18));
		books_submit.setBounds(278, 242, 89, 23);
		books.add(books_submit);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblAuthor.setBounds(178, 138, 62, 14);
		books.add(lblAuthor);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblPublisher.setBounds(178, 182, 77, 14);
		books.add(lblPublisher);
		
		JLabel lblIsbn_1 = new JLabel("Isbn");
		lblIsbn_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblIsbn_1.setBounds(178, 52, 46, 14);
		books.add(lblIsbn_1);
		
		book_name = new JTextField();
		book_name.setBounds(278, 94, 131, 20);
		books.add(book_name);
		book_name.setColumns(10);
		
		author_name = new JTextField();
		author_name.setBounds(278, 136, 131, 20);
		books.add(author_name);
		author_name.setColumns(10);
		
		publisher_name = new JTextField();
		publisher_name.setBounds(278, 180, 131, 20);
		books.add(publisher_name);
		publisher_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Copies");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(178, 214, 62, 14);
		books.add(lblNewLabel_1);
		
		copies = new JTextField();
		copies.setBounds(278, 211, 131, 20);
		books.add(copies);
		copies.setColumns(10);
		
		JPanel members = new JPanel();
		members.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("Member", null, members, null);
		members.setLayout(null);
		
		JLabel lblMemberName = new JLabel("Member Name");
		lblMemberName.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblMemberName.setBounds(134, 76, 110, 14);
		members.add(lblMemberName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblCourse.setBounds(134, 112, 110, 14);
		members.add(lblCourse);
		
		textField_10 = new JTextField();
		textField_10.setBounds(289, 74, 110, 20);
		members.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(289, 110, 110, 20);
		members.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnSave.setBounds(289, 162, 89, 23);
		members.add(btnSave);
		
		JPanel search = new JPanel();
		search.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("Search", null, search, null);
		search.setLayout(null);
		
		JLabel lblName_1 = new JLabel("search by author,publisher,book name,book id, isbn no etc");
		lblName_1.setFont(new Font("Simplified Arabic Fixed", Font.ITALIC, 10));
		lblName_1.setBounds(140, 145, 345, 14);
		search.add(lblName_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(93, 119, 440, 20);
		search.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(254, 185, 89, 23);
		search.add(btnSearch);
		
		JPanel help = new JPanel();
		help.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("help", null, help, null);
	}
}
