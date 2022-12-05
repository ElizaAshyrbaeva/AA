import classes.Cast;
import classes.Director;
import classes.Movie;
import service.SortAble;
import service.impl.FindImpl;
import service.impl.SortImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortAble sort = new SortImpl();
        FindImpl find = new FindImpl();
        Scanner scanner1 = new Scanner(System.in);
        Cast cast1 = new Cast("Kit Harrington", "Jon Snow");
        Cast cast2 = new Cast("Brad Pitt", "Tyler Durden");
        Cast cast3 = new Cast("Leonardo DiCaprio", "Jack Dawson");
        Cast cast4 = new Cast("Jenna Ortega", "Wednesday Addams");
        Cast cast5 = new Cast("Ryan Reynolds", "Wade Wilson");

        List<Cast> casts = new ArrayList<>(Arrays.asList(cast1, cast2,cast3,cast4,cast4,cast5));

        Director director1 = new Director("Brian De Palma");
        Director director2 = new Director("David Fincher");
        Director director3 = new Director("James Cameron");
        Director director4 = new Director("Tim Miller");
        Director director5 = new Director("Damien Chazelle");

        Movie movie1 = new Movie("Mission Impossible", 1996, "Movie", director1, cast1);
        Movie movie2 = new Movie("Fight club", 1999, "Movie", director2, cast2);
        Movie movie3 = new Movie("Titanic", 1997, "Movie", director3, cast3);
        Movie movie4 = new Movie("La-La-Lend", 2016, "Movie", director4, cast4);
        Movie movie5 = new Movie("Deadpool", 2016, "Movie", director5, cast5);

        List<Movie>movies = new ArrayList<>(Arrays.asList(movie1,movie2,movie3,movie4,movie5));

        while (true) {
            System.out.println(
                    """
                            =======================COMMANDS=====================
                            Press 1 to print catalog
                            Press 2 to find a movie by full or name
                            Press 3 to sort by year
                            Press 4 to sort by name
                            Press 5 to sort by director
                            Press 6 to find movies by actor's name
                            Press 7 to find movies by director's name
                            Press 8 to find movies by year
                            Press 9 to list all movies and roles by actor's name
                            Press 10 to sort list of all actor's with his roles
                            ====================================================
                            """
            );
            break;
        };
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~ALL MOVIES~~~~~~~~~~~~~~~");
                    find.getAllMovies(movies).forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Write movies name: ");
                    find.findMovieByName(scanner1.nextLine(), movies);
                    break;
                case 3:
                    System.out.println("""
                            Press 1 to sort by ascending
                            Press 2 to sort by descending
                            """);
                    switch (scanner.nextInt()) {
                        case 1 -> sort.sortByYearAscending(movies);
                        case 2 -> sort.sortByYearDescending(movies);
                        default -> System.out.println("Error press!!");
                    }
                    break;
                case 4:
                    System.out.println("""
                            Press 1 to sort by A-z
                            Press 1 to sort by Z-a
                            """);
                    switch (scanner.nextInt()) {
                        case 1 -> sort.sortByMovieNameA_z(movies);
                        case 2 -> sort.sortByMovieNameZ_a(movies);
                        default -> System.out.println("Error write!!");
                    }
                case 5:
                    sort.sortByDirector(movies);
                    break;
                case 6:
                    System.out.println("Write actor's name: ");
                    find.findMovieByActorName(scanner1.nextLine(), movies);
                    break;
                case 7:
                    System.out.println("Write director's name: ");
                    find.findMovieByDirector(scanner1.nextLine(), movies);
                    break;
                case 8:
                    System.out.println("Write the year: ");
                    find.findMovieByYear(scanner1.nextInt(), movies);
                    break;
                case 9:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Write actor's name: ");
                    String actName = scanner2.nextLine();
                    System.out.println("------------------------------------");
                    System.out.println("           Actor: " + actName);
                    System.out.println("------------------------------------");
                    find.findMovieByActorName(actName, movies);
                    break;
                    case 10:
                    System.out.println("Write actor's role: ");
                    find.findMovieByRole(scanner1.nextLine(), movies);
                    break;
                default:
                    System.out.println("Error writhing!!");
            }
        }
    }

