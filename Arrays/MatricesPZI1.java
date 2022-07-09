
public class MatricesPZI1 {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        //int[][] aMatrix = new int[4][5];
        //int[][] bMatrix = new int[4][5];
        //{null, ..., null}
        //{{0, 0, 0, 0, 0}, ..., {0, 0, 0, 0, 0}}

        /*int[] myArrayA1 = {1, 2, 3, 4, 5};
        int[] myArrayA2 = {6, 7, 8, 9, 10};
        int[] myArrayA3 = {11, 12, 13, 14, 15};
        int[] myArrayA4 = {16, 17, 18, 19, 20};
        int[] myArrayA5 = {21, 22, 23, 24, 25};

        int[] myArrayB1 = {1, 2, 3, 4, 5};
        int[] myArrayB2 = {6, 7, 8, 9, 10};
        int[] myArrayB3 = {11, 12, 13, 14, 15};
        int[] myArrayB4 = {16, 17, 18, 19, 20};
        int[] myArrayB5 = {21, 22, 23, 24, 25};
        int[][] aMatrix = new int[][]{myArrayA1,myArrayA2,myArrayA3,myArrayA4,myArrayA5};
        int[][] bMatrix = new int[][]{myArrayB1,myArrayB2,myArrayB3,myArrayB4,myArrayB5};
      MATICE PRE SCITANIE  */

        //int[][] addition = addMatrices(aMatrix, bMatrix);
        //int[][] transposed = transpose(aMatrix);
        //int[][] multiplied = multiply(aMatrix, bMatrix);


       /* int[] myArrayA1 = {1, 2, 3, 4, 5};
        int[] myArrayA2 = {6, 7, 8, 9, 10};
        int[][] forTransMatrix = new int[][]{myArrayA1,myArrayA2};
       MATICA PRE TRANSPOZICIU */

        /*int[] myArrayA1 = {2, 3, 1};
        int[] myArrayA2 = {4, 3, 5};


        int[] myArrayB1 = {1, 0, 2};
        int[] myArrayB2 = {3, 3, -1};
        int[] myArrayB3 = {-2, 1, 3};

        int[][] aMatrix = new int[][]{myArrayA1, myArrayA2};
        int[][] bMatrix = new int[][]{myArrayB1, myArrayB2, myArrayB3};
          MATICE PRE NASOBENIE*/

        //print matrix
        //printMatrix(aMatrix);
        //printMatrix(bMatrix);

        /*SCITANIE MATIC-PRIKAZ    printMatrix(addMatrices(aMatrix, bMatrix));*/
        /*TRANSPOZICIA MATICE-PRIKAZ  printMatrix(transpose(forTransMatrix));*/
        /*PRIKAZ PRE NASOBENIE  multiply(aMatrix, bMatrix);*/
       /*BUBBLE SORT ARRAY int[] myBubbleArray = {8, 0, 0, 3, 15};*/
       /*PRIKAZ PRE BUBBLESORT bubbleSort(myBubbleArray);*/
    }

    public static int[] bubbleSort(int myArray[]) {
        int myChecker = myArray.length;
        int myFirsValue = 0;
        int mySecondValue = 0;
        int i = 0;
        while (myChecker > 1) {
            if (myArray[i] < myArray[i] + 1 || myArray[i] == myArray[i + 1]) {
                myChecker = myChecker - 1;
            }
            if (myArray[i] > myArray[i + 1]) {
                myFirsValue = myArray[i];
                mySecondValue = myArray[i + 1];
                myArray[i] = mySecondValue;
                myArray[i + 1] = myFirsValue;
                myChecker = myArray.length + 1;
            }
            i=i+1;
            if (i==myArray.length-1){
                i=0;
            }
        }
        for(int j = 0; j<myArray.length;++j)
        {
        System.out.println(myArray[j]);
        }
        return myArray;
}
    private static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixB[0].length - 1][matrixA[0].length];
        int[][] nullMatrix = new int[2][2];
        int[] matrixACheck = {0, 0};
        int[] matrixBCheck = {0, 0};
        boolean multCheck = false;
        int[][] transposedMatrixA = new int[matrixA[0].length][matrixA.length];
        matrixACheck = matrixDimensionCheck(matrixA);
        matrixBCheck = matrixDimensionCheck(matrixB);
        multCheck = multCheckDimension(matrixACheck, matrixBCheck);
        if (multCheck == true) {
            transposedMatrixA = transpose(matrixA);
            //printMatrix(transposedMatrix);
            int a = 0;
            int i = 0;
            int c = 0;
            while (a < matrixB[0].length) {
                for (i = 0; i < transposedMatrixA.length; i++) {
                    matrixC[c][a] = matrixC[c][a] + transposedMatrixA[i][c] * matrixB[i][a];
                }
                a = a + 1;
                if (a == matrixB[0].length) {
                    c = c + 1;
                    a = 0;
                }
                if (c == transposedMatrixA[0].length) {
                    printMatrix(matrixC);
                    break;
                }
            }

        } else {
            System.out.println(" preto nie je možné matice násobiť");
            return nullMatrix;
        }
        return matrixC;
    }

    public static boolean multCheckDimension(int[] matrix1, int matrix2[]) {
        boolean myResult = true;
        if (matrix1[0] == matrix2[1]) {
            System.out.println("Rozmery matic pre nasobenie  nie su spravne");
            myResult = false;
        }
        return myResult;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        //vysledok bude v matrixC
        return transposed;
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
        int[] matrixACheck = {0, 0};
        int[] matrixBCheck = {0, 0};
        boolean addCheck = false;
        matrixACheck = matrixDimensionCheck(matrixA);
        matrixBCheck = matrixDimensionCheck(matrixB);
        addCheck = addCheckDimension(matrixACheck, matrixBCheck);
        if (addCheck == true) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else {
            System.out.println(", preto matice nie je mozne scitat");
        }
        return matrixC;
    }

    public static boolean addCheckDimension(int[] matrix1, int matrix2[]) {
        boolean myResult = true;
        if (matrix1[0] != matrix2[0] || matrix1[1] != matrix2[1]) {
            System.out.println("Rozmery matic  nie su spravne");
            myResult = false;
        }
        return myResult;
    }

    public static int[] matrixDimensionCheck(int[][] myMatrix) {
        //zisti rozmery zadanej matice a ulozi do pola
        int[] myResult = {0, 0};
        myResult[0] = myMatrix.length;
        myResult[1] = myMatrix[0].length;
        //System.out.println(myResult[0] + "," + myResult[1]);
        return myResult;
    }

    public static boolean matrixDimensionRowEqualityCheck(int[][] myMatrix) {
        //skontroluje, či každé pole v dvojrozmernom p-oli má rovnakú veľkosť
        for (int i = 0; i < myMatrix.length - 1; i++) {
            if (myMatrix[i].length != myMatrix[i + 1].length) {
                System.out.println("Nie je mozne vykonat operaciu s maticami, lebo rozmery poli su rozne");
                return false;
            }
        }
        System.out.println("Vnútorné rozmery matíc sú správne");
        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}