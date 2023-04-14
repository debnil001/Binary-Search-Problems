/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class MinimumTImeToMakeMBouquets {
    public boolean isValid(long days,int[] bloomDay, int m, int k) {
	int len = bloomDay.length, count = 0, adjacent = 0;
	for (int i = 0; i < len; i++) {
		if (bloomDay[i] <= days) {
			adjacent++;
			if (adjacent == k) {
				count++;
				if (count == m)
					return true;
				adjacent = 0;
			}
		} 
                else
                    adjacent = 0;
	}
	return false;
}
    int getMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long left=1,right=getMax(bloomDay);
        long res=-1;
        System.out.println(right);
        while(left<=right){
            long mid=left+(right-left)/2;
            if(isValid(mid,bloomDay,m,k)){
                res=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return (int)res;
    }
}
