package org.example;

import javax.swing.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JLabel {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];

        for (int y = 0; y < chessboard.length; y++) {
            for (int x = 0; x < chessboard.length; x++) {
                if ((x+y) % 2 == 0) {
                    chessboard[y][x] = "\u25A0"; // white box
                } else {
                    chessboard[y][x] = "\u25A1"; // black box

                }
            }
        }

        for (String[] row : chessboard) {
            System.out.println(Arrays.toString(row));
        }
    }
}