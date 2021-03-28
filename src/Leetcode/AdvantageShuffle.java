package Leetcode;


/*
Example 1:
Input: A = [2,7,11,15], B = [1,10,4,11]
Output: [2,11,7,15]

Example 2:
Input: A = [12,24,8,32], B = [13,25,32,11]
Output: [24,32,8,12]
 */
/*
2 > 1 -> 0th now this 0th position will get stored in the linkedHashSet
now when for 7 when value will iterate over the B , it will skip out those
elements that are present in the linkedHashSet.....
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class AdvantageShuffle {
    public static void main(String[] args) {
        int [] A= {2,7,11,15};
        int [] B= {1,10,4,11};
        AdvantageShuffle advantageShuffle = new AdvantageShuffle();
        advantageShuffle. advantageCount(A,B);
        advantageShuffle.printingValue();
    }
    //0
    int [] list = new int[4];
    public void advantageCount(int[] a, int[] b) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a.length ; j++){
                if(!set.contains(j)&&a[i]>b[j]){
                    addingValueAtRightSpot(a[i],i);
                    set.add(i);
                    break;
            }else{
                    for (int k = 0 ; k < a.length ; k++){
                        if(!set.contains(k)&&a[i]>a[k]){
                            System.out.println("Invoked At " + k);
                            set.add(k);
                            addingValueAtRightSpot(a[i],k);
                            break;
                        }
                    }
                }
            }
        }
    }
    public void addingValueAtRightSpot(int valueOfA,int placeToAddAt){
        list[placeToAddAt] = valueOfA;

    }
    public void printingValue(){
        Arrays.stream(list).forEach(System.out::println);
    }

}
