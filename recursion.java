import java.util.ArrayList;
import java.util.List;

public class recursion{
    



    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;

        }
        if(n<m){
            return 1;
        }
        
        int vertPlaced=placeTiles(n-m, m);
        int horizontalPlaced=placeTiles(n-1, m);

        return vertPlaced+horizontalPlaced;
    }

    public static void printPerm(String str , String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permutation+curr);

        }

    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        // base case
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue; // avoid reuse

            temp.add(nums[i]);                 // choose
            backtrack(nums, temp, result);     // explore
            temp.remove(temp.size() - 1);      // un-choose (backtrack)
        }
    }

    public static int countPath(int i,int j,int n,int m){

        if(i==n-1 &&j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
        int right=countPath(i, j+1, n, m);
        int down=countPath(i+1, j, n, m);

        return right + down;
    }
}