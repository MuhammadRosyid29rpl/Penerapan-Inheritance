/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapan.inheritance;

/**
 *
 * @author ASUS TUF A15
 */
public class PenerapanInheritance {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        // TODO code application logic here
        Siswa1 t=new Siswa1();
    Siswa2 r=new Siswa2();
    KelasA prof1=new KelasA();
    KelasB prof2=new KelasB();
    
    t.setNamasiswa("Ryu");
    t.setGender("Laki-Laki");
    t.cetak();
    prof1.setnomorabsen(20);
    prof1.cetak();
        System.out.println(prof1.getnomorabsen());
        prof1.keterangan();
        prof1.nilaiPAT(90);
        prof1.nilaiAkhir(88);
        
        System.out.println("==========================");
        
        r.setSiswa("Hanma");
        r.setGender("Perempuan");
        r.cetak();
        prof2.setnomorabsen(14);
        prof2.cetak();
        System.out.println(prof2.getnomorabsen());
        prof2.keterangan();
        prof2.nilaiPAT(92);
        prof2.nilaiAkhir(88);
            }
    }
    

