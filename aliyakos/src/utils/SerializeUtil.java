/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author USER
 */
import models.Booking;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeUtil {
    public static void saveBooking(Booking booking) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("booking.ser", true))) {
            out.writeObject(booking);
        } catch (IOException e) {
            System.out.println("Gagal simpan booking: " + e.getMessage());
        }
    }
}

