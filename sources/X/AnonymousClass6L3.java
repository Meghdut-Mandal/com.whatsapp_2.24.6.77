package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6L3  reason: invalid class name */
public class AnonymousClass6L3 {
    public final char A00;
    public final DecimalFormat A01;
    public final char A02;
    public final int A03;
    public final int A04;

    public static String A00(AnonymousClass6L3 r5, String str) {
        int lastIndexOf = str.lastIndexOf(r5.A02);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        int i = lastIndexOf - 1;
        while (i > 0 && Character.isDigit(str.charAt(i - 1))) {
            i--;
        }
        int i2 = i + 1;
        StringBuilder A0i = C90524aI.A0i(str.substring(0, i2));
        while (i2 < lastIndexOf) {
            int i3 = (lastIndexOf - i2) - r5.A03;
            if (i3 == 0 || (i3 > 0 && i3 % r5.A04 == 0)) {
                A0i.append(r5.A00);
            }
            C90514aH.A1R(str, A0i, i2);
            i2++;
        }
        return AnonymousClass000.A0q(str.substring(lastIndexOf), A0i);
    }

    public AnonymousClass6L3(String str, Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        this.A01 = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        this.A02 = decimalFormatSymbols.getDecimalSeparator();
        this.A00 = decimalFormatSymbols.getGroupingSeparator();
        decimalFormat.applyPattern(str);
        decimalFormat.setGroupingUsed(false);
        int indexOf = str.indexOf(46);
        indexOf = indexOf == -1 ? str.length() : indexOf;
        int lastIndexOf = str.lastIndexOf(44, indexOf - 1);
        int i = (indexOf - lastIndexOf) - 1;
        this.A03 = i;
        int lastIndexOf2 = str.lastIndexOf(44, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            this.A04 = i;
        } else {
            this.A04 = (lastIndexOf - lastIndexOf2) - 1;
        }
    }
}
