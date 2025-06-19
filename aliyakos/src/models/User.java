/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author USER
 */

public class User {
    private String nama;
    private String passwordHash;

    public User(String nama, String passwordHash) {
        this.nama = nama;
        this.passwordHash = passwordHash;
    }

    public String getNama() { return nama; }
    public String getPasswordHash() { return passwordHash; }
}