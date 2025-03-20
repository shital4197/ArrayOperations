public class SumofArray {

    public static void main(String[] args) {

        int arr[] = {8,66,89,12,8,1,5};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array is : " + sum);
    }
}
