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
public class Frame_Login extends JPanel implements ActionListener {

	private int width;
	private int height;

	private MainFrame mainFrame;

	public Frame_Login(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		width = 285;
		height = 170;
		setBorder(BorderFactory.createTitledBorder(null, "Login", TitledBorder.DEFAULT_JUSTIFICATION,
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
	private JLabel lblWarning;

	private JTextField tfdUserName;

	private JPasswordField pfdPassword;

	private JButton btnLogin;
	private JButton btnBack;

	private void initComponent() {
		lblUserName = new JLabel("UserName ");
		lblUserName.setForeground(Color.white);
		lblPassword = new JLabel("Password ");
		lblPassword.setForeground(Color.white);
		tfdUserName = new JTextField();
		pfdPassword = new JPasswordField();
		lblWarning = new JLabel(" ");
		lblWarning.setForeground(Color.RED);
		btnLogin = new JButton(new ImageIcon(getClass().getResource("Logining.png")));
		btnBack = new JButton(new ImageIcon(getClass().getResource("Back.png")));
		btnBack.addActionListener(this);
	}

	private void addComponent() {
		add(lblUserName);
		add(lblPassword);
		add(tfdUserName);
		add(pfdPassword);
		add(lblWarning);
		add(btnLogin);
		add(btnBack);
	}

	private void setLocation() {
		lblUserName.setBounds(35, 30, 80, 25);
		lblPassword.setBounds(35, 60, 80, 25);
		tfdUserName.setBounds(130, 30, 120, 25);
		pfdPassword.setBounds(130, 60, 120, 25);
		lblWarning.setBounds(40, 90, 220, 25);
		btnBack.setBounds(35, 120, 100, 25);
		btnLogin.setBounds(155, 120, 100, 25);
	}

	public void setLblWarning(JLabel lblWarning) {
		this.lblWarning = lblWarning;
	}

	public JTextField getTfdUserName() {
		return tfdUserName;
	}

	public JPasswordField getPfdPassword() {
		return pfdPassword;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBack) {
			mainFrame.switchPanel("MAIN");
			this.updateUI();
		}
	}

}
