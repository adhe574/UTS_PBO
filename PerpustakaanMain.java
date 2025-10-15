import java.time.LocalDate;

public class PerpustakaanMain {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("B001", "Belajar Java", "Penerbit A", "John Doe");
        Buku buku2 = new Buku("B002", "Pemrograman Python", "Penerbit B", "Jane Smith");
        Buku buku3 = new Buku("B003", "Data Science", "Penerbit E", "Alice Johnson");

        Majalah majalah1 = new Majalah("M001", "Teknologi Terkini", "Penerbit C", 2023);
        Majalah majalah2 = new Majalah("M002", "Sains dan Alam", "Penerbit D", 5);

        Rak rak1 = new Rak("Rak A");
        rak1.tambahBahan(buku1);
        rak1.tambahBahan(majalah1);
        rak1.tambahBahan(buku2);

        Anggota anggota1 = new Anggota("A001", "Alice");
        Anggota anggota2 = new Anggota("A002", "Bob");
        Anggota anggota3 = new Anggota("A003", "Charlie");
        anggota1.pinjam(buku1);
        anggota2.pinjam(majalah1);
        anggota3.kembalikan(buku3);

        System.out.println("\n===== DATA PEMINJAMAN =====");
        anggota1.pinjam(buku1);
        anggota2.pinjam(majalah1);
        anggota3.kembalikan(buku3);

        System.out.println("\n===== DATA PEMINJAMAN LENGKAP =====");
        Peminjaman peminjaman1 = new Peminjaman(anggota1, buku1, LocalDate.of(2023,10,01), LocalDate.of(2023,10,10));
        Peminjaman peminjaman2 = new Peminjaman(anggota2, majalah1, LocalDate.of(2023,10,05), LocalDate.of(2023,10,12));
        peminjaman1.infoPeminjaman();
        peminjaman2.infoPeminjaman();

        rak1.tampilkanBahan();
    }
}