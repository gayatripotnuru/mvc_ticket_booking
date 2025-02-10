//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "booking")
//public class BookingEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "booking_id")
//    private int bookingId;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private UserEntity user; // Assuming a User entity exists
//
//    @ManyToOne
//    @JoinColumn(name = "showtime_id", nullable = false)
//    private ShowTimesEntity showtime; // Assuming a Showtime entity exists
//
//    @Column(name = "total_amount", nullable = false, precision = 10, scale = 2)
//    private BigDecimal totalAmount;
//
//    @Column(name = "status", length = 50, nullable = false)
//    private String status;
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt;
//
//    // Getters and Setters
//    public int getBookingId() {
//        return bookingId;
//    }
//
//    public void setBookingId(int bookingId) {
//        this.bookingId = bookingId;
//    }
//
//    public UserEntity getUser() {
//        return user;
//    }
//
//    public void setUser(UserEntity user) {
//        this.user = user;
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
//    public BigDecimal getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(BigDecimal totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//}
