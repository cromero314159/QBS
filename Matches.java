//This is a class that can be instantiated for each match
public class Matches {
	int id=-1;		
	int leftscore = 0; int rightscore =0;
	int leftteam = 0; 	int rightteam = 0; 
	int tuh = 0; 		int round = 0; 
	int leftbonusheard = 0; int leftbonuspoints = 0;
	int rightbonusheard = 0; int rightbonuspoints = 0; 
	boolean OT = false; 
	boolean forfeit = false;
	boolean SixtySec = false; 
	int leftOT = 0; int rightOT = 0;
	int left60 = 0; int right60 = 0;
	
	int leftplayers[][] = new int[6][7]; 
	int rightplayers[][] = new int[6][7]; 
	
	String rightname[] = new String[20]; 
	String leftname[] = new String[20]; 
	String gameid[] = new String[20];
	
	
	
	
	public Matches (int id, int leftteam, int rightteam, 
					int leftscore, int rightscore, int tuh, 
					int round, int leftbonusheard, int leftbonuspoints, 
					int rightbonusheard, int rightbonuspoints,
					boolean OT, int leftOT, int rightOT, 
					boolean forfeit, int left60, int right60){
		
		this.id = id; 					//01
		this.leftteam = leftteam;		//02
		this.rightteam = rightteam; 	//03
		this.leftscore= leftscore;  	//04
		this.rightscore= rightscore;	//05
		this.tuh = tuh; 				//06
		this.round = round;				//07
		this.leftbonusheard = leftbonusheard;		//08
		this.rightbonusheard = rightbonusheard;		//09
		this.leftbonuspoints = leftbonuspoints;		//10
		this.rightbonuspoints = rightbonuspoints;	//11
		this.OT = OT;								//12
		this.rightOT = rightOT;						//13
		this.leftOT = leftOT;						//14
		this.forfeit = forfeit;						//15
		this.left60 = left60;						//16
		this.right60 =right60;						//17
	}
	
	//constructor to assign id after call to instantiate
	public Matches (int id){
		this.id = id; 
	}
	
	
	
	

}
