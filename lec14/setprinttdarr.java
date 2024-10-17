package lec14;
// set print 2 d array
public class setprinttdarr {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        int row=arr.length;
        int col=arr[0].length;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
