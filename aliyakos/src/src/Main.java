/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author USER
 */
import models.*;
import utils.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Simulasi login
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();
        String hashed = CryptoUtil.hashPassword(pass);
        User user = new User(nama, hashed);
        System.out.println("Login berhasil sebagai: " + user.getNama());

        // Tampilkan kost
        List<Kost<Integer>> listKost = DBUtil.getKostList();
        System.out.println("\nDaftar Kost:");
        for (Kost<Integer> k : listKost) {
            System.out.println(k.getId() + ". " + k.getNama() + " - Sisa kamar: " + k.getSisaKamar());
        }

        // Pilih dan booking
        System.out.print("\nPilih ID kost yang ingin dibooking: ");
        int pilih = sc.nextInt();
        for (Kost<Integer> k : listKost) {
            if (k.getId() == pilih) {
                BookingThread thread = new BookingThread(k, user.getNama());
                thread.start();
                thread.join(); // tunggu sampai selesai
                break;
            }
        }

        System.out.println("Selesai.");
    }
}
