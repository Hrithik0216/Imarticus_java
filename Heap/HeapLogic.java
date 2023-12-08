package Heap;

public class HeapLogic {
    private int[] heapArr;
    private int size;
    private int maxSize;

    HeapLogic(int maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        this.heapArr = new int[this.maxSize + 1];
        heapArr[0] = 5555;
    }
    public void minHeap(int current){
        while (current > 0 && parent(current)>0 && heapArr[parent(current)] > heapArr[current]) {
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public int parent(int position) {
        return position / 2;
    }

    public int leftChild(int position) {
        return position * 2;
    }

    public int rightChild(int position) {
        return position * 2 + 1;
    }

    public void insert(int value) {
        size += 1;
        heapArr[size] = value;
        int current = size;
        
        minHeap(current);
        
    }
    

    public void swap(int position1, int position2) {
        int temp = heapArr[position1];
        heapArr[position1] = heapArr[position2];
        heapArr[position2] = temp;
    }
    

    // public void display() {
    //     for (int i = 1; i < heapArr.length+1; i++) {
    //         System.out.print(heapArr[i]);
    //         if(maxSize>= heapArr[leftChild(i)]){
    //             System.out.print("Left: "+heapArr[leftChild(i)]);
    //         }
    //         if(maxSize>= heapArr[rightChild(i)]){
    //             System.out.print("Right: "+heapArr[rightChild(i)]);
    //         }
    //     }
    // }
    public void display() {
        for (int i = 1; i <= size; i++) {
            if(i<heapArr.length/2){
                System.out.print(heapArr[i]);
            }
            
    
            if (leftChild(i) <= size) {
                System.out.print(" Left: " + heapArr[leftChild(i)]);
            }
    
            if (rightChild(i) <= size) {
                System.out.print(" Right: " + heapArr[rightChild(i)]);
            }
    
            System.out.println();
        }
    }
    
}
