package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDayChooser;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;


public class Report_GUI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report_GUI frame = new Report_GUI();
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
	public Report_GUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Reporting");
		setBounds(100, 100, 682, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnAll = new JRadioButton("All");
		rdbtnAll.setSelected(true);
		buttonGroup.add(rdbtnAll);
		rdbtnAll.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAll.setBounds(37, 50, 103, 21);
		contentPane.add(rdbtnAll);
		
		JRadioButton rdbtnCity = new JRadioButton("City");
		buttonGroup.add(rdbtnCity);
		rdbtnCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnCity.setBounds(37, 83, 103, 21);
		contentPane.add(rdbtnCity);
		
		JRadioButton rdbtnDate = new JRadioButton("Date");
		buttonGroup.add(rdbtnDate);
		rdbtnDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnDate.setBounds(37, 148, 103, 21);
		contentPane.add(rdbtnDate);
		
		JLabel lblNewLabel = new JLabel("Categories :-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(37, 20, 150, 24);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(368, 28, 276, 256);
		contentPane.add(textArea);
		
		String[] choices = {"Select","Brampton", "Toronto", "Mississauga","Kitchener","Oakville","Cambridge"};
		JComboBox cmboxDate = new JComboBox(choices);
		cmboxDate.setEnabled(false);
		cmboxDate.setBounds(37, 115, 132, 27);
		contentPane.add(cmboxDate);
		
		JDateChooser datePicker = new JDateChooser();
		datePicker.setDateFormatString("MM/dd/yyyy");
		datePicker.setEnabled(false);
		datePicker.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		datePicker.setBounds(37, 184, 134, 27);
		contentPane.add(datePicker);
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(Validator.dateValidate(), getTitle()).isPresent(cmboxDate, getName()))
			}
		});
		btnGenerateReport.setBounds(29, 253, 158, 31);
		contentPane.add(btnGenerateReport);
	}
}
