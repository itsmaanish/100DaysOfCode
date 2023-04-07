// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}

// Input :  arr[] = Geeks
// Output : arr[] = skeeG

// public class ReverseArray {
//     public static void main(String args[]){
//         // int arr[] = new int[]{4, 5, 1, 2};
//         char arr[] = new char[]{'G','e','e','k','s'};

//         System.out.println("Array Elements: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//         System.out.println("Reverse Array: ");
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// USING Function

public class ReverseArray {

    public static void toReverseArray(char arr[]){
        System.out.println("Array Elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Reverse Array: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[] = new char[]{'G','e','e','k','s'};
        toReverseArray(arr);
    }
}

