package X;

import java.util.ArrayList;

/* renamed from: X.5ap  reason: invalid class name and case insensitive filesystem */
public abstract class C110535ap {
    public static ArrayList A00(Long l, int[] iArr) {
        long longValue;
        ArrayList A0I = AnonymousClass001.A0I();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            j += (long) iArr[i];
            if (i != length - 1 || l == null) {
                if (j > j2) {
                    int i2 = (int) ((((j - j2) + 15) / 16) * 16);
                    AnonymousClass000.A1F(A0I, i2);
                    j3 = j2;
                    j2 = ((long) i2) + j2;
                }
                i++;
            } else {
                if (j > j2) {
                    longValue = l.longValue() - j2;
                } else {
                    A0I.remove(C90504aG.A0C(A0I));
                    longValue = l.longValue() - j3;
                }
                AnonymousClass000.A1F(A0I, (int) longValue);
            }
        }
        return A0I;
    }
}
