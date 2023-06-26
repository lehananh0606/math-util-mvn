/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hananh.mathutil.core.test;

import static org.hananh.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author MSI GF63
 */
public class MathUtilityAdvancedTest {
    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào và expected trả về 
    // int                long -> Object (wrapper class)
    //                                      Integer Long
    
    public static Object[][] initTestData(){
        Object testData[][] ={{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {5, 1020}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    //                                                            cột 0,     cột một
    public void testFactorialGivenRightDrivenArugment0ReturnsWell(int n, long expected) {
       assertEquals(expected, getFactorial(n));
       
       
    }
    
}

//TDD : Test Driven Development là kĩ thuật lập trình mà 
// gắn với việc viết các test case để kiểm thử ngay những hàm dev mình vừa viết
// Viết code chính và viết code test (JUnit, Unit Test) xen kẽ với nhau. 2 màu
// xanh đỏ liên tục diễn ra

//DDT: sự mở rộng thêm cho quá trình viết code test (JUnit)
// Data Driven Testing
// kĩ thuật taccsh bộ test data ra 1 chỗ riêng, tách vào mảng tách vào file Excel,
// hay table; sau đó nhồi/fill/map
// cái data từ mảng này vào trong hàm so sánh assertEquals()
// Giúp code dễ đọc hơn, để kiểm tra xem còn thiếu test case nào hay ko