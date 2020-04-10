import java.util.Random;
public class stonepaperscissors 
{
	public static void main(String args[])
	{	System.out.println("\n\t\t\t\t\t\tLETS PLAY ROCK,PAPER,SCISSORS");
		System.out.println("\t\t\t\t\t\t_____________________________");
		
	 try {
            
            Thread.sleep(2000);//to improve the visualiazation
         } catch (Exception e) {
            System.out.println(e);
         }
		String choice[]={"ROCKS","PAPER","SCISSORS"};
		for(int i=1;i<=50;i++)
		{	System.out.println("\nROUND:"+i);
			String playersmove[]=new String[4];//playersmove[] array is having all the fourplayers move
			playersmove=selectchoice(choice);
			Matches(playersmove);
			System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
		}
		

	}
	

 public static String[] selectchoice(String c[])//this function helps to generate computer's input
	{
		String fourplayers[]=new String[4];
		Random r=new Random();
		for(int i=0;i<fourplayers.length;i++)
		{
			int randomnum=r.nextInt(c.length);
			fourplayers[i]=c[randomnum];
			

		}
	return fourplayers;

	} 
public static void Matches(String playersmove[])//to select each and every player with other players
	{	for(int i=0;i<playersmove.length;i++)
		{	String firstp=playersmove[i];
			String secondp="";
			for(int j=0;j<playersmove.length;j++)
			{	if(i!=j)
				{	secondp=playersmove[j];
					VsMatches(i+1,j+1,firstp,secondp);
					
				}
			}
		
		
		}

	}
public static void VsMatches(int p,int q,String movep1,String movep2)//description which player is against which player
	{	
		System.out.println("\nPlayer"+" "+p+" VS"
					+" Player"+" "+q);
		System.out.println("----------------------------");
		System.out.println("Player"+p+" move:"+movep1+"\n"
					+"Player"+q+" move:"+movep2);
		System.out.println("RESULT:"+check_who_won(p,q,movep1,movep2));
		System.out.println("----------------------------");

	}
public static String check_who_won(int p,int q,String movep1,String movep2)//Logic behind the game
	{
		if(movep1.equals(movep2))
		return "MATCH TIE";
		else if(movep1=="ROCKS" && movep2=="PAPER")
		return "WINNER IS PLAYER"+q;
		else if(movep1=="PAPER" && movep2=="SCISSORS")
		return "WINNER IS PLAYER"+q;
		else if(movep1=="SCISSORS" && movep2=="ROCKS")
		return "WINNER IS PLAYER"+q;
		else 
		return "WINNER IS PLAYER"+p;

	}


}
