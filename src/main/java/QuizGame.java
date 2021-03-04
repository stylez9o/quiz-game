import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.IntStream;

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

		
		// Main Variables: often-Use
//		User.lastQuestContainer;
		User.highscores = User.createHighScoreList();
		boolean antwort;
		String username = "Leer";

		int countLoop = 0; //Spieldurchläufe
		int punkte = 0;
		int intoSetPunkte = 0;
		int pnkte = 0;
		String diff = "0";
		

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
				if ("4".equals(diff)) {
					z--;
					username = QuestInfo.askUsername();
				} else {
					z++;
				}
			}

			diff = QuestInfo.printDiffAnsw(diff);
			String theme = QuestInfo.chooseTheme();
//			int i;
			
			int size = 10;
			int size2 = 15;
			int size3 = 20;
			if ("1".equals(diff)) {

				switch (theme) {
				case "movie":
					
					
					
					
					 ArrayList<Integer> lis = new ArrayList<Integer>(size);
				     ArrayList<Integer> list = new ArrayList<Integer>(size);
				     
					  for(int i = 1; i <= size; i++)
						  
					  {list.add(i);
					  
					  }
					  
				     Random rand = new Random();
				     
				     
				     for(int i = 0; i <= list.size(); i++) {
				    	 
				      int index = rand.nextInt(list.size());
				      lis.add(i, list.remove(index));
				      
				     }

				     
				     
				     
					//Beginn: Film Fragen Schleife
	
					for (int i = 1; i <= 10; i++) {

						int frageNr = lis.get(i-1);

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

					
					 ArrayList<Integer> listech1 = new ArrayList<Integer>(size);
				     ArrayList<Integer> listtech1 = new ArrayList<Integer>(size);
					  for(int i = 1; i <= size; i++)
					  {listtech1.add(i);}
				     Random rand2 = new Random();
				     for(int i = 0; i <= listtech1.size(); i++) {
				      int index = rand2.nextInt(listtech1.size());
				      listech1.add(i, listtech1.remove(index));}
					
					for (int i = 1; i <= 10; i++) {
							     
						int frageNr = listech1.get(i-1);
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
						
					 ArrayList<Integer> lisnature1 = new ArrayList<Integer>(size);
				     ArrayList<Integer> listnature1 = new ArrayList<Integer>(size);
					  for(int i = 1; i <= size; i++)
					  {listnature1.add(i);}
				     Random rand3 = new Random();
				     for(int i = 0; i <= listnature1.size(); i++) {
				      int index = rand3.nextInt(listnature1.size());
				      lisnature1.add(i, listnature1.remove(index));}
					
					for (int i = 1; i <= 10; i++) {
						

					     
									     
						int frageNr = lisnature1.get(i-1);
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

			} else if ("2".equals(diff)) {

				switch (theme) {
				case "movie":
					
					 ArrayList<Integer> lis2 = new ArrayList<Integer>(size2);
				     ArrayList<Integer> list2 = new ArrayList<Integer>(size2);
					  for(int i = 1; i <= size2; i++)
					  {list2.add(i);}
				     Random rand3 = new Random();
				     for(int i = 0; i <= list2.size(); i++) {
				      int index = rand3.nextInt(list2.size());
				      lis2.add(i, list2.remove(index));}
					
					for (int i = 1; i <= 15; i++) {
						

					     
									     
						int frageNr = lis2.get(i-1);
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
					
					 ArrayList<Integer> listech2 = new ArrayList<Integer>(size2);
				     ArrayList<Integer> listtech2 = new ArrayList<Integer>(size2);
					  for(int i = 1; i <= size2; i++)
					  {listtech2.add(i);}
				     Random rand4 = new Random();
				     for(int i = 0; i <= listtech2.size(); i++) {
				      int index = rand4.nextInt(listtech2.size());
				      listech2.add(i, listtech2.remove(index));}
					
					for (int i = 1; i <= 15; i++) {
						

					     
									     
						int frageNr = listech2.get(i-1);
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
					
					 ArrayList<Integer> lisnature2 = new ArrayList<Integer>(size2);
				     ArrayList<Integer> listnature2 = new ArrayList<Integer>(size2);
					  for(int i = 1; i <= size2; i++)
					  {listnature2.add(i);}
				     Random rand5 = new Random();
				     for(int i = 0; i <= listnature2.size(); i++) {
				      int index = rand5.nextInt(listnature2.size());
				      lisnature2.add(i, listnature2.remove(index));}
					
					for (int i = 1; i <= 15; i++) {
						

					     
									     
						int frageNr = lisnature2.get(i-1); 
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

			} else if ("3".equals(diff)) {


				switch (theme) {
				
				case "movie":
					
					 ArrayList<Integer> lis3 = new ArrayList<Integer>(size3);
				     ArrayList<Integer> list3 = new ArrayList<Integer>(size3);
					  for(int i = 1; i <= size3; i++)
					  {list3.add(i);}
				     Random rand6 = new Random();
				     for(int i = 0; i <= list3.size(); i++) {
				      int index = rand6.nextInt(list3.size());
				      lis3.add(i, list3.remove(index));}
					
					for (int i = 1; i <= 20; i++) {
						

					     
									     
						int frageNr = lis3.get(i-1);
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
					
					 ArrayList<Integer> listech3 = new ArrayList<Integer>(size3);
				     ArrayList<Integer> listtech3 = new ArrayList<Integer>(size3);
					  for(int i = 1; i <= size3; i++)
					  {listtech3.add(i);}
				     Random rand7 = new Random();
				     for(int i = 0; i <= listtech3.size(); i++) {
				      int index = rand7.nextInt(listtech3.size());
				      listech3.add(i, listtech3.remove(index));}
					
					for (int i = 1; i <= 20; i++) {
						

					     
									     
						int frageNr = listech3.get(i-1);
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
					
					 ArrayList<Integer> lisnature3 = new ArrayList<Integer>(size3);
				     ArrayList<Integer> listnature3 = new ArrayList<Integer>(size3);
					  for(int i = 1; i <= size3; i++)
					  {listnature3.add(i);}
				     Random rand8 = new Random();
				     for(int i = 0; i <= listnature3.size(); i++) {
				      int index = rand8.nextInt(listnature3.size());
				      lisnature3.add(i, listnature3.remove(index));}
					
					for (int i = 1; i <= 10; i++) {
						

					     
									     
						int frageNr = lisnature3.get(i-1); 
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
				
				if(user.getPunkte() != 0){
					
				User.highscores.add(countLoop,user);
				}
				
			}

			

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

			countLoop++;
			if (QuestInfo.playAgainQuestion(user.getUsername()) == false) {
				count++;
				break;
			} else {
				;
				count--;

			}
			if (dummyUser.getUsername().equals(user.getUsername())) {

			} else {
				System.out.println("################################" + 
								   "\n## H  I  G  H  S  C  O  R  E ###"
								 + "\n################################"
								 + "\n#### N a m e ## P u n k t e ####"
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
