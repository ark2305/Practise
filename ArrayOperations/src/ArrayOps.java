public class ArrayOps {

    public static void main(String[] args) {

        int[] arr = {9, 2, 1, 7, 5};

        int z=arr[0];
        int x=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>z){
                z=arr[i];
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]<x){
                x=arr[i];
            }
        }
        System.out.println("largest number of an array\t"+z);
        System.out.println("smallest number of an array\t"+x);

    }
}