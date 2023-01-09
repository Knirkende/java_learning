
abstract class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

class BaseballPlayer extends Player {
	public BaseballPlayer(String name) {
		super(name);
	}
	
}

class FootballPlayer extends Player {
	public FootballPlayer(String name) {
		super(name);
	}
	
}

class SoccerPlayer extends Player {
	public SoccerPlayer(String name) {
		super(name);
	}
	
}