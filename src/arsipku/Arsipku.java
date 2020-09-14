/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipku;

/**
 *
 * @author Ipit
 */
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
 Arsipku ps = new Arsipku();
 ps.nama();
 ps.tempatLahir();
 ps.hobi();
 ps.agama();
 ps.BahasaIndonesia();
 ps.matematika();
    }
    public void nama(){
        System.out.println("Nama = ");
       }
       public void tempatLahir(){
           System.out.println("TepatLahir = ");
       }
       public void hobi(){
           System.out.println("Hobi = ");
       }
       public void agama(){
           System.out.println("Agama = ");
       }
       public void BahasaIndonesia(){
          System.out.println("BahasaIndonesia = ");
       }
       public void matematika(){
           System.out.println("matematika = ");
       }
    }

