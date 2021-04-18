import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int dimension = 8;
        char[][] board = new char[dimension][dimension];
        boolean isWhite = false;
        for(int y = 0; y < board.length ; y++){

            isWhite = !isWhite;
            for(int x=0; x < board[y].length; x++){

                if(isWhite) board[y][x]='W';
                if(!isWhite) board[y][x]='B';
                isWhite = !isWhite;

            }
        }

        for(int i=0; i<board.length; i++){
            System.out.println(Arrays.toString(board[i]));
        }

    }
} 
