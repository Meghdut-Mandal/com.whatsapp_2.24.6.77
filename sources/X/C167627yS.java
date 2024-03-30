package X;

/* renamed from: X.7yS  reason: invalid class name and case insensitive filesystem */
public final class C167627yS extends AnonymousClass04R {
    public String A00;
    public final AnonymousClass08S A01;
    public final C132566Uh A02;

    public C167627yS(C132566Uh r7) {
        AnonymousClass00C.A0D(r7, 1);
        this.A02 = r7;
        AnonymousClass08S r5 = new AnonymousClass08S();
        r5.A0D(new C199779fx((C128826Dt) null, false, false));
        C10770fC r0 = new C10770fC();
        C10770fC r4 = new C10770fC();
        r5.A0F(r7.A00, new BA6(new C22494AnX(r5, this, r0, r4), 27));
        r5.A0F(r7.A01, new BA6(new C22486AnP(r5, this, r4), 28));
        this.A01 = r5;
    }

    public final C128826Dt A0S() {
        C199779fx r0 = (C199779fx) this.A01.A04();
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final void A0T(String str) {
        C199779fx r0 = (C199779fx) this.A01.A04();
        if (r0 == null || r0.A02) {
            C132566Uh r3 = this.A02;
            r3.A0B.Boy(new AnonymousClass751(22, str, r3));
            return;
        }
        this.A00 = str;
    }
}
