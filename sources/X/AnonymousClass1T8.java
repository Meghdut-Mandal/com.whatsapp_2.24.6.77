package X;

import android.content.Context;

/* renamed from: X.1T8  reason: invalid class name */
public class AnonymousClass1T8 {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19630wG A03;
    public final C18820ts A04;

    public static String A00(AnonymousClass11F r5, AnonymousClass1T8 r6, int i) {
        Context context = r6.A03.A00;
        Object[] objArr = new Object[1];
        AnonymousClass16D r0 = r6.A01;
        C18740tg.A06(r5);
        String str = null;
        String A0H = r6.A02.A0H(r0.A0D(r5));
        if (A0H != null) {
            str = r6.A04.A0G(A0H);
        }
        objArr[0] = str;
        return context.getString(i, objArr);
    }

    public AnonymousClass1T8(C19730wQ r1, AnonymousClass16D r2, AnonymousClass171 r3, C19630wG r4, C18820ts r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }
}
