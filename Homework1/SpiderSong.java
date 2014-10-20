
// Programming Homework 1
// Jessica Morton
// 1/15/2014

// Java program that prints the lyrics of 
// "There was an old woman who swallowed a fly"
public class SpiderSong {
	
	// Variables for each animal and strings
	String fly;
	String spider;
	String bird;
	String cat;
	String dog;
	String python;
	String horse;
	
	String result;
	String first = "There was an old woman who swallowed a ";
	String swallow = "She swallowed the ";
	String capture = " to catch the ";
	
	// Constructor
	SpiderSong() {
		this.fly = "fly";
		this.spider = "spider";
		this.bird = "bird";
		this.cat = "cat";
		this.dog = "dog";
		this.python = "python";
		this.horse = "horse";
	}
	
	String getLastLines() {
		result = "I don't know why she swallowed that " + this.fly + ",\n";
		result = result + "Perhaps she'll die.\n\n";;
		return result;
	}
	
	String getFly() {
		result = first + this.fly + ".\n";
		result = result + getLastLines();
		return result;
	}
	
	String getSpider() {
		result = first + this.spider + ",\n";
		result = result + "That wriggled and iggled and jiggled inside her.\n";
		result = result + swallow + this.spider + capture + this.fly + ",\n";
		result = result + getLastLines();
		return result;
	}
	
	String getBird() {
		result = first + this.bird + ",\n";
		result = result + "How absurd to swallow a bird.\n";
		result = result + swallow + this.bird + capture + this.spider + ",\n";
		result = result + swallow + this.spider + capture + this.fly + ",\n";
		result = result + getLastLines();
		return result;
	}
	
	String getCat() {
		result = first + this.cat + ",\n";
		result = result + "Imagine that to swallow a cat.\n";
		result = result + swallow + this.cat + capture + this.bird + ",\n";
		result = result + swallow + this.bird + capture + this.spider + ",\n";
		result = result + swallow + this.spider + capture + this.fly + ",\n";
		result = result + getLastLines();
		return result;
	}
	
	String getDog() {
		result = first + this.dog + ",\n";
		result = result + "What a hog to swallow a dog.\n";
		result = result + swallow + this.dog + capture + this.cat + ",\n";
		result = result + swallow + this.cat + capture + this.bird + ",\n";
		result = result + swallow + this.bird + capture + this.spider + ",\n";
		result = result + swallow + this.spider + capture + this.fly + ",\n";
		result = result + getLastLines();
		return result;
	}
	
	String getPython() {
		result = first + this.python + ",\n";
		result = result + "She was an icon for swallowing that python.\n";
		result = result + swallow + this.python + capture + this.dog + ",\n";
		result = result + swallow + this.dog + capture + this.cat + ",\n";
		result = result + swallow + this.cat + capture + this.bird + ",\n";
		result = result + swallow + this.bird + capture + this.spider + ",\n";
		result = result + swallow + this.spider + capture + this.fly + ",\n";
		result = result + getLastLines();
		return result;
	}
	
	String getHorse() {
		result = first + this.horse + ".\n";
		result = result + "She died of course.";
		return result;
	}
	
	public static void main(String[] args) {
		SpiderSong song = new SpiderSong();
		String songString = song.getFly() + song.getSpider() + song.getBird() + song.getCat() + song.getDog() + song.getPython() + song.getHorse();
		System.out.println(songString);
	} //end main method
} // end class
