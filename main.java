import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Langkah 3: Input Pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();
        
        // Langkah 4: Konversi String ke Integer
        try {
            int convertedInt = Integer.parseInt(inputString);
            System.out.println("Hasil konversi: " + convertedInt);
        } catch (NumberFormatException e) {
            // Tangani pengecualian jika input tidak dapat dikonversi menjadi integer
            System.out.println("Error: Input bukan angka yang valid.");
        }
        scanner.close();
    }
}
