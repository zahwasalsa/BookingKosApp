/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author USER
 */

import models.Kost;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    public static List<Kost<Integer>> getKostList() {
        List<Kost<Integer>> list = new ArrayList<>();
        list.add(new Kost<>(1, "Kost Mawar", 3));
        list.add(new Kost<>(2, "Kost Melati", 2));
        return list;
    }
}
