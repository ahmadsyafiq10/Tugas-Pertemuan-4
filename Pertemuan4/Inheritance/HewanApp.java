/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Inheritance;

/**
 *
 * @author asus
 */
public class HewanApp {
    public static void main(String[] args) {
    Enemy enemy = new Enemy();
    
    Kucing kucing = new Kucing();
    kucing.name ="Neko";
    kucing.hp= 80;
    kucing.attackpoin=15;
    System.out.println(kucing.name +" Healt Point = "+kucing.hp + " Attack poin = "+kucing.attackpoin);
    kucing.attack();
    kucing.walk();
    
    Katak katak = new Katak();
    katak.name ="Toadzilla";
    katak.hp= 85;
    katak.attackpoin=10;
    System.out.println(katak.name +" Healt Point = "+katak.hp + " Attack poin = "+katak.attackpoin);
    katak.attack();
    katak.jump();
    
    Burung garuda = new Burung();
    garuda.name ="Guaruda";
    garuda.hp= 100;
    garuda.attackpoin=5;  
    System.out.println(garuda.name +" Healt Point = "+garuda.hp + " Attack poin = "+garuda.attackpoin);
    garuda.attack();
    garuda.walk();
    garuda.jump();
    garuda.fly();
    }
}
