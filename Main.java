package Tugas2;

public class Main {
	 public static void main(String[] args) {
	        Lingkaran l1 = new Lingkaran(5); // Membuat objek l1 dengan jari-jari 5
	        Lingkaran l2 = l1; // Menugaskan l2 untuk merujuk ke objek yang sama dengan l1

	        // Menampilkan nilai jari-jari dari l1 dan l2
	        System.out.println(l1.getJari2()); // Output: 5
	        System.out.println(l2.getJari2()); // Output: 5

	        // Mengubah nilai jari-jari l2 menjadi 10
	        l2.setJari2(10);

	        // Menampilkan kembali nilai jari-jari dari l1 dan l2 setelah diubah
	        System.out.println(l1.getJari2()); // Output: 10
	        System.out.println(l2.getJari2()); // Output: 10
	    }
}
