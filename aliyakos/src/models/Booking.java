/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author USER
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {
    private String namaUser;
    private String namaKost;
    private LocalDate tanggal;

    public Booking(String namaUser, String namaKost, LocalDate tanggal) {
        this.namaUser = namaUser;
        this.namaKost = namaKost;
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return namaUser + " booking " + namaKost + " pada " + tanggal.toString();
    }
}