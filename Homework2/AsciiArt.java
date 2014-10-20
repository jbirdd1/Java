// Homework 2
//Part A

public class AsciiArt {
	
	// Set the number of times you want bunny to print
	static int cnt = 2;
	
	public static void bunny() {
		String[] bunny = {
				"(\\___/)",
				"(='.'=)",
				"(\")_(\")"
			};
		
		for (int count = 1; count <= cnt; count++) {
			for (int i = 0; i < bunny.length; i++) {
				System.out.print(bunny[i] + " \n");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		bunny();
	}
}