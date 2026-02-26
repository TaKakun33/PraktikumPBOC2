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
    Garis(Titik P,Titik Q) {
        awal = P;
        akhir = Q;
    }

    Garis() {
        this(new Titik(), new Titik());
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    


    

    
}
