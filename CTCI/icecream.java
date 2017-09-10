import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //test cases
        
        for(int a0 = 0; a0 < t; a0++)
        {
            HashMap <Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
            int m = in.nextInt(); //money
            int n = in.nextInt(); //size of cost array
            for(int index=1; index <= n; index++)
            {
                int cost = in.nextInt(); //get each cost
                
                if(!map.containsKey(cost))
                {
                    //if cost (key) is not present in map, add it to map.
                    map.put(cost,new ArrayList<Integer>()); 
                    
                }
                map.get(cost).add(index);//store the index(es) as value.
                
            }
            
            for (int cost : map.keySet())
            {
                if(cost * 2 == m)
                { //if sum of 2 identical costs equals m 
                    ArrayList<Integer> indices = map.get(cost);
                    if(indices.size()>=2)
                    {
                        print(indices.get(0),indices.get(1));
                        break;
                    }    
                }
                else if (map.containsKey(m-cost))
                {
                    print(map.get(cost).get(0),map.get(m-cost).get(0));
                    break;
                }
            }
        }
        in.close();
    }
    
    static void print(int index1, int index2)
    {
        if(index1 >= index2)
        {
            System.out.println(index2 + " " + index1);
        }
        else
        {
            System.out.println(index1 + " " + index2);
        }
            
    }
    
}

