package X;

import android.util.Log;

/* renamed from: X.6VD  reason: invalid class name */
public class AnonymousClass6VD {
    public static final Object A01 = C36441kJ.A11();
    public static volatile AnonymousClass6VD A02;
    public final int A00;

    public static AnonymousClass6VD A00() {
        AnonymousClass6VD r0;
        synchronized (A01) {
            if (A02 == null) {
                A02 = new AnonymousClass6VD(3);
            }
            r0 = A02;
        }
        return r0;
    }

    public void A04(String str, String str2) {
        if (this.A00 <= 3) {
            Log.d(str, str2);
        }
    }

    public AnonymousClass6VD(int i) {
        this.A00 = i;
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder A0h = C90524aI.A0h(23);
        A0h.append("WM-");
        if (length >= 20) {
            str = C90514aH.A0z(str, 20);
        }
        return AnonymousClass000.A0q(str, A0h);
    }

    public static void A02(AnonymousClass6VD r1, Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A04(str2, sb.toString());
    }

    public static void A03(AnonymousClass6VD r1, String str, String str2, StringBuilder sb) {
        sb.append(str);
        r1.A04(str2, sb.toString());
    }
}
