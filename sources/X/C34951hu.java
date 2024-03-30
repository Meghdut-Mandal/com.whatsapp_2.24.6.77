package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Iterator;

/* renamed from: X.1hu  reason: invalid class name and case insensitive filesystem */
public final class C34951hu {
    public final WfalManager A00;
    public final AnonymousClass16E A01;
    public final C21010yW A02;

    public C34951hu(WfalManager wfalManager, AnonymousClass16E r3, C21010yW r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(wfalManager, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = wfalManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C108475Tq r5, X.AnonymousClass3T1 r6, X.C34951hu r7, java.lang.String r8, int r9) {
        /*
            X.2SU r4 = new X.2SU
            r4.<init>()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            r4.A08 = r8
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            int r1 = r5.ordinal()
            r5 = 2
            r3 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0021
            if (r1 == r3) goto L_0x0022
        L_0x0021:
            r5 = 1
        L_0x0022:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A07 = r0
            X.3Qa r0 = r6.A1J
            java.lang.String r0 = r0.A01
            r4.A09 = r0
            com.whatsapp.bridge.wfal.WfalManager r0 = r7.A00
            X.005 r0 = r0.A03
            java.lang.Object r2 = r0.get()
            X.1UC r2 = (X.AnonymousClass1UC) r2
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x00ae
            r0 = 0
            X.6Oy r2 = new X.6Oy
            r2.<init>(r0, r0)
        L_0x004a:
            if (r5 == r3) goto L_0x00ab
            boolean r0 = r2.A01
        L_0x004e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            boolean r0 = r6 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x00a1
            r1 = 39
        L_0x005a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x005e:
            r4.A06 = r0
            X.16E r0 = r7.A01
            int r2 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 0
            if (r0 == 0) goto L_0x007a
            r0 = 3
            if (r2 == 0) goto L_0x0076
            r0 = 2
            if (r2 == r3) goto L_0x0076
            if (r2 != r0) goto L_0x007a
            r0 = 4
        L_0x0076:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x007a:
            r4.A04 = r1
            X.3GP r0 = r6.A0c
            X.3XT r0 = r0.A01
            if (r0 == 0) goto L_0x009b
            int r3 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0099
            r1 = 3
            if (r3 == 0) goto L_0x0095
            r0 = 1
            r1 = 2
            if (r3 == r0) goto L_0x0095
            if (r3 != r1) goto L_0x0099
            r1 = 4
        L_0x0095:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0099:
            r4.A05 = r2
        L_0x009b:
            X.0yW r0 = r7.A02
            r0.Bly(r4)
            return
        L_0x00a1:
            int r0 = r6.A1I
            r1 = 2
            if (r0 == r3) goto L_0x005a
            r1 = 3
            if (r0 == r1) goto L_0x005a
            r0 = 0
            goto L_0x005e
        L_0x00ab:
            boolean r0 = r2.A00
            goto L_0x004e
        L_0x00ae:
            boolean r1 = X.AnonymousClass1UC.A04(r2)
            boolean r0 = X.AnonymousClass1UC.A05(r2)
            X.6Oy r2 = new X.6Oy
            r2.<init>(r1, r0)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34951hu.A00(X.5Tq, X.3T1, X.1hu, java.lang.String, int):void");
    }

    public final void A01(AnonymousClass6DN r9) {
        Iterator it = r9.A01.iterator();
        while (it.hasNext()) {
            C127986Ak r6 = (C127986Ak) it.next();
            Iterator it2 = r9.A02.iterator();
            while (it2.hasNext()) {
                AnonymousClass3T1 r4 = (AnonymousClass3T1) it2.next();
                AnonymousClass00C.A0B(r4);
                A00(r6.A00, r4, this, r9.A04, 2);
            }
        }
    }
}
