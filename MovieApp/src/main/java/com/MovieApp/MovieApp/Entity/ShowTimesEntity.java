//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "showtime")
//public class ShowTimesEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "showtime_id")
//    private int showtimeId;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id", nullable = false)
//    private Movie movie; // Assuming a Movie entity exists
//
//    @ManyToOne
//    @JoinColumn(name = "theater_id", nullable = false)
//    private TheaterEntity theater; // Assuming a Theater entity exists
//
//    @Column(name = "start_time", nullable = false)
//    private LocalDateTime startTime;
//
//    @Column(name = "end_time", nullable = false)
//    private LocalDateTime endTime;
//
//    @Column(name = "available_seats", nullable = false)
//    private int availableSeats;
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//
//    // Getters and Setters
//    public int getShowtimeId() {
//        return showtimeId;
//    }
//
//    public void setShowtimeId(int showtimeId) {
//        this.showtimeId = showtimeId;
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//
//    public TheaterEntity getTheater() {
//        return theater;
//    }
//
//    public void setTheater(TheaterEntity theater) {
//        this.theater = theater;
//    }
//
//    public LocalDateTime getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(LocalDateTime startTime) {
//        this.startTime = startTime;
//    }
//
//    public LocalDateTime getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(LocalDateTime endTime) {
//        this.endTime = endTime;
//    }
//
//    public int getAvailableSeats() {
//        return availableSeats;
//    }
//
//    public void setAvailableSeats(int availableSeats) {
//        this.availableSeats = availableSeats;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//}
