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
public class KelasA extends Siswa1 {
  
    int nomorabsen;
    public void keterangan(){
        super.Profesi();
        System.out.println("Pelajar");
    }
    public void setnomorabsen(int nomorabsen){
        this.nomorabsen=nomorabsen;
        System.out.println("Nomor         : "+nomorabsen);
    }
    public int getnomorabsen(){
        return nomorabsen;
    }
    public void nilaiPAT (int nilai){
    int total=nilai;
            System.out.println("Nilai PAT: "+total);
}
    public void nilaiAkhir (int nilai){
        int total=nilai;
        System.out.println("Nilai Akhir setelah dirata rata: "+total);
    
}

    
    }
    

