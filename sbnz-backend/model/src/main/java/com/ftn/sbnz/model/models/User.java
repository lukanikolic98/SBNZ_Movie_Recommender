package com.ftn.sbnz.model.models;

import java.util.ArrayList;

public class User extends Person {
  public ArrayList<Genres> favoriteGenres;
  public ArrayList<Review> reviews;
  public ArrayList<Movie> watched;
  public ArrayList<Movie> watchList;
  public ArrayList<Keyword> prefferedKeywords;
  public ArrayList<MoviePrediction> predictions;

  public User() {
    super();
  }

  public User(String username, String password, ArrayList<Genres> favoriteGenres, ArrayList<Review> reviews,
      ArrayList<Movie> watched,
      ArrayList<Movie> watchList, ArrayList<Keyword> keywords, ArrayList<MoviePrediction> predictions) {
    super(username, password);
    this.favoriteGenres = favoriteGenres;
    this.reviews = reviews;
    this.watched = watched;
    this.watchList = watchList;
    this.prefferedKeywords = keywords;
    this.predictions = predictions;
  }

  public ArrayList<Genres> getFavoriteGenres() {
    return favoriteGenres;
  }

  public void setFavoriteGenres(ArrayList<Genres> favoriteGenres) {
    this.favoriteGenres = favoriteGenres;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  public ArrayList<Movie> getWatched() {
    return watched;
  }

  public void setWatched(ArrayList<Movie> watched) {
    this.watched = watched;
  }

  public ArrayList<Movie> getWatchList() {
    return watchList;
  }

  public void setWatchList(ArrayList<Movie> watchList) {
    this.watchList = watchList;
  }

  public ArrayList<Keyword> getPrefferedKeywords() {
    return prefferedKeywords;
  }

  public void setPrefferedKeywords(ArrayList<Keyword> prefferedKeywords) {
    this.prefferedKeywords = prefferedKeywords;
  }

  public ArrayList<MoviePrediction> getPredictions() {
    return predictions;
  }

  public void setPredictions(ArrayList<MoviePrediction> predictions) {
    this.predictions = predictions;
  }

  @Override
  public String toString() {
    return "User: username=" + this.username + ", password=" + this.password;
  }
}
