/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.InheritanceBangunDatar;

/**
 *
 * @author asus
 */
public class BangunDatarApp {
    public static void main(String[] args) {
        //object bangun datar
        BangunDatar bangundatar= new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
                
        Lingkaran lingkaran= new Lingkaran();
        lingkaran.r =22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 4;
        persegiPanjang.panjang= 8;
        
        
        //menunjukkan inheritage
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
    }
}
