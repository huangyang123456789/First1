package com.company;

import java.util.Calendar;
import java.util.Locale;

public class JudgingTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String displayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
        System.out.println(day);
        System.out.println(displayName);
    }
}

