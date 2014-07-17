package com.bunjix.ordinal;

import java.util.Locale;

public abstract class Ordinal {

    public static Ordinal forLocale(Locale locale){
        if (Locale.ENGLISH.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new EnglishOrdinal();
        if (Locale.FRENCH.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new FrenchOrdinal();
        if (Locale.GERMAN.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal(".");
        if (Locale.ITALIAN.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("°");
        if ("es".equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("o");
        if (Locale.JAPANESE.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("番目");
        if (Locale.KOREAN.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("번째");
        if ("ru".equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("-й");
        if (Locale.SIMPLIFIED_CHINESE.getLanguage().equalsIgnoreCase(locale.getLanguage())) return new SimpleOrdinal("-й");
        return new EnglishOrdinal();
    }

    public abstract String getSuffix(int value);


    static class SimpleOrdinal extends Ordinal {

        private final String single;

        public SimpleOrdinal(String singleChoice) { this.single = singleChoice; }

        @Override
        public String getSuffix(int value) {
            return single;
        }
    }
}
