
class Movie {
	private String title;
	
	public Movie(String title) {
		super();
		this.title = title;
	}

	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName();
		System.out.println("Watched " + title + ", type " + instanceType);
	}
	// factory method
	public static Movie getMovie(String type, String title) {
		return switch (type.toUpperCase().charAt(0)) {
			case 'A' -> new Adventure(title);
			case 'C' -> new Comedy(title);
			case 'S' -> new ScienceFiction(title);
			default -> new Movie(title);
		};
	}
}

class Adventure extends Movie {
	
	public Adventure(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.println("Exciting");
	}
	
	public void watchAdventure() {
		System.out.println("Watching adv");
	}
	
}

class Comedy extends Movie {
	
	public Comedy(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.println("Haha");
	}
	
	public void watchComedy() {
		System.out.println("Watching com");
	}
}

class ScienceFiction extends Movie {
	
	public ScienceFiction(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.println("Spaaaace!");
	}
	
	public void watchScienceFiction() {
		System.out.println("Watching scifi");
	}
	
}
