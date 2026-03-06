/* File       : Titik.java
 * Deskripsi  : Berisi artibut dan method dalam class titik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Februari 2026 
 */ 

public class Titik{
    /******** Variable ********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /******** method ********/
    // Konstruktor untuk membuat Titik (0,0)(pakai this)
    // this di sini gk bisa jalan jika gk ada this yg satunya
    Titik(){
        this(0, 0);
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengesset absis titik dengan nilai baru X
    void setAbsis(double x){
        absis = x;
    }

    // Mengesset ordinat titik dengan nilai baru Y
    void setOrdinat(double Y){
        ordinat = Y;
    }
    
    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + getAbsis() + "," + getOrdinat() + ")");
    }

    // buat konstruktor titik baru dimana ada parameter input yaitu X dan Y
    // untuk pengunanan this() bergantung pada ini karena ini konstruktor yg utama
    // abaikan Z (cmn coba aja)
    Titik(double X, double  Y){
        absis = X;
        ordinat = Y;
        counterTitik++;
    }

    // Hitung total titik dari counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // cari kuadran pd titik
    int getKuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1;
        } 
        else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        }
        else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        }
        else {
            return 4;
        }
    }

    // cari jarak titik dengan pusat (0,0)
    double getJarakPusat(){
        return (double) Math.sqrt(Math.pow(this.absis,2) + (double)Math.pow(this.ordinat, 2));
    }

    // cari jarak 2 titik
    double getJarak(Titik T){
        return (double) Math.sqrt(Math.pow(this.absis - T.getAbsis(),2) + (double)Math.pow(this.ordinat - T.getOrdinat(), 2));
    }

    // refleksi titik terhadap X
    void refleksiX(){
        this.absis=  -this.getAbsis();
    }

    // refleksi titik terhadap Y
    void refleksiY(){
        this.ordinat=  -this.getOrdinat();
    }

    // buat titik jika X di refleksikan
    Titik getRefleksiX(){
        return new Titik(-absis, ordinat);
    }

    // buat titik jika Y di refleksikan
    Titik getRefleksiY(){
        return new Titik(absis, -ordinat);
    }

}