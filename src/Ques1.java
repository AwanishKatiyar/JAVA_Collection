import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Ques1 {
    public static void main(String[] args) {
        Collection<Float> list = new LinkedList<Float>();
        list.add(2.5f);
        list.add(4.03f);
        list.add(6.7f);
        list.add(2.7512f);
        list.add(8.87f);
        Iterator listIterator = list.iterator();
        float sum = 0;
        while (listIterator.hasNext()){
            sum += (float) listIterator.next();
        }
        System.out.println(sum);
    }
}
