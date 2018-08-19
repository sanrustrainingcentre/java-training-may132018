
public class Demo {

	public static void main(String[] args) {
		
		SachinTendulkar sachin = new SachinTendulkar();
		sachin.bat();
		sachin.bowl();
		sachin.field();
		sachin.wicketKeeping();
		sachin.playTennis();
		
		
		PlayerA playerA = new PlayerA();
		playerA.playTennis();
		
		CanPlayCricket[] cricketPlayers = new CanPlayCricket[11];
		cricketPlayers[0] = new SachinTendulkar();
		
		CanPlayTennis[] tennisPlayers = new CanPlayTennis[2];
		tennisPlayers[0] = new SachinTendulkar();
		
		if (tennisPlayers[0] instanceof CanPlayCricket) {
			((CanPlayCricket) tennisPlayers[0]).bat();
		}
		

	}

}
