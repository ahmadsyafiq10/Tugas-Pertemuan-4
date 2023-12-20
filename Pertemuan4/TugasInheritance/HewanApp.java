/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.TugasInheritance;

/**
 *
 * @author asus
 */
public class HewanApp {
     public static void main(String[] args) {
        Hewan hewan = new Hewan();
        
        hewan.bersuara("Doggy");
        Kucing Kucing = new Kucing();
        Kucing.suara();
        
        hewan.bersuara("Katty");
        Kucing kucing = new Kucing();
        kucing.suara();
        
        hewan.bersuara("Sappy");        
        Sapi sapi = new Sapi();
        sapi.suara();
        
        hewan.bersuara("Wofly");
        Serigala serigala = new Serigala();
        serigala.suara();

        hewan.bersuara("Lion");        
        Burung Burung = new Burung();
        Burung.suara();
    }
}
