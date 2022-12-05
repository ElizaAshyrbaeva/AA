package service.impl;

import classes.Director;
import classes.Movie;
import service.Findable;

import java.util.List;
import java.util.Scanner;

public class FindImpl implements Findable {


    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(String name, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getName().equals(name)){
                System.out.println(movie);
            }
        }

    }

    @Override
    public void findMovieByActorName(String actorName, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getCast().getActerFullName().equals(actorName)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByYear(int year, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getYear()==year);
            System.out.println(movie.getYear());
        }
    }

    @Override
    public void findMovieByDirector(String directorName, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getDirector().getName().equals(directorName)){
                System.out.println(movie);
            }

        }
    }

    @Override
    public void findMovieByDescription(String descriptionName, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getDescription().equals(descriptionName)){
                System.out.println(movie);
        }
        }

    }

    @Override
    public void findMovieByRole(String roleName, List<Movie> movies) {
        for (Movie movie : movies) {
            if(movie.getCast().getRole().equals(roleName)){
                System.out.println(movie);

            }
        }

    }
}
