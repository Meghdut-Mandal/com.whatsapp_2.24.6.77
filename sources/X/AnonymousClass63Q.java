package X;

/* renamed from: X.63Q  reason: invalid class name */
public final class AnonymousClass63Q {
    public final C1260662k A00;
    public final C130796Ml A01;
    public final C144186rm A02;
    public final C110295aR A03;

    public final void A00(int i) {
        AnonymousClass6YM r8 = this.A02.A00;
        if (r8 != null) {
            C36321k7.A1T("VoiceService:onMinimizedBannerVisibilityChanged: ", AnonymousClass000.A0u(), i);
            if (i == 0) {
                r8.A0V = System.currentTimeMillis();
                return;
            }
            long j = r8.A0V;
            if (j != -1) {
                r8.A0Y += C36441kJ.A0A(j);
                r8.A0V = -1;
            }
        }
    }

    public AnonymousClass63Q(C1260662k r1, C130796Ml r2, C144186rm r3, C110295aR r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
