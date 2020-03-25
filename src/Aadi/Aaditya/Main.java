package Aadi.Aaditya;

import Aadi.Aaditya.utility.Board;

import java.util.Scanner;

public class Main {
    private static Board board;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    board = new Board();
	    board.displayBoard();
	    while(true) {
            String in = input.nextLine();
            System.out.println(runTurn(in,true));
            board.displayBoard();
        }
    }

    public static boolean runTurn(String input, boolean isWhite) {
        if(input.length() != 5) {
            System.out.println("error");
            return false;
        }
        char[] in = input.toCharArray();
        int[] coords = new int[4];

        int x = 0;
        for(char c : in) {
            if(Character.isDigit(c)) {
                coords[x] = Integer.parseInt(c+"");
                x++;
            }
        }

        return board.Move(coords[0],coords[1],coords[2],coords[3], isWhite);
    }


}
