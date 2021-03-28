package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;


public class PathCross {
    public static void main(String[] args) {
        Solut solution = new Solut();
        System.out.println(solution.isPathCrossing("SS"));

    }
}
class Solut {
    public boolean isPathCrossing(String path) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        set.add(arrayList);
        for(char ch : path.toCharArray()){
            if(ch=='N'){
                arrayList.set(0,arrayList.get(0)+1);
            }
            if(ch=='S'){
                arrayList.set(0,arrayList.get(0)-1);
            }
            if(ch=='E'){
                arrayList.set(1,arrayList.get(1)+1);
            }
            if(ch=='W'){
                arrayList.set(1,arrayList.get(1)-1);
            }
            if(set.contains(arrayList)){
                return true;
            }
            set.add(arrayList);
        }
        return false;
    }
}
