public class Questions {
// ATTRIBUTE / EIGENSCHAFTEN
	//Punktevariablen
	
	
	
	// SAMMLUNG im ARRAY Fragen  thema + Q(Question) + m(Mittel)
	//l = leicht, m=mittel, s=schwer
	
///--------------MOVIE---------------	
	
	public static String movieQuestionNrLeicht(int frageNr) {
		String[] movieQl = {"Wer spielt die Sch\u00FClerin Chantal im\ndeutschen Film *Fack ju G\u00f6the* (2013) ?\n",															//0
							"Wer spielt Iron Man im gleichnamigen Film aus dem Jahr 2008 ?\n",																			//1
							"Wer spielt Nick Fury, den Chef der Spionage-Agentur\nS.H.I.E.L.D., im Film *The Avengers*?\n",												//2
							"Wie hei\u00dfen die Hauptfiguren in Titanic (1997) mit Vornamen ?\n",																			//3
							"Wie hei\u00dft der B\u00f6sewicht in *The Dark Knight Rises* ?\n",																					//4
							"Wie hei\u00dft der kleiner und schleimige \nehemalige Hobbit in *Der Herr der Ringe* (2001) ?\n",													//5
							"Wie hei\u00dft der Schauspieler, der in \n*Twilight* den Charakter Edward spielt ?\n",															//6
							"Wie hei\u00dft der schwer atmende Sith der \ndunklen Seite in *Star Wars* (1977) ?\n",															//7
							"Wer steckt hinter der Stimme von Darth Vader\nin den Star-Wars-Filmen? \n",																	//8
							"In welchem der folgenden Filme hei\u00dfen die \nHauptfiguren Alex, Marty, Gloria und Melman ?\n",
							"In der Disney finanzierten Serie *The Mandalorian*, geht es um..",
							"Wie lautet der Serienname richtig? The Big Bang..",
							"Wer spielt in *Forest Gump* den Hauptcharakter *Forest Gump* ?",
							"Worum geht es im Film *Jurassic Park* ?",
							"Welches Auto f\u00e4hrt der Filmb\u00f6sewicht *Goldfinger*\nim gleichnamigen James-Bond-Film?",
							"Was ist kein Horkrux von Harry Potters Gegenspieler Lord Voldemort?",
							"Was ist Superheld *Hawkeyes* bevorzugte Waffe im Kampf gegen das B\u00f6se?",
							"Wer erfand das Gruselmonster *Freddy Kr\u00FCger* ?",
							"In der Kinder-Serie *Benjamin Bl\u00FCmchen*. Dieser ist ein...",
							"Welche Hautfarbe hat *Yoda* aus Star Wars ?"};
		return movieQl[frageNr];
	}											
	
	public static String movieQuestionAOLeicht(int frageNrAO) {
						//AO = Answer Options
		String[] movieQlAO = {"[1]Barabara Sch\u00f6neberger   [2]Jella Haase   [3]Sibel Kekilli   [4]Fiona Schweiger",													//0
									"[1]Robert Downey Jr.   [2]Charlie Sheen   [3]Tom Cruise   [4]Harrison Ford",													//1
									"[1]Ludacris   [2]Stan Lee   [3]Sam\u00FCl L. Jackson   [4]Ice Cube",																//2
									"[1]James & Kamilla   [2]Jackyl & Hide   [3]Jordan & Katy   [4]Jack & Kate",													//3
									"[1]Bone   [2]Pinguin   [3]Bane   [4]Joker",																					//4
									"[1]Frodo   [2]Aragorn   [3]Gandalf   [4]Gollum",																				//5
									"[1]Robert Pattinson   [2]Charles Melton   [3]Finn Wolfhard   [4]Taylor Lautner",												//6
									"[1]Darth Maul   [2]Boba Fett   [3]Darth Vader   [4]Obi-Wan Kenobi",															//7
									"[1]Robert Frederik [2]James Earl Jones   [3]Peter Scar   [4]James Cameron",													//8
									"[1]Madagascar   [2]Afrika   [3]Italien   [4]China",
									"[1]einen Mandalorianer der sich um Waisenkind namens *Grogu* k\u00FCmmert.\n[2]den Kampf gegen die Sith.\n[3]Luke Skywalker.\n[4]einen Sturmtruppler des Imperiums.",
									"[1]Club   [2]Theory   [3]Boom   [4]Bang",
									"[1]Mel Gibson   [2]Hugh Grant   [3]Tom Hanks   [4]Sean Connery",
									"[1]Fossilien   [2]Dinosaurier   [3]Gesteinsschichten   [4]Rechtsprechung",
									"[1]Maybach   [2]Rolls Royce   [3]Bentley   [4]Mercedes",
									"[1]Merope Gaunts Medaillon   [2]Helga Hufflepuffs Becher\n[3]Godric Gryffindors Uhr   [4]Tom Riddles Tagebuch",
									"[1]Steinschleuder   [2]Pistole   [3]Speer   [4]Pfeil und Bogen",
									"[1]Stephen King   [2]John Carpenter   [3]Wolfgang Hohlbein   [4]Wes Craven",
									"[1]Elefant   [2]Tiger   [3]Baum   [4]Fisch",
									"[1]Gelb   [2]Gr\u00FCn   [3]Rot   [4]Grau"};
		return movieQlAO[frageNrAO];
	}

	
	
	public static String movieQuestionAnswerLeicht(int frageNr) {
		String[] movieQlAnswer = {"2","1","3","4","3","4","1","3","2","1","1","2","3","2","2","3","4","4","1","2"};
		return movieQlAnswer[frageNr];
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------	
		
	
	public static String movieQuestionNrMittel(int frageNr) {
		String[] movieQm = {"Aus welchem Land stammt Al Pachinos Charakter Tony Montana\nurspr\u00FCnglich im Film  *Scarface*  (1983) ?\n",								//0
							"In welcher der folgenden Serien gibt es keinen Familienhund?\n",																			//1
							"Im Film *Pain & Gain* (2013) spielen Mark Wahlberg und Anthony Mackie\nzwei der drei Hauptrollen. Wer ist der dritte Hauptdarsteller ?\n", //2
							"Schreiende Kinder eine Energiequelle, in welchem Film ?\n",																				//3
							"In welchem Film verliert *Stu* nach einer \nwilden Partynacht seinen Schneidezahn ?\n",													//4
							"Im welchem Jahr wurde Disneys Zeichentrickfilm\n*Der K\u00f6nig der L\u00f6wen* ver\u00f6ffentlicht ?\n",												//5
							"Mit welchem Film gelang Arnold Schwarzenegger der\ninternationale Durchbruch auf der Kinoleinwand ?\n",									//6
							"In der TV-Serie *Dexter* ist die Hauptperson ein Serienkiller \n- was ist jedoch ihr eigentlicher Job ?\n",									//7
							"Welche der folgenden Schauspieter spielt nicht\nin der Kom\u00f6die *Kindsk\u00f6pfe* (2010) mit ?\n",											//8
							"Welcher Darsteller spielte bisher am h\u00e4ufigsten \ndie Rolle des  *James Bond* ?\n",														//9
							"Welcher Film der Firma Pixar war der erste\nComputer-animierte Spielfilm ?\n",
							"In welcher Ausbildung steckt Kung Fu Panda Po\nbevor er sich zum Kung Fu K\u00e4mpfer ausbilden l\u00e4sst ?\n",
							"Wie hei\u00dft die Psychiatrie von Gotham City, der Stadt \u00FCber die Batman wacht ?",
							"Aus welchem Film stammt das Zitat: *Wir sehn uns in etwa 30 Jahren!* ?",
							"Mit wem verbrachte Stiflers Mom im Kult-Film *American Pie 1* eine Nacht ?",
							"Wie hei\u00dft ein deutscher M\u00e4rchenfilm richtig? *Die Geschichte vom goldenen...",
							"In welcher Stadt treibt der d\u00FCmmste Schurke\naller Zeiten *Megamind* sein Unwesen?",
							"Wen wollen die Protagonisten der Filmreihe\n*Final Destination* \u00FCberlisten?",
							"Wer spielt die Hauptrolle in dem Actionfilm *16 Blocks* ?",
							"Welcher war der erste Film aus dem Disney-Studio?"};														//8
		return movieQm[frageNr];
	}		
		
		
		public static String movieQuestionAOMittel(int frageNr) {		
		//AO = Answer Options
			String[] movieQmAO = {		"[1]Kuba   [2]Kolumbien   [3]Jamaika   [4]Brasilien\n",								//0
										"[1]Die Simpsons   [2]American Dad   [3]Rick & Morty   [4]South Park\n",																			//1
										"[1]Tom Cruise   [2]Vin Diesel   [3]Dwayne Johnson   [4]Harrison Ford\n", //2
										"[1]Toy Story   [2]Disney’s Cars   [3]Das gro\u00dfe Krabbeln   [4]Die Monster AG\n",																				//3
										"[1]Hangover   [2]One Night in Paris   [3]Set Up   [4]Nightmare on Elm Street\n",													//4
										"[1]2001   [2]1990  [3]1994   [4]1992\n",												//5
										"[1]Conan der Barbar   [2]Terminator 2   [3]The Last Stand   [4]The Expendables\n",									//6
										"[1]Polizist   [2]Forensiker   [3]G\u00e4rtner   [4]Taxi-Fahrer\n",									//7
										"[1]Adam Sandler   [2]Chris Rock   [3]Kevin James   [4]Jim Carey\n",											//8
										"[1]Sean Connery   [2]Roger Moore   [3]Silvester Stallone   [4]Pierce Brosnan\n",														//9
										"[1]Toy Story   [2]Lilo & Stitch   [3]Alles steht Kopf   [4]Das Gro\u00dfe Krabbeln\n",
										"[1]Pancake-Macher   [2]Fleischkl\u00f6pschen-Macher\n[3]Saure H\u00FChnerbr\u00FC\u00FCstchen-Macher   [4]Nudel-Macher",
										"[1]Gotham Asylum   [2]Arkham Asylum   [3]Ashecliffe Asylum   [4]Soul Asylum",
										"[1]Zur\u00FCck in die Zukunft I   [2]Zur\u00FCck in die Zukunft II   \n[3]Zur\u00FCck in die Zukunft III   [4]Der Legion\u00e4r",
										"[1]Oz   [2]Finch   [3]Jim   [4]Sherman",
										"[1]Pfennig   [2]B\u00e4umchen   [3]Taler   [4]Teller",
										"[1]Gotham City   [2]Metro City   [3]New York City   [4]Mexico City",
										"[1]Die CIA   [2]Ihren Mathe-Lehrer   [3]Den Tod   [4]Ihre Mitsch\u00FCler",
										"[1]Bruce Willis   [2]Denzel Washington   \n[3]Robert De Niro   [4]Al Pacino",
										"[1]Die Schneeballfabrik   [2]Schneewittchen und die Sieben Zwerge\n[3]Magdalena der Frosch   [4]Der K\u00f6nig der L\u00f6wen"};
			return movieQmAO[frageNr];
		}
			
			
	public static String movieQuestionAnswerMittel(int frageNr) {
			String[] movieQmAnswer = {"1","2","3","4","1","3","1","2","4","2","1","4","2","1","2","3","2","3","1","2"};
			return movieQmAnswer[frageNr];
	}
			
		
	//--------------------------------------------------------------------------------------------------------------------	
	public static String movieQuestionNrSchwer(int frageNr) {
		String[] movieQs = {"Welches Film-Unternehmen ver\u00f6ffentlichte die *Herr der Ringe* – Trilogie ?\n",
									"Welches Lied spielt Marty McFly in *Zur\u00FCck in die Zukunft* auf der Gitarre ?\n",
									"Wer f\u00FChrte bei *Alien* und *Blade Runner* Regie ?\n",
									"Wer f\u00FChrte zur Science-Fiction-Parodie *Dark Star* aus dem Jahr 1974 Regie ?\n",
									"Wer schrieb und f\u00FChrte Regie zum preisgekr\u00f6nten Film *Avatar* ?\n",
									"Wer spielt die Hauptrolle im Film *Shoot ´Em Up*  (2007) ?\n",
									"Wer spielte Johnny Cash im Film *Walk the Line* ?\n",
									"Wer spielte neben Mel Gibson die Hauptrolle in der Reihe *Lethal Weapon* - Zwei stahlharte Profis ?\n",
									"Wer war urspr\u00FCnglich f\u00FCr die Rolle des *Indiana Jones* vorgesehen ?\n",
									"Wie hei\u00dft der von Leslie Nielson gespielte tollpatschige Lieutenant in der Filmreihe *Die nackte Kanone* ?\n",
									"Welche Schauspielerin war kein Bond-Girl ?",
									"Welcher Film ist bis dato der l\u00e4ngste, der je als\n*Bester Film* mit dem Oscar ausgezeichnet wurde ?",
									"Welcher fiktiven Spezies geh\u00f6rt Kultfigur Scrat\naus den *Ice Age*-Filmen an ?",
									"Wer spielt das Elternpaar im oscar-nominierten\nFilm *Extrem laut und unglaublich nah* ?",
									"Wer verk\u00f6rperte den kleinen Elliott im Spielberg-Streifen:\n*E.T. - Der Au\u00dferirdische* ?",
									"Welche besondere Gabe besitzt Vampir Alice,\ndie Schwester von Edward ?",
									"Welchen seiner Filme drehte Alfred Hitchcock\nin einer *3-D-Naturalversion* ?",
									"Im Film *Quiet Earth – Das letzte Experiment*\ntreffen sich 3 \u00FCberlebende Personen. Welche ?",
									"Wer f\u00FChrt Regie im Film *Equilibrium* ?",
									"In welchem Teil von *Rocky* (Boxfilme) spielt Dolph Lundgren\nden Gegner von Sylvester Stallone ?"};
		return movieQs[frageNr];
	}		
		
		
		public static String movieQuestionAOSchwer(int frageNr) {	
		//AO = AnswerOptions
		String[] movieQsAO = {"[1]Universal   [2]New Line Cinema   [3]Tele M\u00FCnchen Gruppe   [4]Paramount",
									"[1]Roxanne   [2]Sweet Home Alabama   [3]Johnny B. Goode   [4]Texas",
									"[1]Ridley Scott   [2]James Cameron   [3]Steven Spielberg   [4]Jonathan Frakes",
									"[1]Peter Jackson   [2]Mich\u00e4l Bay   [3]Steven Spielberg   [4]John Carpenter",
									"[1]Christopher Nolan   [2]James Cameron   [3]Jonathan Frakes   [4]David Yates",
									"[1]Clive Owen   [2]Tom Cruise   [3]Will Smith   [4]Tim Burton",
									"[1]Tom Hanks   [2]Kevin Spacey   [3]Christian Bale   [4]Joaquin Ph\u00f6nix",
									"[1]Sean Connery   [2]Dustin Hoffmann   [3]Danny Clover   [4]David Hasselhoff",
									"[1]Roger Moore   [2]Tom Selleck   [3]Nicolas Cage   [4]Jonathan Frakes",
									"[1]Frank Debrin   [2]Jack Goldman   [3]James Hunt   [4]Pierre Cardin",
									"[1]Elke Sommer   [2]Ursula Andress   [3]Britt Ekland   [4]Jane Seymour",
									"[1]Vom Winde verweht   [2]Hamlet   \n[3]Der mit dem Wolf tanzt   [4]Titanic",
									"[1]Eisratte   [2]S\u00e4belzahneichh\u00f6rnchen\n[3]Mammutmaus   [4]Uhrzeithamster",
									"[1]Scarlett Johansson & Ewan McGregor   [2]Jennifer Aniston & Owen Wilson\n[3]Tom Hanks & Sandra Bullock   [4]George Clooney & Patricia Hastie",
									"[1]Henry Thomas   [2]Brad Pitt   [3]Keanu Reeves   [4]River Ph\u00f6nix",
									"[1]Sie kann sich ohne Probleme in der Sonne zeigen.\n[2]Sie hat Visionen der Zukunft.\n[3]Sie kann Gedanken lesen.\n[4]Sie kann die Stimmung anderer Leute beeinflussen.",
									"[1]Bei Anruf Mord   [2]Vertigo   [3]Das Fenster zum Hof   [4]Psycho",
									"[1]Neo, Morpheus & Trinity   [2]Tick, Trick & Track\n[3]Lev, Frank & Claire   [4]Zac, Api & Joanne",
									"[1]Andy Wachowski   [2]George Lucas   [3]Kurt Wimmer   [4]Peter Jackson",
									"[1]Rocky IV   [2]in allen.   [3]Rocky III   [4]Rocky II"};
		return movieQsAO[frageNr];
	}
		
		
public static String movieQuestionAnswerSchwer(int frageNr) {
		String[] movieQmAnswer = {"2","3","1","4","2","1","4","3","2","1","1","1","2","3","1","2","1","4","3","1"};
		return movieQmAnswer[frageNr];
}
		
//------------------------------------------------------------------------------------------------------------------------------	
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------TECHNIK-----------------------------------------------------------------

public static String techQuestionNrLeicht(int frageNr) {
	String[] techQl = {"Was bedeutet die Abk\u00FCrzung *CD*?\n",															//0
						"Moderne TV-Ger\u00e4te haben einen so genannten\nLCD-Bildschirm. Wof\u00FCr steht LCD ?\n",																			//1
						"Welche der folgenden ist eine Programmiersprache ?\n",												//2
						"Wie nennt man eine Armbanduhr, die \u00FCber ein\nDisplay und Internetzugriff verf\u00FCgt ?\n",																			//3
						"Was speichert ein Kondensator?\n",																					//4
						"Wie nennt man ein gel\u00e4ufiges Werkzeug zum \u00f6ffnen von T\u00FCren ?\n",												//5
						"Wie wird die textbasierte Auszeichnungssprache, auf\nder das World Wide Web beruht, abgek\u00FCrzt ?\n",															//6
						"Wo wurde in der Raumfahrt ein *Lunar Rover* eingesetzt ?\n",															//7
						"Welche Farbe hat *Schutzleiter* in einem gew\u00f6hnlichen Stromkabel ? \n",																//8
						"Welche Aufl\u00f6sung besitzt ein sogenannter Full-HD-TV ?\n",
						"Zu welchem Dateityp geh\u00f6rt eine Datei mit der Endung .bmp ?",
						"Wie welchem Emoticon versendet man per SMS einen Kuss ?",
						"Wof\u00FCr braucht man im Internet Bookmarks ?",
						"Welches Ger\u00e4t kann Schallwellen aufnehmen und in\nelektrische Signale umwandeln ?",
						"Ein Teilbereich der Physik: Die Lehre vom Licht ist die...",
						"Was bedeutet *Astronaut* w\u00f6rtlich \u00FCbersetzt ?",
						"Welches Werkzeug ist am besten geeignet, um Erde zu bewegen ?",
						"Womit kann man auf dem Fernseher den Sender wechseln ?",
						"Wof\u00FCr verwendet man einen Kompass?",
						"Was ben\u00f6tigt man f\u00FCr einen Laptop damit er mit dem Strom verbunden ist?"};
	return techQl[frageNr];
}											


public static String techQuestionAOLeicht(int frageNrAO) {
					//AO = Answer Options
	String[] techQlAO = {"[1]Compact Disc   [2]Computer Disc   [3]Collective Decision   [4]Class Decryption",													//0
								"[1]Light Cascading Dash  [2]Light Comparing Demodulator\n[3]Liquid Crystal Display   [4]Long Correct Display",													//1
								"[1]Cobra   [2]Pyton   [3]Bird   [4]Hornet",																//2
								"[1]G-Shock   [2]Automatic Watch   [3]Smartwatch   [4]Digitaluhr",													//3
								"[1]Elektrische Ladung   [2]Kondenswasser   [3]Honig   [4]Gestein",																					//4
								"[1]Wilhelm   [2]Dietrich   [3]Jochen   [4]Meinhard",																				//5
								"[1]SQL   [2]HTML   [3]PHP   [4]CSS",												//6
								"[1]Auf dem Nordpol   [2]Auf der ISS   [3]Auf dem Mars   [4]Auf dem Mond",															//7
								"[1]Gr\u00FCn-Gelb [2]Orange   [3]Schwarz   [4]Rot",													//8
								"[1]800 x 600   [2]2048 x 1200   [3]1920 x 1080   [4]3840 x 2160",
								"[1]Tabellenkalkulationsdatei   [2]Ausf\u00FChrbare Datei   \n[3]Bilddatei   [4]Audiodatei",
								"[1] :-o   [2] :-$   [3] :-8   [4] :-*",
								"[1]als PIN f\u00FCr Online-Banking   [2]als Lesezeichen f\u00FCr eine Webseite\n[3]zur Nutzererkennung   [4]f\u00FCr Geb\u00FChrenabrechnungen",
								"[1]Lautsprecher   [2]Bildschirm   [3]Grammofon   [4]Mikrofon",
								"[1]Optik   [2]Analytik   [3]Linguistik   [4]Phonetik",
								"[1]Raumfahrer   [2]Sternfahrer [3]Weltallreisender   [4]Hochflieger",
								"[1]Ein Bohrer   [2]Eine S\u00e4ge   [3]Eine Schaufel   [4]Ein Hammer",
								"[1]Fernbedienung   [2]Drucker   [3]Videorecorder   [4]Fernsehbox",
								"[1]Bronzeguss   [2]Navigation   [3]Abk\u00FChlung   [4]Kochen",
								"[1]Prozessor   [2]Arbeitsspeicher   [3]Netzteil   [4]Grafikkarte"};
	return techQlAO[frageNrAO];
}


public static String techQuestionAnswerLeicht(int frageNr) {
	String[] techQlAnswer = {"1","3","2","3","1","2","2","4","1","3","3","4","2","4","1","2","3","1","2","3"};
	return techQlAnswer[frageNr];
}


//--------------------------------------------------------------------------------------------------------------------	
	

public static String techQuestionNrMittel(int frageNr) {
	String[] techQm = {"Welches Unternehmen steht hinter dem\nLinux-basierten Betriebssystem *Android* ?\n",												//1
						"Wie lautet KEIN Name eines Unternehmens, das Notebooks entwickelt ?\n", 														//2
						"Wie nennt man einen Herd, bei dem der Topf oder die\nPfanne mittels eines Magnetfeldes erhitzt wird ?\n",						//3
						"Wonach ist eine Bauform des Verbrennungsmotors benannt ?\n",																	//4
						"Wof\u00FCr benutzt man einen sogenannten *Fuchsschwanz* ?\n",																		//5
						"Wie hie\u00df der Konkurrent der BluRay, der\nsich jedoch nicht durchsetzen konnte ?\n",												//6
						"Welche Mercedes-Klasse gibt es nicht ?\n",																						//7
						"Welche Erfindung wird mit Farbbrillen, Polarisationsfiltern\noder Shutter-Brillen verbunden ?\n",								//8
						"Welche Erfindung gibt es in den Varianten\nOtto, Wankel oder Stirling ?\n",														//9
						"Was kann man mit einem Pager machen ?\n",
						"Der 2011 verstorbene iGod Steve Jobs kehrte erst 1997 zu Apple zur\u00FCck.\nWomit gelang ihm damals die Rettung der Firma ?",
						"WAP steht f\u00FCr... ?",
						"Welches Tier war das Maskottchen der Apollo-11-Mission ?",
						"Das Verhalten von K\u00f6rpern in einem Luftstrom beschreibt...",
						"Wie bewegt ein Unterseeboot im Wasser auf und ab ?",
						"Wie hei\u00dft die Europ\u00e4ische Weltraumorganisation ?",
						"Was misst man auf der Richterskala ?",
						"Wer oder was ist *ASCII* ?",
						"Die kleinste Informationseinheit, die ein Computer darstellen kann ist ein ... ",
						"GPRS, EDGE, UMTS, HSPA - wer blickt noch durch beim mobilen Internet?\nWelche Aussage stimmt ?"};																						//10
	return techQm[frageNr];
}		
	
	
	public static String techQuestionAOMittel(int frageNr) {		
	//AO = Answer Options
		String[] techQmAO = {		"[1]Microsoft   [2]Google  [3]Oracle   [4]Yahoo\n",																	//1
									"[1]Android   [2]Acer  [3]Dell   [4]HP\n", 																			//2
									"[1]Tesla Herd   [2]Power Herd  [3]Induktionsherd   [4]Magnetherd\n",												//3
									"[1]Stern   [2]Sechseck  [3]Trapez   [4]Kreis\n",																	//4
									"[1]als Troph\u00e4e   [2]w\u00e4rmen   [3]als Schl\u00FCsselanh\u00e4nger   [4]S\u00e4gen\n",												//5
									"[1]Super Disk   [2]HD DVD   [3]Betamax Final   [4]Red Beam\n",														//6
									"[1]A-Klasse   [2]G-Klasse   [3]I-Klasse   [4]C-Klasse\n",															//7
									"[1]3D-Film   [2]Skibrillen   [3]Augenmessung   [4]Splitterschutzbrillen\n",										//8
									"[1]Teller   [2]Motor   [3]Verlag   [4]Formel\n",																	//9
									"[1]Sein Alter pr\u00FCfen   [2]Internetseiten sehen   [3]Kurznachrichten empfangen   [4]Seiten sortieren\n",
									"[1]iPhone   [2]iMac   [3]iPad   [4]MacBook",
									"[1]Wireless Application Protocol   [2]Wave Add-on Protocol   \n[3]Wireless Application Program   [4]Wireless Application Path",
									"[1]ein Fisch   [2]ein Adler   [3]ein Puma   [4]ein Bison",
									"[1]die Hydrologie [2]die Architektur   [3]die Aerodynamik   [4]die Astrophysik",
									"[1]Durch Kork und Steine   [2]Durch Luft und Sand   \n[3]Durch aufblasbare Kissen   [4]Durch Wasser und Luft",
									"[1]ESA   [2]ESS   [3]CSG   [4]ISS",
									"[1]Radiowellen   [2]Temperatur   [3]Erdbebenst\u00e4rke   [4]Lautst\u00e4rke",
									"[1]Mischung aus Ascorbins\u00e4ure & Sa\u00FCrstoff   [2]ein Zeichencode   \n[3]die regierende Partei in Nigeria   [4]Bemannte Raumf\u00e4hre der USA",
									"[1]Byte   [2]Bit   [3]Kibibit   [4]Bol",
									"[1]GPRS gibt es nicht mehr\n[2]HSDPA ist schneller als GPRS\n[3]UMTS ist das schnellste Netz\n[4]EDGE hat nichts mit mobilem Internet zu tun"};			//10
		return techQmAO[frageNr];
	}
		
		
public static String techQuestionAnswerMittel(int frageNr) {
		String[] techQmAnswer = {"2","1","3","1","4","2","3","1","2","3","2","1","2","3","4","1","3","2","2","2"};
		return techQmAnswer[frageNr];
}
		
	





//--------------------------------------------------------------------------------------------------------------------	
public static String techQuestionNrSchwer(int frageNr) {
	String[] techQs = {			"In welchem Handwerk wird ein sogenannter *Sch\u00FCtze* verwendet?\n",
								"In welchem Jahr erfand Fahrenheit das erste Thermometer?\n",
								"Wann wurde der *Commodore 64*-Heimcomputer\ndas erste mal ver\u00f6ffentlicht?\n",
								"In welchem Jahr wurde der *Zauberw\u00FCrfel*,\nauch Rubik´s Cube genannt, erfunden?\n",
								"Wann wurde die NASA gegr\u00FCndet?\n",
								"Was wurde mit dem foucaultschen Pendel bewiesen?\n",
								"Welcher Flugzeugba\u00FCr hat den Langstreckenbomber B-52 entwickelt?\n",
								"Welches Unternehmen entwickelte den ersten PC,\nder am 12. August 1981 ver\u00f6ffentlicht wurde?\n",
								"Wie hie\u00df die Raumfahrtmission, die im Jahr 1969\ndie ersten Menschen auf den Mond brachte?\n",
								"Wof\u00FCr ist *Modem* eine Abk\u00FCrzung ?\n",
								"Was war ein Plagiat des franz. Citr\u00f6n 5CV ?",
								"Wie viele Passagiere bef\u00f6rderte der Flughafen\nFrankfurt/Main im Jahr 2011 ?",
								"Ein *Coulomb* ist die abgeleitete SI-Einheit... ?",
								"Was verwendeten die amerikanischen Soldaten im Zweiten Weltkrieg,\num Salzwasser aus ihren Gewehrm\u00FCndungen zu halten,\nals sie an Land schwommen ?",
								"Aus welchem Material waren die ersten zugelassenen Kondome in den USA ?",
								"Wo sitzt normalerweise kein Schloss ?",
								"Was erzeugt das typische Pling beim tropfenden Wasserhahn ?",
								"Unter Augmented Reality versteht man ...",
								"Welches Bauteil ist bei Dieselmotoren, im Gegensatz zu Ottomotoren, \u00FCberfl\u00FCssig ?",
								"Wie hei\u00dft die kleinste Einheit einer Rastergrafik ?"};
	return techQs[frageNr];
}		
	
	
	public static String techQuestionAOSchwer(int frageNr) {	
	//AO = AnswerOptions
		String[] techQsAO = {"[1]Weberei   [2]Gastronomie   [3]Sicherheitsdienst   [4]Dachdecker",
								"[1]1701   [2]1724   [3]1829   [4]1790",
								"[1]1960   [2]2000   [3]1982   [4]1990",
								"[1]1974   [2]1955   [3]1983   [4]1992",
								"[1]1966   [2]1930   [3]1940   [4]1958",
								"[1]Die Schwerkraft  [2]Die Erdrotation   [3]Hexerei   [4]Radioaktive Strahlung",
								"[1]Lockheed   [2]Airbus   [3]B\u00f6ing   [4]Bell",
								"[1]Apple   [2]Microsoft   [3]Atari   [4]IBM",
								"[1]Apollo 11   [2]Apollo 7   [3]Apollo 18   [4]Apollo 9",
								"[1]Modulator Demodulator   [2]Modemato Scalare\n[3]Multi Order Decryption Encryption Mode   [4]Mono-Decrypter",
								"[1]Opel Laubfrosch   [2]Ford Capri 1   [3]VW Karmann-Ghia   \n[4]Mercedes-Benz 300S Coupé",
								"[1]33,35 Millionen   [2]91,45 Millionen   [3]56,44 Millionen   [4]36,26 Millionen",
								"[1]der elektrischen Stromst\u00e4rke   [2]der elektrischen Spannung   \n[3]des elektrischen Wiederstandes   [4]der elektrischen Ladung",
								"[1]Ein Kondom   [2]Einen Stock   [3]Einen Butt-Plug   [4]Einen Dildo",
								"[1]Tierdarm   [2]Leinen   [3]Gummi   [4]Plastik",
								"[1]Am Ofen   [2]Im Haus   [3]Am Briefkasten   [4]Im Auto",
								"[1]Kapillarwellen, die an der Oberfl\u00e4che entlanglaufen\n[2]Ein vibrierender Hohlraum darunter, der nach dem Aufprall entsteht\n[3]Das Auftreffen des Tropfens auf der Wasseroberfl\u00e4che\n[4]Durch die Schwerkraft der Erde",
								"[1]Comp. gest\u00FCtzte Erweiterung der Wahrnehmung\n[2]Computerspiel Genre   [3]3D Effekt\n[4]eine Software zum realit\u00e4tsgetre\u00FCn Darstellen von Objekten",
								"[1]Batterie   [2]Z\u00FCndkerze   [3]Verbrennungsraum   [4]Nockenwelle",
								"[1]Vektor   [2]Punkt   [3]Linie   [4]Pixel"};
	return techQsAO[frageNr];
}
	
	
public static String techQuestionAnswerSchwer(int frageNr) {
	String[] techQmAnswer = {"1","2","3","1","4","2","3","4","1","1","1","3","4","1","3","1","2","1","2","4"};
	return techQmAnswer[frageNr];
}
	
		
	
//------------------------------------------------------------------------------------------------------------------------------	
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------NATUR-------------------------------------------------------------

public static String natureQuestionNrLeicht(int frageNr) {
	String[] natureQl = {"Welches dieser Bodentiere ist KEIN Insekt?\n",															//0
						"Welches der folgenden *Vegetables* z\u00e4hlt NICHT zum Gem\u00FCse?\n",																			//1
						"Wie viele Z\u00e4hne kann ein Hai im \nLaufe seines Lebens bekommen?\n",												//2
						"Wie hoch ist der Berg *Mount Everest* im Himalaya?\n",																			//3
						"Welches der folgenden Tiere kann \nam schnellsten *rennen*?\n",																					//4
						"Was speichern Kamele in ihren H\u00f6ckern?\n",												//5
						"Welches ist kein echter Baum?\n",															//6
						"In welchem Lebensraum lebt der Igel?\n",															//7
						"Welche der folgenden Fr\u00FCchte sind giftig? \n",																//8
						"Aus welchem Material besteht Lava?\n","","","","","","","","","",""};
	return natureQl[frageNr];
}											


public static String natureQuestionAOLeicht(int frageNrAO) {
					//AO = Answer Options
	String[] natureQlAO = {"[1]Wespe   [2]Stubenfliege   [3]Milbe   [4]Borkenk\u00e4fer",													//0
								"[1]Tomate   [2]Karotte   [3]Zucchini   [4]Kartoffel",													//1
								"Bis zu... [1]10000   [2]40000   [3]20000   [4]30000",																//2
								"[1]6700m   [2]8800m   [3]7100m   [4]6000m",													//3
								"[1]Gazelle   [2]Strau\u00df   [3]Gepard   [4]Panther",																					//4
								"[1]Urin   [2]Fett   [3]Blut   [4]Wasser",																				//5
								"[1]Gummibaum   [2]Dinosaurierbaum   [3]Mammutbaum   [4]Elfenbaum",												//6
								"[1]Im Wald   [2]Im Wasser   [3]In der Erde   [4]In der Erde",															//7
								"[1]Weintraube [2]Tollkirsche   [3]Heidelbeere   [4]Litschi",													//8
								"[1]Gestein   [2]Holz   [3]Kunststoff   [4]Wasser","","","","","","","","","",""};
	return natureQlAO[frageNrAO];
}


public static String natureQuestionAnswerLeicht(int frageNr) {
	String[] techQlAnswer = {"3","1","4","2","3","2","1","1","2","1","","","","","","","","","",""};
	return techQlAnswer[frageNr];
}


//--------------------------------------------------------------------------------------------------------------------	
	

public static String natureQuestionNrMittel(int frageNr) {
	String[] natureQm = {"Wie nennt man ein m\u00e4nnliches Schaf?\n",												//1
						"Welcher dieser Affen z\u00e4hlt NICHT zu den Menschenaffen?\n", 														//2
						"Aus welcher Pflanze wird Vanille gewonnen?\n",						//3
						"Welches dieser Tiere ist so intelligent, dass\nes sich selbst im Spiegel erkennen kann?\n",																	//4
						"Woraus besteht das Skelett eines Hai's?\n",																		//5
						"Wie viel wiegt ein Igel?\n",												//6
						"Welches Tier hat die l\u00e4ngsten Samenzellen der Welt?\n",																						//7
						"Welche S\u00e4ugetiere leben am l\u00e4ngsten?\n",								//8
						"Welches dieser Reptilien ist am gr\u00f6\u00dften?\n",														//9
						"\u00e4ltere Gorillam\u00e4nnchen sind riesig und k\u00f6nnen bis zu 200 kg wiegen.\nSie leben mit einem Harem von 5-30 Weibchen.\nWie nennt man sie?\n",
						"","","","","","","","","",""};																						//10
	return natureQm[frageNr];
}		
	
	
	public static String natureQuestionAOMittel(int frageNr) {		
	//AO = Answer Options
		String[] natureQmAO = {		"[1]Hammel   [2]Widder  [3]Lamm   [4]Mufflon\n",																	//1
									"[1]Gibbon   [2]Gorilla  [3]Orang U-Tan   [4]Schimpanse\n", 																			//2
									"[1]Wasserpflanze   [2]R\u00FCben  [3]Orchidee   [4]Nussbaum\n",												//3
									"[1]Elefant   [2]Hund  [3]Affe   [4]Schwein\n",																	//4
									"[1]Knochen   [2]Muskeln   [3]Gr\u00e4ten   [4]Knorpel\n",												//5
									"[1]1750g   [2]1000g   [3]2250g   [4]880g\n",														//6
									"[1]Eine Giraffe   [2]Ein Tigerhai   [3]Eine Fruchtfliege   [4]Eine Schlange\n",															//7
									"[1]Wale   [2]Elefanten   [3]Nilpferde   [4]W\u00f6lfe\n",										//8
									"[1]Der amerik. Alligator   [2]Das Salzwasserkrokodil   \n[3]Der Komodowaran   [4]Die Anakonda\n",																	//9
									"[1]Casanova   [2]King Kong   [3]Silberr\u00FCcken   [4]Don Juan\n","","","","","","","","","",""};			//10
		return natureQmAO[frageNr];
	}
		
		
public static String natureQuestionAnswerMittel(int frageNr) {
		String[] natureQmAnswer = {"2","1","3","1","4","2","3","1","2","3","","","","","","","","","",""};
		return natureQmAnswer[frageNr];
}
		
	
//--------------------------------------------------------------------------------------------------------------------	
public static String natureQuestionNrSchwer(int frageNr) {
	String[] natureQs = {"\n",
								"Was wird mit der Fehlingl\u00f6sung nachgewiesen?\n",
								"Welcher von diesen Pflanzen sind giftig?\n",
								"Wer oder was ist eine Mimose?\n",
								"Wie viele L\u00e4nder grenzen an Ungarn?\n",
								"Wer ist der Haupttr\u00e4ger der Tollwut?\n",
								"Welche dieser vier spanischen Inseln ist die gr\u00f6\u00dfte?\n",
								"Wie hei\u00dft der zweith\u00f6chste Berg Deutschlands?\n",
								"Welche Fr\u00FChlingsblume entsteht aus den Buchstaben?\nR-E-U-E-L-W-Z-G-N-E-L\r\n",
								"Zwischen welchen St\u00e4dten ist die Luftlinie am k\u00FCrzesten?\n",
								"Welcher Vogel l\u00e4sst seine Eier von anderen V\u00f6geln ausbr\u00FCten?\n","","","","","","","","","",""};
	return natureQs[frageNr];
}		
	
	
	public static String natureQuestionAOSchwer(int frageNr) {	
	//AO = AnswerOptions
		String[] natureQsAO = {"[1]Eiwei\u00df   [2]Zucker   [3]Sa\u00FCrstoff   [4]S\u00e4ure",
								"[1]Heidelbeere   [2]Einbeere   [3]Physalis   [4]Stachelbeere",
								"[1]ein Weichei   [2]ein S\u00FCdseefisch   \n[3]eine tropische Pflanze   [4]eine Hautkrankheit",
								"[1]7   [2]6   [3]8   [4]5",
								"[1]der Wolf   [2]der Hase   [3]das Reh   [4]der Fuchs",
								"[1]Isla de Lobos   [2]Alegranza   [3]Isla de la Toja   [4]Isla Dragonera",
								"[1]Watzmann   [2]Hochvogel   [3]Schneefernerkopf   \n[4]Mittlere H\u00f6llentalspitze",
								"[1]Wurzegel   [2]Egelwurzel   [3]Wurzeleng   [4]Engelwurzel",
								"[1]B\u00FCnosAires - SantiagodeChile    [2]Sidney - Aucklan   \n[3Berlin - Moskau    [4]Durban - Antananarivo",
								"[1]Der Kuckuck   [2]Der Specht   [3]Die Amsel   [4]Der Uhu","","","","","","","","","",""};
	return natureQsAO[frageNr];
}
	
	
public static String natureQuestionAnswerSchwer(int frageNr) {
	String[] natureQmAnswer = {"2","2","3","1","4","2","3","4","1","1","","","","","","","","","",""};
	return natureQmAnswer[frageNr];
}


//------------------------------------------------------------------------------------------------------------------------------------------------

public static String mixQuestionNrRandom(int frageNr) {
	String[] natureQs = {		"Welches Bauteil ist bei Dieselmotoren, im Gegensatz zu Ottomotoren, \u00FCberfl\u00FCssig ?",
								"Welcher von diesen Pflanzen sind giftig?\n",
								"Wer oder was ist eine Mimose?\n",
								"Wie viele L\u00e4nder grenzen an Ungarn?\n",
								"Welches Tier hat die l\u00e4ngsten Samenzellen der Welt?\\n",
								"Welche dieser vier spanischen Inseln ist die gr\u00f6\u00dfte?\n",
								"Wie hei\u00dft der zweith\u00f6chste Berg Deutschlands?\n",
								"In welchem Film verliert *Stu* nach einer \nwilden Partynacht seinen Schneidezahn ?\n",
								"Zwischen welchen St\u00e4dten ist die Luftlinie am k\u00FCrzesten?\n",
								"Welcher Vogel l\u00e4sst seine Eier von anderen V\u00f6geln ausbr\u00FCten?\n","","","","","","","","","",""};
	return natureQs[frageNr];
}		
	
	
	public static String mixQuestionAORandom(int frageNr) {	
	//AO = AnswerOptions
		String[] natureQsAO = {"[1]Batterie   [2]Z\u00FCndkerze   [3]Verbrennungsraum   [4]Nockenwelle",
								"[1]Heidelbeere   [2]Einbeere   [3]Physalis   [4]Stachelbeere",
								"[1]ein Weichei   [2]ein S\u00FCdseefisch   \n[3]eine tropische Pflanze   [4]eine Hautkrankheit",
								"[1]7   [2]6   [3]8   [4]5",
								"[1]Eine Giraffe   [2]Ein Tigerhai   [3]Eine Fruchtfliege   [4]Eine Schlange\\n",
								"[1]Isla de Lobos   [2]Alegranza   [3]Isla de la Toja   [4]Isla Dragonera",
								"[1]Watzmann   [2]Hochvogel   [3]Schneefernerkopf   \n[4]Mittlere H\u00f6llentalspitze",
								"[1]Hangover   [2]One Night in Paris   [3]Set Up   [4]Nightmare on Elm Street\n",
								"[1]B\u00FCnosAires - SantiagodeChile    [2]Sidney - Aucklan   \n[3Berlin - Moskau    [4]Durban - Antananarivo",
								"[1]Der Kuckuck   [2]Der Specht   [3]Die Amsel   [4]Der Uhu","","","","","","","","","",""};
	return natureQsAO[frageNr];
}
	
	
public static String mixQuestionAnswerRandom(int frageNr) {
	String[] natureQmAnswer = {"2","2","3","1","2","3","1","1","1","","","","","","","","","",""};
	return natureQmAnswer[frageNr];
}

}

