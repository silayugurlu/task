/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.cube.builder;

import com.game.cube.model.Piece;
import java.util.List;

/**
 *
 * @author silay.ugurlu
 */
public interface CubeBuilder {
    
     /**
     * Gets pieces in puzzle, builds first possible cube and prints it to the
     * file named {color}_base.text
     * 
     * @param pieces
     * @param color 
     */
    public void baseTask(List<Piece> pieces, String color);
    
      /**
     * Gets pieces in puzzle, builds all possible cubes and prints them to the
     * file named {color}_task2.txt
     *
     * @param pieces pieces in puzzle
     * @param color name of the file
     */
    public void additionalTask1(List<Piece> pieces, String color);
}
