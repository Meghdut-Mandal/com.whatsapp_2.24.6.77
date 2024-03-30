package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Vh  reason: invalid class name and case insensitive filesystem */
public abstract class C132796Vh {
    public static double A01(List list, int i) {
        long A09 = C36431kI.A09(list.get(0));
        long A092 = C36431kI.A09(list.get(1));
        long j = (long) (2 << (i - 1));
        double d = 360.0d / ((double) j);
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(Double.valueOf(A00(A092, j, true)));
        A0I.add(Double.valueOf((((double) A09) * d) - 180.0d));
        A0I.add(Double.valueOf(A00(A092, j, false)));
        A0I.add(Double.valueOf((d * ((double) (A09 + 1))) - 180.0d));
        return (double) (C90474aD.A0J(C90484aE.A0S((Number) A0I.get(1), C90504aG.A01(A0I.get(0))), "origin").distanceTo(C90474aD.A0J(C90484aE.A0S((Number) A0I.get(3), C90504aG.A01(A0I.get(2))), "destination")) / 2.0f);
    }

    public static double A00(long j, long j2, boolean z) {
        if (z) {
            j++;
        }
        double exp = Math.exp((((((double) j) * 1.0d) / ((double) j2)) - 0.5d) * 4.0d * 3.141592653589793d);
        return -((Math.asin((exp - 1.0d) / (exp + 1.0d)) * 180.0d) / 3.141592653589793d);
    }

    public static ArrayList A03(double d, double d2, int i) {
        if (i <= 0 || d < -85.05112878d || d > 85.05112878d || d2 < -180.0d || d2 > 180.0d) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        long j = (long) (2 << (i - 1));
        double d3 = (double) j;
        C36391kE.A1W(A0I, (long) Math.min(Math.max(((d2 + 180.0d) / 360.0d) * d3, 0.0d), (double) (j - 1)));
        double sin = Math.sin((Math.min(Math.max(d, -85.05112878d), 85.05112878d) * 3.141592653589793d) / 180.0d);
        C36391kE.A1W(A0I, (long) Math.min(Math.max((0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d)) * d3, 0.0d), d3 - 1.0d));
        return A0I;
    }

    public static ArrayList A04(int i, long j, long j2) {
        long j3 = (long) (2 << (i - 1));
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(Double.valueOf((A00(j2, j3, true) + A00(j2, j3, false)) / 2.0d));
        A0I.add(Double.valueOf(((360.0d / ((double) j3)) * (((double) j) + 0.5d)) - 180.0d));
        return A0I;
    }

    public static String A02(Long l, Long l2, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        while (i > 0) {
            char c = '0';
            long j = (long) (1 << (i - 1));
            if ((l.longValue() & j) != 0) {
                c = (char) 49;
            }
            if ((l2.longValue() & j) != 0) {
                c = (char) (((char) (c + 1)) + 1);
            }
            A0u.append(c);
            i--;
        }
        return A0u.toString();
    }
}
