// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	
	// constructor, to initialize the components
	// with default values.
	public MyFrame()
	{
		setTitle("SDMX CONVERTER");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		ImageIcon img = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\pastedImage.jpg");
		this.setIconImage(img.getImage());
		

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Mapping Submission");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		name = new JLabel("Element Name");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 12));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);
		
		name = new JLabel("Version");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		name.setLocation(480, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 12));
		tname.setSize(190, 20);
		tname.setLocation(550, 100);
		c.add(tname);

		mno = new JLabel("Doubtful");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(10, 180);
		c.add(mno);
		
		mno = new JLabel("up to 1 year");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(10, 200);
		c.add(mno);

		mno = new JLabel("Domestic");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(110, 180);
		c.add(mno);
		
		mno = new JLabel("Operations");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(110, 200);
		c.add(mno);
		
		mno = new JLabel("Gross Loans");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(200, 180);
		c.add(mno);
		
		mno = new JLabel("and Advances");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(200, 200);
		c.add(mno);
		
		mno = new JLabel("Outstanding");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(300, 180);
		c.add(mno);
		
		mno = new JLabel("Amount");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(300, 200);
		c.add(mno);
		
		mno = new JLabel("Indian");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(400, 180);
		c.add(mno);
		
		mno = new JLabel("Rupee");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(400, 200);
		c.add(mno);
		
		mno = new JLabel("Table name ");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(450, 180);
		c.add(mno);
		
		mno = new JLabel("Column name");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(550, 180);
		c.add(mno);
		
		mno = new JLabel("Time period ");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(650, 180);
		c.add(mno);
		
		/*mno = new JLabel("Dimension 4");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(750, 180);
		c.add(mno);*/
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(450, 200);
		c.add(tmno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(550, 200);
		c.add(tmno);
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(650, 200);
		c.add(tmno);
		
		/*tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(750, 200);
		c.add(tmno);
		/*add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 300);
		c.add(add);
		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 300);
		tadd.setLineWrap(true);
		c.add(tadd);*/

		term = new JCheckBox("Validation");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		/*tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);*/

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		/*resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);*/

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Element Name : "
					+ tname.getText() + "\n"
					+ "Database Table : "
					+ tmno.getText() + "\n";
				/*if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				/*String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";*/

				//String data3 = "Address : " + tadd.getText();
				tout.setText(data);
				tout.setEditable(false);
				res.setText("Mapping Successfully Done...");
			}
			/*else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}*/
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			//date.setSelectedIndex(0);
			//month.setSelectedIndex(0);
			//year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}

// Driver Code
class RegistrationM {

	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
		
		
	}
}