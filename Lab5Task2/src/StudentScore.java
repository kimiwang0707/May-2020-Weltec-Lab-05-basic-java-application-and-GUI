
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StudentScore {

	private JFrame frame;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldScore;
	private JButton btnAddtoList;
	private JTextArea textAreaStudent;
	private JLabel lblResult;
	private int count;
	private String Student = "";
	private int totalScore = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentScore window = new StudentScore();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentScore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(41, 40, 54, 15);
		frame.getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(41, 78, 54, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(41, 120, 54, 15);
		frame.getContentPane().add(lblScore);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(96, 37, 117, 21);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(96, 75, 117, 21);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldScore = new JTextField();
		textFieldScore.setBounds(96, 117, 117, 21);
		frame.getContentPane().add(textFieldScore);
		textFieldScore.setColumns(10);
		
		textAreaStudent = new JTextArea();
		textAreaStudent.setEditable(false);
		textAreaStudent.setBounds(240, 20, 170, 117);
		frame.getContentPane().add(textAreaStudent);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setBounds(221, 185, 54, 15);
		frame.getContentPane().add(lblAverage);
		
		lblResult = new JLabel("");
		lblResult.setBounds(285, 181, 125, 23);
		frame.getContentPane().add(lblResult);
	
	
	    btnAddtoList = new JButton("Add to List");	
	    for (count = 1 ; count > 0; count++)
	    {
	    	btnAddtoList.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
			add_btnAdd_actionPerformed(e);
		}
	    }); break;
	    }
	
	        btnAddtoList.setBounds(53, 181, 117, 23);
	        frame.getContentPane().add(btnAddtoList);
		
	}
	   
	        protected void add_btnAdd_actionPerformed(ActionEvent e){    	
	    	String ID = textFieldId.getText();
	    	String Name = textFieldName.getText();
	    	try {
	    	int Score = Integer.parseInt(textFieldScore.getText());
	    	if (Score < 0 || Score > 100){
	    		JOptionPane.showMessageDialog(null, "Score must be between 0-100!", "Error", JOptionPane.WARNING_MESSAGE);	
	    		return;
	    	}
	    	
	    	Student += ID + " " + Name + " " + textFieldScore.getText() + "\n";    	
	    	textAreaStudent.setText(Student);
	    	
	        totalScore += Score;
	    	int average = totalScore / count++;
	    	lblResult.setText(Integer.toString(average));
	    		    	
	    	} catch (NumberFormatException ex)
	    	{JOptionPane.showMessageDialog(null, "Score must be an integer between 0-100!", "Error", JOptionPane.WARNING_MESSAGE);	    	 
	    	 return;
            }
	    
	      }
	       
	
	
}



