//ArrayList is used if the size of an array is unnknown
package List;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.LinkedList;

public class sample {
    public static void main(String[] args) {
        
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("volvlo");
        cars.add("polo");
        cars.add("VW");
        for(String i: cars){
            System.out.println(i);
        }

        ArrayList <Integer> nums = new ArrayList <Integer>();
        for(int i=0;i<=10;i++){
            nums.add(i);
        }
        
        nums.set(3,56);
        nums.remove(0);
        System.out.println(nums);
        //suing for loop
        for(Integer i: nums){
            System.out.println(i);
        }
        //using Iterator
        
        Iterator<Integer> i = nums.iterator(); //iterator is an object
        System.out.println("Using Iterator");
        System.out.println(i.next());
        System.out.println("Entire Range");
        while(i.hasNext()){
            System.out.println(i.next());
        }

        /*ArrayList nums1 = new ArrayList();
        nums1.add("ram");
        System.out.println(nums1.get(0));
        nums1.get(0);*/

        //Cretaing a linked list
        LinkedList <Integer> cars = new LinkedList<>();
    }
}
