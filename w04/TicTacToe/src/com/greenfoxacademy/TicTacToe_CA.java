package com.greenfoxacademy;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_CA {


    public static void main(String[] args) {
        new TicTacToe_CA().main();
    }

    void main() {
        char[][] board = new char[3][3];
        String firstPlayerName = readPlayerName("First player:");
        String secondPlayerName = readPlayerName("Second player:");
        boolean firstPlayerWithX = calculateFirstPlayer(firstPlayerName, secondPlayerName);
        String playerWithX = firstPlayerWithX ? firstPlayerName : secondPlayerName;
        String playerWithO = firstPlayerWithX ? secondPlayerName : firstPlayerName;

        int stepNum = 0;
        do {
            if (stepNum % 2 == 0) {
                System.out.println(playerWithX + "'s round:");
            } else {
                System.out.println(playerWithO + "'s round:");
            }

            printBoard(board);
            int[] nextCoord = readCoordinate();
            boolean isXRound = stepNum % 2 == 0;
            boolean hasStepSuccess = step(board, nextCoord[0], nextCoord[1], isXRound);
            if (hasStepSuccess) {
                stepNum++;
            } else {
                System.out.println("Cell is used.");
            }

            if (isWin(board)) {
                System.out.println("Somebody has won.");
            }
        } while (stepNum < 9);
    }

    boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            boolean isSame = true;
            for (int j = 0; j < board[i].length - 1; j++) {
                if (board[i][j] != board[i][j + 1]) {
                    isSame = false;
                    break;
                }
                if (board[i][j] == 0) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                return true;
            }
        }

        for (int i = 0; i < board.length; i++) {
            boolean isSame = true;
            for (int j = 0; j < board[j].length - 1; j++) {
                if (board[j][i] != board[j + 1][i]) {
                    isSame = false;
                    break;
                }
                if (board[j][i] == 0) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                return true;
            }
        }

        return false;
    }

    private int[] readCoordinate() {
        int xCoord = readCoord("X");
        int yCoord = readCoord("Y");
        int[] returnValue = {xCoord - 1, yCoord - 1};
        return returnValue;
    }

    private int readCoord(String symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the " + symbol + " coordinate 1 to 3");
        int coord;
        do {
            if (scanner.hasNextInt()) {
                coord = scanner.nextInt();
                if (coord > 0 && coord <= 3) {
                    break;
                }
            }
            System.out.println("Please choose a valid coordinate 1 to 3");
            scanner.nextLine();
        } while (true);
        return coord;
    }

    private boolean calculateFirstPlayer(String firstPlayerName, String secondPlayerName) {
        Random random = new Random();
        boolean firstPlayerWithX = random.nextBoolean();
        String symbol = firstPlayerWithX ? "X" : "O";
        System.out.println(firstPlayerName + " plays with " + symbol + " symbol.");
        symbol = firstPlayerWithX ? "O" : "X";
        System.out.println(secondPlayerName + " plays with " + symbol + " symbol.");
        return firstPlayerWithX;
    }

    private String readPlayerName(String prefix) {
        System.out.println(prefix);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name:");
        return scanner.nextLine();
    }

    boolean step(char[][] board, int coordX, int coordY, boolean isXSymbol) {
        if ((coordX >= board.length || coordX < 0) && (coordY >= board[coordX].length || coordY < 0)) {
            return false;
        }

        boolean cellEmpty = isCellEmpty(board, coordX, coordY);
        if (cellEmpty) {
            board[coordX][coordY] = isXSymbol ? 'X' : 'O';
            return true;
        }

        return false;
    }

    boolean isCellEmpty(char[][] board, int coordX, int coordY) {
        return board[coordX][coordY] == 0;
    }

    void printBoard(char[][] board) {
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
        System.out.println("\r\n");
    }
}

