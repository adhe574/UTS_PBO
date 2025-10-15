public class Majalah extends BahanPustaka {
    private int edisi;

    public Majalah(String kode, String judul, String penerbit, int edisi) {
        super(kode, judul, penerbit);
        this.edisi = edisi;
    }

    public int getEdisi() {
        return edisi;
    }

    @Override
    public void info() {
        System.out.println("Kode    : " + getKode());
        System.out.println("Judul   : " + getJudul());
        System.out.println("Edisi   : " + edisi);
        System.out.println("-------------------------------------");
    }
}