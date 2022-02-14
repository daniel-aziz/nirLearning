package Testing;

public class Arrays {
    public static void main(String[] args) {


        int num[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int num1[] = {1,2,3,2,1};
        int num2[] = {1,2,3,7,1};


        for (int row = 0; row < num.length; row +=1) {
            for (int col = 0; col < num[0].length ; col+=1) {
                System.out.println(num[row][col]);
                System.out.println("Row: " + row + " Col: " + col);
            }
            System.out.println();
        }

    }
}
