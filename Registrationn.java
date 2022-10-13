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
	private Graphics g;

	
	// constructor, to initialize the components
	// with default values.
	public MyFrame()
	{
		setTitle("SDMX CONVERTER");
		setBounds(50, 50, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		ImageIcon image = new ImageIcon("C:\\Users\\harshada.sawant\\Desktop\\logo2.png");
		
		JLabel imageLabel = new JLabel(image);
		c.add(imageLabel);
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(1000, 750);
		imageLabel.setLocation(0, 0);
		imageLabel.setSize(150, 50);
		imageLabel.setVisible(true);
		
		title = new JLabel("SDMX CONVERTER");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(800, 30);
		title.setLocation(500, 40);
		c.add(title);
		
		title = new JLabel("Mapping Submission");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setSize(600, 80);
		title.setLocation(520, 150);
		c.add(title);

		name = new JLabel("Element Name");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		name.setLocation(150, 230);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 12));
		tname.setSize(190, 20);
		tname.setLocation(250, 230);
		c.add(tname);
		
		name = new JLabel("Version");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		name.setLocation(550, 230);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 12));
		tname.setSize(190, 20);
		tname.setLocation(640, 230);
		c.add(tname);
		
		mno = new JLabel("Dimension 1");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(130, 280);
		c.add(mno);
		
		mno = new JLabel("Doubtful");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(130, 320);
		c.add(mno);
		
		mno = new JLabel("up to 1 year");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(130, 340);
		c.add(mno);

		mno = new JLabel("Dimension 2");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(230, 280);
		c.add(mno);
		
		mno = new JLabel("Domestic");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(230, 320);
		c.add(mno);
		
		mno = new JLabel("Operations");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(230, 340);
		c.add(mno);
		
		mno = new JLabel("Dimension 3");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(330, 280);
		c.add(mno);
		
		mno = new JLabel("Gross Loans");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(330, 320);
		c.add(mno);
		
		mno = new JLabel("and Advances");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(330, 340);
		c.add(mno);
		
		mno = new JLabel("Dimension 4");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(430, 280);
		c.add(mno);
		
		mno = new JLabel("Outstanding");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(430, 320);
		c.add(mno);
		
		
		mno = new JLabel("Amount");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(430, 340);
		c.add(mno);
		
		mno = new JLabel("Dimension 5");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(530, 280);
		c.add(mno);
		
		mno = new JLabel("Indian");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(530, 320);
		c.add(mno);
		
		mno = new JLabel("Rupee");
		mno.setFont(new Font("Arial", Font.PLAIN, 13));
		mno.setSize(100, 20);
		mno.setLocation(530, 340);
		c.add(mno);
		
		mno = new JLabel("Table name ");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(680, 280);
		c.add(mno);
		
		mno = new JLabel("Column name");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(800, 280);
		c.add(mno);
		
		mno = new JLabel("Item Column");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(920, 280);
		c.add(mno);
		
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(680, 320);
		c.add(tmno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(800, 320);
		c.add(tmno);
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(920, 320);
		c.add(tmno);
		
	

		term = new JCheckBox("Validation");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 450);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 500);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 500);
		reset.addActionListener(this);
		c.add(reset);

	

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		
        
		JTextField footer = new JTextField();
		footer.setText("© Reserve Bank of India. All Rights Reserved");
		footer.setEditable(false);
		footer.setFont(new Font("Arial",Font.PLAIN,12));
        footer.setSize(1200,20);
	    footer.setLocation(000,530);
		c.add(footer);
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
				

				//String data3 = "Address : " + tadd.getText();
				tout.setText(data);
				tout.setEditable(false);
				res.setText("Mapping Successfully Done...");
			}
			
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
	
			resadd.setText(def);
		}
	}
}

// Driver Code
class Registrationn {

	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
		
		
	}
}
