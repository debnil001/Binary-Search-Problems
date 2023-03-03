/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class CapacityToShipPackagesWithinDDays {
    public int[] getMaxnSum(int[]weights){
        int max=Integer.MIN_VALUE,sum=0;
        for(int i:weights){
            max=Math.max(max,i);
            sum+=i;
        }
        return new int[]{max,sum};
    }
    public boolean isValid(int capacity,int days,int weights[]){
        int day=1,currCap=capacity;
        for(int w:weights){
            if(currCap-w<0){
                day++;
                currCap=capacity;
            }
            currCap-=w;
        }
        return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int info[]=getMaxnSum(weights);
        int l=info[0],r=info[1];
        int res=r;
        while(l<=r){
            int capacity=l+(r-l)/2;
            if(isValid(capacity,days,weights)){
                res=Math.min(res,capacity);
                r=capacity-1;
            }
            else{
                l=capacity+1;
            }
        }
        return res;
    }
}
