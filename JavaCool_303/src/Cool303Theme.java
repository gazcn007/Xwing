import java.awt.Color;
import java.awt.Shape;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public  abstract class Cool303Theme {
	protected String iconpath;
	protected Color color;
	protected Shape shape;
	protected Icon icon;
	public abstract void paint();
	public void setColor(Color color){
		this.color = color;
	}
	public Color getColor(){
		return color;	
	}
	
	public void setShape(Shape shape){
		this.shape = shape;
		
	}
	

	public ImageIcon getIcon(){
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			return new ImageIcon(ImageIO.read(classLoader.getResource(iconpath)));	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
