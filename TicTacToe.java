import java.util.Arrays;
import java.util.Scanner;
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
	    public static char getInput(Scanner userInput)
	    {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Choose between x and 0 ");
//	        char option=scan.next().charAt(0);
//	        System.out.println("You choose "+option);
	        return userInput.next().toUpperCase().charAt(0);
	    }
	    public static void displayBoard()
	    {
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                System.out.print("___");
	                if(j<2)
	                {
	                    System.out.print("|");
	                }
	            }

	            System.out.println();
	        }
	        System.out.println("   |   |   ");
	    }
	    public static int getUserMove(char[] board, Scanner userInput) {
	        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        while (true) {
	            System.out.println("What is your next move");
	            int index = userInput.nextInt();
	            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index)) {
	                return index;
	            }
	        }


	    }private static void checkFreePosition(int userMove)
	    {
	        Scanner scan=new Scanner(System.in);
	        board[userMove]=getInput(scan);
	        displayBoard();

	    }

	    private static boolean isSpaceFree(char[] board, int index) {
	        return board[index] == ' ';
	    }

	    public static void main(String[] args)
	    {
	        System.out.println("Welcome");
	        char board[]=printMatrix();
	        Scanner userInput=new Scanner(System.in);
	        char userLetter=getInput(userInput);
	        char computerLetter=(userLetter=='X')?'0':'X';
	        System.out.println("computerLetter"+computerLetter);
	        displayBoard();
	        int userMove = getUserMove(board, userInput);
	        userLetter = getInput(userInput);
	        board[userMove] = userLetter;
	        displayBoard();
	        userMove=getUserMove(board,userInput);
	        checkFreePosition(userMove);

}}
