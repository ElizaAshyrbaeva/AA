package service;

import classes.Movie;

import java.util.List;

public interface Findable {
    List<Movie>getAllMovies(List<Movie>movies);
    void findMovieByName(String name,List<Movie>movies);
    void findMovieByActorName(String actorName,List<Movie>movies);
    void findMovieByYear(int year,List<Movie>movies);
    void findMovieByDirector(String directorName,List<Movie>movies);
    void findMovieByDescription(String descriptionName,List<Movie>movies);
    void findMovieByRole(String roleName,List<Movie>movies);

}
