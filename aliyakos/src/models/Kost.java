/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author USER
 */

public class Kost<T> {
    private T id;
    private String nama;
    private int sisaKamar;

    public Kost(T id, String nama, int sisaKamar) {
        this.id = id;
        this.nama = nama;
        this.sisaKamar = sisaKamar;
    }

    public T getId() { return id; }
    public String getNama() { return nama; }
    public int getSisaKamar() { return sisaKamar; }
    public void kurangiKamar() { this.sisaKamar--; }
}