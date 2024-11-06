package com.app._06_11_2024;

import lombok.Setter;

@Setter
public class Famous {

    private Famous famous;

    public Famous getFamous(Famous[] famous) {
        int first = 0;
        int last = famous.length - 1;

        while (first != last) {
            if (famous[first].isKnow(famous[last])) {
                first++;
            } else {
                last--;
            }
        }

        for (int f = 0; f < famous.length; f++) {

        }

        return null;
    }

    private boolean isKnow(Famous famous) {
        if(this.famous.famous == famous) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Famous f1 = new Famous();
        Famous f2 = new Famous();
        Famous f3 = new Famous();
        Famous f4 = new Famous();

        f1.setFamous(f2);

    }
}
