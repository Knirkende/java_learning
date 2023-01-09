import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " duplicate");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " okay");
			return true;
		}
	
	}
	
	@Override
	public int compareTo(Team<T> other) {
		return this.won - other.won;
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			won ++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		if (opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}
	
}
