import java.util.ArrayList;
import java.util.List;

public class Subset {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        generateSubset(0, nums, new ArrayList<>(), list);
        return list;
    }
    
    public void generateSubset(int index, int[]nums, List<Integer> current, List<List<Integer>> list){
        list.add(new ArrayList<>(current));
        System.out.println("List: "+list);
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            generateSubset(i+1, nums, current, list);
            System.out.println("current: " +current);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        Subset ob = new Subset();
        System.out.println(ob.subsets(nums));
         
    }

}
