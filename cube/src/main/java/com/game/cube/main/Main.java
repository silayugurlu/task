package com.game.cube.main;

import com.game.cube.builder.CubeBuilder;
import com.game.cube.builder.CubeBuilderImpl;

import com.game.cube.model.Piece;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static Piece[] prepareDataBlue() {
        int[][] nodes1 = {{0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0},
        {0, 0, 1, 0, 0}};

        Piece piece1 = new Piece(1, nodes1);

        int[][] nodes2 = {{1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1}};

        Piece piece2 = new Piece(2, nodes2);

        int[][] nodes3 = {{0, 0, 1, 0, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1},
        {0, 0, 1, 0, 0}};

        Piece piece3 = new Piece(3, nodes3);

        int[][] nodes4 = {{0, 1, 0, 1, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {1, 1, 0, 1, 0}};

        Piece piece4 = new Piece(4, nodes4);

        int[][] nodes5 = {{0, 1, 0, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0}};

        Piece piece5 = new Piece(5, nodes5);

        int[][] nodes6 = {{0, 1, 0, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1},
        {1, 1, 0, 1, 1}};

        Piece piece6 = new Piece(6, nodes6);

        Piece[] pieces = {piece1, piece2, piece3, piece4, piece5, piece6};
        return pieces;
    }

    public static Piece[] prepareDataRed() {
        int[][] nodes1 = {{0, 0, 0, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0},
        {0, 1, 0, 1, 1}};

        Piece piece1 = new Piece(1, nodes1);

        int[][] nodes2 = {{0, 1, 0, 1, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {0, 1, 0, 0, 0}};

        Piece piece2 = new Piece(2, nodes2);

        int[][] nodes3 = {{0, 1, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 0, 1, 1}};

        Piece piece3 = new Piece(3, nodes3);

        int[][] nodes4 = {{0, 0, 1, 0, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {0, 0, 1, 0, 0}};

        Piece piece4 = new Piece(4, nodes4);

        int[][] nodes5 = {{0, 0, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0}};

        Piece piece5 = new Piece(5, nodes5);

        int[][] nodes6 = {{0, 1, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0},
        {1, 1, 0, 1, 1}};

        Piece piece6 = new Piece(6, nodes6);

        Piece[] pieces = {piece1, piece2, piece3, piece4, piece5, piece6};
        return pieces;
    }

    public static Piece[] prepareDataPurple() {
        int[][] nodes1 = {{1, 1, 0, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1},
        {0, 0, 1, 0, 0}};

        Piece piece1 = new Piece(1, nodes1);

        int[][] nodes2 = {{0, 0, 0, 1, 1}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0},
        {0, 1, 0, 1, 0}};

        Piece piece2 = new Piece(2, nodes2);

        int[][] nodes3 = {{0, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {0, 0, 1, 0, 0}};

        Piece piece3 = new Piece(3, nodes3);

        int[][] nodes4 = {{1, 1, 0, 1, 1}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 0},
        {0, 1, 0, 1, 0}};

        Piece piece4 = new Piece(4, nodes4);

        int[][] nodes5 = {{0, 0, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {1, 0, 1, 1, 0}};

        Piece piece5 = new Piece(5, nodes5);

        int[][] nodes6 = {{0, 1, 0, 1, 1}, {0, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {1, 1, 0, 1, 0}};

        Piece piece6 = new Piece(6, nodes6);

        Piece[] pieces = {piece1, piece2, piece3, piece4, piece5, piece6};
        return pieces;
    }

    public static Piece[] prepareDataYellow() {
        int[][] nodes1 = {{0, 0, 1, 0, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0},
        {0, 1, 0, 1, 0}};

        Piece piece1 = new Piece(1, nodes1);

        int[][] nodes2 = {{0, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0},
        {0, 1, 0, 1, 0}};

        Piece piece2 = new Piece(2, nodes2);

        int[][] nodes3 = {{0, 0, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0}};

        Piece piece3 = new Piece(3, nodes3);

        int[][] nodes4 = {{1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0}};

        Piece piece4 = new Piece(4, nodes4);

        int[][] nodes5 = {{0, 0, 1, 0, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1},
        {1, 1, 0, 1, 0}};

        Piece piece5 = new Piece(5, nodes5);

        int[][] nodes6 = {{0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0},
        {0, 1, 0, 1, 1}};

        Piece piece6 = new Piece(6, nodes6);

        Piece[] pieces = {piece1, piece2, piece3, piece4, piece5, piece6};
        return pieces;
    }

    public static void main(String[] args) {

        CubeBuilder builder = new CubeBuilderImpl();

        List<Piece> bluePieces = Arrays.asList(prepareDataBlue());
        builder.baseTask(bluePieces, "blue");
        builder.additionalTask1(bluePieces, "blue");

        List<Piece> redPieces = Arrays.asList(prepareDataRed());
        builder.baseTask(redPieces, "red");
        builder.additionalTask1(redPieces, "red");

        List<Piece> purplePieces = Arrays.asList(prepareDataPurple());
        builder.baseTask(purplePieces, "purple");
        builder.additionalTask1(purplePieces, "purple");

        List<Piece> yellowPieces = Arrays.asList(prepareDataYellow());
        builder.baseTask(yellowPieces, "yellow");
        builder.additionalTask1(yellowPieces, "yellow");

    }

}
