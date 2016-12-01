import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Cool303Container extends Cool303Abstract{
	
	private ArrayList<Cool303Abstract> list = new ArrayList<>();
	public Cool303Container(Cool303Theme theme){
		super(theme);
		setOpaque(true);
	
	}
	
	public void add(Cool303Abstract e){
		list.add(e);
	}
	
	public void remove(int index){
		list.remove(index);
	}
	@Override
	public void paint(Graphics g) {
		int x =0;
		int y = 0;
		for(Cool303Abstract t : list){
			t.setBounds(x, y, 40, 40);
			t.paint(g);
			x = x+40;
		}
		
	}                          
}
