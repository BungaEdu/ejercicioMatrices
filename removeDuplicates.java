import java.util.Arrays;
public class removeDuplicates{
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] tempA = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[n-1];
        for (int i=0; i<j; i++){
            arr[i] = tempA[i];
        }
        return j;
    }

    /*********************COMO UTILIZARLO FUERA de esta clase*********///////
    public static void main (String[] args) {
        int arr[] = {11,7,2,2,7,8,8,8,3};
        Arrays.sort(arr);
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
