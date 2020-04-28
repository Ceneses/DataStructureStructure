package Test;

public class Test {
    public static void main(String[] args) {
        String str = "Java,Java, Hello World!";
        String newStr = str.replaceAll("Java","Han");
        System.out.println(newStr);
        int[][] chess = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;
        for (int[] row : chess) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        System.out.println("稀疏数组....");
        chess2sparse(chess);
    }
    public static int[][] chess2sparse(int[][] chess){
        int row = chess.length;
        int col = chess[0].length;
        int num = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(chess[i][j] != 0){
                    num++;
                }
            }
        }
        int[][] sparseArr = new int[num + 1][3];
        sparseArr[0][0] = row;
        sparseArr[0][1] = col;
        sparseArr[0][2] = num;
        int count = 1;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(chess[i][j] != 0){
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chess[i][j];
                    count++;
                }
            }
        }
        for (int i = 0; i < num + 1; ++i){
            for (int j = 0; j < 3; ++j){
                System.out.printf("%d\t",sparseArr[i][j]);
            }
            System.out.println();
        }
        return sparseArr;
    }
}
