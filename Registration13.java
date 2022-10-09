//import abc.;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class SecondPage
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
    private Container c;
    private JLabel title;
    //private JLabel name;
    //private JTextField tname;
    //private JLabel mno;
    //private JTextField tmno;
    private JLabel selectOne;
    private JRadioButton mapping;
    private JRadioButton filSubmission;
    private ButtonGroup gengp;
    private JLabel elementname;
    private JComboBox Elementnm;
    private JComboBox version;
    //private JComboBox year;
    //private JLabel add;
   // private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String Elementnms[]
        = { "Loans and Advances", "Asset Quality Migration", "Netting Items for NPA - Loans and Advances", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String versions[]
        = { "version1", "version2", "version3", "version4",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
   /* private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };*/
 
    // constructor, to initialize the components
    // with default values.
    public SecondPage()
    {
        setTitle("SDMX CONVERTER");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
		ImageIcon img = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\pastedImage.jpg");
		this.setIconImage(img.getImage());
		
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("SDMX CONVERTER");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
       /* name = new JLabel("ReturnName");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);*/
 
        /*tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);*/
 
        /*mno = new JLabel("ReturnCODE");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);*/
 
       /* tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);*/
 
        /*selectOne = new JLabel("Select One");
        selectOne.setFont(new Font("Arial", Font.PLAIN, 12));
        selectOne.setSize(100, 20);
        selectOne.setLocation(100, 200);
        c.add(selectOne);
 
        mapping = new JRadioButton("Mapping");
        mapping.setFont(new Font("Arial", Font.PLAIN, 10));
        mapping.setSelected(true);
        mapping.setSize(90, 40);
        mapping.setLocation(200, 185);
        c.add(mapping);
 
        filSubmission = new JRadioButton("FileSubmission");
        filSubmission.setFont(new Font("Arial", Font.PLAIN, 10));
        filSubmission.setSelected(false);
        filSubmission.setSize(90, 40);
        filSubmission.setLocation(280, 185);
        c.add(filSubmission);
 
        gengp = new ButtonGroup();
        gengp.add(mapping);
        gengp.add(filSubmission);*/
 
        elementname = new JLabel("Element Name");
        elementname.setFont(new Font("Arial", Font.PLAIN, 15));
        elementname.setSize(100, 20);
        elementname.setLocation(100, 90);
        c.add(elementname);
 
        Elementnm = new JComboBox(Elementnms);
        Elementnm.setFont(new Font("Arial", Font.PLAIN, 15));
        Elementnm.setSize(80, 20);
        Elementnm.setLocation(200, 90);
        c.add(Elementnm);
 
        version = new JComboBox(versions);
        version.setFont(new Font("Arial", Font.PLAIN, 15));
        version.setSize(80, 20);
        version.setLocation(300, 90);
        c.add(version);
		
		selectOne = new JLabel("Select One");
        selectOne.setFont(new Font("Arial", Font.PLAIN, 15));
        selectOne.setSize(100, 15);
        selectOne.setLocation(100, 200);
        c.add(selectOne);
 
        mapping = new JRadioButton("Mapping");
        mapping.setFont(new Font("Arial", Font.PLAIN, 15));
        mapping.setSelected(true);
        mapping.setSize(90, 40);
        mapping.setLocation(200, 185);
        c.add(mapping);
 
        filSubmission = new JRadioButton("File Submission");
        filSubmission.setFont(new Font("Arial", Font.PLAIN, 15));
        filSubmission.setSelected(false);
        filSubmission.setSize(90, 40);
        filSubmission.setLocation(300, 185);
        c.add(filSubmission);
 
        gengp = new ButtonGroup();
        gengp.add(mapping);
        gengp.add(filSubmission);
 
 
       /* year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);*/
 
        //add = new JLabel("Address");
        //add.setFont(new Font("Arial", Font.PLAIN, 20));
        //add.setSize(100, 20);
        //add.setLocation(100, 300);
        //c.add(add);
 
        //tadd = new JTextArea();
        //tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        //tadd.setSize(200, 75);
        //tadd.setLocation(200, 300);
        //tadd.setLineWrap(true);
        //c.add(tadd);
 
       /* term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);*/
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Proceed");
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
                /*String data
                    = "ReturnName : "
                      + tname.getText() + "\n"
                      + "ReturnCode : "
                      + tmno.getText() + "\n";*/
                if (mapping.isSelected())
                    data1 = "selectOne : mapping"
                            + "\n";
                else
                    data1 = "selectOne : filSubmission"
                            + "\n";
                String data2
                    = "ElementName : "
                      + (String)Elementnm.getSelectedItem()
                      + "/" + (String)version.getSelectedItem()
                     // + "/" + (String)year.getSelectedItem()
                      + "\n";
 
               // String data3 = "Address : " + tadd.getText();
                tout.setText(data1 + data2);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
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
            //tname.setText(def);
            //tadd.setText(def);
            //tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            Elementnm.setSelectedIndex(0);
            version.setSelectedIndex(0);
            //year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
 
// Driver Code

class Registration13 {
 
    public static void main(String[] args) throws Exception
    {
        SecondPage f = new SecondPage();
    }
}