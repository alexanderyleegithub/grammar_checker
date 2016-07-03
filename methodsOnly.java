//Version 1.5
//https://github.com/alexanderyleegithub
//Alexander Lee, Ammar Albaqshi

import java.awt.print.Printable;
import java.util.*;

public class methodsOnly {

	public void UpercaseObjPatern2(String sub) {
		boolean hasUppercase = !sub.equals(sub.toLowerCase());

		if (!hasUppercase)

		{
			System.out.print("");

		} else

		{
			System.out.println("The adjective word can not have a capitalization!");
		}
	}

	// for second object
	public void UpercaseObj2Patern2(String sub) {
		boolean hasUppercase = !sub.equals(sub.toLowerCase());

		if (!hasUppercase)

		{
			System.out.print("");

		} else

		{
			System.out.println("The 2nd adjective word can not have a capitalization!");
		}
	}

	// for verb
	public void UpercaseVerbPatern2(String sub) {
		boolean hasUppercase = !sub.equals(sub.toLowerCase());

		if (!hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The verb to be can not have a capitalization!");
		}
	}

	// for the second verb
	public void UpercaseVer2bPatern2(String sub2) {
		boolean hasUppercase = !sub2.equals(sub2.toLowerCase());

		if (!hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The 2nd verb to be can not have a capitalization!");
		}
	}

	// just Upercase

	// patern one
	public void UpercaseSubPatern2(String sub) {
		boolean hasUppercase = !sub.equals(sub.toLowerCase());

		if (hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The subject needs to have a capitalization!");
		}
	}

	// patern 1 for v

	public void v1(String sub) {
		boolean hasUppercase = sub.equals(sub.toLowerCase());

		if (hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The verb can not have a capitalization!");
		}
	}

	// second Upercase
	public void UpercaseSub2Patern2(String sub2) {
		boolean hasUppercase = sub2.equals(sub2.toLowerCase());

		if (hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The 2nd subject can not have a capitalization!");
		}
	}

	public void UpercaseA(String sub2) {
		boolean hasUppercase = sub2.equals(sub2.toLowerCase());

		if (hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The compound word can not have a capitalization!");
		}
	}

	public void UpercasVerbPattern1(String s) {
		boolean hasUppercase = s.equals(s.toLowerCase());
		if (hasUppercase)

		{
			System.out.print("");

		} else {
			System.out.println("The verb can not have a capitalization!");
		}

	}

	public void verbWithHe(String v) {
		if (v.equalsIgnoreCase("is")) {

			System.out.print("");
		} else {
			System.out.println("There is something wrong with the verb to be!! you need to have 'is'.");
		}
	}

	public void verbWithThey(String v) {
		if (v.equalsIgnoreCase("are") && !v.equalsIgnoreCase("he") && !v.equalsIgnoreCase("she")
				&& !v.equalsIgnoreCase("it") && !v.equalsIgnoreCase("they") && !v.equalsIgnoreCase("i")) {
			System.out.print("");
		} else {
			System.out.println("There is something wrong with the verb to be!! you need to have 'are'.");
		}

	}

	public void verbWithI(String v) {
		if (v.equalsIgnoreCase("am")) {
			System.out.print("");
		} else {
			System.out.println("There is something wrong with the verb to be!! you need to have 'am'.");

		}

	}

	public void objForTheyAndHeAndI(String o) {
		if (!o.equalsIgnoreCase("is") && !o.equalsIgnoreCase("are") && !o.equalsIgnoreCase("am")
				&& !o.equalsIgnoreCase("she") && !o.equalsIgnoreCase("it") && !o.equalsIgnoreCase("he")
				&& !o.equalsIgnoreCase("me") && !o.equalsIgnoreCase("were") && !o.equalsIgnoreCase("was")
				&& !o.equalsIgnoreCase("is.") && !o.equalsIgnoreCase("are.") && !o.equalsIgnoreCase("am.")
				&& !o.equalsIgnoreCase("she.") && !o.equalsIgnoreCase("it.") && !o.equalsIgnoreCase("he.")
				&& !o.equalsIgnoreCase("we.") && !o.equalsIgnoreCase("were.") && !o.equalsIgnoreCase("was.")
				&& !o.equalsIgnoreCase("you") && !o.equalsIgnoreCase("we") && !o.equalsIgnoreCase("i")) {
			System.out.print("");
		}

		else {
			System.out.println("You have writen an invaled adjective!");
		}
	}

	public void pat1(String s, String v) {
		methodsOnly ob = new methodsOnly();
		switch (s) {

		case "she":
		case "She":
		case "it":
		case "IT":
		case "he":
		case "He":

			ob.verbShe(v);
			ob.noPast2(v, v);
			break;
		case "they":
		case "They":
		case "you":
		case "You":
		case "we":
		case "WE":
			ob.verbThey(v);
			ob.noPast2(v, v);
			break;

		default:

			System.out.println(
					"The subject you entered is not acceptable.You can only use'HE,SHE,IT,THEY,YOU or WE as your subject!");

		}

	}

	public void pat2(String s, String v, String o) {

		methodsOnly ob = new methodsOnly();
		switch (s) {

		case "she":
		case "She":
		case "it":
		case "IT":
		case "he":
		case "He":
			ob.verbWithHe(v);

			ob.objForTheyAndHeAndI(o);
			ob.noPast2(v, o);
			break;
		case "they":
		case "They":
		case "you":
		case "You":
		case "we":
		case "WE":

			ob.verbWithThey(v);

			ob.objForTheyAndHeAndI(o);
			ob.noPast2(v, o);

			break;
		case "i":
		case "I":
			ob.verbWithI(v);

			ob.objForTheyAndHeAndI(o);
			ob.noPast2(v, o);
			break;
		case "is":
		case "Is":
			ob.subShe(v);
			ob.objForTheyAndHeAndI(o);

			break;
		case "are":
		case "Are":
			ob.subThey(v);
			ob.objForTheyAndHeAndI(o);

			break;
		case "am":
		case "Am":
			ob.subI(v);

			break;
		default:
			System.out.println(
					"The subject you entered is not acceptable. You can only use'HE,SHE,IT,THEY,YOU or WE as your subject!");
		}

	}

	public void verbShe(String v) {

		String[] notusableverbs1 = { "are", "am", "is", "kiss" ,"miss","assess","bless","caress","fuss","pass","toss"};

		if (((!Arrays.asList(notusableverbs1).contains(v)) ) && (v.endsWith("es") || v.endsWith("ss") || v.endsWith("s"))              ) {
			
			System.out.print(""); 
			
		} else {
			System.out.println("The verb does not match with the subject!");
		}

	}

	public void verbThey(String v) {

		String[] notusableverbs2 = { "is", "am" };

		if (!(Arrays.asList(notusableverbs2).contains(v) && !v.endsWith("es")) && !v.endsWith("ss")
				&& !v.endsWith("s")) {

			System.out.print("");

		} else {
			System.out.println("The verb does not match with the subject!");
		}

	}

	public void noPast2(String p, String p2) {

		String[] notusableverbs1 = { "wrote", "arisen", "arisen", "was", "were", "Was", "bore", "born", "beat",
				"beaten", "became", "become", "began", "bid", "broke", "broken", "brought", "built", "bought", "caught",
				"chose", "chosen", "came", "drank", "drove", "ate", "eaten", "fell", "fallen", "fed", "felt", "fought",
				"found", "fled", "flew", "got", "gave", "went", "grew", "hung", "had", "heard", "kept", "knew", "led",
				"leaned", "left", "lied", "lost", "made", "met", "mistook", "overcame", "paid", "pleaded", "rebuilt",
				"rode", "ridden", "rang", "rung", "ran", "said", "saw", "seen", "sought", "sold", "sent", "set",
				"sewed", "shaved", "sheared", "showed", "shut", "sang", "sung", "sat", "slept", "slid", "smelled",
				"spoke", "spelled ", "spent", "spun", "spit ", "spat", "split", "spoiled", "spread", "stood", "stole",
				"swore", "took", "taught", "told", "thought", "threw", "thrown", "understood", "underwrote", "wrote",
				"written", "woke", "wore", "worn", "wove", "wed", "wept", "wet", "won", "wound", "withdrew", "wrung" };

		if ((!p.endsWith("ed") && !p.endsWith("ing") && !Arrays.asList(notusableverbs1).contains(p))
				|| (!p2.endsWith("ed") && !p2.endsWith("ing") && !Arrays.asList(notusableverbs1).contains(p2))) {
			System.out.print("");
		} else {
			System.out.println(
					"This grammar might not be in accordance to the rules' simple past and future'or 'past, present and future contentious'! ");
		}
	}

	public void endComaV(String c) {
		if (c.endsWith(",") && !c.endsWith(" ")) {
			System.out.print("");
		} else {

			System.out.println("There is a missing comma after the first verb");
		}

	}

	public void endComaO(String c) {
		if (c.endsWith(",") && !c.endsWith(" ")) {
			System.out.print("");
		} else {

			System.out.println("There is a missing comma after the ajective");
		}

	}

	public void subThey(String s) {

		if (s.equalsIgnoreCase("they") || s.equalsIgnoreCase("you") || s.equalsIgnoreCase("we")) {
			System.out.print("");
		} else {
			System.out.println("There is a problem with the subject! ");
		}
	}

	public void subShe(String s) {

		if (s.equalsIgnoreCase("he") || s.equalsIgnoreCase("she") || s.equalsIgnoreCase("it")) {
			System.out.print("");
		} else {
			System.out.println("There is a problem with the subject! ");
		}
	}

	public void subI(String s) {

		if (s.equalsIgnoreCase("i")) {
			System.out.print("");
		} else {
			System.out.println("There is a problem with the subject! ");
		}
	}

	// this is for Q mark?
	public void endQ(String q) {
		if ((q.endsWith("?")) && (!q.endsWith("."))) {
			System.out.println("");

		}
		{
			System.out.println("you need to have a question mark! ");
		}
	}

	/// this is for period
	public void endWith(String o) {

		if ((o.endsWith(".") && !o.endsWith(" "))) {
			System.out.println("");
		}

		else {
			System.out.println("You need to have a Period at the end of the sentence!");
		}

	}

	public void endWithP2(String f, String s, String l) {

		String[] verb = { "is", "am", "are" };

		String[] sub = { "he", "she", "it", "they", "we", "you", "i" };

		if (((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && l.endsWith(".")) {
			System.out.println(" you can not have a perioud at the end of the sentence! you need a question mark'?' ");
		}

		else if (((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && !l.endsWith("?")) {
			System.out.println(" you need to have question mark!  ");
		} else if (((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && l.endsWith("?")) {
			System.out.print("");

		}

		else if (((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && l.endsWith("?")) {
			System.out.println(" you can not have a question mark at the end of the sentence! you need a perioud '.' ");
		}

		else if (((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && l.endsWith(".")) {
			System.out.println("");

		}

		else if (((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && !l.endsWith(".")) {
			System.out.println(" you need to have a perioud! ");

		} else {
			System.out.println(" The application cannot determine whether the sentence needs a question mark or a period!");
		}

	}

	public void endWithP22(String f, String s, String l, String f2, String s2, String l2) {

		String[] verb = { "is", "am", "are" };

		String[] sub = { "he", "she", "it", "they", "we", "you", "i" };

		if ((((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && l.endsWith("."))
				|| ((Arrays.asList(verb).contains(f2)) && (Arrays.asList(sub).contains(s2))) && l2.endsWith(".")) {
			System.out.println(" you can not have a perioud at the end of the sentence! you need a question mark'?' ");
		}

		else if ((((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && !l.endsWith("?"))
				|| (((Arrays.asList(verb).contains(f2)) && (Arrays.asList(sub).contains(s2))) && !l2.endsWith("?"))) {
			System.out.println(" you need to have question mark!  ");
		} else if ((((Arrays.asList(verb).contains(f)) && (Arrays.asList(sub).contains(s))) && l.endsWith("?"))
				|| (((Arrays.asList(verb).contains(f2)) && (Arrays.asList(sub).contains(s2))) && l2.endsWith("?"))) {
			System.out.print("");

		}

		else if ((((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && l.endsWith("?"))
				|| (((Arrays.asList(sub).contains(f2)) && (Arrays.asList(verb).contains(s2))) && l2.endsWith("?"))) {
			System.out.println(" you can not have a question mark at the end of the sentence! you need a perioud '.' ");
		}

		else if (((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && l.endsWith(".")) {
			System.out.println("");

		}

		else if (((Arrays.asList(sub).contains(f)) && (Arrays.asList(verb).contains(s))) && !l.endsWith(".")) {
			System.out.println(" you need to have a perioud! ");

		} else {
			System.out.print(""); //
		}

	}

}
