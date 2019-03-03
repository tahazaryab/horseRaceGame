import java.io.IOException;
public class HorseRace {
	
	private static int rNum() {
		return((int)(Math.random()*100+1));
	}
	
		
	private static void ShowHorse(int hNum, int position) {
		System.out.print(hNum+"|");
			
		for (int i=0;i<110;i++) {
			if(i==position)
				System.out.print("H");
			else
				System.out.print("-");
		}
		System.out.print("|\n");
	}
		
		public static void main(String[] args) throws IOException, InterruptedException { 
			
			int pos1=0, pos2=0, pos3=0, winner=0;
			while (pos1!=110 && pos2!=110 && pos3!=110) {
				if(rNum()>50) {
					pos1+=1;
				}
				if(rNum()>50) {
					pos2+=1;
				}
				if(rNum()>50) {
					pos3+=1;
				}
				ShowHorse(1, pos1);
				ShowHorse(2, pos2);
				ShowHorse(3, pos3);
				Thread.sleep(100);
				
				for(int i=0;i<=20;i++) {
					System.out.println(" ");
				}
			}
			
			if(pos1==110)
				winner=1;
			else if(pos2==110)
				winner=2;
			else if(pos3==110)
				winner=3;
			
			System.out.println("\n\n The winner is horse #"+winner);
			

	}

}
