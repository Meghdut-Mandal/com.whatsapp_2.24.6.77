package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2uG  reason: invalid class name and case insensitive filesystem */
public abstract class C55212uG {
    public static String A00(String str) {
        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str);
        if (matcher.find()) {
            return C36321k7.A0D(matcher.group(1), matcher.group(2));
        }
        return str;
    }
}
