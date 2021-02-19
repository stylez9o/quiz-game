import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.*;
import javafx.scene.paint.RadialGradient;

public class QuizGame{

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

	public static void main(String[] args) {

		//TEstig threads
		Thread thread = new Thread(new QuizGameSecondThread());
		thread.start();
		
		// Main Variables: often-Use
//		User.lastQuestContainer;
		User.highscores = User.createHighScoreList();
		boolean antwort;
		String username = "Leer";
		int countDurchgänge = 0;// Anzahl der SPIEL-Durchgänge
		int punkte = 0;
		int intoSetPunkte = 0;
		int pnkte = 0;
		int diff = 0;

		// Blind Variables: without function
		User dummyUser = new User("dummy", 0);
		User user = new User("dummy", 0);
		int p = 0;

		// Hier die Möglichkeit, ältere Spielergebnisse trotzdem darzustellen:
		// z.B.
		/**
		 * ---------------------------------------------------------
		 * 
		 * 
		 * 
		 * 
		 * ---------------------------------------------------------
		 **/
		// Spiel-Schleife-beginnt-hier-----------------------------------------------
		for (int count = 0; count < 1; count++) {
			user.setPunkte(0);// Damit zu beginn des SPiels die Werte zurückgesetzt werden
			pnkte = 0;// Dasselbe wie Oben pnkte ist ein zwischensammler der Punkte
//	 Startsequenz: Name des Spiels
			System.out.println("\n[[[[[ DAS ]][[ FRAGE ]][[ SPIEL ]]]]]");
			InnerQuestions quest = new InnerQuestions(); // Fragenkatalog Objekt wird erzeugt
			long start = System.currentTimeMillis();// Zeitmessung des Spiels beginnt
			/**
			 * -----------------------------------------------------------------------------------------
			 **/
// Spieler erstellung! / Abfrage (if) ob der Spieler und der dummyUser(testNutzer) den selben Namen haben
			for (int z = 1; z < 2; z++) {
				if (user.getUsername().equals(dummyUser.getUsername())) {
					username = QuestInfo.askUsername();
					user = new User(username, 0);
				}

				/**
				 * ------------------------------------------------------------------------------------------
				 **/

				diff = QuestInfo.chooseDiff();

				if (diff == 4) {
					z--;
					username = QuestInfo.askUsername();
				} else {
					z++;
				}
			}

			diff = QuestInfo.printDiffAnsw(diff);
			String theme = QuestInfo.chooseTheme();
//			int i;
			if (diff == 1) {

// Nummern Set ----- für jede Schwierigkeit - neu erzeugt -----				
				TreeSet<Integer> setNmbrs = new TreeSet<Integer>();
				int f = 0;
				setNmbrs.add(17);
				setNmbrs.add(0);
				setNmbrs.add(20);
				setNmbrs.add(1);
				setNmbrs.add(18);
				setNmbrs.add(3);
				setNmbrs.add(15);
				setNmbrs.add(19);
				setNmbrs.add(2);
				setNmbrs.add(8);
				setNmbrs.add(4);
				setNmbrs.add(12);
				setNmbrs.add(9);
				setNmbrs.add(5);
				setNmbrs.add(16);
				setNmbrs.add(10);
				setNmbrs.add(13);
				setNmbrs.add(7);
				setNmbrs.add(14);
				setNmbrs.add(11);
				setNmbrs.add(6);

				switch (theme) {
				case "movie":

					for (int i = 1; i <= 10; i++) {

						int[] arrayZ = new int[11];
						Scanner mathScanner = new Scanner(System.in);
						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						
						int frageNr = f;// i oder x

						int fA = i;

						if (i != 10) { 

							antwort = quest.questXmovieX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							} // arrayZ[i] = 0;

						} if(i == 10) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");} 
					}
					break;
				case "tech":

					for (int i = 1; i <= 10; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x
						int fA = i;
						if (i != 10) {
							antwort = quest.questXtechnikX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 10) System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");
					}
					break;
				case "nature":
					for (int i = 1; i <= 20; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x
						int fA = i;
						if (i != 10) {
							antwort = quest.questXnaturX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 10) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}

					break;
				case "mix":
					break;
				}

//------------------------------------------------------------------------------------------------------				

			} else if (diff == 2) {

// Nummern Set ----- für jede Schwierigkeit - neu erzeugt -----				
				TreeSet<Integer> setNmbrs = new TreeSet<Integer>();
				int f = 0;
				setNmbrs.add(17);
				setNmbrs.add(0);
				setNmbrs.add(20);
				setNmbrs.add(1);
				setNmbrs.add(18);
				setNmbrs.add(3);
				setNmbrs.add(15);
				setNmbrs.add(19);
				setNmbrs.add(2);
				setNmbrs.add(8);
				setNmbrs.add(4);
				setNmbrs.add(12);
				setNmbrs.add(9);
				setNmbrs.add(5);
				setNmbrs.add(16);
				setNmbrs.add(10);
				setNmbrs.add(13);
				setNmbrs.add(7);
				setNmbrs.add(14);
				setNmbrs.add(11);
				setNmbrs.add(6);

				switch (theme) {
				case "movie":

					for (int i = 1; i <= 15; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 15) {
							antwort = quest.questXmovieX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 15) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "tech":

					for (int i = 1; i <= 15; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						//Das hier ist ein Kommentar
						
						
						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 15) {
							antwort = quest.questXtechnikX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 15) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "nature":
					for (int i = 1; i <= 15; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 15) {
							antwort = quest.questXnaturX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 15) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "mix":
					break;
				}

//------------------------------------------------------------------------------------------------------					

			} else if (diff == 3) {

// Nummern Set ----- für jede Schwierigkeit - neu erzeugt -----				
				TreeSet<Integer> setNmbrs = new TreeSet<Integer>();
				int f = 0;
				setNmbrs.add(17);
				setNmbrs.add(0);
				setNmbrs.add(20);
				setNmbrs.add(1);
				setNmbrs.add(18);
				setNmbrs.add(3);
				setNmbrs.add(15);
				setNmbrs.add(19);
				setNmbrs.add(2);
				setNmbrs.add(8);
				setNmbrs.add(4);
				setNmbrs.add(12);
				setNmbrs.add(9);
				setNmbrs.add(5);
				setNmbrs.add(16);
				setNmbrs.add(10);
				setNmbrs.add(13);
				setNmbrs.add(7);
				setNmbrs.add(14);
				setNmbrs.add(11);
				setNmbrs.add(6);

				switch (theme) {
				case "movie":

					for (int i = 1; i <= 20; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 20) {
							antwort = quest.questXmovieX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 20) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "tech":

					for (int i = 1; i <= 20; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 20) {
							antwort = quest.questXtechnikX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 20) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "nature":
					for (int i = 1; i <= 20; i++) {

						int x = 0 + (int) (Math.random() * 19);

						for (int z = 0; z < 19; z++) {
							if (x > 5) {
								f = setNmbrs.higher(1 | 10);
							} else {
								f = setNmbrs.floor(19);
							}
						}

						int frageNr = f;// i oder x (x) = wenn zufälige zahlen erscheinen sollen
						int fA = i;
						if (i != 20) {
							antwort = quest.questXnaturX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								setNmbrs.remove(f);

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								setNmbrs.remove(f);
								break;
							}
						}if(i == 20) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}

					break;
				case "mix":
					break;
				}
			}

			User userNeu = user;

			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;
			System.out.println(ANSI_YELLOW_BACKGROUND + "#### Deine Spielzeit: " + (timeElapsed / 1000)
					+ " Sekunden. ####" + ANSI_RESET);

			// Blanko Vorlage: Frage 1 oder 2...
//			int frageNr;
//			Scanner scanEingabeFrage = new Scanner(System.in);
//			frageNr = scanEingabeFrage.nextInt();
//			antwort = quest.questXmovieX_1(frageNr);
//			System.out.println(antwort);
//
//			if (antwort) {
//				user.setPunkte(3);
//			}

			countDurchgänge++;// Zählt einen durchgang am ENDE eines Spiels
			if (QuestInfo.playAgainQuestion(user.getUsername()) == false) {
				count++;
				break;
			} else {
				;
				count--;

			}
			if (dummyUser.getUsername().equals(user.getUsername())) {

			} else {
				System.out.println("################################" + "\n## H  I  G  H  S  C  O  R  E ###"
						+ "\n################################" + "\n#### N a m e ## P u n k t e ####"
						+ "\n********************************");

				user.setPunkte(-pnkte);
				for (Object userInListe : User.highscores) {
					System.out.println("   " + ((User) userInListe).getUsername() + "   "
							+ ((User) userInListe).getPunkte() + " Punkte");
				}
				System.out.println("################################");

			}
		} // Ende der Großen FOR-Schleife die Das Quiz umhüllt

	}
}
