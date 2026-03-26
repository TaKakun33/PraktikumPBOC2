/* File       : MPegawai.java
 * Deskripsi  : Main dari class Pegawai, Dosen, Tendik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        // Pegawai (base)
        Pegawai P = new Pegawai("1234567890", 
            "Ahmad", 
            LocalDate.of(1985, 6, 15),
            LocalDate.of(2010, 3, 1),
            4000000
        );
 
        System.out.println("==============================================");
        System.out.println("       INFO PEGAWAI (langsung / base)        ");
        System.out.println("==============================================");
        P.printInfo();

        // Dosen Tetap
        DosenTetap D1 = new DosenTetap(
            "9545647548",
            "78647324",
            "Andi",
            LocalDate.of(1990, 5, 5),   
            LocalDate.of(2015, 1, 1),    
            5_000_000,
            "Fakultas Sains dan Matematika"
        );

        System.out.println("\n=================================================");
        System.out.println("         INFO PEGAWAI - DOSEN TETAP              ");
        System.out.println("=================================================");
        D1.printInfo();

        // Dosen Tamu 
        DosenTamu D2 = new DosenTamu(
            "8812345678",
            "NIDK12345",
            "Budi Santoso",
            LocalDate.of(1985, 3, 20),  
            LocalDate.of(2023, 7, 1),   
            6_000_000,
            "Fakultas Teknik",
            LocalDate.of(2026, 12, 31)   
        );

        System.out.println("\n=================================================");
        System.out.println("         INFO PEGAWAI - DOSEN TAMU               ");
        System.out.println("=================================================");
        D2.printInfo();

        // Tenaga Kependidikan 
        Tendik T = new Tendik(
            "7723456789",
            "Siti Rahayu",
            LocalDate.of(1978, 8, 15),  
            LocalDate.of(2010, 3, 1),   
            4_500_000,
            "AKADEMIK"
        );

        System.out.println("\n=================================================");
        System.out.println("     INFO PEGAWAI - TENAGA KEPENDIDIKAN          ");
        System.out.println("=================================================");
        T.printInfo();
        
    }
}