package com.ftn.sbnz.model.models;

public class Review {
  public int rating;
  public String reviewText;
  public Movie movie;
  public User author;

  public Review() {
  }

  public Review(int rating, Movie movie, User author) {
    this.rating = rating;
    this.movie = movie;
    this.author = author;
  }

  public Review(int rating, String reviewText, Movie movie, User author) {
    this.rating = rating;
    this.reviewText = reviewText;
    this.movie = movie;
    this.author = author;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Review: rating=" + rating + ", text=" + reviewText;
  }
}
