package X;

import android.content.SharedPreferences;

/* renamed from: X.1He  reason: invalid class name and case insensitive filesystem */
public final class C25661He {
    public final AnonymousClass1HY A00;
    public final C20810yC A01;
    public final AnonymousClass00T A02 = new AnonymousClass00U(new C25671Hf(this));
    public final C19970wo A03;
    public final AnonymousClass005 A04;

    public C25661He(AnonymousClass1HY r3, C19970wo r4, C20810yC r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r6, 4);
        this.A03 = r4;
        this.A01 = r5;
        this.A00 = r3;
        this.A04 = r6;
    }

    public final C52232p6 A01() {
        Integer valueOf;
        int A0O = this.A00.A00.A0O("bonsai_genai_waitlist_state", -1);
        if (A0O == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(A0O);
        }
        for (C52232p6 r2 : C52232p6.values()) {
            int i = r2.value;
            if (valueOf != null && i == valueOf.intValue()) {
                return r2;
            }
        }
        return null;
    }

    public final C52232p6 A02() {
        return (C52232p6) ((C63473Ke) this.A02.getValue()).A01();
    }

    public final void A03() {
        AnonymousClass1HY r4 = this.A00;
        r4.A00.A1c("bonsai_genai_waitlist_state", C52232p6.AI_AVAILABLE.value);
        long A002 = C19970wo.A00(this.A03);
        SharedPreferences.Editor edit = ((SharedPreferences) r4.A02.getValue()).edit();
        edit.putLong("bonsai_gen_ai_feature_allowed_timestamp_ms", A002);
        edit.apply();
        A00(this);
    }

    public final void A04() {
        AnonymousClass1HY r4 = this.A00;
        r4.A00.A1c("bonsai_genai_waitlist_state", C52232p6.IN_WAITLIST.value);
        long A002 = C19970wo.A00(this.A03);
        AnonymousClass00T r42 = r4.A02;
        SharedPreferences.Editor edit = ((SharedPreferences) r42.getValue()).edit();
        edit.putLong("bonsai_gen_ai_added_to_waitlist_timestamp_ms", A002);
        edit.apply();
        ((SharedPreferences) r42.getValue()).edit().remove("bonsai_gen_ai_feature_allowed_timestamp_ms").apply();
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r4.value > r2.value) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C25661He r5) {
        /*
            X.2p6 r2 = r5.A01()
            r0 = -1
            if (r2 == 0) goto L_0x003f
            int r1 = r2.ordinal()
            if (r1 == r0) goto L_0x003f
            r0 = 0
            if (r1 == r0) goto L_0x0085
            r0 = 1
            if (r1 == r0) goto L_0x003c
            r0 = 2
            if (r1 != r0) goto L_0x007f
            X.0yC r2 = r5.A01
            r1 = 4010(0xfaa, float:5.619E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x003c
            X.2p6 r4 = X.C52232p6.AI_AVAILABLE
        L_0x0024:
            X.2p6 r2 = r5.A02()
            r3 = r2
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0048
            r0 = 1
            if (r1 == r0) goto L_0x0042
            r0 = 2
            if (r1 == r0) goto L_0x0042
            X.0jS r1 = new X.0jS
            r1.<init>()
            throw r1
        L_0x003c:
            X.2p6 r4 = X.C52232p6.IN_WAITLIST
            goto L_0x0024
        L_0x003f:
            X.2p6 r4 = X.C52232p6.BEFORE_WAITLIST
            goto L_0x0024
        L_0x0042:
            int r1 = r4.value
            int r0 = r2.value
            if (r1 <= r0) goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            if (r3 == r2) goto L_0x007e
            X.00T r2 = r5.A02
            java.lang.Object r1 = r2.getValue()
            X.3Ke r1 = (X.C63473Ke) r1
            r0 = 1
            r1.A03(r3, r0)
            r2.getValue()
            X.005 r0 = r5.A04
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            X.1LF r0 = (X.AnonymousClass1LF) r0
            X.00T r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.00r r0 = (X.C001600r) r0
            r0.A0C(r3)
            goto L_0x0066
        L_0x007e:
            return
        L_0x007f:
            X.0jS r1 = new X.0jS
            r1.<init>()
            throw r1
        L_0x0085:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Wrong genai state "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25661He.A00(X.1He):void");
    }
}
