package X;

import java.util.Comparator;

/* renamed from: X.75t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1505675t implements Comparator {
    public static final /* synthetic */ C1505675t A00 = new C1505675t();

    public final int compare(Object obj, Object obj2) {
        C129066Eu r3 = (C129066Eu) obj;
        C129066Eu r4 = (C129066Eu) obj2;
        boolean A01 = r3.A01();
        boolean A012 = r4.A01();
        if (!A01) {
            return A012 ? 1 : 0;
        }
        if (A012) {
            return Integer.compare(C36381kD.A03(r3.A08), C36381kD.A03(r4.A08));
        }
        return -1;
    }
}
