package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(traverse(matrix));
    }

     private static List<Integer> traverse(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int topFence = 0;
        int bottomFence = matrix.length - 1;
        int rightFence = matrix[0].length - 1;
        int leftFence = 0;
        int totalElements=matrix.length*matrix[0].length;
        int traversed=1;
        while(traversed<=totalElements){
            //Traversing over topFence
            for(int col = leftFence; col<=rightFence; col++){
               result.add(matrix[topFence][col]);
               traversed++;
               System.out.println("TopFence- row="+topFence+" column="+col);
            }
            topFence++;
            //Traversing over rightFence
            for(int row = topFence; row<= bottomFence&&traversed<=totalElements; row++){
                result.add(matrix[row][rightFence]);
                traversed++;
                System.out.println("RightFence- row="+row+" column="+rightFence);
            }
            rightFence--;
            //Traversing over bottomFence
            for(int col = rightFence; col >= leftFence&&traversed<=totalElements; col--){
                result.add(matrix[bottomFence][col]);
                traversed++;
                System.out.println("BottomFence- row="+bottomFence+" column="+col);
            }
            bottomFence--;
            //Traversing over leftFence
            for(int row = bottomFence; row >= topFence&&traversed<=totalElements; row--){
                result.add(matrix[row][leftFence]);
                traversed++;
                System.out.println("LeftFence- row="+row+" column="+leftFence+" traversed="+traversed);
            }
            leftFence++;
        }
        return result;
     }
}
