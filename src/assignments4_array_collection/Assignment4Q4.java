package assignments4_array_collection;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q4 {

	public static void main(String[] args) {
		
		List<String> highest_grossing_movies = new ArrayList<String>();
		highest_grossing_movies.add("KGF");
		highest_grossing_movies.add("SALAAR");
		highest_grossing_movies.add("3 IDIOTS");
		highest_grossing_movies.add("BAHUBALI");
		highest_grossing_movies.add("JAWAAN");
		
		System.out.println("The third movie on the list is :" + highest_grossing_movies.get(2));
		
	}

}
