/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        long l=1,r=num/2;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid<num)
                l=mid+1;
            else if(mid*mid>num)
                r=mid-1;
            else
                return true;
        }
        return false;
    }
}