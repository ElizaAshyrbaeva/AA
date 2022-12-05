package service;

import classes.Movie;

import java.util.List;

public interface SortAble {
    void sortByMovieNameA_z(List<Movie> movies);
    void sortByYearAscending(List<Movie> movies);
    void sortByMovieNameZ_a(List<Movie> movies);
    void sortByYearDescending(List<Movie> movies);
    void sortByDirector(List<Movie> movies);
}
