import java.util.ArrayList;
import java.util.Scanner;

public class InnerQuestions extends Questions implements IquestionBodys {

	// Hier werden die Fragen sowie die Abläufe dazu gesteuert z.B.
	// Frageschwierigkeit, Welche frage, Welche Antwortmöglichkeiten, Punkte,
	// Fehlschlagoptionen.
//hgjkjhgfcdfvghjk
	// Farbkonstanten
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
	
	

//-----MOVIE FRAGEN---- 1-Leicht 2-Mittel 3-Schwer

	@Override
	public boolean questXmovieX_1(int frageNr, int frageAbfolge) {

		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov1QN>10QN<0 >>>>>>");
		} else {
			Scanner movieScL = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(movieQuestionNrLeicht(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(movieQuestionAOLeicht(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = movieQuestionAnswerLeicht(frageNr);
				String eingabeScanner = movieScL.nextLine();
				
				
				
				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov1QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

	@Override
	public boolean questXmovieX_2(int frageNr, int frageAbfolge) {

		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov2QN>10QN<0 >>>>>>");
		} else {
			Scanner movieScM = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(movieQuestionNrMittel(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(movieQuestionAOMittel(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = movieQuestionAnswerMittel(frageNr);
				String eingabeScanner = movieScM.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibt--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov2QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

	@Override
	public boolean questXmovieX_3(int frageNr, int frageAbfolge) {

		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov3QN>10QN<0 >>>>>>");
		} else {
			Scanner movieScS = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(movieQuestionNrSchwer(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(movieQuestionAOSchwer(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = movieQuestionAnswerSchwer(frageNr);
				String eingabeScanner = movieScS.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code mov3QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

//-----TECHNIK FRAGEN---- 1-Leicht 2-Mittel 3-Schwer------------------------------------------------
	@Override
	public boolean questXtechnikX_1(int frageNr, int frageAbfolge) {
		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech1QN>10QN<0 >>>>>>");
		} else {
			Scanner techScL = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(techQuestionNrLeicht(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(techQuestionAOLeicht(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = techQuestionAnswerLeicht(frageNr);
				String eingabeScanner = techScL.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech1QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;

	}

	@Override
	public boolean questXtechnikX_2(int frageNr, int frageAbfolge) {

		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech2QN>10QN<0 >>>>>>");
		} else {
			Scanner techScM = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(techQuestionNrMittel(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(techQuestionAOMittel(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = techQuestionAnswerMittel(frageNr);
				String eingabeScanner = techScM.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech2QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;

	}

	@Override
	public boolean questXtechnikX_3(int frageNr, int frageAbfolge) {
		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech3QN>10QN<0 >>>>>>");
		} else {
			Scanner techScS = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(techQuestionNrSchwer(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(techQuestionAOSchwer(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = techQuestionAnswerSchwer(frageNr);
				String eingabeScanner = techScS.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code tech3QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;

	}
//-----NATUR FRAGEN- 1-Leicht 2-Mittel 3-Schwer------------------------------------------------

	@Override
	public boolean questXnaturX_1(int frageNr, int frageAbfolge) {
		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat1QN>10QN<0 >>>>>>");
		} else {
			Scanner natureScL = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(natureQuestionNrMittel(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(natureQuestionAOMittel(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = natureQuestionAnswerMittel(frageNr);
				String eingabeScanner = natureScL.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat1QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

	@Override
	public boolean questXnaturX_2(int frageNr, int frageAbfolge) {
		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat2QN>10QN<0 >>>>>>");
		} else {
			Scanner natureScM = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(natureQuestionNrMittel(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(natureQuestionAOMittel(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = natureQuestionAnswerMittel(frageNr);
				String eingabeScanner = natureScM.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat2QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

	@Override
	public boolean questXnaturX_3(int frageNr, int frageAbfolge) {
		if (frageNr > 19 | frageNr < 0) {
			System.err.println(
					"Schwerer Frageparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat3QN>10QN<0 >>>>>>");
		} else {
			
			Scanner natureScS = new Scanner(System.in); // Scanner zum abfragen der Antwort
			System.out.println("\nFRAGE " + (frageAbfolge));// Index Ausgabe, welche Frage?
			System.out.println(natureQuestionNrSchwer(frageNr)); // Ausgabe methode der Frage #1
			System.out.println(natureQuestionAOSchwer(frageNr)); // Antwortmöglichkeiten #2

			for (int count = 0; count < 1; count++) {
				String richtigeAntwort = natureQuestionAnswerSchwer(frageNr);
				String eingabeScanner = natureScS.nextLine();

				// if abfrage ob der User eine unerlaubte zahl kleiner als 0 oder größer als 4
				// eingibte--- sollte dies zutreffen wird der loop wiederholt
				if (eingabeScanner.equals("4") | eingabeScanner.equals("3") | eingabeScanner.equals("2") | eingabeScanner.equals("1")) {
					if (richtigeAntwort.equals(eingabeScanner)) {
						System.out.println(ANSI_GREEN + ">> Richtig! <<" + ANSI_RESET);
						return true;
					} else {
						System.out.println(ANSI_RED_BACKGROUND + "\nFalsch! - Die richtige Antwort wäre ["
								+ richtigeAntwort + "] gewesen\n\n" + ANSI_RESET);

					}
				} else {// if Abfrage ob die richtige Antwort eingegeben wurde!
					count--;
					System.err.println(
							"Schwerer Eingabeparameter Fehler, bitte\nwenden Sie sich an den Entwickler.\n<<<<<< Code nat3QiP>4QiP<1 >>>>>>");
					System.out.println("Bitte erneut eingeben\n");
				
					
				}
			}
		}
		return false;
	}

//	Scanner scan1111 = new Scanner(System.in);
//	for (int j111 = 0; j111 < 1; ++j111) {
//		System.out.println(ANSI_BLUE_BACKGROUND + "4. Frage:" + ANSI_RESET
//				+ " Welches Kfz-Kennzeichen Kürzel hat Monaco? \n [1]-MC   [2]-MN   [3]-MOC");
//		int eingabe1111 = scan1111.nextInt();
//
//		switch (eingabe1111) {
//		case 1:
//			System.out
//					.println(ANSI_GREEN + "Richtig!" + ANSI_RESET + "  + 2 Punkte");
//			punkte += 2;
//			
//			break;
//		case 2:
//			System.out.println(ANSI_RED + "Falsch!" + ANSI_RESET
//					+ " [1] wäre die Richtige Antwort gewesen.\n ");
//			System.out.println(" \n \n \n \n \n ");
//			System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "GAME OVER!"
//					+ ANSI_RESET + "\n " + "\n " + "\n[Letzter Punktestand]\n "
//					+ ANSI_BLUE + eingabeName + ANSI_RESET + " " + ANSI_CYAN
//					+ punkte + " Punkte" + ANSI_RESET);
//			break;
//		case 3:
//			System.out.println(ANSI_RED + "Falsch!" + ANSI_RESET
//					+ " [1] wäre die Richtige Antwort gewesen.\n ");
//			System.out.println(" \n \n \n \n \n ");
//			System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "GAME OVER!"
//					+ ANSI_RESET + "\n " + "\n[Letzter Punktestand]\n " + ANSI_BLUE
//					+ eingabeName + ANSI_RESET + " " + ANSI_CYAN + punkte
//					+ " Punkte" + ANSI_RESET);
//			break;
//		default:
//			System.out.println(
//					ANSI_RED + "Deine Eingabe war ungültig! Versuche es erneut!"
//							+ ANSI_RESET);
//			j111--;
//			break;
//		}
//	}
}
