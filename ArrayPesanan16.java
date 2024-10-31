import java.util.Scanner;

public class ArrayPesanan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = new String[10];
        int[] harga = new int[10];
    
        int jmlPesanan;
        double total=0;

        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = sc.nextInt();
        sc.nextLine();

        for (int i =0; i<jmlPesanan; i++) {
            System.out.print("Masukkan Pesanan anda yang ke" + (i+1) + " : ");
            menu[i] = sc.nextLine();
            System.out.print("Harga pesanan ke-"+ (i+1) + ": ");
            harga[i] = sc.nextInt();
            total += harga[i];
            sc.nextLine();
        }
        for (int i = 0; i<jmlPesanan; i++) {
            System.out.println("Pesanan anda ke-" + (i+1) + " " + menu[i] + " berharga " + " " + 
            harga[i] );
        }
        System.out.println("Total biaya pesanan anda berjumlah: " + total);
        
    
    }

    
}
