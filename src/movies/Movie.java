package movies;

public class Movie {
   private String movie;
   private String category;

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMovie() {
        return movie;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return movie;
    }

    public Movie(String movie, String category) {
        this.movie = movie;
        this.category = category;


    }
}
