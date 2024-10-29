public void QuickSort(int start, int end) {
    int i = start;
    int j = end;
    int pivot = array[(start + end) / 2];

    while (i <= j) {
        while (array[i] < pivot) {
            i++;
        }
        while (array[j] > pivot) {
            j--;
        }
        if (i <= j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    if (start < j) {
        quickSort(start, j);
    }
    if (i < end) {
        quickSort(i, end);
    }
}
