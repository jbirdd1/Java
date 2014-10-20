import java.text.DecimalFormat;
import java.util.*; 
import java.io.*; 
import java.awt.*;

public class Admissions {
	
	static Scanner console = new Scanner(System.in); // create new scanner
	static DecimalFormat dec = new DecimalFormat("#,##0.0"); // format to 1 decimal place

	public static void main(String[] args) {
		double[] GPAinfo;
		Prompt();
		double score1 = App1();
		GPAinfo = GPAprompt();
		double GPA1 = calcGPA(GPAinfo);
		double score2 = App2();
		GPAinfo = GPAprompt();
		double GPA2 = calcGPA(GPAinfo);
		overall(GPA1, GPA2, score1, score2);
	}
	
	public static void Prompt() {
		System.out.print("This program compares two applicants to\n" 
				+ "determine which one seems like the stronger\n"
				+ "applicant.  For each candidate I will need\n"
				+ "either SAT or ACT scores plus a weighted GPA.\n\n");
	}
	
	public static double App1() {
		System.out.print("Information for applicant #1:\n");
		System.out.print("    Do you have 1) SAT scores or 2) ACT scores? ");
		
		if (console.nextInt() == 1) {
			int[] SATinfo = SATprompt();
			double score1 = calcSAT(SATinfo);
			return score1;
		}
		else {
			int[] ACTinfo = ACTprompt();
			double score1 = calcACT(ACTinfo);
			return score1;
		}
	}
	
	public static double App2() {
		System.out.print("Information for applicant #2:\n");
		System.out.print("    Do you have 1) SAT scores or 2) ACT scores? ");
		
		if (console.nextInt() == 1) {
			int[] SATinfo = SATprompt();
			double score2 = calcSAT(SATinfo);
			return score2;
		}
		else {
			int[] ACTinfo = ACTprompt();
			double score2 = calcACT(ACTinfo);
			return score2;
		}
	}
	
	public static int[] SATprompt() {
		System.out.print("    SAT Math? ");
		int math = console.nextInt();
		System.out.print("    SAT Critical Reading? ");
		int read = console.nextInt();
		System.out.print("    SAT Writing? ");
		int write = console.nextInt();
		
		return new int[] {math, read, write};
	}
	
	public static int[] ACTprompt() {
		System.out.print("    ACT English? ");
		int english = console.nextInt();
		System.out.print("    ACT Math? ");
		int math = console.nextInt();
		System.out.print("    ACT Reading? ");
		int read = console.nextInt();
		System.out.print("    ACT Science? ");
		int science = console.nextInt();
		
		return new int[] {english, math, read, science};
	}
	
	public static double[] GPAprompt() {
		System.out.print("    Overall GPA? ");
		double GPA = console.nextDouble();
		System.out.print("    Max GPA? ");
		double maxGPA = console.nextDouble();
		System.out.print("    Transcript Multiplier? ");
		double mult = console.nextDouble();
		
		return new double[] {GPA, maxGPA, mult};
	}
	
	public static double calcSAT(int[] SATinfo) {
		double math = SATinfo[0];
		double read = SATinfo[1];
		double write = SATinfo[2];
		double score = 0;
		
		score = (2 * math + read + write)/(32);
		System.out.print("    Exam Score = " + score + "\n");
		return score;
	}

	public static double calcACT(int[] ACTinfo) {
		int english = ACTinfo[0];
		int math = ACTinfo[1];
		int read = ACTinfo[2];
		int science = ACTinfo[3];
		double score = 0;
	
		score = (english + 2 * math + read + science)/(1.8);
		System.out.print("    Exam Score = " + dec.format(score) + "\n");
		return score;
	}
	
	public static double calcGPA(double[] GPAinfo) {
		double GPA = GPAinfo[0];
		double maxGPA = GPAinfo[1];
		double mult = GPAinfo[2];
		double GPAscore = 0;
		
		GPAscore = (GPA/maxGPA) * 100 * mult;

		System.out.format("    GPA Score = %.1f\n\n", GPAscore);
		return GPAscore;
	}
	
	public static void overall(double GPA1, double GPA2, double score1, double score2) {
		double finalScore1 = GPA1 + score1;
		double finalScore2 = GPA2 + score2;
		
		System.out.format("First applicant overall score = %.1f\n", finalScore1);
		System.out.format("Second applicant overall score = %.1f\n", finalScore2);
		if (finalScore1 > finalScore2) {
			System.out.println("The first applicant seems to be better");
		}
		else {
			System.out.println("The second applicant seems to be better");
		}
	}
}

// http://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java