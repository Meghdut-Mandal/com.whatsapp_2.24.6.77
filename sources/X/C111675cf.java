package X;

import java.io.File;

/* renamed from: X.5cf  reason: invalid class name and case insensitive filesystem */
public abstract class C111675cf {
    public static final C135066c4 A00(C24041Av r27, C23981Ap r28, AnonymousClass6EB r29) {
        AnonymousClass6EB r2 = r29;
        AnonymousClass00C.A0D(r2, 0);
        C24041Av r5 = r27;
        C23981Ap r1 = r28;
        C36321k7.A0v(r1, 1, r5);
        String str = r2.A0B;
        String str2 = r2.A0D;
        File A04 = r5.A04(str, str2);
        if (!A04.exists()) {
            return null;
        }
        C135066c4 r7 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r7.A0E = str;
        r7.A02(A04.getAbsolutePath(), 1);
        r7.A0H = r2.A0E;
        r7.A09 = r2.A0A;
        r7.A07 = r2.A08;
        r7.A0D = str2;
        r7.A0C = r2.A0C;
        r7.A00 = r2.A04;
        r7.A03 = r2.A06;
        r7.A02 = r2.A05;
        r7.A08 = r2.A09;
        r7.A0M = r2.A0G;
        r7.A0B = r2.A01;
        r7.A06 = r2.A00;
        r7.A0N = r2.A03;
        r1.A04(r7);
        return r7;
    }
}
