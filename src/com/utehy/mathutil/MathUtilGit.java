
package com.utehy.mathutil;

public class MathUtilGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        
        System.out.println("5! = 120; actual: " + result);
        
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        
        //thêm code sau lần đầu tiên làm chuyện ấy - code lên server 2:04 16/1/2024
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
        
        //MathUtil.getFactorial(-5);  //ném ngoại lệ
    }
    
}
