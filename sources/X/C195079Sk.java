package X;

import com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1;

/* renamed from: X.9Sk  reason: invalid class name and case insensitive filesystem */
public final class C195079Sk {
    public long A00;
    public C007403e A01;
    public byte[] A02;
    public final int A03 = AnonymousClass0XG.A01.A03(0, 1000);
    public final AnonymousClass130 A04;
    public final C19970wo A05;
    public final C26151Jb A06;
    public final AnonymousClass134 A07;
    public final C21520zN A08;
    public final C005502l A09;
    public final AnonymousClass040 A0A;

    public final synchronized void A00() {
        C21520zN r5 = this.A08;
        boolean A0E = r5.A0E(6430);
        boolean A1T = AnonymousClass000.A1T(this.A03, r5.A07(7217));
        if (A0E && A1T) {
            C007403e r0 = this.A01;
            if (r0 == null || (!r0.BL7() && (C19970wo.A00(this.A05) - this.A00 >= ((long) r5.A07(6431)) || this.A02 == null))) {
                AnonymousClass040 r3 = this.A0A;
                this.A01 = AnonymousClass0A2.A02(C023109s.A00, this.A09, new KeyAttestationLifetimeManager$prepare$1(this, (C023509x) null), r3);
            }
        }
    }

    public C195079Sk(AnonymousClass130 r4, C19970wo r5, C26151Jb r6, AnonymousClass134 r7, C21520zN r8, C005502l r9) {
        C36321k7.A11(r7, r8, r4);
        C36341k9.A1F(r5, r9);
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = C009403z.A02(r9);
    }
}
