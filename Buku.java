public class Buku extends BahanPustaka {
    private String penulis;

    public Buku(String kode, String judul, String penerbit, String penulis) {
        super(kode, judul, penerbit);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public void info() {
        System.out.println("Kode    : " + getKode());
        System.out.println("Judul   : " + getJudul());
        System.out.println("Penulis : " + penulis);
        System.out.println("------------------------------------");
    }   
}