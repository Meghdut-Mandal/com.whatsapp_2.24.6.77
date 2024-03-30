package X;

import java.io.File;

/* renamed from: X.1QB  reason: invalid class name */
public class AnonymousClass1QB {
    public final C25531Gr A00;
    public final AnonymousClass1EH A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (X.AnonymousClass2bU) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(X.AnonymousClass3T1 r6) {
        /*
            boolean r0 = r6 instanceof X.AnonymousClass2bU
            r5 = 0
            if (r0 == 0) goto L_0x0028
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.3Qj r0 = r6.A01
            if (r0 == 0) goto L_0x0028
            java.io.File r0 = r0.A0I
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0028
            X.3Qj r0 = r6.A01
            java.io.File r0 = r0.A0I
            long r3 = r0.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            X.3Qj r0 = r6.A01
            java.io.File r0 = r0.A0I
            return r0
        L_0x0028:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A00(X.3T1):java.io.File");
    }

    public byte[] A01(AnonymousClass3T1 r9) {
        C122585v5 A002;
        AnonymousClass1EH r5 = this.A01;
        byte[] A05 = r5.A05(r9);
        if (A05 == null) {
            if (r9.A0H() == 1 && r9.A1N > 0) {
                if (r9 instanceof AnonymousClass2bU) {
                    AnonymousClass2bU r0 = (AnonymousClass2bU) r9;
                    File A003 = A00(r0);
                    if (!(A003 == null || (A002 = this.A00.A00(new C122575v4(AnonymousClass6Y1.A02(r0), A003, r0.A05, false))) == null || (A05 = A002.A02) == null)) {
                        r5.A03(r9, A05);
                    }
                }
            }
            return null;
        }
        return A05;
    }

    public AnonymousClass1QB(AnonymousClass1EH r1, C25531Gr r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
