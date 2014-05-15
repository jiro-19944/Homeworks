public class BinarySearch {
    private static int[] list = { 1 , 2 , 3 , 4 , 5 , 6 , 17};
    public static void main(String[] args) {
        System.out.print(binarySearch(list, 17 )+"\n");
    }
    public static int sort(){
        int i,j;
        int iMin;
        for (j = 0; j < n-1; j++) {
            iMin = j;
            for ( i = j+1; i < n; i++) {
                if (a[i] < a[iMin]) {
                    iMin = i;
                }
            }
            if ( iMin != j ) {
                swap(a[j], a[iMin]);
            }
        }

    }
    public static int binarySearch(int[] a,int target){
        return binarySearch(a, 0, a.length-1, target);
    }

    public static int binarySearch(int[] a, int start, int end, int target){
        int middle = (start + end) / 2;
        if(end < start)
            return -1;
        if(target==a[middle])
            return middle;
        if(target<a[middle])
            return binarySearch(a, start, middle - 1, target);
        else
            return binarySearch(a, middle + 1, end, target);
    }



}
