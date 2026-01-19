

public class Solution {
    
    public static  String getChar(int index,int boundry)
    {
        if(index==boundry)
        return "-";

       String toPrint = "-" + getChar(++index, boundry);
       System.out.println(toPrint);
       return toPrint;
    }
    public static void main(String[] args) {
        getChar(0,5);
    }

}
