/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuchecker;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author mike
 */
public class mmonical_SudokuChecker {

    private grid[9][9];
    
    
    /**
     * mmonical_SudokuChecker()
     * 
     * This is the constructor method for the class. It will not have a return
     * type, and the name of the method needs to match the name of the class
     * exactly.
     * 
     * This method takes as an argument a String that is the name of a file. It
     * should open up the file and read in the file contents into the 2-d int 
     * array "grid" that is a private instance variable of the class.
     * 
     * @param inputFile a String containing the input file name
     * @return no return type at all
     */
    public mmonical_SudokuChecker (String : inputFile)
    {
        try{
            grid [][] 
          
            Scanner keyboard = new Scanner(System.in);
            String inputFile;
            System.out.println("Enter input filename: ");
            inputFile = keyboard.next();
            
            

            File file = new File( inputFile );
            input = new Scanner( file );
            numSquare = input.nextInt();
    }
    
    /**
     * display()
     * 
     * This method displays the square to the screen. There should not be any
     * labeling of the rows or columns, but separating the output into regions 
     * is required for easier visual identification of each region of the Sudoku
     * grid. See the sample runs for examples.
     */
    public void display()
    {
        
    }
    
    /**
     * checkRows()
     * 
     * This method checks each row to see if it is a valid row, with each
     * value between 1 and 9 inclusive being used only once.
     * 
     * The method should label each of the 9 rows and then identify if the
     * column is GOOD or BAD by outputting the text GOOD or BAD. There is no
     * need to identify which values are bad (either duplicated or missing).
     * 
     * The method should return true if all of the rows are valid and false
     * otherwise.
     * 
     * 
     * @return boolean true or false if all the rows are valid. 
     */
    public boolean checkRows()
    {
        
    }
        /**
     * checkColumns()
     * 
     * This method checks each column to see if it is a valid column, with each
     * value between 1 and 9 inclusive being used only once.
     * 
     * The method should label each of the 9 columns and then identify if the
     * column is GOOD or BAD by outputting the text GOOD or BAD. There is no
     * need to identify which values are bad (either duplicated or missing).
     * 
     * The method should return true if all of the columns are valid and false
     * otherwise.
     * 
     * 
     * @return boolean true or false if all the columns are valid. 
     */
    public boolean checkColumns()
    {
        
    }
    
    /**
     * checkRegions()
     * 
     * This method checks each region to see if it is a valid region, with each
     * value between 1 and 9 inclusive being used only once.
     * 
     * The method should label each of the 9 regions and then identify if the
     * column is GOOD or BAD by outputting the text GOOD or BAD. There is no
     * need to identify which values are bad (either duplicated or missing).
     * 
     * The method should return true if all of the regions are valid and false
     * otherwise.
     * 
     * 
     * @return boolean true or false if all the regions are valid. 
     */
    public boolean checkRegions()
    {
        
    }

}

