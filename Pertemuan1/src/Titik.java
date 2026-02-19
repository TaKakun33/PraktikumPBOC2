/* File       : Titik.java
 * Deskripsi  : Berisi artibut dan method dalam class titik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 19 Februari 2026 
 */

public class Titik{
    /******** Variable ********/
    double absis;
    double ordinat;

    /******** method ********/
    // Konstruktor untuk membuat Titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // Mengesset absis titik dengan nilai baru X
    public void setAbsis(double x){
        absis = x;
    }

    // Mengesset ordinat titik dengan nilai baru Y
    public void setOrdinat(double Y){
        ordinat = Y;
    }
    
    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}