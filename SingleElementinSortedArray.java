/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class SingleElementinSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==nums[mid^1])
                l=mid+1;
            else
                r=mid-1;
        }
        return nums[l];
    }
}
