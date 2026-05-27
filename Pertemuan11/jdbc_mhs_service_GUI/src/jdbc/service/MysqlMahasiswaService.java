package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    /** Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert: " + mhs.getNama());
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update id: " + mhs.getId());
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete id: " + id);
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                list.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return list;
    }

    /** Reset indeks tabel mahasiswa ke 1 */
    public void indexReset() {
        try {
            String truncate = "DELETE FROM mahasiswa";
            Statement st = koneksi.createStatement();
            st.executeUpdate(truncate);

            String resetIndex = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            st.executeUpdate(resetIndex);

            st.close();
            System.out.println("Berhasil reset indeks");
        } catch (SQLException e) {
            System.out.println("Gagal reset indeks: " + e.getMessage());
        }
    }

    /** Memeriksa apakah tabel kosong */
    public boolean isEmpty() {
        boolean kosong = true;
        try {
            String query = "SELECT COUNT(*) AS total FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                int total = rs.getInt("total");
                kosong = (total == 0);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Gagal isEmpty: " + e.getMessage());
        }
        return kosong;
    }

    /** Menutup koneksi ke DB */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }
}