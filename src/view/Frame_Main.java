package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Frame_Main extends JPanel implements ActionListener {

	private int width;
	private int height;

	private MainFrame mainFrame;

	public Frame_Main(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		width = 200;
		height = 120;
		setBorder(BorderFactory.createTitledBorder(null, "Choess Loging", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, Color.white));
		setBounds((mainFrame.getSize().width / 2) - (width / 2), (mainFrame.getSize().height / 2) - (height / 2), width,
				height);
		setBackground(new Color(0, 0, 0, 150));
		setLayout(null);
		initComponent();
		addComponent();
		setLocationComponent();
	}

	private JButton btnLogin;
	private JButton btnRegister;

	private void initComponent() {
		btnLogin = new JButton(new ImageIcon(getClass().getResource("Login.png")));
		btnLogin.addActionListener(this);
		btnRegister = new JButton(new ImageIcon(getClass().getResource("Register.png")));
		btnRegister.addActionListener(this);
	}

	private void addComponent() {
		add(btnLogin);
		add(btnRegister);
	}

	private void setLocationComponent() {
		btnLogin.setBounds(35, 30, 130, 25);
		btnRegister.setBounds(35, 65, 130, 25);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogin) {
			mainFrame.switchPanel("LOGIN");
		} else if (e.getSource() == btnRegister) {
			mainFrame.switchPanel("REGISTER");
		}
	}

}
