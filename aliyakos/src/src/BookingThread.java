/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author USER
 */
import models.Kost;
import models.Booking;
import utils.SerializeUtil;
import utils.LogUtil;
import java.time.LocalDate;

public class BookingThread extends Thread {
    private Kost<Integer> kost;
    private String user;

    public BookingThread(Kost<Integer> kost, String user) {
        this.kost = kost;
        this.user = user;
    }

    @Override
    public void run() {
        if (kost.getSisaKamar() > 0) {
            kost.kurangiKamar();
            System.out.println("Booking berhasil untuk " + user + " di " + kost.getNama());
            LogUtil.log("User " + user + " booking " + kost.getNama());

            // Simpan booking ke file .ser
            Booking b = new Booking(user, kost.getNama(), LocalDate.now());
            SerializeUtil.saveBooking(b);
        } else {
            System.out.println("Kamar penuh di " + kost.getNama());
        }
    }
}