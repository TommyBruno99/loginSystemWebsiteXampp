public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45,320, 5};

        AlgorithmVector vector = new AlgorithmVector(arr);
        System.out.println("Array before bubble sort");

        // Print array before bubble sort
        vector.printArray();

        System.out.println();
        System.out.println();
        System.out.println();

        // Sort array
        vector.sortArray();

        System.out.println("Array after sort");
        // Print after bubble sort
        vector.printArray();
    }
}
