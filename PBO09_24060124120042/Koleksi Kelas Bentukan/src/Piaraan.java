/* File        : Piaraan.java
 * Deskripsi   : Kelas Piaraan sebagai koleksi antrean objek Anabul menggunakan LinkedList
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 9 Mei 2026
 */

/**** Libary ****/
import java.util.LinkedList;

public class Piaraan {

    /**** Atribut ****/
    private int nbelm;
    private final LinkedList<Anabul> Lanabul;

    /**** Konstruktor ****/
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Getter nbelm
    public int getNbelm() {
        return nbelm;
    }

    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    //  Menambah anabul ke akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // Mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // Mengambil data anabul pertama tanpa mengeluarkan dari antrean
    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    // Mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        Anabul A = Lanabul.pollFirst();
        if (A != null) nbelm--;
        return A;
    }

    // Menampilkan nama panggilan semua anabul dalam antrean
    public void showAnabul() {
        for (Anabul i : Lanabul) {
            System.out.println(i.getPanggilan());
        }
    }

    // Menghitung banyak keluarga Kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul i : Lanabul) {
            if (i instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // Menghitung total bobot keluarga Kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul i : Lanabul) {
            if (i instanceof Kucing) {
                totalBobot += ((Kucing) i).getBobot();
            }
        }
        return totalBobot;
    }

    // Menampilkan nama panggilan dan jenis objek setiap anabul dalam antrean
    public void showJenisAnabul() {
        for (Anabul i : Lanabul) {
            System.out.println(i.getPanggilan() + " -> " + i.getClass().getName());
        }
    }
}