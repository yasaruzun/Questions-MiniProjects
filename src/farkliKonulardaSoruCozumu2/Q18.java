package farkliKonulardaSoruCozumu2;

public class Q18 {

    /*
     * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
     * value, decreasing constantly after the maximum value Not Mauntain Array-->
     * [5, 2, 7, 1, 4]
     *
     * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
     * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
     */
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 3, 1}; // {1,2,3,4,5,8,7,1,0}
        System.out.println(isMountainArr(arr));

    }

    public static boolean isMountainArr(int[] arr) {
        boolean bl = true;
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            if (arr[i] > arr[i + 1]) {
                bl = false;
                break;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                bl = false;
                break;
            }
        }

        return bl;
    }

}