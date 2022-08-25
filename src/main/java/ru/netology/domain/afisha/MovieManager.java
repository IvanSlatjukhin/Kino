package ru.netology.domain.afisha;

public class MovieManager {
    private MovieData[] movies = new MovieData[0];
    private int countMovies = 10;

    public MovieManager() {
    }

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    public int getCountMovies() {
        return countMovies;
    }

    public void setCountMovies(int countMovies) {
        this.countMovies = countMovies;
    }

    public void add(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length - 1] = movie;
        movies = tmp;
    }

    public MovieData[] findAll() {

        return movies;
    }

    public void findLast(MovieData movie) {
        int lenght;
        if (movies.length < countMovies) {
            lenght = movies.length;
        } else {
            lenght = countMovies;
        }
        MovieData[] tmp = new MovieData[countMovies];
        int i;
        for (i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        tmp[movies.length - 1 - i] = movie;
        movies = tmp;
    }
    public MovieData[] findLast() {
        return movies;
    }
}