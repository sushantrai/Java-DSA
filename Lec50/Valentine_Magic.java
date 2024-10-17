package Lec50;

import java.util.Arrays;

public class Valentine_Magic {
    public static void main(String[] args) {
          int []boys={};
          int [] girls={};
          Arrays.sort(boys);
          Arrays.sort(girls);
          System.out.println(Valentine_Magi(boys, girls, 0, 0));

    }
    public static int Valentine_Magi(int[] boys,int [] girls,int i,int j)
    {
        if(i==boys.length)
        {
            return 0;
        }
        if(j==girls.length)
        {
            return 10000000;
        }
        int pair=Math.abs(boys[i]-girls[j]+Valentine_Magi(boys, girls, i+1, j+1));
        int nopair=Valentine_Magi(boys, girls, i, j+1);
        return Math.min(pair, nopair);

    }
}
