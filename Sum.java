import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sum {

    public static void main(String x[]) {
     float sum=0;
        List<Float> list = new ArrayList();
        list.add(2.3f);
        list.add(44.5f);
        list.add(43.32f);
        list.add(20.35f);


        //iterate over the list
        Iterator<Float> itr= list.iterator();

        while (itr.hasNext())
        {
            Float i = itr.next();

            // Getting elements one by one
             System.out.print( i + " ");
             sum=sum+i;

        }
        System.out.println();
        System.out.printf("The sum is  : %.2f ", sum);
    }
}
