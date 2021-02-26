package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Covid19_Data_Manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Covid19_Data_Manager frame = new Covid19_Data_Manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Covid19_Data_Manager() {
		setTitle("Covid19_Data_Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic(KeyEvent.VK_F);//Making it keyboard accessible 
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setMnemonic(KeyEvent.VK_E);
		mnFile.add(mntmExit);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setMnemonic(KeyEvent.VK_O);
		menuBar.add(mnOptions);
		
		JMenuItem mntmRecord = new JMenuItem("Record");
		mntmRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Record_GUI recGUI = new Record_GUI();
				recGUI.setVisible(true);
			}
		});
		
		mntmRecord.setMnemonic(KeyEvent.VK_E);
		mnOptions.add(mntmRecord);
		
		//Click Event Handling
		JMenuItem mntmReport = new JMenuItem("Report");
		mntmReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Report_GUI repGUI = new Report_GUI();
				repGUI.setVisible(true);
			}
		});
		mntmReport.setMnemonic(KeyEvent.VK_R);
		mnOptions.add(mntmReport);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
