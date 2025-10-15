import java.util.ArrayList;
import java.util.List;

public class Rak {
    private String kodeRak;
    private List<BahanPustaka> daftarBahan = new ArrayList<>();

    public Rak(String kodeRak) {
        this.kodeRak = kodeRak;
    }

    public void tambahBahan(BahanPustaka bahan) {
        daftarBahan.add(bahan);
    }

    public void tampilkanBahan() {
        System.out.println("\n==============================");
        System.out.println("Daftar Isi Rak : " + kodeRak);
        System.out.println("==============================");
        for (BahanPustaka b : daftarBahan) {
            b.info();
        }
    }
}