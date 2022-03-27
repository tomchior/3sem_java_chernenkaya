package ru.spbu.arts.java.oop.ascigraphics;

public class Drawing {
    private int i;
    private int j;
    private char c;
    private char[][] d;

    public Drawing(int i, int j, char c) {
        d = new char[i][j];
        for (int k = 0; k < i; k++)
            for (int l = 0; l < j; l++) d[k][l] = c;
    }

    public void print() {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void setPoint(int x, int y, char z) {
        d[y][x] = z;
    }

    public void drawVerticalLine(int stLine, int endLine, int column, char symbol) {
        if (stLine > endLine) {
            int a = stLine;
            stLine = endLine;
            endLine = a;
        }
        for (i = stLine; i <= endLine; i++) {
            d[i][column] = symbol;
        }
    }

    public void drawHorizontalLine(int line, int stColumn, int endColumn, char symbol) {
        if (stColumn > endColumn) {
            int a = stColumn;
            stColumn = endColumn;
            endColumn = a;
        }
        for (j = stColumn; j <= endColumn; j++) {
            d[line][j] = symbol;
        }
    }

    public void drawRectangle(int topX, int topY, int bottomX, int bottomY) {
        drawHorizontalLine(topY, bottomX, topX, '-');
        drawHorizontalLine(bottomY, bottomX, topX, '-');
        drawVerticalLine(topY, bottomY, topX, '|');
        drawVerticalLine(topY, bottomY, bottomX, '|');
        d[topY][topX] = '+';
        d[bottomY][bottomX] = '+';
        d[bottomX][topY] = '+';
        d[bottomY][topX] = '+';
    }

}