import java.awt.List;
import java.util.*;

public class User {

// EIGENSCHAFTEN
	//Liste in der die Highscores mit der Laufzeit gespeichert werden.
	static ArrayList<Object> highscores;
	private String userName; 
	
	//GETTER - Username ausgeben lassen
	public String getUsername() {
			return userName;
	}

	//SETTER - Username setzen / Neu-Setzen
	public void setUsername(String username) {
			this.userName = username;
	}	
	
		/**------Punkterechner------
		 * ---Leicht---+3--Punkte---
		 * ---Mittel---+5--Punkte---
		 * ---Schwer---+7--Punkte---
		 * -------------------------
		 */
	
	private int punkteHs;
int punktereferenz = punkteHs;
	


			//GETTER - Punkte auslesen
			public int getPunkte() {
					return punkteHs;
			}
			//SETTER - Punkte setzen / Neu-Setzen
			public void setPunkte(int punkte) {
				this.punkteHs += punkte;
			}	
	
			
	//--------------------------Konstruktor------------------------------------
	public User(String spielername, int punkte) {
		setUsername(spielername);
		setPunkte(punkte);
		
	}
	
	public static User createUser(String userName, int punkteHs) {
		return new User(userName, punkteHs);
	}
	
	public static ArrayList<Object> createHighScoreList() {
		return new ArrayList<Object>();
		
	}


	
}
