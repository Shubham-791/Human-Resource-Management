import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Main extends JFrame {	
private CardLayout cardLayout = new CardLayout(20,10);
private JPanel panel = new JPanel(cardLayout); 
private JTextField jtf1 = new JTextField();
private JTextField jtf2 = new JTextField();
private JTextField jtf3 = new JTextField();
private JButton jbt1 = new JButton("INSERT");
private JButton jbt2 = new JButton("CLEAR");
private JButton jbt3 = new JButton("CLOSE");
static JMenuBar  jmb = new JMenuBar();

public Main(){
setJMenuBar(jmb);
setLayout(new BorderLayout());
panel.setBorder(new LineBorder(Color.red));
JPanel p_Insertion = new JPanel(new BorderLayout());
p_Insertion.add(new JLabel("EMPLEVEL INSERTION"),BorderLayout.NORTH);
JPanel p = new JPanel(new GridLayout(3, 2));
p.add(new JLabel("Level No"));
p.add(jtf1);
p.add(new JLabel("Low Salary"));
p.add(jtf2);
p.add(new JLabel("High Salary"));
p.add(jtf3);
JPanel p1 = new JPanel(new GridLayout(1, 3));
p1.add(jbt1);
p1.add(jbt2);
p1.add(jbt3);
p_Insertion.add(p,BorderLayout.CENTER);
p_Insertion.add(p1,BorderLayout.SOUTH);
panel.add(new JLabel("Welcome"));
panel.add(p_Insertion);
add(panel,BorderLayout.CENTER);
//panel.setVisible(false);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main frame = new Main();
		frame.setTitle("Main");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//Menu
		
		JMenu fileMenu = new JMenu("File");
		JMenu insertMenu = new JMenu("Insert");
		JMenu deleteMenu = new JMenu("Delete");
		JMenu searchMenu= new JMenu("Search");
		JMenu displayMenu = new JMenu("Display");
		JMenu updateMenu = new JMenu("Update");
	
		jmb.add(fileMenu);
		jmb.add(insertMenu);
		jmb.add(deleteMenu);
		jmb.add(searchMenu);
		jmb.add(displayMenu);
		jmb.add(updateMenu);
		
		fileMenu.add(new JMenuItem("Department"));
		fileMenu.add(new JMenuItem("Dependent"));
		fileMenu.add(new JMenuItem("EmpLevel"));
		fileMenu.add(new JMenuItem("Employee"));
		fileMenu.add(new JMenuItem("Position"));
		fileMenu.add(new JMenuItem("Qualification"));
		
		insertMenu.add(new JMenuItem("Department"));
		insertMenu.add(new JMenuItem("Dependent"));
		insertMenu.add(new JMenuItem("EmpLevel"));
		insertMenu.add(new JMenuItem("Employee"));
		insertMenu.add(new JMenuItem("Position"));
		insertMenu.add(new JMenuItem("Qualification"));
		
		deleteMenu.add(new JMenuItem("Deparment"));
		deleteMenu.add(new JMenuItem("Dependent"));
		deleteMenu.add(new JMenuItem("EmpLevel"));
		deleteMenu.add(new JMenuItem("Employee"));
		deleteMenu.add(new JMenuItem("Position"));
		deleteMenu.add(new JMenuItem("Qualification"));
	
		searchMenu.add(new JMenuItem("Department"));
		searchMenu.add(new JMenuItem("Dependent"));
		searchMenu.add(new JMenuItem("EmpLevel"));
		searchMenu.add(new JMenuItem("Employee"));
		searchMenu.add(new JMenuItem("Position"));
		searchMenu.add(new JMenuItem("Qualification"));
		
		displayMenu.add(new JMenuItem("Department"));
		displayMenu.add(new JMenuItem("Dependent"));
		displayMenu.add(new JMenuItem("EmpLevel"));
		displayMenu.add(new JMenuItem("Employee"));
		displayMenu.add(new JMenuItem("Position"));
		displayMenu.add(new JMenuItem("Qualification"));
		
		updateMenu.add(new JMenuItem("Department"));
		updateMenu.add(new JMenuItem("Dependent"));
		updateMenu.add(new JMenuItem("EmpLevel"));
		updateMenu.add(new JMenuItem("Employee"));
		updateMenu.add(new JMenuItem("Position"));
		updateMenu.add(new JMenuItem("Qualification"));
		
		
		
	}

}
