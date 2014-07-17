package com.bunjix.ordinal;

import java.util.Locale;

public abstract class Ordinal {

    /**
     *
     * @param locale ordinal depends on the language of the Locale
     * @return an Ordinal object that can perform getOrdinal call on some int values
     */
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

    /**
     * Return an ordinal String according to the language and the value
     *
     * @param value for which we want an ordinal String
     * @return the ordinal String according to the value
     */
    public abstract String getOrdinal(int value);


    /**
     * Simple class to use when the ordinal will be always the same.
     */
    static class SimpleOrdinal extends Ordinal {

        private final String single;

        /**
         *
         * @param singleChoice the only one possible ordinal to return
         */
        public SimpleOrdinal(String singleChoice) { this.single = singleChoice; }

        @Override
        public String getOrdinal(int value) {
            return single;
        }
    }
}
