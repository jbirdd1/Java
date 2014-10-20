// Lab 3

public class NormalBirthdaySong {
    static String bdayStr = "Happy Birthday to you";
	
	static String Sing() {
	    return bdayStr;
	}
	
	static String noun(String name) {
	    String thirdLine = "Happy Birthday, dear " + name;
		return thirdLine;
	}
	
    public static void main(String[] args) {     //signature
	    System.out.println(Sing());
		System.out.println(Sing());
		System.out.println(noun("Ada"));
		System.out.println(Sing());
	}
}