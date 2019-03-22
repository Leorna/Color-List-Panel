package aula02;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListTest extends JFrame {
	private JList colorList;
	private Container container;
	
	private String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", " Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
	
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,  Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
	
	public ListTest() {
		super("List test");
		container = getContentPane();
		container.setLayout(new FlowLayout());
		
		colorList = new JList(colorNames);
		colorList.setVisibleRowCount(3);
		
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		container.add(new JScrollPane(colorList));
		
		colorList.addListSelectionListener(new ListSelectionListener() {
			@Override public void valueChanged(ListSelectionEvent event) {
				container.setBackground(colors[colorList.getSelectedIndex()]);
			}
		});
		setSize(800, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
