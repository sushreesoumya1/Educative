package netflix.feature2;

import java.util.Comparator;

public class MovieComparator {

    public static Comparator<Movie> rankAndNameComparator(){
        return Comparator.comparing(Movie::movieRank)
                        .thenComparing(Movie::movieName);

    }
}
