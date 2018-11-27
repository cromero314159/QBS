	import java.util.ArrayList;	import java.util.Scanner;
	import java.io.File;		import java.io.IOException;

	public class RomeroMain {
		public static void main(String[] args) throws IOException {
			ArrayList<String> Lines = new ArrayList<String>();
			ArrayList<Matches> Games = new ArrayList<Matches>();
	 
			
			System.out.println("This is the PQBS runner");
		      Lines=readFile();
		      parseInputArray(Lines, Games);
		     
		} //close method main

		public static void parseInputArray(ArrayList<String> Lines, ArrayList<Matches> Games) {
			//  Check to see if Lines ArrayList has been passed
			//System.out.println("The teams number is " + Integer.parseInt(Lines.get(0)));
			Event.totalteams = Integer.parseInt(Lines.get(0));
			Team.teamsize[0]= Event.totalteams; 
			//System.out.println("The teams number is " + Team.teamsize[0]);
			
			int linemark = 1;
			
			//Input Teams
			for (int i=1; i<Event.totalteams+1; i++){ // teams input for loop 
				Team.teamsize[i] = Integer.parseInt(Lines.get(linemark))-1; 
				linemark++; // get teamsize, increment mark
				Team.teams[i][0]= Lines.get(linemark); 
				linemark++; // get teamname, increment mark
				//System.out.println(Team.teams[i+1][0]);
				//System.out.println("\nTeam "+ i +" is "+Team.teams[i][0]+" and it has "+ Team.teamsize[i]+ " members.");
				
				//System.out.print("Team members for "+Team.teams[i][0]+" are ");
				for (int j=0; j<Team.teamsize[i]; j++){
				Team.teams[i][j]= Lines.get(linemark);
				//System.out.print(Team.teams[i][j]+" ");
				linemark++; } // end players input for loop j	
				} // end teams input for loop i  
		
			System.out.println("\nThe Current Linemark is "+linemark);
			Event.totalmatches = Integer.parseInt(Lines.get(linemark));
			System.out.println("The total number of matches is: "+Event.totalmatches);
			
			float leftplayers[][][] = new float[Event.totalmatches][8][7]; 
			float rightplayers[][][] = new float[Event.totalmatches][8][7];
			
			int id=-1; int Lscore = 0; int Rscore =0;
			int Lteam = 0; int Rteam = 0; int tuh = 0; int round = 0; 
			int Lbh = 0; int Lbp = 0;
			int Rbh = 0; int Rbp = 0; 
			boolean OT = false; boolean forfeit = false; boolean SixtySec = false; 
			int LOT = 0; int ROT = 0; int L60 = 0; int R60 = 0;
			
			
			//Input Matches 17 pre-game lines & 7 lines per player for 8 players for each team 
			
			for (int i=0; i<Event.totalmatches; i++){
			//int i =0;
			System.out.println(" ");
			linemark++; id = Integer.parseInt(Lines.get(linemark)); 	//01
			System.out.print("Id: "+id+ " ");
			linemark++; Lteam = Integer.parseInt(Lines.get(linemark)); 	//02
			System.out.print("LTeam: "+Lteam+ " ");
			linemark++; Rteam = Integer.parseInt(Lines.get(linemark)); 	//03
			System.out.print("RTeam: "+Rteam+ " ");
			linemark++; Lscore = Integer.parseInt(Lines.get(linemark)); //04
			System.out.print("LScore: "+Lscore+ " ");
			linemark++; Rscore = Integer.parseInt(Lines.get(linemark)); //05
			System.out.print("RScore: "+Rscore+ " ");
			linemark++; tuh = Integer.parseInt(Lines.get(linemark)); 	//06
			System.out.print("tuh: "+tuh+ " ");
			linemark++; round = Integer.parseInt(Lines.get(linemark)); 	//07
			System.out.print("round: "+round+ " ");
			linemark++; Lbh = Integer.parseInt(Lines.get(linemark)); 	//08
			System.out.print("Lbh: "+Lbh+ " ");
			linemark++; Lbp = Integer.parseInt(Lines.get(linemark)); 	//09
			System.out.print("Lbp: "+Lbp+ " ");
			linemark++; Rbh = Integer.parseInt(Lines.get(linemark)); 	//10
			System.out.print("Rbh: "+Rbh+ " ");
			linemark++; Rbp = Integer.parseInt(Lines.get(linemark)); 	//11
			System.out.print("Rbp: "+Rbp+ " ");
			linemark++; OT = Boolean.parseBoolean(Lines.get(linemark)); 	//12
			System.out.print("OT: "+OT+ " ");
			linemark++; LOT = Integer.parseInt(Lines.get(linemark)); 	//13
			System.out.print("LOT: "+LOT+ " ");
			linemark++; ROT = Integer.parseInt(Lines.get(linemark)); 	//14
			System.out.print("ROT: "+ROT+ " ");
			linemark++; forfeit = Boolean.parseBoolean(Lines.get(linemark)); //15
			System.out.print("Forfeit: "+forfeit+ " ");
			linemark++; L60 = Integer.parseInt(Lines.get(linemark)); 	//16
			System.out.print("L60: "+L60+ " ");
			linemark++; R60 = Integer.parseInt(Lines.get(linemark)); 	//17
			System.out.println("R60: "+R60+ " ");

			Games.add(new Matches(id, Lteam, Rteam, Lscore, Rscore, tuh, 
						round, Lbh, Lbp, Rbh, Rbp, OT, 
						LOT, ROT, forfeit,L60, R60));
			
			for (int j=0; j<8; j++){ // loop to run through all players for a given match
			for (int k1=0; k1<7; k1++){	
				linemark++;
				leftplayers[i][j][k1] = Float.parseFloat(Lines.get(linemark));
				System.out.print("left("+i+","+j+","+k1+")="+leftplayers[i][j][k1]+" ");
				} // end k1 for loop
			for (int k2=0; k2<7; k2++){	
				linemark++;
				rightplayers[i][j][k2] = Float.parseFloat(Lines.get(linemark));
				System.out.print("right("+i+","+j+","+k2+")="+rightplayers[i][j][k2]+" ");
			} //end k2 for loop
			} //end j for loop
			} //end i for loop for matches
			
			//Add End of File info to EventClass Static Variables

		} // end parseInputArray
		
		public static ArrayList readFile() throws IOException {
			ArrayList<String> Input = new ArrayList<String>(); 
			File file = new File("18Hawks1110");
				Scanner sc4nn3r = new Scanner(file);
				
				while (sc4nn3r.hasNextLine()) {
					Input.add(sc4nn3r.nextLine());
				} // end while
				System.out.println(Input);
				//System.out.println("The teams number is " + Integer.parseInt(Input.get(0)));
				return Input; // Input is an ArrayList we want to return
				//return "ok";
				} // end readInput method
		
		} // close class RomeroMain

