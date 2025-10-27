import java.util.HashMap;
import java.util.Map;

public class MajorityElementNBy2 {
    public static void main(String[] args) {
       System.out.println(moore(new int[]{2,2,3,3,1,2,2})); 
    }
    public static int find(int[] arr)
    {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
               int freq=1;
               if(mpp.containsKey(arr[i]))
               {
                  freq=mpp.get(arr[i]);
                  freq++;
                  mpp.put(arr[i], freq);
               }
               else
               {
                mpp.put(arr[i], freq);
               }
        }
        for(Map.Entry<Integer,Integer> el: mpp.entrySet() )
        {
            if(el.getValue()>arr.length/2)
            return el.getKey();
        }
        return 0;
    }
    public static int moore(int[] arr)
    {
        int el=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=arr[i];
            }
            if(el==arr[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==el)
            c++;
        }
        if(c>arr.length/2)
        return el;
    
        return -1;
    }
}
