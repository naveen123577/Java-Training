package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {

    LinkedHashMap<Movie,Integer> movieMap;

    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
    public MovieService() {
        movieMap=new LinkedHashMap<>();
    }

    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {


        return movieMap;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
        movieMap.put(movie,rating);

        return movieMap.entrySet();
    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {

        List<String> l=new ArrayList<>();
        for (Map.Entry<Movie,Integer> entry:movieMap.entrySet())
        {
            if (entry.getValue()>=rating)
                l.add(entry.getKey().getMovieName());
        }

        return l;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {

        List <String> gm=new ArrayList<>();
        for (Map.Entry<Movie,Integer> entry:movieMap.entrySet())
        {
            if (entry.getKey().getGenre().equalsIgnoreCase(genre))
            {
                gm.add(entry.getKey().getMovieName());
            }
        }
        return gm;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List<String> lm=new ArrayList<>();
        for (Map.Entry<Movie,Integer> entry:movieMap.entrySet())
        {
            if (entry.getKey().getReleaseDate().compareTo(releaseDate)>0 && entry.getValue()<=3)
            {
                lm.add(entry.getKey().getMovieName());
            }
        }
        return lm;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
        //return null;
        TreeMap<Movie,LocalDate> sortedMovie = new TreeMap<>();
        List<Movie> movieRelease = new ArrayList<>();

        for (var dateMovie : movieMap.entrySet()){
            sortedMovie.put(dateMovie.getKey(), dateMovie.getKey().getReleaseDate());
        }
        for(Movie movie: sortedMovie.keySet()){
            movieRelease.add(movie);
        }
        return  movieRelease;
    }

    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
        //return null;
        List<Map.Entry<Movie, Integer>> movieList = new LinkedList<>(movieMap.entrySet());
        movieList.sort(Map.Entry.comparingByValue());
        Map<Movie, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Movie, Integer> entry : movieList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}