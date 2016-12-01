import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public abstract class Cool303Abstract extends JComponent {
	protected Cool303Theme theme;
	protected Color color;
	protected Shape shape;
	
	public Cool303Abstract(Cool303Theme theme){
		super();
		this.theme = theme;
		this.color = theme.color;
		this.shape = theme.shape;

	}
	
	
}
