package com.rometools.modules.itunes.types;

/**
 * @author Michiel Meeuwissen
 * @since 1.6
 */
public enum YesNo {
	YES,
	NO;

    public static YesNo valueOfLowercase(String string) {
        return valueOf(string.trim().toUpperCase());
    }
}
