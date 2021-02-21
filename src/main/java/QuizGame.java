import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.*;
import javafx.scene.paint.RadialGradient;

public class QuizGame{
static int f = 1;
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
				
				
//Abfrage der Schwierigkeitsstufe
				diff = QuestInfo.chooseDiff(); 

				
//Erneutes Abfragen der Schwierigkeitsstufe wenn während des Spiels ein neuer Spieler erstellt werden soll				
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

				switch (theme) {
				case "movie":
					

					
					//Beginn: Film Fragen Schleife
					for (int i = 1; i <= 10; i++) {
						
						int x = 0;						
						
						genNumber genNumber = new genNumber();
						if(countDurchgänge<1) {
							x = genNumber.random(9,i); 
						}else {
							genNumber genNumber2 = new genNumber();
							x = genNumber2.random(9,i); 
						}
						
						int frageNr = x;

						int fA = i;

						if (i != 9) { 

							antwort = quest.questXmovieX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								
								break;
							} // arrayZ[i] = 0;

						} if(i == 10) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< "); break;}
		
					} 

					break;
				case "tech":

					for (int i = 1; i <= 10; i++) {
					
					     
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(9,i); 
						int fA = i;
						if (i != 9) {
							antwort = quest.questXtechnikX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
						
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								
								break;
							} if(i == 10) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< "); break;}
						
					
						}
					}

						break;
				case "nature":
						
					
					for (int i = 1; i <= 10; i++) {
						

					     
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(9,i); 
						int fA = i;
						if (i != 9) {
							antwort = quest.questXnaturX_1(frageNr, fA);

							if (antwort) {
								pnkte += 3;
								intoSetPunkte = 3;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
							
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
						
								break;
							}
						}if(i == 10) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");break;}
					
					}
					break;
				case "mix":
					break;
				}

//------------------------------------------------------------------------------------------------------				

			} else if (diff == 2) {

				switch (theme) {
				case "movie":

					for (int i = 1; i <= 15; i++) {
					

					    genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(14,i); 
						int fA = i;
						if (i != 14) {
							antwort = quest.questXmovieX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
							
								break;
							}
						}if(i == 15) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");break;}
					
					}
					break;
				case "tech":
					
					for (int i = 1; i <= 15; i++) {
						

					     
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(14,i); 
						int fA = i;
						if (i != 14) {
							antwort = quest.questXtechnikX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
								
								break;
							}
						}if(i == 15) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					
				}
					break;
				case "nature":
					
					for (int i = 1; i <= 15; i++) {
					
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(14,i); 
						int fA = i;
						if (i != 14) {							
							antwort = quest.questXnaturX_2(frageNr, fA);

							if (antwort) {
								pnkte += 5;
								intoSetPunkte = 5;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
							

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
							
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


				switch (theme) {
				
				case "movie":
					
				
					for (int i = 1; i <= 20; i++) {
					
					     
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(19,i); 
						int fA = i;
						if (i != 19) {
							antwort = quest.questXmovieX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
							
							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
							
								break;
							}
						}if(i == 20) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "tech":
					
				
					for (int i = 1; i <= 20; i++) {
				

					     
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(19,i); 
						int fA = i;
						if (i != 19) {
							antwort = quest.questXtechnikX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
								

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));

								break;
							}
						}if(i == 20) {System.out.println(">>>Du hast alle " + i + " Fragen dieser Schwierigkeitsstufe richtig beantwortet!<<< ");}
					}
					break;
				case "nature":
					
				
					for (int i = 1; i <= 20; i++) {
					
						genNumber genNumber = new genNumber();					     
						int frageNr = genNumber.random(19,i); 
						int fA = i;
						if (i != 19) {
							antwort = quest.questXnaturX_3(frageNr, fA);

							if (antwort) {
								pnkte += 7;
								intoSetPunkte = 7;
								user.setPunkte(intoSetPunkte);
								punkte = user.getPunkte();
							

							} else {
								System.out.println("Deine letzte Punktzahl: " + user.getPunkte());
								User.highscores.add(User.createUser(username, user.getPunkte()));
							
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
