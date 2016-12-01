import java.awt.Color;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class Wintertheme extends Cool303Theme {
	
	public Wintertheme(){
		this.iconpath = "images/orange.png";
		this.icon = getIcon();
		
		this.color = new Color(1,1,1);
		float iconmax = (float) (Math.max(this.icon.getIconWidth(), this.icon.getIconHeight()));
		this.shape = new Ellipse2D.Float(0,0,iconmax,iconmax);
		
	}
	
	
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

}
