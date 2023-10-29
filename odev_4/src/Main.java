import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    // Soru1
    /*
    1-Unit test nedir?
    -Unit Test, yazılım geliştirme sürecinde kullanılan bir test türüdür. Kodun en küçük parçaları olan birimlerin
    (genellikle fonksiyonlar, metotlar veya sınıf metodları gibi) beklenen şekilde çalışıp çalışmadığını doğrulamak
    için yapılan otomatik testlerdir.

    2-Neden Unit Test yaparız?
    -Yazılım Kalitesini Artırmak,Hata Ayıklama Kolaylığı

    3-Unit Test Frameworkları listeleyiniz.
    -Java için Junit, JavaScript için Mocha, Python için PyTest, PHP için PHPUnit’tir.

    4- Unit Test için uyulması gereken kuralları belirleyiniz.
    Bağımsızlık (Her testin birbiriyle ilişkisi olmaması ve sıralı olması), Yalınlık(Basit ve anlaşılır olması)
    Tekrarlanabilirlik(Her seferinde aynı çıktıyı vermesi),Okunabilirlik(Anlaşılır ve diğer kullanıcılar tarafından kullanılabilir olması)
    Performans(Hızlı bir şekilde çalışması)


    // Soru 2
    1- Design pattern nedir ?
    - Yazılım geliştirme sürecinde karşılaşılan tekrar eden problemlere yönelik çözüm stratejileridir. Bu desenler, daha önce denenmiş,
     test edilmiş ve yaygın olarak kabul görmüş en iyi uygulama yöntemlerini sağlar. Tasarım desenleri genellikle kodun daha okunabilir,
      ölçeklenebilir ve sürdürülebilir olmasını sağlar.

    2- Kaç tipi vardır her tipe 2 adet örnek veriniz?
       3 Tipi vardır.
    1- Creational Desenler: Singleton(Bir sınıf için nesne oluşturmayı yalnızca bir örnekle sınırlar) , Factory(Alt sınıfların nesne oluşturma sürecini belirlediği bir üst sınıf tanımlar)
    2- Structural Desenler: Adapter(Bir arayüzü, başka bir sınıfın beklediği şekle dönüştürmek için kullanılır), Decorator(İşlevselliği dinamik olarak genişletir)
    3- Behavioral Desenler: Observer( Diğer nesnelerdeki değişikliklerin nesnelere nasıl bildirileceğini tanımlar), Strategy (Bir sınıf içindeki bir algoritmayı kapsüller)
     */




    // Soru 4 (e sayısını bulma)
        Scanner scan = new Scanner(System.in);
        System.out.println("Gitmek istediğiniz basamak sayısı nedir?");
        int k = scan.nextInt();
        double e = 0;
        for(int i=0; i<=k; i++){
            e += 1.0 / faktoriyel(i);

        }
        System.out.println("e'nin değeri: "+ e);
       //Soru 5
        System.out.println("Çarpanların toplamını istediğiniz sayıyı giriniz: ");
        int carpanSayi = scan.nextInt();
        System.out.println("Girdiğiniz sayının çarpanlarının toplamı: "+sumFactors(carpanSayi));

        //Soru 6

        System.out.println("Seçtiğiniz sayılar arkadaş mı? -> "+ isFriend(220,281));
        // 4 basamaklı arkadaşlar
        for(int x = 1000; x<10000;x++){
            for (int y =1000; y<10000; y++){
                if (isFriend(x,y)){
                    System.out.println(x+" ve "+ y + " sayıları arkadaş sayıdır.");

            }
        }}


        // Soru7
        //--a
        System.out.println("Seçtiğiniz sayı mükkemmel sayı mı? -> "+isPerfect(28));

        //--b
        for(int i = 1000; i<10000;i++){
            if (isPerfect(i)){
                System.out.println(i+ " sayısı mükkemmel sayıdır.");
            }
        }


    }
public static boolean isPerfect(int sayi){
    int toplam = sumFactors(sayi);
    if (toplam == sayi){
        return true;
    }
    else
        return false;


    }

    public static boolean isFriend(int x, int y) {
        int toplamX = sumFactors(x);
        int toplamY = sumFactors(y);

        if (toplamX == y && toplamY == x){
            return true;
        }else
            return false;
}
public static int faktoriyel(int sayi){
        int sonuc=1;
        for(int i=1;i<=sayi; i++){
            sonuc *=i;

        }
        if(sayi <=1)
            return 1;
        else
            return sonuc;
    }
public static int sumFactors(int sayi){
    ArrayList bolen = new ArrayList<Integer>();
    for (int i=1; i<sayi;i++){
        if(sayi % i == 0){
            bolen.add(i);
        }
    }
    int toplam = 0;
    for(int i=0;i<bolen.size();i++){
        toplam += (int)bolen.get(i);

    }
    return toplam;
}



}