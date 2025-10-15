public class Anggota {
    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void pinjam(BahanPustaka bahan) {
        System.out.println(nama + " meminjam buku " + bahan.getJudul());
        bahan.info();
    }

    public void pinjam(BahanPustaka bahan, int hari) {
        System.out.println(nama + " meminjam buku " + bahan.getJudul() + " selama " + hari + " hari.");
        bahan.info();
    }

    public void kembalikan(BahanPustaka bahan) {
        System.out.println(nama + " mengembalikan buku " + bahan.getJudul());
    }    
}