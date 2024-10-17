package lec24;

public class combination {
    public static void main(String[] args) {
        boolean[] board=new boolean[4];
        int tq=2;
        queenbox(board, tq, " ",0,0);
    }
    public static void queenbox(boolean[] board,int tq,String ans,int qpsf,int idx) 
    {
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                queenbox(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);
                board[i]=false;
            }
        }
    }
}
