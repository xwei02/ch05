public class Practice3 {
    public static int[] reversedArray(int[] arr) {
        int[] outputArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1;  i >=0 ; i--) {
            outputArray[j] = arr[i]; //outputArray[2] = 6
            j++;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        int[] array ={4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reversedArray(array);
        for (int i :reversedArray) {
            System.out.println(i+" ");
        }
    }
}

