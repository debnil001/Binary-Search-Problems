/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author HP
 */
class ArrangingCoins {
    public int arrangeCoins(int n) {
        long l=1,h=n;
        long res=0;
        while(l<=h){
            long mid=l+(h-l)/2;
            long totalCoins=(mid*(mid+1))/2;
            if(totalCoins>n)
                h=mid-1;
            else{
                l=mid+1;
                res=Math.max(res,mid);
            }
        }
        return (int)res;
    }
}
