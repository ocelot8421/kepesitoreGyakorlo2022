package hu.nive.ujratervezes.kepesitovizsga.adddigits;

import java.util.Objects;

public class AddDigits {

    public int addDigits(String input) {

        if (input == null || input.isEmpty()){
            return -1;
        }

        int sum = 0;
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
