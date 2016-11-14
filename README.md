You can use CubeBuilder to build cube, it has two methods for base task and additional task1, they print cubes to the file named color

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
    public void additionalTask2(List<Piece> pieces, String color);