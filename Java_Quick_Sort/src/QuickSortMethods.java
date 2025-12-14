public class QuickSortMethods {
        public void QuickSort(int[] array, int start, int end){
            if (start < end) {
                int pi = Partition(array, start, end);
                QuickSort(array, start, pi-1);
                QuickSort(array, pi+1, end);
            }
        }

        public int Partition(int[] array, int low, int high){

            int pivot = array[high];
            int pi = low - 1;
            for (int i = low; i <= high - 1; i++) {

                if (array[i] < pivot) {
                    pi++;

                    int temp = array[i];
                    array[i] = array[pi];
                    array[pi] = temp;
                }

            }

            pi++;

            int temp = array[pi];
            array[pi] = pivot;
            array[high] = temp;

            return pi;

        }
    }
