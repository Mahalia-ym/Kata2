
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1, 1, 1, 0, 0, 1, 2, 2, 2, 3};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr =histo.getHistogram();
        
       
       
        for (int key : histogr.keySet ()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
