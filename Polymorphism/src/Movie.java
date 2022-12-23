
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
	
}
