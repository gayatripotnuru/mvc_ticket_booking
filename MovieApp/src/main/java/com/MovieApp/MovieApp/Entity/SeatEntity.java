//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "seat")
//public class SeatEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "seat_id")
//    private int seatId;
//
//    @ManyToOne
//    @JoinColumn(name = "showtime_id", nullable = false)
//    private ShowTimesEntity showtime; // Assuming a Showtime entity exists
//
//    @Column(name = "seat_number", length = 10, nullable = false, unique = true)
//    private String seatNumber;
//
//    @Column(name = "seat_type", length = 50, nullable = false)
//    private String seatType;
//
//    @Column(name = "availability", nullable = false)
//    private boolean availability;
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_by", length = 100, nullable = false)
//    private String updatedBy;
//
//    // Getters and Setters
//    public int getSeatId() {
//        return seatId;
//    }
//
//    public void setSeatId(int seatId) {
//        this.seatId = seatId;
//    }
//
//    public ShowTimesEntity getShowtime() {
//        return showtime;
//    }
//
//    public void setShowtime(ShowTimesEntity showtime) {
//        this.showtime = showtime;
//    }
//
//    public String getSeatNumber() {
//        return seatNumber;
//    }
//
//    public void setSeatNumber(String seatNumber) {
//        this.seatNumber = seatNumber;
//    }
//
//    public String getSeatType() {
//        return seatType;
//    }
//
//    public void setSeatType(String seatType) {
//        this.seatType = seatType;
//    }
//
//    public boolean isAvailability() {
//        return availability;
//    }
//
//    public void setAvailability(boolean availability) {
//        this.availability = availability;
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
//    public String getUpdatedBy() {
//        return updatedBy;
//    }
//
//    public void setUpdatedBy(String updatedBy) {
//        this.updatedBy = updatedBy;
//    }
//}
