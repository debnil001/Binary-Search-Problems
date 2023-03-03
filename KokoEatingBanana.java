/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxk = 0;
        for(int i : piles)
            maxk = Math.max(maxk, i);
        
        int res = maxk, l = 1, r = maxk;
        
        while(l <= r){
            
            int mid = l + (r - l) / 2;
            int hour = 0;
            for(int i : piles){
                //Careful here, when we want to get float number of integer devision and round it up
                //We need to cast it to float / double first
                //But for this problem , Float won't work becasue it can have maximum 6-7 digits 
				//but the input is maximum 10^9 , so we need to use double here which can have maximum 15 digits
                
                hour += Math.ceil((double)i / mid );
            }
            
            if(hour <= h){
                r = mid - 1;
                res = Math.min(res, mid);
            }else{
                l = mid + 1;
            }
        }
        
        return res;
    }
}
