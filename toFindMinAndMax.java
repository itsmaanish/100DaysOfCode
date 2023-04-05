// Maximum and minimum of an array using minimum number of comparisons
    public class toFindMinAndMax {

        public static void main(String args[]){
            int[] arr = {2,5,6,1,3,4};
            toFindMaxAndMin(arr);
        }
    
        public static void toFindMaxAndMin(int[] arr){
            int max = arr[0];
            int min = arr[0];
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Maximum: " + max +"\n" + "Minimun: "+min);
        }
    }
    
    // GeeksForGeeks
    
    /* 
    
    class MaxMin {
        public static int findSum(int A[], int N){
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int i=0;i<N;i++){
                if(min>A[i]){
                    min = A[i];
                }
                if(max<A[i]){
                    max = A[i];
                }
            }
            return min+max;
        }
    }
    
    */



