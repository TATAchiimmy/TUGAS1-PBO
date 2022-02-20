package tugas1pbo;
import java.util.Scanner; 
public class main {
    
    static double celcius;
    static int pilih;
    static int i=0;
    
        public static void main (String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("konversi suhu");
            System.out.println(" ");
            System.out.printf("masukkan suhu air dalam celcius :");
            celcius=input.nextDouble();
            
            while (i!=1){
                System.out.println("\n opsi");
                System.out.println("");
                System.out.println("1. lihat data konversi");
                System.out.println("2. edit data konversi");
                System.out.println("3. exit");
                System.out.print("silahkan pilih");
                pilih = input.nextInt();
                
                switch(pilih) {
                    case 1:
                         System.out.println("suhu dalam celcius : " +celcius+"*C");
                         System.out.println("Fahrenheit : "+konversi.farenheit() +"*F");
                         System.out.println("Reamur : " +konversi.reamur()+"*R");
                         System.out.println("Kelvin : " +konversi.kelvin()+"K"); 
                         
                         if (celcius<=0){System.out.println("suhu air beku");}
                         else if (celcius>=100){ System.out.println("suhu air mendidih" );}
                         else{ System.out.println("suhu air normal ");}
                         break;
                         
                    case 2:
                         System.out.print("ubah suhu air :");
                         celcius = input.nextDouble();
                         break;
                    case 3 :
                        i=1;
                        System.exit(0);
                        break;
                    default : System.out.println("input anda masukkan salah");
                    break;
                
                         
                }
                System.out.println("");
            }
        }
} 

