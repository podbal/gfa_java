package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
        new Main().main(); //kiszerveztük egy main függvénybe a kódot, amin nem static
    }

    void main() {
        System.out.println("TicTacToe");
        char[][] board = new char[3][3];
        printBoard(board);

    }

    private void printBoard(char[][] board) {
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
    }
}
