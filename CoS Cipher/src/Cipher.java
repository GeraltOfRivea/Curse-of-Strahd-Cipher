import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Cipher {

	public static void main(String[] args) {
		
		
		while (true) {
			
			//Ask what mode user wants to run
			Scanner modeInput = new Scanner(System.in);
			System.out.println("Would you like to encrypt, decrypt text or quit? (E/D/Q)");
			String mode = modeInput.nextLine();
			
			if (mode.equals("Q")) System.exit(0);
			
			//Ask user for input
			Scanner textInput = new Scanner(System.in);
			System.out.println("Please enter some text");
			String stringInput = textInput.nextLine();
			
			//Call Encrypter and copy output to clipboard
			if (mode.equals("E")) {
				System.out.println("Your encrypted string has been pasted to your clipboard!");
				String output = EncrypterString(stringInput);
				StringSelection stringSelection = new StringSelection(output);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
			}
			//Call Decrypter and copy output to clipboard
			else {
				System.out.println("Your encrypted string has been pasted to your clipboard!");
				String output = DecrypterString(stringInput);
				System.out.println(output);
				StringSelection stringSelection = new StringSelection(output);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
			}
		}
	}
	
	private static String DecrypterString(String input) {
		
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '-':
				output += "A";
				break;
			case '!':
				output += "B";
				break;
			case ',':
				output += "C";
				break;
			case ':':
				output += "D";
				break;
			case '3':
				output += "E";
				break;
			case ';':
				output += "F";
				break;
			case '(':
				output += "G";
				break;
			case ')':
				output += "H";
				break;
			case '8':
				output += "I";
				break;
			case '€':
				output += "J";
				break;
			case '&':
				output += "K";
				break;
			case '@':
				output += "L";
				break;
			case '[':
				output += "M";
				break;
			case '\'':
				output += "N";
				break;
			case '9':
				output += "O";
				break;
			case '0':
				output += "P";
				break;
			case '1':
				output += "Q";
				break;
			case '4':
				output += "R";
				break;
			case '/':
				output += "S";
				break;
			case '5':
				output += "T";
				break;
			case '7':
				output += "U";
				break;
			case '?':
				output += "V";
				break;
			case '2':
				output += "W";
				break;
			case '.':
				output += "X";
				break;
			case '6':
				output += "Y";
				break;
			case '"':
				output += "Z";
				break;
			case ' ':
				output += " ";
				break;
			}
		}
		return output;
	}
	
	private static String EncrypterString(String input) {
		
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			
			switch (input.charAt(i)) {
			
			case 'A': case 'a':
				output += "-";
				break;
			case 'B': case 'b':
				output += "!";
				break;
			case 'C': case 'c':
				output += ",";
				break;
			case 'D': case 'd':
				output += ":";
				break;
			case 'E': case 'e':
				output += "3";
				break;
			case 'F': case 'f':
				output += ";";
				break;
			case 'G': case 'g':
				output += "(";
				break;
			case 'H': case 'h':
				output += ")";
				break;
			case 'I': case 'i':
				output += "8";
				break;
			case 'J': case 'j':
				output += "€";
				break;
			case 'K': case 'k':
				output += "&";
				break;
			case 'L': case 'l':
				output += "@";
				break;
			case 'M': case 'm':
				output += "[";
				break;
			case 'N': case 'n':
				output += "'";
				break;
			case 'O': case 'o':
				output += "9";
				break;
			case 'P': case 'p':
				output += "0";
				break;
			case 'Q': case 'q':
				output += "1";
				break;
			case 'R': case 'r':
				output += "4";
				break;
			case 'S': case 's':
				output += "/";
				break;
			case 'T': case 't':
				output += "5";
				break;
			case 'U': case 'u':
				output += "7";
				break;
			case 'V': case 'v':
				output += "?";
				break;
			case 'W': case 'w':
				output += "2";
				break;
			case 'X': case 'x':
				output += ".";
				break;
			case 'Y': case 'y':
				output += "6";
				break;
			case 'Z': case 'z':
				output += "\"";
				break;
			case ' ':
				output += " ";
				break;
			}
		}
		return output;
	}

}
