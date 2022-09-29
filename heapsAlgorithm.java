import java.util.*;

public class heapsAlgorithm {
    public static void main(String[] args){
        System.out.println(permuteUnique(new int[] {1,2,3}));
    }

    public static ArrayList<ArrayList<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int n: nums){
            a.add(n);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        gen(a, res, a.size());
        return res;
    }
    public static void gen(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> res, int n){
        if(n == 1){
            if(!res.contains(a)) res.add(new ArrayList<>(a));
            return;
        }
        
        gen(a, res, n-1);
        for(int i = 0; i < n-1; i++){
            if(n%2 == 0) Collections.swap(a, i, n-1);
            else Collections.swap(a, 0, n-1);
            
            gen(a, res, n-1);
        }
    }
}
