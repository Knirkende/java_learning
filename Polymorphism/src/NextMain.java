
public class NextMain {
	public static void main(String[] args) {
		Movie theMovie = Movie.getMovie("Comedy", "Lol");
		theMovie.watchMovie();
		
		Adventure adventure = (Adventure) Movie.getMovie("A", "Abc");
		adventure.watchMovie();
		
		Object comedy = Movie.getMovie("C", "Comedy");
		Comedy comedyMovie = (Comedy) comedy;
		comedyMovie.watchComedy();
		//local variable type inference
		var airplane = Movie.getMovie("Comedy", "Airplane");
		airplane.watchMovie();
		
		var plane = new Comedy("Airplane");
		plane.watchComedy();
		
		Object unknown = Movie.getMovie("A", "Funny bones");
		
		if (unknown instanceof Comedy) {
			((Comedy) unknown).watchMovie();
		} else if (unknown instanceof Adventure adv) {
			adv.watchMovie();
		}
	}
}
