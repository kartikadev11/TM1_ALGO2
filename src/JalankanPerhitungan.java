package src;

import src.model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        
        
        Perhitungan s = new Perhitungan(4, 6, 0) ;
        s.PrintJudul();
        int hasilTambah = s.HasilTbh(4, 6);
        System.out.println("Hasil tambah = "+hasilTambah);
        int HasilPerkalian = s.HasilKali(4, 6);
        System.out.println("Hasil Perkalian = "+HasilPerkalian);
      
        // tugas munculkan judul dan hasil dengan method ke-4 
        // TUGAS DI POST DI REPO GITHUB
        // HASIL REPO DI EMAIL KE aherijanto@mimoapps.xyz
        //subject : TM_NIM_NAMALENGKAP_KELAS  cth: TM_00093348_AHERIJANTO_2D
        //dikumpulkan hari Sabtu 23 April 2022
    }
}
