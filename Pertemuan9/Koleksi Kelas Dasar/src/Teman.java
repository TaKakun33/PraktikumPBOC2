/* File        : Teman.java
 * Deskripsi   : Kelas Teman sebagai koleksi nama-nama teman 
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 7 Mei 2026
 */

// ===== Libary =====
import java.util.ArrayList;

public class Teman {

    // ===== ATRIBUT =====
    private int nbelm;
    private final ArrayList<String> Lnama;

    // ===== KONSTRUKTOR =====
    public Teman() {
        this.nbelm = 0;
        Lnama = new ArrayList<>();
    }

    // ===== GETTER & SETTER =====

    // Mengembalikan jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    //Mengembalikan nama pada indeks tertentu
    public String getNama(int index) {
        return Lnama.get(index);
    }

    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    // Mengubah nama pada indeks tertentu
    public void setNama(int index, String nama) {
        Lnama.set(index, nama);
    }

    // ===== OPERATOR =====

    // Menambahkan nama ke dalam Lnama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Menghapus nama dari Lnama
    public void delNama(String nama) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (nama.equals(getNama(i))) {
                Lnama.remove(nama);
                nbelm--;
            }
        }
    }

    // Mengecek apakah nama ada di dalam Lnama
    public boolean isMember(String nama) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (nama.equals(getNama(i))) {
                return true;
            }
        }
        return false;
    }

    // Mengganti nama lama dengan nama baru
    public void gantiNama(String nama, String namaBaru) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (nama.equals(getNama(i))) {
                setNama(i, namaBaru);
            }
        }
    }

    // Menghitung berapa kali nama muncul di Lnama
    public int countNama(String nama) {
        int count = 0;
        for (int i = 0; i < Lnama.size(); i++) {
            if (nama.equals(getNama(i))) {
                count++;
            }
        }
        return count;
    }

    // Menampilkan semua nama teman dalam Lnama
    public void showTeman() {
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println(getNama(i));
        }
    }
}