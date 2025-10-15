abstract class BahanPustaka {
    private String kode;
    private String judul;
    private String penerbit;

    public BahanPustaka(String kode, String judul, String penerbit) {
        this.kode = kode;
        this.judul = judul;
        this.penerbit = penerbit;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public abstract void info();
}