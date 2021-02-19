
public interface IquestionBodys {
	//Attribute
	
	
	//xThemax z.B. XmovieX, XgeografieX, XallgemeinbildungX
	//_1-MITTEL _2-Mittel _3-Schwer
	//1 = Frage 1, 2 = Frage 2....
	
	//Beispiel: public boolean questXmovieX_3(2); ---  eine Frage vom Thema "Movie" auf SCHWER"_3" und es ist die 2e Frage "..(2)"
	
//########################THEMEN#############################

	
// ---MOVIE---
	// LEICHT------LEICHT-----LEICHT-----
	public boolean questXmovieX_1(int frageNr,int frageAbfolge);
	
	// MITTEL------MITTEL-----MITTEL-----
	public boolean questXmovieX_2(int frageNr, int frageAbfolge);
	
	// SCHWER------SCHWER-----SCHWER-----
	public boolean questXmovieX_3(int frageNr, int frageAbfolge);
	
	
// ---TECHNIK---	
	// LEICHT------LEICHT-----LEICHT-----
	public boolean questXtechnikX_1(int frageNr, int frageAbfolge);
	
	// MITTEL------MITTEL-----MITTEL-----
	public boolean questXtechnikX_2(int frageNr, int frageAbfolge);
	
	// SCHWER------SCHWER-----SCHWER-----
	public boolean questXtechnikX_3(int frageNr, int frageAbfolge);
	
	
// ---NATUR---
	// LEICHT------LEICHT-----LEICHT-----
	public boolean questXnaturX_1(int frageNr, int frageAbfolge);
	
	// MITTEL------MITTEL-----MITTEL-----
	public boolean questXnaturX_2(int frageNr, int frageAbfolge);
	
	// SCHWER------SCHWER-----SCHWER-----
	public boolean questXnaturX_3(int frageNr, int frageAbfolge);
		
	
	
	
	
}
