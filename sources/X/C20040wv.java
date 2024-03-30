package X;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0wv  reason: invalid class name and case insensitive filesystem */
public abstract class C20040wv {
    public static volatile DateFormat A00;
    public static volatile DateFormat A01;
    public static volatile DateFormat[] A02;

    public static String A08(C18820ts r1, long j) {
        return A0C(r1, 0).format(new Date(j));
    }

    public static String A00(C18820ts r2) {
        return A0A(C18820ts.A01(r2.A00), r2.A0A(272));
    }

    public static String A01(C18820ts r2) {
        return A0A(C18820ts.A01(r2.A00), r2.A0A(298));
    }

    public static String A04(C18820ts r3, long j) {
        DateFormat dateFormat = r3.A03;
        if (dateFormat == null) {
            Locale A012 = C18820ts.A01(r3.A00);
            dateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(A012, "MMMd"), A012);
            r3.A03 = dateFormat;
        }
        return ((DateFormat) dateFormat.clone()).format(new Date(j));
    }

    public static String A05(C18820ts r2, long j) {
        if (A01 == null) {
            A01 = DateFormat.getDateInstance(2, C18820ts.A01(r2.A00));
        }
        return ((DateFormat) A01.clone()).format(new Date(j));
    }

    public static String A06(C18820ts r2, long j) {
        Calendar instance = Calendar.getInstance(C18820ts.A01(r2.A00));
        instance.setTimeInMillis(j);
        return A02(r2, instance.get(7));
    }

    public static String A07(C18820ts r3, long j) {
        return new SimpleDateFormat(r3.A0A(172), C18820ts.A01(r3.A00)).format(new Date(j));
    }

    public static String A09(C18820ts r2, long j) {
        if (A00 == null) {
            A00 = DateFormat.getDateInstance(3, C18820ts.A01(r2.A00));
        }
        return ((DateFormat) A00.clone()).format(new Date(j));
    }

    public static DateFormat A0B(C18820ts r5) {
        String[] A002;
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat = r5.A02;
        SimpleDateFormat simpleDateFormat2 = dateFormat;
        if (dateFormat == null) {
            Locale A012 = C18820ts.A01(r5.A00);
            String A0A = r5.A0A(174);
            if (A0A.contains("MMMM")) {
                A002 = AnonymousClass6Rb.A01(r5, 0);
            } else if (A0A.contains("LLLL")) {
                A0A = A0A.replace("LLLL", "MMMM");
                A002 = AnonymousClass6Rb.A00(r5);
            } else {
                simpleDateFormat = new SimpleDateFormat(A0A, A012);
                r5.A02 = simpleDateFormat;
                simpleDateFormat2 = simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A0A, A012);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A002);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
            simpleDateFormat = simpleDateFormat3;
            r5.A02 = simpleDateFormat;
            simpleDateFormat2 = simpleDateFormat;
        }
        return (DateFormat) simpleDateFormat2.clone();
    }

    public static DateFormat A0C(C18820ts r7, int i) {
        if (A02 == null) {
            Locale A012 = C18820ts.A01(r7.A00);
            String A0A = r7.A0A(169);
            String[] A013 = AnonymousClass6Rb.A01(r7, 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A0A, A012);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A013);
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            String[] A014 = AnonymousClass6Rb.A01(r7, 1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(A0A, A012);
            DateFormatSymbols dateFormatSymbols2 = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols2.setMonths(A014);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols2);
            String[] A015 = AnonymousClass6Rb.A01(r7, 2);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A0A, A012);
            DateFormatSymbols dateFormatSymbols3 = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols3.setMonths(A015);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols3);
            A02 = new SimpleDateFormat[]{simpleDateFormat, simpleDateFormat2, simpleDateFormat3};
        }
        return (DateFormat) A02[i].clone();
    }

    public static String A02(C18820ts r3, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 205;
                break;
            case 2:
                i2 = 203;
                break;
            case 3:
                i2 = 207;
                break;
            case 4:
                i2 = 208;
                break;
            case 5:
                i2 = 206;
                break;
            case 6:
                i2 = 202;
                break;
            case 7:
                i2 = 204;
                break;
            default:
                throw new AssertionError("Unreachable code");
        }
        String A0A = r3.A0A(i2);
        if ("titlecase-firstword".equals(r3.A0A(274))) {
            return A0A(C18820ts.A01(r3.A00), A0A);
        }
        return A0A;
    }

    public static String A03(C18820ts r1, long j) {
        return A0B(r1).format(new Date(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r3 == 105) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0A(java.util.Locale r4, java.lang.String r5) {
        /*
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0007
            return r5
        L_0x0007:
            java.lang.String r4 = r4.getLanguage()
            r0 = 0
            int r3 = r5.codePointAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r3 != r0) goto L_0x003e
            java.lang.String r0 = "tr"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "az"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0040
        L_0x0024:
            r0 = 304(0x130, float:4.26E-43)
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r3)
            java.lang.String r0 = r5.substring(r0)
        L_0x0036:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x003e:
            if (r3 != r0) goto L_0x0063
        L_0x0040:
            r2 = 2
            if (r1 < r2) goto L_0x0063
            r0 = 1
            char r1 = r5.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L_0x0063
            java.lang.String r0 = "nl"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0063
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IJ"
            r1.append(r0)
            java.lang.String r0 = r5.substring(r2)
            goto L_0x0036
        L_0x0063:
            int r0 = java.lang.Character.toTitleCase(r3)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20040wv.A0A(java.util.Locale, java.lang.String):java.lang.String");
    }
}
