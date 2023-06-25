import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapHash {
    public static void main(String[] args) {
        System.out.println( "------------ Hash Map ------------");

        HashMap<Integer, String> student = new LinkedHashMap<>();
        student.put(101, "Adam" );
        student.put(102, "Ewa" );
        student.put(103, "Roman" );
        System.out.println( student);
        for (Integer i: student.keySet()){
            System.out.println("klucz " + i + " nazwa " + student.get(i));
        }
    }
}
