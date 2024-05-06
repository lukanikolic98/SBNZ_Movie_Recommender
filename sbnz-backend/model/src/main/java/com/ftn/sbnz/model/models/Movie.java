package com.ftn.sbnz.model.models;

import java.util.ArrayList;

public class Movie {
  public float rating;
  public String name;
  public String description;
  public ArrayList<Genres> genres;
  public ArrayList<Review> reviews;
  public ArrayList<Keyword> keywords;

  public Movie() {
  }

  public Movie(float rating, String name, String description, ArrayList<Genres> genres, ArrayList<Review> reviews,
      ArrayList<Keyword> keywords) {
    this.rating = rating;
    this.name = name;
    this.description = description;
    this.genres = genres;
    this.reviews = reviews;
    this.keywords = keywords;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ArrayList<Genres> getGenres() {
    return genres;
  }

  public void setGenres(ArrayList<Genres> genres) {
    this.genres = genres;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  public ArrayList<Keyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(ArrayList<Keyword> keywords) {
    this.keywords = keywords;
  }

  @Override
  public String toString() {
    return "Movie: " + name + ", rating " + rating;
  }
}
