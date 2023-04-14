/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class MinimumTimetoCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1,right=0;
        for (int t:time) {
            right=Math.max(right, t);
        }
        right=right*totalTrips;
        long ans=right;
        while (left<=right) {
            long mid=(left + right) / 2;
            if (check(mid,time,totalTrips)) {
                ans=mid;
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return ans;
    }    
    public boolean check(long givenTime,int[]time,int totalTrips) {
        long actualTrips = 0;
        for (int t : time) 
            actualTrips += givenTime / t;
            if(actualTrips>=totalTrips)
                return true;
        return actualTrips >= totalTrips;
    }
}