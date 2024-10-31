import java.util.Scanner;

public class ArrayKafe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
                        "Teh Tarik", "Cappucino", "Chocolate ice"};

        String key;
        System.out.print("Masukkan menu yang ingin anda cari: ");
        key=sc.nextLine();
        
        for (int i=0; i<menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                System.out.println("Menu yang anda cari ada di urutan ke-" + (i+1));
                break;
            } else if (key != menu[i] && i==(menu.length-1) ) {
                System.out.println("Menu yang anda cari tidak ada dalam data");
            }
        }
    }
}
