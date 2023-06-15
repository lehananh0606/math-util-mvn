/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hananh.mathutil.core;

//class này clone lại cái class huyền thoại java.utils.Math
//với các hàm nổi tiếng Math.sqrt() Math.sin() Math.rondom()
//và con số PI
public class MathUtility {

    public static final double PI = 3.1415;
    //class này chứa hàm static, chấm xài luôn
    //tính n giai thừa n! = 1,2,3,....
    //0! = 1! =1
    //không có giai thừa số âm. Nếu đưa số âm , chửi
    //giai thùa tăng nhanh, 20! vừa khớp full kiểu long
    //do đó 21! ko dùng kiểu long được. Nếu đưa > 21 chửi
    //chửi: ko trả về giá trị gì cả mà ném ra ngoại lệ EXCEPTION
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plsssss");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; // tích nhân dồn khởi động từ 1
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}


// TDD: Test Driven Development - phát triển phần mềm theo phong cách
// code đến đâu kiểm thử đến đó, viết code và viết test case/test run
// diễn ra song song, đan xen

// cứ có hàm là có test case
// viết ra test case đủ bao quát các tình huống xài hàm
// test case: bộ dữ liệu đưa vào app / hàm để mô phỏng lại
// 1 tình huống xài app/ hàm.  Nó có input data, giải thích cách dùng hàm/app
//và có giá trị trả về expected
// lát hồi run (test run/test execution) để luận đúng sai


//DÂN DEV GIỐNG DÂN QC Ở CHỖ NÀY
//ĐỀU PHẢI VIẾT/TẠO RA CÁC TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/CHẠY TEST
// VÀ ĐỀU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI
// DEV KHÁC TESTTER LÀ PHẢI VIẾT CODE LÀM APP!!


//TEST CASE không viết tự do mà viết theo template
//Viết tự do: 0! -> 1; 1! -> 1; 2! -> 2;3! -> 6
//Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE, KHÓA LUẬN T/N VÀ ĐI LÀM
// Test case #1: (mục tiêu test) check getF() with n = 0
// Steps-Procedures ( cách tiến hành test - input/output...)
//          1.Given n = 0;
//          2.Call the getF(n) (getF(0))
//      Expected results: (kết quả kì vọng)
//          getF(0) must return 1

// Test case #2: (mục tiêu test) check getF() with n = 1
// Steps-Procedures ( cách tiến hành test - input/output...)
//          1.Given n = 1;
//          2.Call the getF(n) (getF(1))
//      Expected results: (kết quả kì vọng)
//          getF(1) must return 1
