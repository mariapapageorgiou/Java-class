public class DiagonalStar {

    // Write a method named printSquareStar with one parameter of type int named number.
    // If number is < 5, the method should print "Invalid Value".
    // The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be
    // accomplished by using loops (see examples below)
    //
    // printSquareStar(5);                                printSquareStar(8);
    //
    // *****  5 stars                                     ********  8 stars
    // ** **  2 stars space 2 stars                       **    **  2 stars 4 space 2 stars
    // * * *  1 star space 1 star space 1 star            * *  * *  1 star space 1 star 2 space 1 star space 1 star
    // ** **  2 stars space 2 stars                       *  **  *  1 star 2 space 2 stars 2 space 1 star
    // *****  5 stars                                     *  **  *  1 star 2 space 2 stars 2 space 1 star
    //                                                    * *  * *  1 star space 1 star 2 space 1 star space 1 star
    //                                                    **    **  2 stars 4 space 2 stars
    //                                                    ********  8 stars
    //
    // The patterns above consist of a number of rows and columns (where number is the number of rows to print).
    // For each row or column, stars are printed based on four conditions (READ CAREFULLY):
    // 1. In the first or last row
    // 2. In the first or last column
    // 3. When the row number equals the column number
    // 4. When the column number equals rowCount -currentRow + 1 (where currentRow is current row number)
    //
    // TIPS:Use a nested loop (a loop inside of a loop)
    //      To print on the same line, use the print method instead of println, e.g. System.out.print(" ");
    //         prints a space and does not "move" to another line.
    //      To "move" to another line, you can use an empty println call, e.g. System.out.println();
}
