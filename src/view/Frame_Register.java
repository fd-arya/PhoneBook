package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Frame_Register extends JPanel implements ActionListener {

	private int width;
	private int height;

	private MainFrame mainFrame;

	public Frame_Register(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		width = 290;
		height = 260;
		setBorder(BorderFactory.createTitledBorder(null, "Register", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, Color.white));
		setBackground(new Color(0, 0, 0, 150));
		setBounds((mainFrame.getSize().width / 2) - (width / 2), (mainFrame.getSize().height / 2) - (height / 2), width,
				height);
		setLayout(null);
		setVisible(true);

		initComponent();
		addComponent();
		setLocation();
	}

	private JLabel lblUserName;
	private JLabel lblPassword;
	private JLabel lblBirthday;
	private JLabel lblEmails;
	private JLabel lblNumberPhones;
	private JLabel lblWarinig;

	private JTextField tfdUrserName;
	private JPasswordField pfdPassword;
	private JTextField tfdBirthday;
	private JTextField tfdEmails;
	private JTextField tfdNumberPhones;

	private JButton btnSave;
	private JButton btnBack;

	private void initComponent() {
		lblUserName = new JLabel("UserName :");
		lblUserName.setForeground(Color.WHITE);
		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.white);
		lblBirthday = new JLabel("Birthday :");
		lblBirthday.setForeground(Color.white);
		lblEmails = new JLabel("Email :");
		lblEmails.setForeground(Color.white);
		lblNumberPhones = new JLabel("Phone :");
		lblNumberPhones.setForeground(Color.white);
		lblWarinig = new JLabel(" ");
		lblWarinig.setForeground(Color.RED);

		tfdUrserName = new JTextField();
		pfdPassword = new JPasswordField();
		tfdBirthday = new JTextField();
		tfdEmails = new JTextField();
		tfdNumberPhones = new JTextField();

		btnSave = new JButton(new ImageIcon(getClass().getResource("save.png")));
		btnBack = new JButton(new ImageIcon(getClass().getResource("back.png")));
		btnBack.addActionListener(this);
	}

	private void addComponent() {
		add(lblUserName);
		add(lblPassword);
		add(lblBirthday);
		add(lblEmails);
		add(lblNumberPhones);
		add(lblWarinig);
		add(tfdUrserName);
		add(pfdPassword);
		add(tfdBirthday);
		add(tfdEmails);
		add(tfdNumberPhones);
		add(btnBack);
		add(btnSave);
	}

	private void setLocation() {
		lblUserName.setBounds(35, 30, 80, 25);
		lblPassword.setBounds(35, 60, 80, 25);
		lblBirthday.setBounds(35, 90, 80, 25);
		lblEmails.setBounds(35, 120, 80, 25);
		lblNumberPhones.setBounds(35, 150, 80, 25);
		lblWarinig.setBounds(45, 180, 220, 25);
		tfdUrserName.setBounds(130, 30, 120, 25);
		pfdPassword.setBounds(130, 60, 120, 25);
		tfdBirthday.setBounds(130, 90, 120, 25);
		tfdEmails.setBounds(130, 120, 120, 25);
		tfdNumberPhones.setBounds(130, 150, 120, 25);
		btnBack.setBounds(35, 210, 100, 25);
		btnSave.setBounds(155, 210, 100, 25);
	}

	public JTextField getTfdUrserName() {
		return tfdUrserName;
	}

	public JPasswordField getPfdPassword() {
		return pfdPassword;
	}

	public JTextField getTfdBirthday() {
		return tfdBirthday;
	}

	public JTextField getTfdEmails() {
		return tfdEmails;
	}

	public JTextField getTfdNumberPhones() {
		return tfdNumberPhones;
	}

	public void setLblWarinig(JLabel lblWarinig) {
		this.lblWarinig = lblWarinig;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBack) {
			mainFrame.switchPanel("MAIN");
			this.updateUI();
		}
	}

}
