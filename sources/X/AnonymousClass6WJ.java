package X;

import java.util.List;

/* renamed from: X.6WJ  reason: invalid class name */
public final class AnonymousClass6WJ {
    public long A00;
    public C1042058r A01;
    public final C19970wo A02;
    public final List A03 = AnonymousClass001.A0I();
    public final C20810yC A04;

    public final synchronized void A04(int i) {
        A01(this, (Integer) null, i);
    }

    public final synchronized void A05(int i) {
        A01(this, Integer.valueOf(i), 3);
    }

    public final synchronized void A06(int i, int i2, String str, int i3) {
        if (this.A01 == null) {
            C1042058r r2 = new C1042058r();
            r2.A0N = str;
            r2.A0M = this.A04.A09(3076);
            r2.A05 = 1;
            r2.A0F = Long.valueOf(C19970wo.A00(this.A02));
            r2.A04 = Integer.valueOf(i);
            r2.A06 = Integer.valueOf(i2);
            r2.A07 = C36441kJ.A0y(i3);
            this.A01 = r2;
        }
    }

    public static final void A00(AnonymousClass5TV r3, AnonymousClass5TV r4, Object obj, String str) {
        String str2;
        boolean z = true;
        boolean A1T = C36371kC.A1T(r4.value, r3.value);
        if (obj == null) {
            z = false;
        }
        if (A1T != z) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            A0v.append(str2);
            A0v.append(" for scenario: ");
            throw AnonymousClass000.A0g(r4.name(), A0v);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083 A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass6WJ r9, java.lang.Integer r10, int r11) {
        /*
            X.58r r5 = r9.A01
            if (r5 == 0) goto L_0x00e7
            boolean r8 = X.AnonymousClass000.A1V(r10)
            java.lang.String r1 = r5.A0N     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "productSessionId"
            r3 = 1
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r1 = r5.A0M     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectTier"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Integer r1 = r5.A05     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectType"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Long r1 = r5.A0F     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectStartT"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Integer r1 = r5.A04     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectStartReason"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Integer r1 = r5.A06     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "flmConsentType"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Integer r2 = r5.A03     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r2 != 0) goto L_0x0048
            r3 = 0
            java.lang.Long r0 = r5.A0A     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r0 != 0) goto L_0x0048
            r4 = 0
            java.lang.Long r0 = r5.A09     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r0 != 0) goto L_0x0049
            r7 = 0
            java.lang.Long r0 = r5.A0B     // Catch:{ IllegalStateException -> 0x00e3 }
            r6 = 0
            if (r0 == 0) goto L_0x004b
            goto L_0x004a
        L_0x0048:
            r4 = 1
        L_0x0049:
            r7 = 1
        L_0x004a:
            r6 = 1
        L_0x004b:
            java.lang.Long r1 = r5.A0B     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectEmtT"
            A02(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r1 = r5.A0J     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectId"
            A02(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r1 = r5.A0K     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectInstanceId"
            A02(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Long r1 = r5.A09     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectEftT"
            A02(r1, r0, r7)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Long r1 = r5.A0E     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectEttiT"
            A02(r1, r0, r4)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Long r1 = r5.A0A     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectEitT"
            A02(r1, r0, r4)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.Long r1 = r5.A0G     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectTotalLoadingT"
            A02(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            java.lang.String r0 = "effectLoadingResultType"
            A02(r2, r0, r3)     // Catch:{ IllegalStateException -> 0x00e3 }
            if (r3 == 0) goto L_0x008c
            if (r8 == 0) goto L_0x008c
            java.lang.String r0 = "Loading failed reason not expected for a session that has finished loading"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalStateException -> 0x00e3 }
            throw r0     // Catch:{ IllegalStateException -> 0x00e3 }
        L_0x008c:
            X.0wo r0 = r9.A02
            long r2 = X.C19970wo.A00(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5.A0C = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r5.A01 = r0
            java.lang.Integer r0 = r5.A03
            if (r0 != 0) goto L_0x00bc
            if (r10 != 0) goto L_0x00b3
            java.lang.Integer r0 = X.C36361kB.A0j()
            r5.A03 = r0
        L_0x00aa:
            java.util.List r0 = r9.A03
            r0.add(r5)
            r0 = 0
            r9.A01 = r0
            return
        L_0x00b3:
            java.lang.Integer r0 = X.C36371kC.A0n()
            r5.A03 = r0
            r5.A02 = r10
            goto L_0x00aa
        L_0x00bc:
            java.lang.String r4 = "Required value was null."
            if (r1 == 0) goto L_0x00de
            java.lang.Long r0 = r5.A0F
            if (r0 == 0) goto L_0x00d9
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = r5.A0G
            if (r0 == 0) goto L_0x00d4
            java.lang.Long r0 = X.C90484aE.A0i(r0, r2)
            r5.A08 = r0
            goto L_0x00aa
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r4)
            throw r0
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r4)
            throw r0
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r4)
            throw r0
        L_0x00e3:
            r0 = move-exception
            r0.getMessage()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WJ.A01(X.6WJ, java.lang.Integer, int):void");
    }

    public static final boolean A03(AnonymousClass5TV r3, C1042058r r4) {
        try {
            String str = r4.A0N;
            AnonymousClass5TV r2 = AnonymousClass5TV.METADATA_FETCHED_OR_CONSENT_REQUESTED;
            A00(r2, r3, str, "productSessionId");
            A00(r2, r3, r4.A0M, "effectTier");
            A00(r2, r3, r4.A05, "effectType");
            A00(r2, r3, r4.A0F, "effectStartT");
            A00(r2, r3, r4.A04, "effectStartReason");
            A00(r2, r3, r4.A06, "flmConsentType");
            Long l = r4.A0B;
            AnonymousClass5TV r22 = AnonymousClass5TV.EFFECT_FETCHED;
            A00(r22, r3, l, "effectEmtT");
            A00(r22, r3, r4.A0J, "effectId");
            A00(r22, r3, r4.A0K, "effectInstanceId");
            A00(AnonymousClass5TV.EFFECT_INITIALIZED, r3, r4.A09, "effectEftT");
            Long l2 = r4.A0E;
            AnonymousClass5TV r23 = AnonymousClass5TV.EFFECT_ENABLED;
            A00(r23, r3, l2, "effectEttiT");
            A00(r23, r3, r4.A0A, "effectEitT");
            return true;
        } catch (IllegalStateException e) {
            e.getMessage();
            return false;
        }
    }

    public AnonymousClass6WJ(C19970wo r2, C20810yC r3) {
        C36321k7.A0x(r2, r3);
        this.A02 = r2;
        this.A04 = r3;
    }

    public static final void A02(Object obj, String str, boolean z) {
        String str2;
        if (z != AnonymousClass000.A1V(obj)) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            throw AnonymousClass000.A0g(str2, A0v);
        }
    }
}
