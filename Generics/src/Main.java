import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FootballPlayer a = new FootballPlayer("a");
		FootballPlayer x = new FootballPlayer("a");
		BaseballPlayer b = new BaseballPlayer("b");
		SoccerPlayer c = new SoccerPlayer("c");
		
		Team<FootballPlayer> d = new Team<>("d");
		d.addPlayer(a);
		d.addPlayer(x);
//		d.addPlayer(b);
//		d.addPlayer(c);
		
		Team<BaseballPlayer> bTeam = new Team<>("e");
		bTeam.addPlayer(b);
	}
}
