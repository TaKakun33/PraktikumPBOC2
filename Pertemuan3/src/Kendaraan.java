/* File       : Kendaraan.java
 * Deskripsi  : Berisi artibut dan method dalam class Kendaraan
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 5 Maret 2026
 */

public class Kendaraan {
    /******** Variable ********/
    private String noPlat;
    private  String jenis;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Kendaraan tanpa parameter
    public Kendaraan(){
        this("", "");
    }

    // Membuat objek Kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* Getter */
    // Mengembalikan nilai noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // Mengembalikan nilai jenis
    public String getJenis() {
        return jenis;
    }

    /* Setter */
    // Mengesset noPlat dengan string noPlat 
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mengesset jenis dengan string jenis 
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /* Method tambahan */
    // print data Kendaraan
    public void printKendaraan(){
        System.err.println("NoPlat : " + this.getNoPlat());
        System.err.println("Jenis  : " + this.getJenis());
    }  
}
