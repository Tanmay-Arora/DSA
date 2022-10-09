class LinearSearch{

    public void linearSearch(int[] arr, int len, int item) {
        boolean found = false;
        for(int i=0; i<len; i++) {
            if(arr[i] == item) {
                found = true;
                System.out.println("Element found at index " + len);
                break;
            }
        }

        if(found == false) {
            System.out.println("Element not found!!");
        }

    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {5,8,9,1,3,4,2,1};
        int length = arr.length;
        int item = 4;
        ls.linearSearch(arr, length, item);
    }
}