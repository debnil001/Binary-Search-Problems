/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class FindPeakElement {
    public int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int ans=0;
        if(arr.length==1)
            return 0;
        while(start<=end) {
            int mid=start+(end-start)/2;
            //int prev=(mid+arr.length-1)%arr.length;
            //int next=(mid+1)%arr.length;
            if(mid>0 && mid<arr.length-1) {
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                    return mid;
                }
                else if(arr[mid]<arr[mid+1])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else {
                if(mid==0) {
                    if(arr[mid]>arr[mid+1])
                        return mid;
                    else
                        return mid+1;
                    
                }
                else if(mid==arr.length-1) {
                    if(arr[mid]>arr[mid-1])
                        return mid;
                    else
                        return mid-1; 
                }
            }
        }
        return ans;
    }
}
