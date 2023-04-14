/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
public class FindSmallestLetterGreaterThanTarget {
    class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0,high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid]>target){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return letters[low%letters.length];
    }
}
}
