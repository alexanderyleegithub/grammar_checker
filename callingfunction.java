import java.util.Scanner;
import java.util.*;
import java.io.*;

//This is a beautiful design that checks for 2 types of sentence patterns:
//1st = Subject + Verb
//2nd = Subject + Verb + Adjective

//Also can check for any combination between the 2 patterns with an "and/but/or"

//ALL we have to do is add "bullets" = "methods"/rules under any pattern

public class callingfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare loop int for loop purposes
		int loop = 0;

		System.out.println("Please type quit to exit the application at any time");
		System.out.println("Please enter a sentence to be checked: ");
		loopuntilquit: // label for break
		while (loop < 1) { // start the loop for the entire application

			try {

				// user input and placed into a string named userstring
				Scanner userinput = new Scanner(System.in);

				String userstring = userinput.nextLine();
				// user input words that are separated by a space will be put
				// into array for easier handling
				String[] userwords = userstring.split(" ");

				char ch;
				forloopuntilquit: for (int i = 0; i < userstring.length(); i++) {
					ch = userstring.charAt(i);

					if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
							|| ch == '8' || ch == '9' || ch == '0')

					{
						System.out.println("Digits caught in the input, please restart program");

						System.exit(0);

					} else {
						continue;
					}

				}

				if (userstring.equalsIgnoreCase("quit")) {
					System.out.println("Program is exiting...");
					userinput.close(); // closes the scanner
					break loopuntilquit;

				}

				if (userwords.length == 2) {

					String twowords1 = userwords[0];
					String twowords2 = userwords[1];

					methodsOnly obfor2 = new methodsOnly();

					obfor2.UpercaseSubPatern2(twowords1);
					obfor2.UpercasVerbPattern1(twowords2);

					obfor2.pat1(twowords1, twowords2);
					obfor2.endWith(twowords2);

				}

				else if (userwords.length == 3) {

					String threewords1 = userwords[0];
					String threewords2 = userwords[1];
					String threewords3 = userwords[2];

					methodsOnly obfor3 = new methodsOnly();

					obfor3.UpercaseSubPatern2(threewords1); // capitalization
					obfor3.UpercaseVerbPatern2(threewords2); // capitalization
					obfor3.UpercaseObjPatern2(threewords3); // capitalization

					obfor3.pat2(threewords1, threewords2, threewords3);

					obfor3.endWithP2(threewords1, threewords2, threewords3);

				}

				// for compound sentences 5 - 7 words long
				else {

					String[] compoundwords = userwords.clone();

					methodsOnly obfor3 = new methodsOnly();

					// 2 words + 2 words
					if (((compoundwords[2].equalsIgnoreCase("and")) || (compoundwords[2].equalsIgnoreCase("or"))
							|| (compoundwords[2].equalsIgnoreCase("but")) || (compoundwords[3].equalsIgnoreCase("nor"))
							|| (compoundwords[3].equalsIgnoreCase("yet")) || (compoundwords[3].equalsIgnoreCase("so")))
							&& (compoundwords.length == 5)) {

						obfor3.UpercaseSubPatern2(compoundwords[0]);
						obfor3.UpercaseVerbPatern2(compoundwords[1]);

						obfor3.UpercaseA(compoundwords[2]);

						obfor3.pat1(compoundwords[0], compoundwords[1]);

						obfor3.endComaV(compoundwords[1]);

						obfor3.UpercaseSub2Patern2(compoundwords[3]);
						obfor3.UpercaseVer2bPatern2(compoundwords[4]);

						obfor3.pat1(compoundwords[3], compoundwords[4]);
						obfor3.endWith(compoundwords[4]);

					}

					// 2 words + 3 words
					else if (((compoundwords[2].equalsIgnoreCase("and")) || (compoundwords[2].equalsIgnoreCase("or"))
							|| (compoundwords[2].equalsIgnoreCase("but")) || (compoundwords[3].equalsIgnoreCase("nor"))
							|| (compoundwords[3].equalsIgnoreCase("yet")) || (compoundwords[3].equalsIgnoreCase("so")))
							&& (compoundwords.length == 6)) {

						obfor3.UpercaseSubPatern2(compoundwords[0]);

						obfor3.UpercasVerbPattern1(compoundwords[1]);

						obfor3.pat1(compoundwords[0], compoundwords[1]);
						obfor3.UpercaseA(compoundwords[2]);
						obfor3.endComaV(compoundwords[1]);

						obfor3.UpercaseSub2Patern2(compoundwords[3]);
						obfor3.UpercaseVer2bPatern2(compoundwords[4]);
						obfor3.UpercaseObj2Patern2(compoundwords[5]);

						obfor3.endWithP2(compoundwords[3], compoundwords[4], compoundwords[5]);

						obfor3.pat2(compoundwords[3], compoundwords[4], compoundwords[5]);

					}

					// 3 words + 2 words
					else if (((compoundwords[3].equalsIgnoreCase("because"))
							|| (compoundwords[3].equalsIgnoreCase("and")) || (compoundwords[3].equalsIgnoreCase("or"))
							|| (compoundwords[3].equalsIgnoreCase("but")) || (compoundwords[3].equalsIgnoreCase("nor"))
							|| (compoundwords[3].equalsIgnoreCase("yet")) || (compoundwords[3].equalsIgnoreCase("so")))
							&& (compoundwords.length == 6)) {

						obfor3.UpercaseSubPatern2(compoundwords[0]); // capitalization
						obfor3.UpercaseVerbPatern2(compoundwords[1]); // capitalization
						obfor3.UpercaseObjPatern2(compoundwords[2]);

						obfor3.UpercaseA(compoundwords[3]);
						obfor3.pat2(compoundwords[0], compoundwords[1], compoundwords[2]);

						obfor3.endWithP2(compoundwords[0], compoundwords[1], compoundwords[5]);

						obfor3.endComaV(compoundwords[2]); // ends with comma

						obfor3.UpercaseSub2Patern2(compoundwords[4]);
						obfor3.UpercaseVer2bPatern2(compoundwords[5]);

						obfor3.pat1(compoundwords[4], compoundwords[5]);

					}

					// 3 words + 3 words
					else if (((compoundwords[3].equalsIgnoreCase("and")) || (compoundwords[3].equalsIgnoreCase("or"))
							|| (compoundwords[3].equalsIgnoreCase("but")) || (compoundwords[3].equalsIgnoreCase("nor"))
							|| (compoundwords[3].equalsIgnoreCase("yet")) || (compoundwords[3].equalsIgnoreCase("so")))
							&& (compoundwords.length == 7)) {

						obfor3.UpercaseSubPatern2(compoundwords[0]);
						obfor3.UpercaseVerbPatern2(compoundwords[1]);
						obfor3.UpercaseObjPatern2(compoundwords[2]);

						obfor3.pat2(compoundwords[0], compoundwords[1], compoundwords[2]);
						obfor3.UpercaseA(compoundwords[3]);
						obfor3.endComaO(compoundwords[2]);

						obfor3.UpercaseSub2Patern2(compoundwords[4]);
						obfor3.UpercaseVer2bPatern2(compoundwords[5]);
						obfor3.UpercaseObj2Patern2(compoundwords[6]);

						obfor3.pat2(compoundwords[4], compoundwords[5], compoundwords[6]);

						obfor3.endWithP22(compoundwords[0], compoundwords[1], compoundwords[2], compoundwords[4],
								compoundwords[5], compoundwords[6]);

					}

				} // closing the entire else if of compound sentences

				System.out.println("Please enter another sentence to be checked: ");
			} // closing the try
			catch (Exception e) {

				System.out.println("Please try again: ");
			}

		} // closing the loop

	}

}
