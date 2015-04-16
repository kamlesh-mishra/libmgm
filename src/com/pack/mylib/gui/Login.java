package com.pack.mylib.gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.mylib.pojo.Author;
import com.pack.mylib.pojo.Employee;
import com.pack.mylib.pojo.Isbn_details;
import com.pack.mylib.pojo.Publisher;
import com.pack.mylib.pojo.Student;
import com.pack.mylib.util.HibernateUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Login {

	private JFrame frmLibraryManagementSystem;
	private JLabel userName;
	private JPasswordField password;
	private JTextField userid;
	Session session = null;
	Transaction tx = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					
					window.frmLibraryManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryManagementSystem = new JFrame();
		frmLibraryManagementSystem.setTitle("library management system");
		frmLibraryManagementSystem.getContentPane().setBackground(new Color(255, 153, 102));
		frmLibraryManagementSystem.setBounds(100, 100, 600, 400);
		frmLibraryManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryManagementSystem.getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmLibraryManagementSystem.setLocation(dim.width/2-frmLibraryManagementSystem.getSize().width/2, dim.height/2-frmLibraryManagementSystem.getSize().height/2);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(118, 67, 326, 203);
		frmLibraryManagementSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		userName = new JLabel("User Name");
		userName.setBounds(50, 69, 66, 14);
		panel.add(userName);
		
		password = new JPasswordField();
		password.setBounds(126, 119, 130, 20);
		panel.add(password);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 122, 65, 14);
		panel.add(lblPassword);
		
		userid = new JTextField();
		userid.setBounds(126, 66, 129, 20);
		panel.add(userid);
		userid.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=userid.getText();
				String pass=password.getText();
				 if ((user.equals("") || pass.equals("") )) 
				 {
			            System.out.println("All informations are Required");
			     } 
				 else
				 {
				try{
					session = HibernateUtil.getSessionFactory().openSession();
					String hql="from Employee eee where eee.name=:user and password=:pass";
					Query query=session.createQuery(hql);
					query.setParameter("user",user);
					query.setParameter("pass", pass);
					List<Employee> result=query.list();
					 if (result.size() > 0) {
				           
						 EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										Welcome frame = new Welcome();
										frame.setVisible(true);
										Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
										frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
										frmLibraryManagementSystem.dispose();
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						
				            System.out.println("logged in");
				         /*   Iterator<Employee> i=result.iterator();
							while(i.hasNext())
							{
							Employee ee=(Employee)i.next();
							System.out.println(ee.getEid());
							System.out.println(ee.getDesignation());
							}
							*/
				        }
					 else
						 System.out.println("invlaid login");
					
					
				}
				
				catch(HibernateException he){
					System.out.println("here is "+he);
					
				}
				finally{
					session.close();
				}
				 }//else
				
			}
		});
		btnLogin.setBounds(126, 158, 66, 23);
		panel.add(btnLogin);
	}
}
