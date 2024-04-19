
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //User scanner for # they want to print
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter row # you want to print: ");
        int rowNumber = scan.nextInt();

        //Array list for rows that gets the user input
        ArrayList<Integer> row = getRow(rowNumber);
        //prints out the correct row's numbers
        for (int i = 0; i < row.size(); i++) {
            if (i == row.size() - 1)
                System.out.print(row.get(i));
            else
                System.out.print(row.get(i) + ", ");
        }
    }
    public static ArrayList<Integer> getRow(int rowIndex) {
        //array list to get the current row
        ArrayList<Integer> curRow = new ArrayList<Integer>();
        // row starts 1
        curRow.add(1);

        // Check if the row that has to be returned is the first row
        if (rowIndex == 0) {
            return curRow;
        }
        // Gets the previous row
        ArrayList<Integer> prev = getRow(rowIndex - 1);

        for (int i = 1; i < prev.size(); i++) {
            // Gets the current row by the help of the previous row
            int curr = prev.get(i - 1)
                    + prev.get(i);
            curRow.add(curr);
        }
        curRow.add(1);

        // Return the row
        return curRow;
    }
}