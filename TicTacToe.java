
public class TicTacToe {
	 public static char board[];
	    public static char[] printMatrix()
	    {
	        board=new char[10];
	        for(int i=1;i<board.length;i++)
	        {
	            board[i]=' ';
	        }
	        return board;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println("Welcome");
	        char board[]=printMatrix();

}}
