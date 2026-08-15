package fundamental;

public class FunctionTest {

    public static void main(String[] args) { //ini method , jadi method adalah sebuah function didalam class
        System.out.println("=== TEST CASE FUNCTION/METHOD ===\n");

        FunctionTest test = new FunctionTest();

        System.out.println("1. FUNCTION TANPA PARAMETER TANPA RETURN VALUE (void)");
        System.out.println("   ----------------------------------------------------");
        test.tampilkanSalam();
        test.tampilkanGaris();
        test.tampilkanInfoSekolah();
        System.out.println();

        System.out.println("2. FUNCTION DENGAN PARAMETER TANPA RETURN VALUE (void)");
        System.out.println("   ----------------------------------------------------");
        test.sapaNama("Teddy");
        test.sapaNama("Maya");
        System.out.println();

        test.tampilkanBiodata("Citra", 20, "Jakarta");
        test.tampilkanBiodata("Doni", 22, "Bandung");
        System.out.println();

        test.hitungLuasPersegiPanjang(10, 5);
        test.hitungLuasPersegiPanjang(8, 6);
        System.out.println();

        System.out.println("3. FUNCTION DENGAN PARAMETER DAN RETURN VALUE");
        System.out.println("   ----------------------------------------------------");

        int hasilTambah = test.tambah(100, 200);
        System.out.println("100 + 200 = " + hasilTambah);

        int hasilKali = test.kali(7, 8);
        System.out.println("7 x 8 = " + hasilKali);
        System.out.println();

        int hasilKurang = test.pengurangan(50, 15);
        System.out.println("50 - 15 = " + hasilKurang);
        System.out.println();
        System.out.println();

        double rataRata = test.hitungRataRata(80, 90, 75);
        System.out.println("Nilai: 80, 90, 75");
        System.out.println("Rata-rata: " + rataRata);
        System.out.println();

        /*String namaPanjang = test.gabungkanNama("Ahmad", "Rizki", "Pratama");
        System.out.println("Nama lengkap: " + namaPanjang);
        System.out.println();

        boolean lulus = test.cekKelulusan(85);
        System.out.println("Nilai: 85");
        System.out.println("Status: " + (lulus ? "LULUS ✓" : "TIDAK LULUS ✗"));

        boolean tidakLulus = test.cekKelulusan(60);
        System.out.println("Nilai: 60");
        System.out.println("Status: " + (tidakLulus ? "LULUS ✓" : "TIDAK LULUS ✗"));
        System.out.println();

        int hargaTotal = test.hitungTotalBelanja(15000, 3);
        System.out.println("Harga per item: Rp 15.000");
        System.out.println("Jumlah: 3");
        System.out.println("Total: Rp " + hargaTotal);
        System.out.println();

        String grade = test.tentukanGrade(88);
        System.out.println("Nilai: 88 → Grade: " + grade);

        String grade2 = test.tentukanGrade(75);
        System.out.println("Nilai: 75 → Grade: " + grade2);

        String grade3 = test.tentukanGrade(55);
        System.out.println("Nilai: 55 → Grade: " + grade3);*/
    }

    public void tampilkanSalam() { //ini contoh method/function tanpa parameter dan tanpa return value (void)
        System.out.println("   Selamat datang di Program Java!");
        System.out.println("   Semoga hari Anda menyenangkan 😊");
    }

    public void tampilkanGaris() {
        System.out.println("   =====================================");
    }

    public void tampilkanInfoSekolah() { //ini contoh method/function tanpa parameter dan tanpa return value (void)
        System.out.println("   Nama Sekolah: SMK Coding Indonesia");
        System.out.println("   Alamat: Jl. Pemrograman No. 123");
        System.out.println("   Telepon: (021) 12345678");
    }

    public void sapaNama(String nama) { //ini contoh method/function dengan parameter tanpa return value (void)
        System.out.println("   Halo, " + nama + "! Selamat belajar Java!");
    }

    public void tampilkanBiodata(String nama, int umur, String kota) { //ini contoh method/function dengan parameter tanpa return value (void)
        System.out.println("   === BIODATA ===");
        System.out.println("   Nama  : " + nama);
        System.out.println("   Umur  : " + umur + " tahun");
        System.out.println("   Kota  : " + kota);
        System.out.println("   ===============");
    }

    public void hitungLuasPersegiPanjang(int panjang, int lebar) { //ini contoh method/function dengan parameter tanpa return value (void)
        int luas = panjang * lebar;
        System.out.println("   Persegi panjang dengan panjang " + panjang + " cm dan lebar " + lebar + " cm");
        System.out.println("   Luas = " + luas + " cm²");
    }

    public int tambah(int a, int b) { //ini contoh method/function dengan parameter dan return value
        return a + b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double hitungRataRata(int nilai1, int nilai2, int nilai3) {
        double total = nilai1 + nilai2 + nilai3;
        return total / 3;
    }

    /*public String gabungkanNama(String namaDepan, String namaTengah, String namaBelakang) {
        return namaDepan + " " + namaTengah + " " + namaBelakang;
    }

    public boolean cekKelulusan(int nilai) {
        return nilai >= 70;
    }

    public int hitungTotalBelanja(int hargaPerItem, int jumlah) {
        return hargaPerItem * jumlah;
    }

    public String tentukanGrade(int nilai) {
        if (nilai >= 85) {
            return "A (Sangat Baik)";
        } else if (nilai >= 75) {
            return "B (Baik)";
        } else if (nilai >= 65) {
            return "C (Cukup)";
        } else {
            return "D (Kurang)";
        }
    }*/
}
