//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "reviews")
//public class ReviewEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String comment;
//    private int rating;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id", nullable = false)
//    private MovieEntity movie;
//
//    // Constructors
//    public ReviewEntity() {}
//
//    public ReviewEntity(String comment, int rating, MovieEntity movie) {
//        this.comment = comment;
//        this.rating = rating;
//        this.movie = movie;
//    }
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public MovieEntity getMovie() {
//        return movie;
//    }
//
//    public void setMovie(MovieEntity movie) {
//        this.movie = movie;
//    }
//}
