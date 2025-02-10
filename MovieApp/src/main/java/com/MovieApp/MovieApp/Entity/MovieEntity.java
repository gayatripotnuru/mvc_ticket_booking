//package com.MovieApp.MovieApp.Entity;
//
//import java.sql.Date;
//import jakarta.persistence.*;
//
//@Entity
//@Table(name="movie")
//public class MovieEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movie_id")
//    private int movieId;
//
//    @Column(name = "title", nullable = false)
//    private String title;
//
////    @Column(name = "description")
//    private String description;
//
//    @Column(name = "release_date", nullable = false)
//    private Date releaseDate;
//
//    @Column(name = "duration")
//    private int duration;
//
//    @Column(name = "language")
//    private String language;
//
//    @Column(name = "genre")
//    private String genre;
//
//    @Column(name = "rating")
//    private int rating;
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private Date createdAt;
//
//    @Column(name = "updated_by")
//    private String updatedBy; // Changed to store username or admin ID who updated the record
//
//    // Getters and Setters
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public int getDuration() {
//        return duration;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
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
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public String getUpdatedBy() {
//        return updatedBy;
//    }
//
//    public void setUpdatedBy(String updatedBy) {
//        this.updatedBy = updatedBy;
//    }
//}
