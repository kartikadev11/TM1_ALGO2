package src.model;

import src.Interfaces.contohInterfaces;

public class Perhitungan implements contohInterfaces {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(){
        
    }

    public Perhitungan(int a, int b, int hasil){
        this.a =a;
        this.b=b;
        hasil=0;
        this.hasil=0;
        printJudulClass("Print judul dalam class Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul menggunakan Interface");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
    }


    //method rekursif dari hasil tambah
    public int HasilTbh(int a1, int b1){
        this.a=a1;
        this.b=b1;
        HitungTambah();
        return this.hasil;
    }

     //method rekursif dari hasil kali
     public int HasilKali(int a2, int b2){
        this.a=a2;
        this.b=b2;
        HitungKali();
        return this.hasil;
    }
}
