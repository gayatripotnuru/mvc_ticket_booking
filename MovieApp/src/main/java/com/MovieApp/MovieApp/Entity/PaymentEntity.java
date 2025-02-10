////package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "payment")
//public class PaymentEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "payment_id")
//    private int paymentId;
//
//    @ManyToOne
//    @JoinColumn(name = "booking_id", nullable = false)
//    private BookingEntity booking; // Assuming a Booking entity exists
//
//    @Column(name = "payment_method", length = 50, nullable = false)
//    private String paymentMethod;
//
//    @Column(name = "amount", precision = 10, scale = 2, nullable = false)
//    private double amount;
//
//    @Column(name = "payment_date", nullable = false)
//    private LocalDateTime paymentDate;
//
//    @Column(name = "status", length = 50, nullable = false)
//    private String status;
//
//    // Getters and Setters
//    public int getPaymentId() {
//        return paymentId;
//    }
//
//    public void setPaymentId(int paymentId) {
//        this.paymentId = paymentId;
//    }
//
//    public BookingEntity getBooking() {
//        return booking;
//    }
//
//    public void setBooking(BookingEntity booking) {
//        this.booking = booking;
//    }
//
//    public String getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    public LocalDateTime getPaymentDate() {
//        return paymentDate;
//    }
//
//    public void setPaymentDate(LocalDateTime paymentDate) {
//        this.paymentDate = paymentDate;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//}
