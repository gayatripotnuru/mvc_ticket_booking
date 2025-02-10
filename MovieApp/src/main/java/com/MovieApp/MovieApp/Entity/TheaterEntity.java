//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "theater")
//public class TheaterEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "theater_id")
//    private int theaterId;  // Unique identifier
//
//    @Column(name = "name", length = 255, nullable = false)
//    private String name;  // Theater name
//
//    @Lob
//    @Column(name = "address", columnDefinition = "TEXT")
//    private String address;  // Address of the theater
//
//    @Column(name = "city", length = 100, nullable = false)
//    private String city;  // City where the theater is located
//
//    @Column(name = "created_at", updatable = false)
//    private LocalDateTime createdAt;  // Creation timestamp
//
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;  // Last update timestamp
//
//    // Constructors
//    public TheaterEntity() {}
//
//    public TheaterEntity(String name, String address, String city, LocalDateTime createdAt, LocalDateTime updatedAt) {
//        this.name = name;
//        this.address = address;
//        this.city = city;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }
//
//    // Getters and Setters
//    public int getTheaterId() {
//        return theaterId;
//    }
//
//    public void setTheaterId(int theaterId) {
//        this.theaterId = theaterId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
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
