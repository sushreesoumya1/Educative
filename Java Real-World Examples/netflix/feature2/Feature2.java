package netflix.feature2;

import java.util.ArrayList;
import java.util.List;

public class Feature2 {

    public static void main(String[] args) {
        List<Movie> movieList1 = Movie.getMovieList1();
        List<Movie> movieList2 = Movie.getMovieList2();
        List<Movie> movieList3 = Movie.getMovieList3();
        FetchTopMovies fetchTopMovies = new FetchTopMovies();
        List<Movie> mergedMovieList = fetchTopMovies.getTopMovieList(10, movieList1, movieList2, movieList3);
        mergedMovieList.stream()
                .map(m -> m.movieName() + " - " + m.movieRank())
                .forEach(System.out::println);

    }
}
