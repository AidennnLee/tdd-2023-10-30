package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("Calc run 메소드는 int를 리턴")
    void t1(){
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2(){
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 = 0")
    void t3(){
        int rs = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t4(){
        int rs = Calc.run("10 + 20");
        assertThat(rs).isEqualTo(30);
    }
}