package netflix.feature2;

import java.util.List;

public record Movie(String movieName,
                    int movieRank,
                    List<String> movieLanguages,
                    String movieOriginCountry) {

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        String movieName;
        int movieRank;
        List<String> movieLanguages;
        String movieOriginCountry;

        public Builder movieName(String movieName){
            this.movieName = movieName;
            return this;
        }
        public Builder movieRank(int movieRank){
            this.movieRank = movieRank;
            return this;
        }
        public Builder movieLanguages(List<String> movieLanguages){
            this.movieLanguages = movieLanguages;
            return this;
        }
        public Builder movieOriginCountry(String movieOriginCountry){
            this.movieOriginCountry = movieOriginCountry;
            return this;
        }
        public Movie build(){
            return new Movie(movieName, movieRank, movieLanguages, movieOriginCountry);
        }
    }

    public static List<Movie> getMovieList1() {

        List<Movie> movies = List.of(
                Movie.builder()
                        .movieName("RRR")
                        .movieRank(1)
                        .movieLanguages(List.of("Telugu", "Hindi", "English"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Inception")
                        .movieRank(2)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Parasite")
                        .movieRank(3)
                        .movieLanguages(List.of("Korean"))
                        .movieOriginCountry("South Korea")
                        .build(),

                Movie.builder()
                        .movieName("3 Idiots")
                        .movieRank(4)
                        .movieLanguages(List.of("Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Interstellar")
                        .movieRank(5)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Baahubali")
                        .movieRank(6)
                        .movieLanguages(List.of("Telugu", "Tamil", "Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Spirited Away")
                        .movieRank(7)
                        .movieLanguages(List.of("Japanese"))
                        .movieOriginCountry("Japan")
                        .build(),

                Movie.builder()
                        .movieName("The Dark Knight")
                        .movieRank(8)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Dangal")
                        .movieRank(9)
                        .movieLanguages(List.of("Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Avatar")
                        .movieRank(10)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build()
        );
        return movies;
    }
    public static List<Movie> getMovieList2() {
        List<Movie> movies2 = List.of(
                Movie.builder()
                        .movieName("Joker")
                        .movieRank(1)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("KGF")
                        .movieRank(2)
                        .movieLanguages(List.of("Kannada", "Hindi", "Telugu"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Oldboy")
                        .movieRank(3)
                        .movieLanguages(List.of("Korean"))
                        .movieOriginCountry("South Korea")
                        .build(),

                Movie.builder()
                        .movieName("Lagaan")
                        .movieRank(4)
                        .movieLanguages(List.of("Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("The Godfather")
                        .movieRank(5)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Your Name")
                        .movieRank(6)
                        .movieLanguages(List.of("Japanese"))
                        .movieOriginCountry("Japan")
                        .build(),

                Movie.builder()
                        .movieName("Pushpa")
                        .movieRank(7)
                        .movieLanguages(List.of("Telugu", "Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("Fight Club")
                        .movieRank(8)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Train to Busan")
                        .movieRank(9)
                        .movieLanguages(List.of("Korean"))
                        .movieOriginCountry("South Korea")
                        .build(),

                Movie.builder()
                        .movieName("Titanic")
                        .movieRank(10)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build()
        );
        return movies2;
    }
    public static List<Movie> getMovieList3() {
        List<Movie> movies3 = List.of(
                Movie.builder()
                        .movieName("Oppenheimer")
                        .movieRank(1)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Drishyam")
                        .movieRank(2)
                        .movieLanguages(List.of("Malayalam", "Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("The Matrix")
                        .movieRank(3)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Jai Bhim")
                        .movieRank(4)
                        .movieLanguages(List.of("Tamil"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("The Lion King")
                        .movieRank(5)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Ponniyin Selvan")
                        .movieRank(6)
                        .movieLanguages(List.of("Tamil", "Hindi"))
                        .movieOriginCountry("India")
                        .build(),

                Movie.builder()
                        .movieName("The Departed")
                        .movieRank(7)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("Memories of Murder")
                        .movieRank(8)
                        .movieLanguages(List.of("Korean"))
                        .movieOriginCountry("South Korea")
                        .build(),

                Movie.builder()
                        .movieName("Top Gun")
                        .movieRank(9)
                        .movieLanguages(List.of("English"))
                        .movieOriginCountry("USA")
                        .build(),

                Movie.builder()
                        .movieName("RRR Reloaded")
                        .movieRank(10)
                        .movieLanguages(List.of("Telugu", "Hindi"))
                        .movieOriginCountry("India")
                        .build()
        );
        return movies3;
    }
}
