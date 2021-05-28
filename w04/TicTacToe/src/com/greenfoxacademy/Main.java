package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        new Main().main(); //kiszerveztük egy nem static main függvénybe a kódot
    }

    void main() { //main metodus
        char[][] board = new char[3][3];
        printBoard(board);
        System.out.println(isCellEmpty(board, 1, 1));
        step(board, 1, 1, true);
        printBoard(board);
        System.out.println(isCellEmpty(board, 1, 1));
    }

    boolean step(char[][] board, int cordX, int cordY, boolean isXSymbol) { //lépés a board-on
        if ((cordX >= board.length || cordX < 0) && (cordY >= board[cordX].length || cordY < 0)) {
            return false;
        }

        boolean cellEmpty = isCellEmpty(board, cordX, cordX);
        if (cellEmpty) {
            board[cordX][cordY] = isXSymbol ? 'X' : 'O';
            return true;
        }

        return false;
    }

    boolean isCellEmpty(char[][] board, int cordX, int cordY) {
        return board[cordX][cordY] == 0;
    }

    private void printBoard(char[][] board) { //board rajzolása
        System.out.println(". _ _ _ .");
        for (int i = 0; i < board.length; i++) {
            String line = "| ";
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    line += ". ";
                } else {
                    line += board[i][j] + " ";
                }
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println(". _ _ _ .");
        System.out.println("\r\n"); //sortörés karakter
    }
}
