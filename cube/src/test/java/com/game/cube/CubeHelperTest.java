package com.game.cube;

import org.junit.Test;

import static org.junit.Assert.*;

import com.game.cube.model.Piece;

public class CubeHelperTest {

    CubeHelper helper = new CubeHelper();

    @Test
    public void testPieceMatch() {
        Piece piece1 = new Piece(1, new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {0, 0, 1, 0, 0}});
        Piece piece2 = new Piece(2, new int[][]{{0, 1, 0, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});
        assertTrue(helper.checkTwoEdgesMatch(piece1.getEdge(2), piece2.getEdge(0), true));
        assertTrue(helper.checkTwoEdgesMatch(piece1.getEdge(2), piece2.getEdge(0), false));
    }

    @Test
    public void testPieceMatchBoth() {
        Piece piece1 = new Piece(1, new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}});
        Piece piece2 = new Piece(2, new int[][]{{0, 0, 0, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});

        assertTrue(helper.checkTwoEdgesMatch(piece1.getEdge(2), piece2.getEdge(0), true));
    }

    @Test
    public void testPieceNotMatchVertice() {
        Piece piece1 = new Piece(1, new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}});
        Piece piece2 = new Piece(2, new int[][]{{1, 1, 0, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});

        assertTrue(!helper.checkTwoEdgesMatch(piece1.getEdge(2), piece2.getEdge(0), true));
    }

    @Test
    public void testPieceNotMatchEdge() {
        Piece piece1 = new Piece(1, new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}});
        Piece piece2 = new Piece(2, new int[][]{{0, 0, 0, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});

        assertTrue(!helper.checkTwoEdgesMatch(piece1.getEdge(2), piece2.getEdge(0), true));
    }

    @Test
    public void testRotatePiece() {

        int[][] matrix = {{26, 2, 3, 4, 5}, {6, 1, 1, 1, 10}, {11, 1, 1, 1, 15}, {16, 1, 1, 1, 20},
        {21, 22, 23, 24, 25}};

        int[][] rotatedMatrix = {{21, 16, 11, 6, 26}, {22, 1, 1, 1, 2}, {23, 1, 1, 1, 3}, {24, 1, 1, 1, 4},
        {25, 20, 15, 10, 5}};
        int[][] result = helper.rotatePiece(matrix);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(rotatedMatrix[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void testMirrorPiece() {

        int[][] matrix = {{26, 2, 3, 4, 5}, {6, 1, 1, 1, 10}, {11, 1, 1, 1, 15}, {16, 1, 1, 1, 20},
        {21, 22, 23, 24, 25}};

        int[][] mirror = {{21, 22, 23, 24, 25}, {16, 1, 1, 1, 20}, {11, 1, 1, 1, 15}, {6, 1, 1, 1, 10},
        {26, 2, 3, 4, 5}};

        int[][] mirror2 = {{5, 4, 3, 2, 26}, {10, 1, 1, 1, 6}, {15, 1, 1, 1, 11}, {20, 1, 1, 1, 16},
        {25, 24, 23, 22, 21}};

        int[][] result = helper.mirrorPiece(matrix);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(mirror[i][j], result[i][j]);
            }
        }

        result = helper.rotatePiece(result);
        result = helper.rotatePiece(result);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(mirror2[i][j], result[i][j]);
            }
        }
    }
}
