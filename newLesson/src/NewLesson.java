import java.util.Scanner;

public class NewLesson {
    public static void main(String[] args) {
        System.out.println("GİRİLEN SAYILARIN HESAPLANMASI ");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        int numberOne=0;
        int numeberTwo=0;


        System.out.print("1.sayıyı giriniz : ");
        numberOne=scan.nextInt();
        System.out.print("2.sayıyı giriniz :");
        numeberTwo=scan.nextInt();

       int  total=numberOne+numeberTwo;
        System.out.println("Toplam sayı tutarınız : "+total);
          double bölme=(numberOne/numeberTwo);
            System.out.println("1.sayının 2.sayıya bölümü :"+bölme);
                int çıkarma =numberOne-numeberTwo;
                    System.out.println("1.sayının 2.sayıdan çıkarılması :"+çıkarma);
                       int  çarpma=numberOne*numeberTwo;
                                System.out.println("1.sayı ve 2.sayı çarpımı :"+çarpma);


                                System.out.println();

        System.out.println("üÇGENİN ALAN HESAPLANMASI ");

        int taban=1;
        int yükseklik=1;

        System.out.print("Üçgenin tabanını giriniz : ");
        taban=scan.nextInt();

        System.out.print("Üçgenin yükseklğini giriniz :");
        yükseklik=scan.nextInt();

        int alanhesaplama=taban*yükseklik;
        int alanhesplama1=alanhesaplama/2;

        System.out.println("Üçgenin alanı hesaplama sonucu :"+alanhesplama1 );
        System.out.println();
        System.out.println("Kullanıcıdan alınan sayının  değeri :");
        int number;

        System.out.print("Sayı giriniz :");
        number=scan.nextInt();

        if (number>0){
            System.out.println("pozitiftir");
        } else if (number<0) {
            System.out.println("negatiftir.");

        }else {
            System.out.println("sıfıra eşittir.");
        }







    }}


