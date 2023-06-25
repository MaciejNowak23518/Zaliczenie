import java.util.Collections;
import java.util.LinkedList;

public class AlinkedList {
    public static void main(String[] args) {
        System.out.println("-------------- Linked List -----------");
        LinkedList<String> list = new LinkedList<>();
        list.add("Zabrze");
        list.add("Augustów");
        list.add("Warszawa");
        list.add("Radom");
        list.add("Łódź");
        System.out.println(list.get(2));

        System.out.println(list);
        display(list);
        Collections.sort(list);
        System.out.println( " -------- sort ASC ----------");
        display(list);
        Collections.reverse(list);
        System.out.println("----------- sort DESC -----");
        display(list);


    }

    public static void display(LinkedList<String> list ){
        for (String e: list){
            System.out.println(e);
        }
    }

}
