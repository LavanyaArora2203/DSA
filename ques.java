import java.util.*;
public class ques {
    public static int minPartitionsUsed(List<Integer> used, List<Integer> totalCapacity){
        int total=0;
        for(int u : used){
            total+=u;

        }
        List<Integer> capacities = new ArrayList<Integer>(totalCapacity);
        Collections.sort(capacities, Collections.reverseOrder());
        int partUsed=0;
        for(int capacity:capacities){
            if(total<=0){
                break;
            }
            total=total-capacity;

            partUsed++;
        }

        return partUsed;
        
    }


    
    
}
