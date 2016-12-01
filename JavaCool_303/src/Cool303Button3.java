import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class Cool303Button3 extends Cool303Abstract implements MouseListener {
	
	
	  protected Dimension dimension;
	
	  protected String text;
	  
	  protected Image icon;
	  
	  protected Shape shape;

	  protected Rectangle rectangle;

	  protected boolean isActive;

	  protected static Cool303Button3 button;
	  
	  protected int x , y , width , height ; 
	  
	public Cool303Button3(Cool303Theme theme, String text) {
		
		super(theme);
		
		this.shape = theme.shape;
		this.color = theme.color;
		image_property(0, 0, 40, 40);
		dimension = new Dimension(width, height);
		setText(text);
		setOpaque(true);
		addMouseListener(this);
		rectangle = new Rectangle(shape.getBounds());
		setBounds(rectangle);
		setSize(dimension);

	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
	
	protected void setState(boolean active){
		
		isActive = active;
		repaint();
		if(active){
			if(button !=null)
				button.setState(false);
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		} else{
			button = null;
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	@Override
	
	public void mousePressed(MouseEvent e) {
		
		
             Point me = e.getPoint();
             
             if (rectangle.contains(me)) {
                 System.out.println(text);
             }
		

		
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/** this function is to setup the image lication
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public void image_property(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		Image img = theme.getIcon().getImage();
		icon = img.getScaledInstance( width, height,  java.awt.Image.SCALE_SMOOTH ) ;
		float iconmax = (float) (Math.max(this.icon.getWidth(null), this.icon.getWidth(null)));
		this.shape = new Ellipse2D.Float(0,0,iconmax,iconmax);
	}
	public void paint(Graphics g){
		printBorder(g);
		g.setColor(this.color);
	
		g.drawImage(icon, x, y, width, height, null);
	}


	
	
}
