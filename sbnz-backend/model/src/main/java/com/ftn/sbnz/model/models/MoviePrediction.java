package com.ftn.sbnz.model.models;

public class MoviePrediction {
  public float score;
  public Movie movie;

  public MoviePrediction() {
  }

  public MoviePrediction(float score, Movie movie) {
    this.score = score;
    this.movie = movie;
  }

  public float getScore() {
    return score;
  }

  public void setScore(float score) {
    this.score = score;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  @Override
  public String toString() {
    return "Movie prediction: score=" + score + ", movie=" + movie.getName();
  }
}
