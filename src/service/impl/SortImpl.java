package service.impl;

import classes.Movie;
import service.SortAble;

import java.net.SocketImpl;
import java.util.Comparator;
import java.util.List;

public class SortImpl implements SortAble {


    @Override
    public void sortByMovieNameA_z(List<Movie> movies) {
        movies.sort(sortByMovieName);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearAscending(List<Movie> movies) {
        movies.sort(sortByYear1);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByMovieNameZ_a(List<Movie> movies) {
        movies.sort(sortByMovieNameZ_a);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearDescending(List<Movie> movies) {
        movies.sort(sortByYear1Descending);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortByDirector);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public static Comparator<Movie> sortByMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> sortByYear1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };



    public static Comparator<Movie> sortByMovieNameZ_a = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByYear1Descending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    };
    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };


}

