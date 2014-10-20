// HW3
import java.awt.*;

public class Doodle {

	public static void main(String[] args) {
		setPanel();
	}
	
	public static void setPanel() {
		
		DrawingPanel p = new DrawingPanel(500, 500);
		p.setBackground(Color.LIGHT_GRAY);
		Graphics g = p.getGraphics();
		
		// draw a polygon
		g.setColor(Color.YELLOW);
	    int xpoints[] = {25, 145, 25, 145, 25};
	    int ypoints[] = {25, 25, 145, 145, 25};
	    int npoints = 5;
	    
	    g.fillPolygon(xpoints, ypoints, npoints);
		
	    // draw oval
		g.setColor(Color.red);
		g.fillOval(300, 20, 30, 30);
		
		// draw string 
		g.drawString("Hello World!", 40, 300);
		g.drawRect(10, 10, 480, 480);
		
		// draw arcs
		for (int i=0; i<50; i++)
		{
			g.setColor(new Color(i*25, i*35, i*35));
			g.fillArc(100, i*50, i*100, i*50, i*50, i*50);
		}
	}
}
