package X;

import com.whatsapp.R;

/* renamed from: X.6Ml  reason: invalid class name and case insensitive filesystem */
public final class C130796Ml {
    public C123755x2 A00;
    public final AnonymousClass171 A01;
    public final AnonymousClass17X A02;

    public static final C143786r7 A00(C123755x2 r4, C130796Ml r5) {
        if (r4 == null) {
            return new C143786r7(C90524aI.A0O(C90524aI.A0w(), R.string.f12nameremoved), (Integer) null, 0.0f);
        }
        AnonymousClass171 r3 = r5.A01;
        C61243Bc r2 = r4.A01;
        if (r2 == null) {
            AnonymousClass6EE r1 = r4.A02;
            if (r1.A0J) {
                r2 = C90524aI.A0O(C90524aI.A0w(), R.string.f12nameremoved);
            } else {
                r2 = new C47842fr(r3.A0T(r1.A08));
            }
            r4.A01 = r2;
        }
        return new C143786r7(r2, (Integer) r4.A05.getValue(), r4.A00);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C143786r7 A01(X.AnonymousClass6OZ r9) {
        /*
            r8 = this;
            X.0wy r0 = r9.A04
            java.util.Collection r0 = r0.values()
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            r5 = 0
            if (r0 != 0) goto L_0x0045
            r6 = r5
        L_0x0015:
            X.6EE r6 = (X.AnonymousClass6EE) r6
            if (r6 == 0) goto L_0x001f
            int r1 = r6.A02
            r0 = 1
            if (r1 != r0) goto L_0x001f
            r5 = r6
        L_0x001f:
            r2 = 0
            if (r5 == 0) goto L_0x0034
            X.5x2 r0 = r8.A00
            if (r0 == 0) goto L_0x002a
            X.6EE r0 = r0.A02
            com.whatsapp.jid.UserJid r2 = r0.A08
        L_0x002a:
            com.whatsapp.jid.UserJid r0 = r5.A08
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x003b
            X.5x2 r2 = r8.A00
        L_0x0034:
            r8.A00 = r2
            X.6r7 r0 = A00(r2, r8)
            return r0
        L_0x003b:
            X.147 r1 = r9.A06
            X.17X r0 = r8.A02
            X.5x2 r2 = new X.5x2
            r2.<init>(r5, r0, r1)
            goto L_0x0034
        L_0x0045:
            java.lang.Object r6 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0015
            r1 = r6
            X.6EE r1 = (X.AnonymousClass6EE) r1
            int r0 = r1.A02
            r4 = 1
            if (r0 != r4) goto L_0x0071
            int r3 = r1.A00
        L_0x0059:
            java.lang.Object r2 = r7.next()
            r1 = r2
            X.6EE r1 = (X.AnonymousClass6EE) r1
            int r0 = r1.A02
            if (r0 != r4) goto L_0x006a
            int r0 = r1.A00
            if (r3 >= r0) goto L_0x006a
            r6 = r2
            r3 = r0
        L_0x006a:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0059
            goto L_0x0015
        L_0x0071:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130796Ml.A01(X.6OZ):X.6r7");
    }

    public C130796Ml(AnonymousClass171 r1, AnonymousClass17X r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }
}
