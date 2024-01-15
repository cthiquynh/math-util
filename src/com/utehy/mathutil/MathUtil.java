
package com.utehy.mathutil;

//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ TA KHÔNG CẦN NHỚ CÁI GÌ 
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! = 1
    //ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        //hàm dừng liền ko cần return 
        
        //xuống đây là n = 0...20
        if (n == 0 || n == 1)
            return 1;
        
        //xuống đây , n = 2 .. 20 òi
        //chơi for hoặc đệ quy - recursion
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
