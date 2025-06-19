/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author USER
 */

import java.io.FileWriter;
import java.io.IOException;

public class LogUtil {
    public static void log(String data) {
        try (FileWriter writer = new FileWriter("log_booking.txt", true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Gagal log.");
        }
    }
}