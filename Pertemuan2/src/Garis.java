/* File       : MTitik.java
 * Deskripsi  : Berisi artibut dan method dalam class Garis
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Februari 2026 
 */

public class Garis {
    /******** Variable ********/
    Titik awal;
    Titik akhir;
    static int counterGaris;

    /******** method ********/

    // Konstruktor untuk membuat Garis dengan input titik awal dan titik akhir
    Garis(Titik T1,Titik T2) {
        awal = T1;
        akhir = T2;
        counterGaris++;
    }

    // Konstruktor untuk membuat Garis dengan titik awal (0,0) dan titik akhir (1,1) 
    Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // Mengembalikan nilai titik awal
    Titik getAwal(){
        return this.awal;
    }

    // Mengembalikan nilai titik akhir
    Titik getAkhir(){
        return this.akhir;
    }

    // Mengesset titik awal dengan titik T
    void setAwal(Titik T){
        this.awal = T;
    }

    // Mengesset titik akhir dengan titik T
    void setAkhir(Titik T){
        this.akhir = T;
    }

    // Hitung total titik dari counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    // Mengembalikan panjang sebuah garis
    double panjangGaris(){
        return awal.getJarak(akhir);
    }

    // Mengembalikan gradien dari sebuah garis
    double gradien(){
        return (double) (this.akhir.getOrdinat() - this.awal.getOrdinat()) / (double) (this.akhir.getAbsis() - this.awal.getAbsis());
    }
    
    // Mengembalikan titik tengah dari sebuah garis
    Titik titikTengah(){
        double X = (this.awal.getAbsis() + this.akhir.getAbsis()) / 2;
        double Y = (this.awal.getOrdinat() + this.akhir.getOrdinat()) / 2;
        return  new Titik(X,Y);
    }
    
    // Menampilkan ke layar titik awal dan titik akhir garis
    void printGaris(){
        System.err.println("Titik Awal : (" +  this.awal.getAbsis() + "," + this.awal.getOrdinat() + ")");
        System.err.println("Titik Akhir : (" +  this.akhir.getAbsis() + "," + this.akhir.getOrdinat() + ")");
    }

    // Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    // Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == -1;
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    void persamaanGaris(){
        double C;
        double M;
        String tanda;
        
        if (this.getAwal().getAbsis() == this.getAkhir().getAbsis()) {
            System.out.println("Garis Vertical X = " + this.getAwal().getAbsis());
        } else {
            M = gradien();
            C = this.getAwal().getOrdinat() - (M * this.getAwal().getAbsis());
            if (C >= 0){
                tanda = " + ";
            } else {
                tanda = " - ";
            }
            System.out.println("y = " + M + "X" + tanda + Math.abs(C));
        }
    }
    
    
}
