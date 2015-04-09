import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparision
{

    private List<Integer> aList;
    private List<Integer> lList;

    private final int MAX_ITERATIONS = 10000;

    public ListComparision()
    {
        aList = new ArrayList<>();
        lList = new LinkedList<>();
    }
    public void runTests(int iterations) {
        System.out.println("Time alist add: " + testAdd(aList, iterations));
        System.out.println("Time lList add: " + testAdd(lList, iterations));
        
        System.out.println("Time alist get: " + testGet(aList, iterations));
        System.out.println("Time lList get: " + testGet(lList, iterations));

        System.out.println("Time alist remove: " + testRemove(aList, iterations));
        System.out.println("Time lList remove: " + testRemove(lList, iterations));
        System.out.println("End tests");
    }

    private double testAdd(List list, int iterations) {
        double start = System.currentTimeMillis();
        //int count = 0;
        for(int i = 0; i < iterations; i++) {
            list.add(new DummyClass(i));
           // count++;
        }
       // System.out.println("Added " + count + " items");
        double end = System.currentTimeMillis();
        return end - start;
    }

    private double testGet(List list, int iterations) {
        double start = System.currentTimeMillis();
     //   int count = 0;
        for(int i = 0; i < iterations; i++) {
            list.get(i);
        //    count++;
        }
        //System.out.println("Got " + count + " items");
        double end = System.currentTimeMillis();
        return end - start;
    }

    private double testRemove(List list, int iterations) {
        double start = System.currentTimeMillis();
        list.removeAll(list);
        double end = System.currentTimeMillis();
        return end - start;
    }

    public class DummyClass{

        private int test;

        DummyClass(int test) {
            this.test = test;
        }

    }
 
}
