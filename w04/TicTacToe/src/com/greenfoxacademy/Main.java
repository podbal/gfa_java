package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        new Main().main(); //kiszerveztük egy nem static main függvénybe a kódot
    }

    void main() { //main metodus
        char[][] board = new char[3][3];
        printBoard(board);
        step(board, 4, 1, true);
        printBoard(board);
    }

    boolean step(char[][] board, int cordX, int cordY, boolean isXSymbol) { //lépés a board-on
        if (cordX < board.length && cordY < board[cordX].length) {
            board[cordX][cordY] = isXSymbol ? 'X' : 'O';
            return true;
        }
        return false;
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
