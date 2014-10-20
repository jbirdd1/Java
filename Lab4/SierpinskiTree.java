
public class SierpinskiTree {

static int base = 7;
	
	// Print n triangles, of base length BASE, spaced d*2 apart
	// initially indented by l spaces.
	static String triangles(int n, int d, int l) {
		String result = "";
		
		for (int i = 1; i <= base; i += 2) {
			
			for (int k = 1; k <= l; k++) {
				result += " ";
			}
			
			for (int k = 0; k < n; k++) {
				
				for (int j = 0; j <= d; j++) {
					result += " ";
				}
				
				for (int j = 0; j < (base - i)/2; j++) {
					result += " ";
				}
				
				for (int j = 0; j < (i); j++) {
					result += "*";
				}
				
				for (int j = 0; j < (base - i)/2; j++) {
					result += " ";
				}
				
				for (int j = 0; j < d; j++) {
					result += " ";
				}
			}
			result += "\n";
		}
		return result;
	}
	
	static String trunks(int w, int l) {
		String result = "";
		for (int i = 0; i < w; i++) {
			for (int k = 1; k <= l; k++) {
				result += " ";
			}
			
			for (int j = 0; j < w; j++) {
				result += "*";
			}
			result += "\n";
		}
		return result;
	}
	
	static String baseString() {
		String baseString = "";
		String trunkString = "";
		baseString += triangles(1,0,12);
		baseString += triangles(2,0,8);
		baseString += triangles(2,4,0);
		baseString += triangles(4,0,0);
		trunkString += trunks(8,12);
		return baseString + trunkString;
	}
	
	public static void main(String[] args) {
		System.out.println(baseString());
	}
}