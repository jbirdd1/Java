// HW3
// Part B

import java.awt.*;

// draws the Café Wall illusion using DrawingPanel and Graphics
public class CafeWall {
	
	static int mortar = 2; // buffer between each row

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(650, 400);
		panel.setBackground(Color.LIGHT_GRAY);
		Graphics g = panel.getGraphics();
		
		// (g, x-cordinate, y-cordinate, pairs, box size)
		drawRow(g, 0, 0, 4, 20, Color.BLACK, Color.WHITE);
		drawRow(g, 50, 70, 5, 30, Color.BLACK, Color.WHITE);
		
		// (g, x-cordinate, y-cordinate, pairs, box size, offset)
		drawGrid(g, 10, 150, 4, 25, 0, Color.BLACK, Color.WHITE);
		drawGrid(g, 250, 200, 3, 25, 10, Color.BLACK, Color.WHITE);
		drawGrid(g, 425, 180, 5, 20, 10, Color.BLACK, Color.WHITE);
		drawGrid(g, 400, 20, 2, 35, 35, Color.BLACK, Color.WHITE);
		
	}
	
	
	// draws one pair of black/white boxes
	public static void drawPair(Graphics g, int x, int y, int boxSize, java.awt.Color color1, java.awt.Color color2) {
		// draw black box
		g.setColor(color1);
		g.fillRect(x, y, boxSize, boxSize);
		
		// draw blue 'X' inside of black box
		g.setColor(Color.BLUE);
		g.drawLine(x, y, x+boxSize, y+boxSize);
		g.drawLine(x+boxSize, y, x, y+boxSize);
		
		// draw white box
		g.setColor(color2);
		g.fillRect(x+boxSize, y, boxSize, boxSize);
		
	}
	
	// draws one row of a specified number of black/white pairs
	public static void drawRow(Graphics g, int x, int y, int pairs, int boxSize, java.awt.Color color1, java.awt.Color color2) {
		
		// width of each pair
		int width = boxSize*2;
		// length of row
		int length = width*pairs;
		
		// draw length of row with specified number of pairs
		for (int i = 0; i < length; i += width) {
			drawPair(g, x, y, boxSize, color1, color2);
			// increment x-cordinate by adding width of each pair to it 
			x += width;
			
		}	
		
	}
	
	// draws a grid of rows
	public static void drawGrid(Graphics g, int x, int y, int pairs, int boxSize, int offSet, java.awt.Color color1, java.awt.Color color2) {
		
		// number of rows
		int rows = pairs*2;
		
		// draw the number of rows
		for (int i = 1; i <= rows; i++) {
			
			// if current row is even, then add offSet to x-cordinate of row
			if ((i % 2) == 0) {
				drawRow(g, x + offSet, y, pairs, boxSize, color1, color2);
			}
			// if current row is odd, draw row
			else if ((i % 2) == 1) {
				drawRow(g, x, y, pairs, boxSize, color1, color2);
			}
			// add squareSize + mortar to y-cordinate
			y += boxSize+mortar;
			
		} // end loop	
		
	} // end method
	
} // end class




















