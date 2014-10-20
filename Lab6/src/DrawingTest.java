import java.awt.*;

// Drawing test.
public class DrawingTest {
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(800, 600);
		Graphics g = panel.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 800, 600);
		
		// draw checkerboard grid
		drawGrid(g, 200, 200, 3, 50);
	
		panel.compareToFilePublic();
	}
	
	
	public static void drawSquare(Graphics g, int x, int y, int size, java.awt.Color color) {
		g.setColor(color);
		g.fillRect(x, y, size, size);
	}
	
	public static void drawRow(Graphics g, int x, int y, int squares, int size) {

		for (int i = 1; i < squares; i++) {
			drawSquare(g, x, y, size, Color.MAGENTA);
			x += 100;
		}
		
	}
	
	public static void drawGrid(Graphics g, int x, int y, int squares, int size) {
		
		for (int i = 1; i <= squares; i++) {
			
			// if current row is even
			if ((i % 2) == 0) {
				drawSquare(g, x+size, y, size, Color.MAGENTA);
			}
			// if current row is odd
			else {
				drawRow(g, x, y, squares, size);
			}
			y += size;
		} 	
		
	}
	
}
