package X;

/* renamed from: X.8qd  reason: invalid class name and case insensitive filesystem */
public abstract class C183338qd extends C203359nq {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r7 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C195759Vv A00(X.C19730wQ r6, X.AnonymousClass11F r7, X.AnonymousClass8SW r8, X.C64933Qa r9, boolean r10) {
        /*
            java.lang.String r0 = r8.participant_
            com.whatsapp.jid.UserJid r5 = X.C36431kI.A0l(r0)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0036
            X.11F r4 = r9.A00
            boolean r3 = X.AnonymousClass143.A0G(r4)
            boolean r0 = r8.fromMe_
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L_0x0027
            if (r3 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x0032
        L_0x001a:
            r5 = r7
        L_0x001b:
            java.lang.String r0 = r8.id_
            X.3Qa r1 = X.C165617ti.A0R(r4, r0, r2)
            X.9Vv r0 = new X.9Vv
            r0.<init>(r5, r1)
            return r0
        L_0x0027:
            boolean r0 = r6.A0M(r5)
            if (r0 != 0) goto L_0x0031
            if (r3 != 0) goto L_0x0034
            if (r10 != 0) goto L_0x0034
        L_0x0031:
            r2 = 1
        L_0x0032:
            r7 = r1
            goto L_0x001a
        L_0x0034:
            r7 = r5
            goto L_0x001a
        L_0x0036:
            boolean r2 = r8.fromMe_
            X.11F r4 = r9.A00
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183338qd.A00(X.0wQ, X.11F, X.8SW, X.3Qa, boolean):X.9Vv");
    }

    public static C195759Vv A01(AnonymousClass3T1 r4) {
        if (!r4.A10) {
            return null;
        }
        C64933Qa r3 = r4.A1J;
        return new C195759Vv(r3.A00, C165617ti.A0R(r4.A0J(), r3.A01, r3.A02));
    }

    public static void A02(AnonymousClass11F r2, AnonymousClass8NG r3, C64933Qa r4, boolean z) {
        AnonymousClass11F r1 = r4.A00;
        C18740tg.A06(r1);
        AnonymousClass8NG.A00(r1, r3);
        r3.A0V(r4.A01);
        boolean z2 = r4.A02;
        r3.A0Y(z2);
        if (r2 == null) {
            return;
        }
        if ((!z2 && AnonymousClass143.A0G(r1)) || (r1 instanceof C177618e5) || z) {
            r3.A0W(r2.getRawString());
        }
    }
}
