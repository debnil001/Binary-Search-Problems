package BinarySearch;

import DivideAndConquer.*;

public class searchInRotatedSortedArray {
    public static int help(int arr[],int target){
        int start=0,end=arr.length-1;
        int idx=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                idx=mid;
                break;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,6,7,0,1,2};
        int target=0;
        System.out.print(help(arr,target));
    }
}
