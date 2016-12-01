import java.awt.Component;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class mainaa {
	
public static void main(String[] args){
	
	
	Wintertheme theme = new Wintertheme();
	Cool303Container container = new Cool303Container(theme);
	Cool303Button3[] button3 = new Cool303Button3[10];
	
	
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container pane = frame.getContentPane();
	
	for(int i = 1;i<10; i++){
		
		button3[i] = new Cool303Button3(theme, Integer.toString(i) );
		button3[i].image_property(0, 0, 40, 40);
		//pane.add(button3[i]);
		
		container.add(button3[i]);
	}
	
	pane.setLayout(null);
	pane.add(container);
	
	
	
    //Display the window.
    frame.pack();
    frame.setVisible(true);
}
	
}
