package com.bunjix.ordinal;

class FrenchOrdinal extends Ordinal {

    private static final String FIRST = "er";
    private static final String OTHER = "ème";

    @Override
    public String getSuffix(int value) {
        return value == 1 ? FIRST : OTHER;
    }
}
