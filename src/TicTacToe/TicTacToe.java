package TicTacToe;

import java.util.*;

public class TicTacToe {
//    making positions global

    static ArrayList<Integer>playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer>computerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char [][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printBoard(board);
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your number between 1-9: ");
            int playerPosition =  scanner.nextInt();
            while (playerPositions.contains(playerPosition) || computerPositions.contains(playerPosition))
                System.out.println("Position taken! Enter a correct ");
            piece(board, playerPosition, "player");
            String result = checkWinner();
            if (!result.isEmpty()){
                System.out.println(result);
                break;
            }


            Random random = new Random();
            int computerPosition = random.nextInt(9) + 1;
            while (playerPositions.contains(computerPosition) || computerPositions.contains(computerPosition))
                computerPosition = random.nextInt(9) + 1;
            piece(board, computerPosition, "computer");

            printBoard(board);
            result = checkWinner();
            if (!result.isEmpty()){
                System.out.println(result);
                break;
            }
        }



    }
    public static void printBoard( char[][] board){
        for (char [] row : board){
            for (char c:row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void piece(char[][] board, int position, String user){
        char symbol = ' ';
        if (user.equals("player")){
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("computer")) {
            symbol = '0';
            computerPositions.add(position);
        }
        switch (position) {
            case 1 -> board[0][0] = symbol;
            case 2 -> board[0][2] = symbol;
            case 3 -> board[0][4] = symbol;
            case 4 -> board[2][0] = symbol;
            case 5 -> board[2][2] = symbol;
            case 6 -> board[2][4] = symbol;
            case 7 -> board[4][0] = symbol;
            case 8 -> board[4][2] = symbol;
            case 9 -> board[4][4] = symbol;
            default -> {
            }
        }

    }
    public static String checkWinner(){
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(1, 6, 9);
        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        List<List>win = new ArrayList<>();
        win.add(topRow);
        win.add(midRow);
        win.add(botRow);
        win.add(midCol);
        win.add(leftCol);
        win.add(rightCol);
        win.add(cross1);
        win.add(cross2);

        for(List x : win){
            if(playerPositions.containsAll(x)){
                return "Congratulations you won!!!";
            } else if (computerPositions.containsAll(x)) {
                return "Computer Wins!!!";
            } else if (playerPositions.size()+ computerPositions.size() == 9) {
                return "Its a Draw";
                
            }
        }
        return "";
    }
}
