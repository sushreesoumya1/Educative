package netflix.feature2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FetchTopMovies {

    public List<Movie> getTopMovieList(int limit, List<Movie>... movies) {
        List<Movie> mergedMovieList = new ArrayList<>();
        for (List<Movie> moviesList : movies) {
            mergedMovieList.addAll(moviesList);
        }
        mergedMovieList.sort(MovieComparator.rankAndNameComparator());

        return mergedMovieList.stream().limit(limit).toList();
    }

}
