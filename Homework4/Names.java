import java.util.*; 
import java.io.*; 
import java.awt.*;

public class Names {

	static int decades = 14; // set the number of decades
	static int startYear = 1880; // set the starting year
	static int decadeWidth = 70; // set the width per decade
	static int panelLength = decades * decadeWidth; // set the length of panel
	
	public static void main(String[] args) {
		Intro(); // prints the intro about the program
		String[] userInfo = Prompt(); // gets user input and stores as a string array
		String userData = FindName(userInfo); // searches file for given user; returns a string if found, null otherwise
		int[] data = Coordinates(userData); // calculates grid coordinates and stores them as a string array
		DrawPanel(data, userData); // draws the user data and coordinates to a graphics panel
	}
	
	public static void Intro() {
		System.out.println("This program allows you to search through the\n"
				+ "data from the Social Security Administration\n"
				+ "to see how popular a particular name has been\n"
				+ "since " + startYear + ".");
		System.out.println(); 
	}
	
	public static String[] Prompt() {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Name? ");
		String name = console.next(); // get name from user
		System.out.print("Gender (M/F)? ");
		String gender = console.next(); // get gender from user
		
		console.close();
		return new String[] {name, gender}; // returns string array with contents of name and gender
	}
	
	public static String FindName(String[] userInfo) {
		String name = userInfo[0]; 
		String gender = userInfo[1];
		
		boolean found = false;
		String line = null;
		Scanner file = null;
		String ranks = null;
		
		try {
			file = new Scanner(new File("names.txt"));
			// while file has next line and name hasn't been found
			while( file.hasNextLine() && !found ) {
				line = file.nextLine();
				
				// split first each line by a space(" ") and store as elements of string array 'rank'
				String[] rank = line.split(" ");
				
				// if name & gender equal the first two elements from array
				if ( name.equalsIgnoreCase(rank[0]) && gender.equalsIgnoreCase(rank[1]) ) {
					found = true;
					ranks = line;
					System.out.println("Generating graph...");
				}
			}
			if( !found ) {
				System.out.println("Couldn't find name.");
				file.close();
				return null;
			}
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return ranks;
	}

	public static int[] Coordinates(String ranks) {
		if ( ranks == null) {  // error check: array is empty, stop program
			return new int[] {};
		}
		
		String[] data = ranks.split(" ");
		int[] coords = new int[decades];
		
		for ( int i = 0; i < decades; i++ ) {	
			int y = 525;
			double rank = Integer.parseInt(data[i+2]);
			if ( rank != 0) {
				y = (int) Math.ceil(rank/2) + 24;
				coords[i] = y;
			} else {
				coords[i] = y;
			}
		}
		return coords;
	}
	
	public static void DrawPanel(int[] data, String ranks) {
		if (data.length == 0) {  // error check: array is empty, stop program
			return;
		}
		
		DrawingPanel panel = new DrawingPanel(panelLength, 550);
		Graphics g = panel.getGraphics();
		g.drawLine(0, 25, panelLength, 25);   // draw the top line
		g.drawLine(0, 525, panelLength, 525); // draw the bottom line
		
		String[] rank = ranks.split(" ");
		String string = rank[0] + " " + rank[1];
		int nextY = 525;
		int x = 0;
		
		// draws grid
		for ( int i = 0; i < decades; i++ ) {
			x = i * decadeWidth;
			g.drawLine(x, 0, x, 550);
			// increment startYear by adding the value of i times decade,
			// and add "" to convert into a string
			g.drawString(startYear + i*10 + "", x, 550);
		}
		
		// draws data onto grid
		for ( int i = 0; i < decades; i++ ) {
			x = i * decadeWidth;
			g.setColor(Color.RED);
			// doesn't let the index go over array bounds
			if ( i != decades-1 && data[i+1] != 0 ) {
				nextY = data[i+1];
			}
			
			// draws line of data as long as the index is less than decades
			// so that an extra line doesn't get drawn at the end
			if ( i != decades-1 ) {
				g.drawLine(x, data[i], x+decadeWidth, nextY);
				//g.drawString(string + " " + rank[i+2], x, data[i]);
			}
			g.drawString(string + " " + rank[i+2], x, data[i]);
		}	
	}
}

// http://www.tutorialspoint.com/java/util/scanner_hasnextline.htm
// http://www.tutorialspoint.com/java/util/scanner_nextline.htm
// http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
// http://stackoverflow.com/questions/5071040/java-convert-integer-to-string
// http://stackoverflow.com/questions/4540684/java-round-up-any-number
