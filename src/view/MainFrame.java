package view;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class MainFrame extends JFrame implements ActionListener {

	private Point p;
	private Point pDrag;

	private int width;
	private int height;

	private Frame_Main frame_Main;
	private Frame_Login frame_Login;
	private Frame_Register frame_Register;
	private JPanel currentPanel;

	public MainFrame() {
		super("Phone Books");

		width = 1000;
		height = 800;

		p = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

		setContentPane(new JLabel(new ImageIcon(getClass().getResource("b_main.jpg"))));
		setUndecorated(true);
		setSize(width, height);
		setLocation(p.x - width / 2, p.y - height / 2);
		setLayout(null);
		setVisible(true);

		initComponent();
		addComponent();
		setLocationComponent();
		movingFrame();
	}

	private Frame_Main getFrame_Main() {
		if (frame_Main == null) {
			frame_Main = new Frame_Main(this);
		}
		return frame_Main;
	}

	private Frame_Login getFrame_Login() {
		if (frame_Login == null) {
			frame_Login = new Frame_Login(this);
		}
		return frame_Login;
	}

	public Frame_Register getFrame_Register() {
		if (frame_Register == null) {
			frame_Register = new Frame_Register(this);
		}
		return frame_Register;
	}

	private JButton btnExit;

	private void initComponent() {

		currentPanel = getFrame_Main();

		btnExit = new JButton(new ImageIcon(getClass().getResource("exit.jpg")));
		btnExit.addActionListener(this);
	}

	private void addComponent() {
		add(currentPanel);
		add(btnExit);
	}

	private void setLocationComponent() {
		btnExit.setBounds(940, 750, 45, 45);
	}

	private void movingFrame() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pDrag = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				pDrag = null;
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point currenPoint = e.getLocationOnScreen();
				setLocation((currenPoint.x - pDrag.x), (currenPoint.y - pDrag.y));
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}

	protected void switchPanel(String frame) {
		this.getContentPane().remove(currentPanel);
		if (frame == "MAIN") {
			currentPanel = getFrame_Main();
		} else if (frame == "LOGIN") {
			currentPanel = getFrame_Login();
		} else if (frame == "REGISTER") {
			currentPanel = getFrame_Register();
		}
		this.getContentPane().add(currentPanel);
		currentPanel.updateUI();
		SwingUtilities.updateComponentTreeUI(this);

	}
}
