
public class BirthdaySong 
{
	String secondLine;
	String animal;
	String verb;
	
	BirthdaySong(String secondLine, String animal, String verb) 
	{
		this.secondLine = secondLine;
		this.animal = animal;
		this.verb = verb;
	}
	
	String getString() 
	{
		String result = "Happy birthday to you, \n";
		result = result + this.secondLine + "\n";
		result = result + "You look like a " + this.animal + "\n";
		result = result + "And you " + this.verb + " like one too";
		return result;
	}
	public static void main(String[] args)
	{
		BirthdaySong song = new BirthdaySong("You live in a zoo", "python", "undulate");
		String songString = song.getString();
		System.out.println(songString);
	}
}