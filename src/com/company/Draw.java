package com.company;

import java.util.Arrays;
public class Draw {
    private int lucky;
    private int luckyCount = 0;
    private int lucky1 = 0;
    private int lucky2 = 0;
    private int lucky3 = 0;
    private int lucky4 = 0;
    private int lucky5 = 0;
    private int lucky6 = 0;
    public int[] setLucky(){
        while (luckyCount < 6) {
            lucky = (int) (45 * Math.random()+1);
            switch (luckyCount) {
                case 0:
                    lucky1 = lucky;
                    luckyCount++;
                case 1:
                    if (lucky != lucky1) {
                        lucky2 = lucky;
                        luckyCount++;
                    }
                case 2:
                    if (lucky != lucky1 && lucky != lucky2) {
                        lucky3 = lucky;
                        luckyCount++;
                    }
                case 3:
                    if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {
                        lucky4 = lucky;
                        luckyCount++;
                    }
                case 4:
                    if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {
                        lucky5 = lucky;
                        luckyCount++;
                    }
                case 5:
                    if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4 && lucky != lucky5) {
                        lucky6 = lucky;
                        luckyCount++;
                    }
            }
        }
        int[] vietlott = {lucky1, lucky2, lucky3, lucky4, lucky5, lucky6};
        return vietlott;
    }

}

