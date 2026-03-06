public class MMahasiswa {
    public static void main(String[] args) {

        /* Mengecek class Dosen */
        Dosen A = new Dosen();
        Dosen B = new Dosen("123456", "Bunga", "Matematika");
        System.out.println("Dosen B : " + B.getNip() + " " + B.getNama() + " " + B.getProdi());

        A.setNip("987654");
        A.setNama("Andika");
        A.setProdi("Informatika");
        System.out.println("Dosen A : " + A.getNip() + " " + A.getNama() + " " + A.getProdi());

        /* Mengecek class MataKuliah */
        MataKuliah PBO = new MataKuliah();
        MataKuliah Jarkom = new MataKuliah("MK5463", "Jarkom", 3);
        System.out.println("\nMata Kuliah Jarkom : " + Jarkom.getIdMatKul()+ " " + Jarkom.getNama() + " " + Jarkom.getSks());

        PBO.setIdMatKul("MK9897");
        PBO.setNama("PBO");
        PBO.setSks(3);
        System.out.println("Mata Kuliah PBO : " + PBO.getIdMatKul()+ " " + PBO.getNama() + " " + PBO.getSks());

        /* Mengecek class Kendaraan */
        Kendaraan honda = new Kendaraan();
        Kendaraan totoya = new Kendaraan("BE 4532 YE", "mobil");
        System.out.println("\nKendaraan totoya : " + totoya.getNoPlat()+ " " + totoya.getJenis());

        honda.setNoPlat("H 2343 WQ");
        honda.setJenis("motor");
        System.out.println("Kendaraan honda : " + honda.getNoPlat()+ " " + honda.getJenis());

        /* Mengecek class Mahasiswa */
        Mahasiswa Verry = new Mahasiswa("24060124130072", "Verry bin Herry", "Informatika");
        Verry.addMatKul(PBO);
        Verry.addMatKul(Jarkom);
        Verry.setDosenWali(B);
        Verry.setKendaraan(totoya);
        
        System.out.println("\nJumlah SKS Verry : " + Verry.getJumlahSKS());
        System.out.println("Jumlahj MatKul yang diambil Verry : " + Verry.getJumlahMatKul());

        System.out.println("\nHasil dari printMhs ke Verry\n");
        Verry.printMhs();

        System.out.println("\nHasil dari printDetailMhs ke Verry\n");
        Verry.printDetailMhs();

    }
}
