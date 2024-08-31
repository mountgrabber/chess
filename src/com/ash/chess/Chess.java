package com.ash.chess;

public class Chess {
    Figure[] desk;

    Figure getFigure(Position pos) {


        return new Figure(Type.PAWN, false, pos);
    }

    static class Figure {
        static char body;
        boolean isBlack;

        Type type;
        Position position;

        Figure(Type type, boolean isBlack, Position startPos) {
            switch (type) {
                case PAWN -> {
                    body = 'P';
                }
                case KNIGHT -> {
                    body = 'N';
                }
                case BISHOP -> {
                    body = 'B';
                }
                case ROOK -> {
                    body = 'R';
                }
                case QUEEN -> {
                    body = 'Q';
                }
                case KING -> {
                    body = 'K';
                }
            }
            this.type = type;
            this.isBlack = isBlack;
            this.position = startPos;
        }

    }
    static class Position {
        int x;
        int y;
        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    enum Type {
        PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
    }

}

