package StriversArraysAndHashing;



//Here we will get ArrayOutOfBoundsException because we have taken pos and neg arr of same size as of arr
//so if we replace with ArrayList this should be fine

public class AlternateSignArrangement {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, -2, -4, 6, 3, -4, -6, -7, -78, 3, 4, 5, 6 };
        // printArrangedForm(arr); // we use this when we have equal pos and neg
        printArrangedForm2(arr); // we use this when we have unequal pos and neg
    }

    private static void printArrangedForm2(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int posIndex = 0, negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pos[posIndex++] = arr[i];
            else
                neg[negIndex++] = arr[i];
        }
        if (pos.length > neg.length) {
            int i = 0;
            for (i = 0; i < neg.length; i++) {
                arr[2 * i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }

            while (i < pos.length) {
                arr[i] = pos[i];
            }

        } else {
            int i = 0;
            for (i = 0; i < pos.length; i++) {
                arr[2*i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }

            while (i < neg.length) {
                arr[i] = neg[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printArrangedForm(int[] arr) {
        int posIndex = 0;
        int negIndex = 1;
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res[negIndex] = arr[i];
                negIndex += 2;
            } else {
                res[posIndex] = arr[i];
                posIndex += 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i] + " ");
        }
    }

}
