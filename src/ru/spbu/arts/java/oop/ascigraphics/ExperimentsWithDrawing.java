package ru.spbu.arts.java.oop.ascigraphics;

public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing d1 = new Drawing(5, 5, '.');
        d1.print();
        d1.setPoint(3, 2, 'x');
        d1.print();
        d1.drawVerticalLine(2, 0, 2, '|');
        d1.print();
        d1.drawHorizontalLine(1, 0, 3, '-');
        d1.print();
        d1.drawRectangle(4, 0, 0, 3);
        d1.print();
    }
}
