import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;

public class Cool303button extends JButton{
	  protected Shape shape, base;
	  protected Color color;
	  
	  public Cool303button(Shape shape, Color color) {
		    this(null, null,shape, color);
		  }
		  public Cool303button(Icon icon, Shape shape, Color color) {
		    this(null, icon, shape, color);
		  }
		  public Cool303button(String text,Shape shape, Color color) {
		    this(text, null, shape, color);
		  }

		  public Cool303button(String text, Icon icon,Shape shape, Color color) {
			  this.color = color;
			  this.shape = shape;
			  setModel(new DefaultButtonModel());
		    init(text, icon);
		    if(icon==null) {
		      return;
		    }
		    setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
		    setBackground(color);
		    setContentAreaFilled(false);
		    setFocusPainted(true);
		    //setVerticalAlignment(SwingConstants.TOP);
		    //setAlignmentY(Component.TOP_ALIGNMENT);
		    initShape();
		  }

		  protected void initShape() {
		    if(!getBounds().equals(base)) {
		      Dimension s = getPreferredSize();
		      base = getBounds();
		    }
		  }
		  @Override public Dimension getPreferredSize() {
		    Icon icon = getIcon();
		    Insets i = getInsets();
		    int iw = Math.max(icon.getIconWidth(), icon.getIconHeight());
		    return new Dimension(iw+i.right, iw+i.top+i.bottom);
		  }
		  @Override protected void paintBorder(Graphics g) {
		    initShape();
		    Graphics2D g2 = (Graphics2D)g;
		    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                        RenderingHints.VALUE_ANTIALIAS_ON);
		    g2.setColor(getBackground());
		    //g2.setStroke(new BasicStroke(1.0f));
		    g2.draw(shape);
		    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                        RenderingHints.VALUE_ANTIALIAS_OFF);
		  }
		  @Override public boolean contains(int x, int y) {
		    initShape();
		    return shape.contains(x, y);
		    
		  }

}
