public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 4 && 4 < arr.length) { //Check array bounds 
            System.out.println(arr[4]); // Accessing a valid element 
        }
        else{
            System.out.println("Array is empty or index is out of bounds");
        }
    }
}