package X;

import com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1;

/* renamed from: X.9Sc  reason: invalid class name and case insensitive filesystem */
public final class C195009Sc {
    public long A00;
    public C007403e A01;
    public final AnonymousClass130 A02;
    public final C19970wo A03;
    public final C26151Jb A04;
    public final C21520zN A05;
    public final C200079gZ A06;
    public final C005502l A07;
    public final AnonymousClass040 A08;

    public final synchronized void A00() {
        C007403e r0;
        C21520zN r2 = this.A05;
        if (r2.A0E(7006) && ((r0 = this.A01) == null || (!r0.BL7() && C19970wo.A00(this.A03) - this.A00 >= ((long) r2.A07(7007))))) {
            AnonymousClass040 r3 = this.A08;
            this.A01 = AnonymousClass0A2.A02(C023109s.A00, this.A07, new GpiaLifetimeManager$prepare$1(this, (C023509x) null), r3);
        }
    }

    public C195009Sc(AnonymousClass130 r2, C19970wo r3, C26151Jb r4, C21520zN r5, C200079gZ r6, C005502l r7) {
        C36321k7.A11(r5, r2, r3);
        C36341k9.A1F(r6, r7);
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = C009403z.A02(r7);
    }
}
