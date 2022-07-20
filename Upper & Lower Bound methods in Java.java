public static int lowerBound(int[] arr,int key){
    Arrays.sort(arr);
    int idx=Arrays.binarySearch(arr,key);
    if(idx>=0){
        return arr[idx];
    }
    else if((idx+1)*-1<arr.length&&(idx+1)*-1>=0) return arr[(idx+1)*-1];
    return -1;
}
public static int upperBound(int[] arr,int key){
        Arrays.sort(arr);
        int idx=Arrays.binarySearch(arr,key);
        if((idx+1)<arr.length&&idx>=0){
            return arr[idx+1];
        }
        else if((idx+1)*-1<arr.length&&(idx+1)*-1>=0) return arr[(idx+1)*-1];
        return -1;
    }

//it can be used for any other Collection of objects, just change the (int[] arr) parameter
