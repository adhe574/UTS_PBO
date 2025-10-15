import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Peminjaman {
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private Anggota anggota;
    private BahanPustaka bahan;

    public Peminjaman(Anggota anggota, BahanPustaka bahan, LocalDate tanggalPinjam, LocalDate tanggalKembali) {
        this.anggota = anggota;
        this.bahan = bahan;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public long getDurasi() {
        return ChronoUnit.DAYS.between(tanggalPinjam, tanggalKembali);
    }

    public void infoPeminjaman() {
        System.out.println("Anggota             : " + anggota.getNama());
        System.out.println("Judul Buku          : " + bahan.getJudul());
        System.out.println("Tanggal Pinjam      : " + tanggalPinjam);
        System.out.println("Tanggal Kembali     : " + tanggalKembali);
        System.out.println("Durasi Peminjaman   : " + getDurasi() + " hari");
        System.out.println("------------------------------------");
    }
}
