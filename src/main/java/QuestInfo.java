import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestInfo {
	//EIGENSCHAFTEN ATTRIBUTE
	
	//Farbkonstanten
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	
	
	//---------------------------------------------
	private String userName; 
	
	
		//GETTER - Username ausgeben lassen
		public String getUsername() {
				return userName;
		}

		//SETTER - Username setzen / Neu-Setzen
		public void setUsername(String username) {
				userName = username;
		}	

		
	//Hier wird beschrieben welche Ausgabe geprinted wird wenn zB eine Schwierigkeitsstufe gewählt wurde etc..
	
	//chooseDiff - fragt ab welche Schwierigkeitsstufe gewählt wird und gibt diese mittels RETURN als int-wert zurück.
	public static int chooseDiff() {
		int chosenDiff = 0;//Container der die eingegebene Zahl abspeichert und dann weitergibt
		Scanner scanDiff = new Scanner(System.in);
		System.out.println("### Bitte Wählen Sie den Schwierigkeit'slevel ###\n" + 
	"        (Eingabe über Tastatur)" + "\n[1]" + ANSI_GREEN + " Leicht" + ANSI_RESET  + "    [2]" + ANSI_YELLOW + " Mittel  " + ANSI_RESET + "  [3]" + ANSI_RED +" Schwer" + ANSI_RESET + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\n[4] Neuen Spieler erstellen." + ANSI_RESET);
		
		
		
		for(int i = 0; i<1; i++) {
			chosenDiff = scanDiff.nextInt();
			if(chosenDiff > 4 | (chosenDiff < 1 | chosenDiff == 0)) {
				System.err.println("Eingabe ungültig! Erneut versuchen!");
				i--;
				break;
			}else {
				return chosenDiff;
			}
			}
		return chosenDiff;
	}
	
			//gibt eine Passende Ausgabe zur gewählten Schwierigkeit aus (siehe chooseDiff())
	public static int printDiffAnsw(int cases){
		int chosenDiff = 0;
		for(int i = 0; i <1; i++) {
			switch (cases) {
				case 1:
					System.out.println("\n### Du hast dich für leichte Fragen entschieden. ###\n\n");return 1;

					
				case 2:
					System.out.println("\n### Du hast dich für mittelschwere Fragen entschieden. ###\n\n");return 2;
					
				
				case 3:
					System.out.println("\n### Du hast dich für schwere Fragen entschieden. ###\n\n");return 3;
					
				default:
					Scanner printDiffAnswScanner = new Scanner(System.in);
					i--;
					return printDiffAnswScanner.nextInt();
			}
		}
		return 0;
	}
	
	
	//Abfrage des Spielernamen mit Rückgabewert String
	
	public static String askUsername() {
		Scanner askUsername = new Scanner(System.in);
		System.out.println("Geben Sie einen Username ein:");
		String askUsername2 = askUsername.nextLine();
		System.out.println("\nDein Username ist: " + askUsername2 + "\n\nWillkommen " + ANSI_RED + askUsername2 + ANSI_RESET + ".\n");
		return askUsername2;
	}
	
	
	// Abfragen ob man noch einmal spielt
	public static boolean playAgainQuestion(String username){
		Scanner scanPaQ = new Scanner(System.in);
		for(int i = 0; i < 1; i++) {//Eine For-Schleife falls etwas unerwartetes eingegeben wird.
		System.out.println("\n\nMöchtest du nochmal spielen? (ja/nein)\nDein letztes Spielergebnis wird auch gespeichert.");
		String eingabePlayAgain = scanPaQ.nextLine();
			if(eingabePlayAgain.equalsIgnoreCase("ja") | eingabePlayAgain.equalsIgnoreCase("yes")){
			System.out.println("Sehr gut " + ANSI_RED + username + ANSI_RESET + ", weiter gehts! =)\n");
				return true;	
			}else if(eingabePlayAgain.equalsIgnoreCase("nein") | eingabePlayAgain.equalsIgnoreCase("no")) {
				System.out.println("Danke fürs mitspielen " + ANSI_RED + username + ANSI_RESET +  "! =)\n");
			}else {
				System.err.println("Eingabe ungültig! Erneut versuchen!\n");
				i--;
			}
		}
		return false;	
	}
	
	
	public static String chooseTheme(){
		Scanner chooseThemeScanner = new Scanner(System.in);
		for(int i = 0; i<1; i++) {
			System.out.println("######### WÄHLE EIN THEMENGEBIET #########\n# [1]" +ANSI_CYAN+ "FILM  " +ANSI_RESET+ "[2]" +ANSI_CYAN+ "TECHNIK  " +ANSI_RESET+ "[3]" +ANSI_CYAN+ "NATUR  " +ANSI_RESET+ "[4]" +ANSI_RED+ "MIX" +ANSI_RESET+ "  #");
			String themeEingabe = chooseThemeScanner.nextLine();
			
			if(themeEingabe.equals("1")) {
				System.out.println("\n\n\n  ### Fragen aus dem FILM-Bereich. ###");
				return "movie";}
			else if(themeEingabe.equals("2")) {
				System.out.println("\n\n\n  ####### Fragen über TECHNIK. #######");
				return "tech";}
			else if(themeEingabe.equals("3")) {
				System.out.println("\n\n\n  ###### Fragen über die NATUR. ######");
				return "nature";}
			else if(themeEingabe.equals("4")){
				System.out.println("\n\n\n  ###### Gemischte Fragen ######");
				return "mix";} else{i--;}
		}
		return "fehler";
		
		}
	}
	
	

