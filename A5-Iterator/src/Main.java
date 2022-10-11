import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    // show the elements - nodes which added by us.
    public static void sehirleriGoster(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();

       for(String sehir: sehirler){
           System.out.println("Gösterilen Şehir: " + sehir);
           System.out.println("NodeIndex: " + sehirler.indexOf(sehir));

       }
    }
    // add cities as sorted
    public static void sehirleriSiraliEkle(LinkedList<String> sehirler, String city, int comparing) {
        ListIterator<String> iterator = sehirler.listIterator();
        System.out.println("İterator Has Next?: " + iterator.hasNext());
        System.out.println("İterator Has Previoıus?: " + iterator.hasPrevious());

        while(iterator.hasNext()){
            System.out.println("ÖNCE Tekrar hasNext -->" + iterator.hasNext());

            //int comparing = iterator.next().compareTo(city); // demekki burada iterator değişiyor. ve next oluyor.!
            iterator.next();
            System.out.println("SONRA Tekrar hasNext -->" + iterator.hasNext());
            System.out.println("Has Previous Olmalı artık..! -->" + iterator.hasPrevious());
            // city < currentNode = return 1 -- A < M
            // city > currentNode = return -1
            // city = currentNode = return 0
            if(comparing == 0){ // means user try to add same city
                System.out.println("This city already exists.!");
                return;
            }
            else if(comparing < 0){
                // means new city is bigger than currentNode
                // so don't do anything!
                System.out.println("Devam edecek");
                continue;
            }
            else{
                // means new city is smaller than currentNode so that should add before currentNode.!
                System.out.println("Tekrar Has previous--> " + iterator.hasPrevious());
                iterator.previous();
                iterator.add(city);
                return;
            }
        }
        // if there is no city or city is bigger than all cities.!
        iterator.add(city);
    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        System.out.println("****************************************************");
        sehirleriSiraliEkle(sehirler,"Manisa",0);
        System.out.println("****************************************************");

        sehirleriSiraliEkle(sehirler,"Ankara",1);
        System.out.println("****************************************************");

        sehirleriSiraliEkle(sehirler,"Yozgat",-1);
        System.out.println("****************************************************");

        sehirleriSiraliEkle(sehirler,"Bursa",1);
        System.out.println("****************************************************");

        sehirleriSiraliEkle(sehirler,"Manisa",1);
        System.out.println("****************************************************");

        sehirleriGoster(sehirler);
        /*ListIterator<String> ilerle = sehirler.listIterator();
        while (ilerle.hasPrevious()){
            System.out.println("Bastı:" + ilerle.previous());
        }*/



    }
}