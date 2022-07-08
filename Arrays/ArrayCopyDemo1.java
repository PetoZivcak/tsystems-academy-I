public class ArrayCopyDemo1 {
    public static void main(String[] args) {
        /*int[] copyFrom = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo = new int[7];
        int[] copyFrom2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo2 = new int[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (int i : copyTo) {
            System.out.print(i + ",");
        }
        System.out.println();

        arraycopy(copyFrom2, 2, copyTo2, 0, 7);
        for (int i : copyTo) {
            System.out.print(i + ",");
        }
        System.out.println();*/
        int[] copyFrom2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo2 = new int[7];
        int[] copyFrom3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 133, 14};
        int[] copyTo3 = new int[7];
        arraycopy(copyFrom2, 7, copyTo2, 0, 8);

    }

    private static boolean arraycopy(int[] source, int srcIndex,
                                     int[] dest, int destIndex, int length) {

        int limitValue1;
        int limitValue2;
        boolean myResponse;

        limitValue1 = source.length - srcIndex - 1;
        limitValue2 = dest.length - destIndex - 1;
        if (limitValue2 >= limitValue1 && length < limitValue1) {
            for (int i = 0; i < length; i++) {
                dest[destIndex + i] = source[srcIndex + i];
                System.out.print(source[srcIndex + i] + ",");
            }
        } else {
            System.out.println("nesprávne zadanie");
            return false;
        }
        return true;
    }

}