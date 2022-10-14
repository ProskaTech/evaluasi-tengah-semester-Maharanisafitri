/*
 created by 21343008_Maharani Safitri
 */
import javax.swing.JOptionPane;
public class soal3 {
    public static void main(String[] args) {
        String bilangan = "", message = "";
        int angka;

        System.out.println("Nama: Maharani Safitri");
	System.out.println("Nim: 21343008");
        System.out.println("UTS: PRATIKUM PEMROGRAMAN BERORINTASI OBJEK");
        System.out.println("-------------------------------------------------");
        
        bilangan = JOptionPane.showInputDialog("Masukkan angka : ");
        angka = Integer.parseInt(bilangan);

        if(angka >= 0) {
            message = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " merupakan bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
   }
 
