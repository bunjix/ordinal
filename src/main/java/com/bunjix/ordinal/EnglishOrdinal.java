package com.bunjix.ordinal;

class EnglishOrdinal extends Ordinal {
    private static final String TH = "th";
    private static final String[] SUFFIX = new String[] {TH, "st", "nd", "rd", TH, TH, TH, TH, TH, TH};

    @Override
    public String getSuffix(int value) {
        if ((value %100) >= 11 && (value%100) <= 13) {
            return TH;
        } else {
            return SUFFIX[value%10];
        }
    }
}
