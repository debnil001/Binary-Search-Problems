/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
public class SearchInsertPosition {
    public static int returnInsertPos(int[]nums,int target){
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;       
        }
        return l;
    }
    
    public static void main(String[]args){
        int nums[]=new int[]{1,3,5,7};
        int target=4;
        System.out.println(returnInsertPos(nums, target));
    }    
}
