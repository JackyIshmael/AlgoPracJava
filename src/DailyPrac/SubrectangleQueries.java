package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: 5422. Subrectangle Queries
 * @author: Jacky
 * @create: 2020-06-13 22:54
 **/
public class SubrectangleQueries {
    int[][] matr;

    public SubrectangleQueries(int[][] rectangle) {
        int rowLength = rectangle.length;
        int colLength = rectangle[0].length;
        matr=new int[rowLength][colLength];
        for(int i = 0; i < rectangle.length; i++){
            for(int j = 0; j < rectangle[i].length; j++){
                matr[i][j]=rectangle[i][j];
            }
        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++)
                matr[i][j]=newValue;
        }
    }

    public int getValue(int row, int col) {
        return matr[row][col];
    }
}
