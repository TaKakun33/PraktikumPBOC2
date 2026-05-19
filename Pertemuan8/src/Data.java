/* File        : Data.java
 * Deskripsi   : Kelas generik larik statik berisi 100 elemen generik
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */

import java.util.Arrays;

public class Data<T> {

    /******** Atribut ********/

    // Kapasitas maksimum larik
    private static final int KAPASITAS = 100;

    // Larik bertipe generik T berisi maksimal 100 elemen
    private final T[] ruang;

    // Banyaknya elemen efektif yang telah diisi
    private static int banyak;

    /******** Method ********/

    /* Konstruktor */
    // Menerima contohRuang sebagai template agar bisa membuat T[] di Java generik
    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, KAPASITAS);
        banyak = 0;
    }

    /* Fungsi getIsi */
    // Mengembalikan elemen pada posisi ke-posisi (1..100)
    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    /* Prosedur setIsi */
    // Mengisi elemen pada posisi ke-posisi (1..100) dengan objek
    // Jika slot sebelumnya null, banyak bertambah
    public void setIsi(int posisi, T objek) {
        if (ruang[posisi] == null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
    }

    /* Fungsi getSize */
    // Mengembalikan banyaknya elemen efektif
    public int getSize() {
        return banyak;
    }
}