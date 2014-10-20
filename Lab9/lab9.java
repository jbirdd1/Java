import java.util.Arrays;
import java.util.List;

public class lab9 {

	static String[] animals = new String[]{
			"fly",		//0
			"spider",	//1
			"bird",		//2
			"cat",		//3
			"dog",		//4
			"human"		//5
	};
	
// In retrospect Haveing -Verse and Verses was not the most progressive choice
public static void main(String[] args){
		System.out.println(animals[2]);
		Verses();
}

// He wrote a comment
public static void Verses(){
FlyVerse();
SpiderVerse();
BirdVerse();
CatVerse();
DogVerse();
HumanVerse();
}

// He wrote a comment
public static void FlyVerse(){
MainLine("fly");
Print(Ending());
}

public static void SpiderVerse(){
MainLine("Spider");
Print("That wriggled and jiggled inside her");
countDown(1);
}

public static void BirdVerse(){
MainLine("bird");
Print("How absurd to swallow a bird");
countDown(2);
}

public static void CatVerse(){
MainLine("cat");
Print("Imagine that to swallow a cat");
countDown(3);
}

public static void DogVerse(){
MainLine("dog");
Print("what a hog to swallow a dog");
countDown(4);
}

public static void HumanVerse(){
MainLine("human");
Print("trouble is brewin', she swallowed a human");
countDown(5);
}

// He wrote a comment
public static void MainLine(String animal){
Print("There was an old lady who swallowed a " + animal + ".");
}

// He wrote a comment
public static String Ending(){
return("I don't know why she swallowed the fly,\nPerhaps she'll die.\n");
}

public static void countDown(int index){
	for(int i = index; i > 0; i--){
		Catch(animals[i],animals[i-1]);
	}
}

// He wrote a comment
public static void Catch(String a, String b){
Print("She swallowed the " + a + " to catch the " + b + ".");
if (b.equals("fly")){
Print(Ending());
}
}

public static void Print (String P){
System.out.println(P);
}
}