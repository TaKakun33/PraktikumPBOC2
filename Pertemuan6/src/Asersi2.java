/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
 * secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
   Program tersebut kurang tepat karena menggunakan assert untuk logika kontrol validasi data. 
   Jika asersi tidak dihidupkan saat runtime, validasi tersebut akan gagal berfungsi. 
   Seharusnya, validasi input menggunakan statement if dan pelemparan Exception.
*/