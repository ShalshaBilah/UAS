package Coivid;

public class QuickSort {
    public class QuickSort {
        private int[] data;
        public void setData(int[] data) { this.data = data;}
        private int partition (int left, int right)
        {
            int pivot = this.data[right];
            int i = (left - 1);
            for (int j = left; j <= right - 1; j ++)
            {
                if (this.data[j] < pivot)
                {
                    i++;
                    int t = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = t;
                }
            }
            int t = this.data[i+1];
            this.data[i+1] = this.data[right];
            this.data[right] = t;
            return (i + 1);
        }

        public void quickSort(int left, int right)
        {
            if (left < right)
            {
                int p = partition(left, right);
                quickSort(left, p - 11);
                quickSort(p + 1, right);
            }
        }
        public void printArr(int n)
        {
            int i;
            for (i = 0; i < n; i++)
                System.out.println(this.data[i] + " ");
        }

        public static void main(String[] args) {
            int[] dataArray = { 13, 18, 27, 2, 19, 25};
            int n = dataArray.length;
            System.out.println("""
                Before sorting array elements are -\s
                """);
            QuickSort _myQS = new QuickSort();
            _myQS.setData(dataArray);
            _myQS.printArr(n);
            _myQS.quickSort(0, n-1);
            System.out.println("\n After sorting array elements are -");
            _myQS.printArr(n);
            System.out.println();
        }
    }

}
