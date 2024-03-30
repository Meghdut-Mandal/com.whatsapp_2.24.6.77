package X;

/* renamed from: X.1KA  reason: invalid class name */
public final class AnonymousClass1KA {
    public final AnonymousClass1HY A00;
    public final AnonymousClass1KB A01;
    public final C25661He A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final C19770wU A05;
    public final AnonymousClass1KC A06;

    public AnonymousClass1KA(AnonymousClass1HY r2, AnonymousClass1KB r3, AnonymousClass1KC r4, C25661He r5, C19970wo r6, C20810yC r7, C19770wU r8) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r8, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r2, 5);
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == X.C52232p6.A02) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C88384Sm r12) {
        /*
            r11 = this;
            X.1He r0 = r11.A02
            X.2p6 r2 = r0.A02()
            X.2p6 r0 = X.C52232p6.IN_WAITLIST
            if (r2 == r0) goto L_0x000f
            X.2p6 r1 = X.C52232p6.AI_AVAILABLE
            r0 = 0
            if (r2 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.C18740tg.A0C(r0)
            X.1KC r0 = r11.A06
            X.33x r3 = new X.33x
            r3.<init>(r12, r11)
            X.19A r4 = r0.A00
            java.lang.String r7 = r4.A09()
            r0 = 5
            X.1jS r2 = new X.1jS
            r2.<init>((java.lang.String) r7, (int) r0)
            X.9nx r6 = r2.A00
            X.AnonymousClass00C.A08(r6)
            X.30a r1 = new X.30a
            r1.<init>(r3)
            r0 = 2
            X.1jT r5 = new X.1jT
            r5.<init>(r2, r1, r0)
            r8 = 426(0x1aa, float:5.97E-43)
            r9 = 32000(0x7d00, double:1.581E-319)
            r4.A0E(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KA.A01(X.4Sm):void");
    }

    public static final void A00(C52232p6 r2, AnonymousClass1KA r3) {
        int ordinal = r2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r3.A02.A04();
            } else if (ordinal == 2) {
                r3.A02.A03();
            }
            AnonymousClass1HY r1 = r3.A00;
            C19420v0.A00(r1.A00).putLong("bonsai_last_waitlist_update_ms", C19970wo.A00(r3.A03)).apply();
            return;
        }
        throw new IllegalStateException("bonsaiwaitlistsyncmanager/wrong genai state");
    }
}
