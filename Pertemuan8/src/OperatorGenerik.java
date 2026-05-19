/* File        : OperatorGenerik.java
 * Deskripsi   : Berisi metode generik Tukar dan fungsi generik Bobot2
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */


public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // Cara salah 
    // Alasannya karena variable atau parameter di prosedur ini cuman mengarahkan ke variable lokal (gk ubah di memori aslinya)
    // public static <T> void Tukar(T a, T b){
    //     T temp = a;
    //     a = b;
    //     b = temp;
    // }

    // Fungsi generik bounded yang menerima dua objek keturunan Kucing lalu mengembalikan jumlah bobot keduanya
    public static <T extends Kucing> double Bobot2(T kucingA, T kucingB) {
        return kucingA.getBobot() + kucingB.getBobot();
    }

}
