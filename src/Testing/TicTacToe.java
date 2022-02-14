package Testing;

public class TicTacToe {
    public static void main(String[] args) {


        // Open Table
        String[][] gameBoard = createBoard();

        int x = giveNum();

        // Greet User
        System.out.println("Shalom User");
        System.out.println("Look at the Board");

        // Show Board
        printBoard(gameBoard);

    }


    public static int giveNum() {
        return 5;
    }


   public static String[][] createBoard() {
        String[][] myBoard = new String[3][3];
        int x = 1;
        for (int row = 0; row < myBoard.length; row +=1) {
            for (int col = 0; col < myBoard[row].length ; col+=1) {
                myBoard[row][col] = x +"";
                x+=1;
            }
        }
        return myBoard;
    }



    public static void printBoard(String[][] printMe) {
        for (int row = 0; row < printMe.length; row +=1) {
            for (int col = 0; col < printMe[row].length ; col+=1) {
                System.out.print(printMe[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }
}
