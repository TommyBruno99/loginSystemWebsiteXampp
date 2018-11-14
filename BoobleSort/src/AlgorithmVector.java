public class AlgorithmVector {

    private int[] arr;

    AlgorithmVector(int[] arr) {
        this.arr = arr;
    }


    public int[] getList() {
        return this.arr;
    }

     void sortArray() {
        int n = this.arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(this.arr[j-1] > this.arr[j]){
                    //swap elements
                    temp = this.arr[j-1];
                    this.arr[j-1] = this.arr[j];
                    this.arr[j] = temp;
                }

            }
        }
     }

    void printArray() {
        for (int anArr : this.arr) {
            System.out.print(anArr + " ");
        }
    }

}
