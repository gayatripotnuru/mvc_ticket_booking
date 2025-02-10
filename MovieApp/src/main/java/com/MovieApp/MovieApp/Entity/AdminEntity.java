//package com.MovieApp.MovieApp.Entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "admin")
//public class AdminEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "admin_id")
//    private int adminId;
//
//    @Column(name = "first_name", length = 100, nullable = false)
//    private String firstName;
//
//    @Column(name = "last_name", length = 100, nullable = false)
//    private String lastName;
//
//    @Column(name = "email", length = 255, nullable = false, unique = true)
//    private String email;
//
//    @Column(name = "password_hash", length = 255, nullable = false)
//    private String passwordHash;
//
//    @Column(name = "role", length = 50, nullable = false)
//    private String role; // Example: SuperAdmin, TheaterManager
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_by")
//    private String updatedBy; // Stores the username or ID of the user who last updated the record
//
//    // Constructors
//    public AdminEntity() {
//    }
//
//    // Getters and Setters
//    public int getAdminId() {
//        return adminId;
//    }
//
//    public void setAdminId(int adminId) {
//        this.adminId = adminId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPasswordHash() {
//        return passwordHash;
//    }
//
//    public void setPasswordHash(String passwordHash) {
//        this.passwordHash = passwordHash;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
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
