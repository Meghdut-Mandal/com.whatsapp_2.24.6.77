package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1uI  reason: invalid class name and case insensitive filesystem */
public final class C39931uI extends AnonymousClass04R {
    public AnonymousClass11F A00;
    public String A01 = "";
    public List A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass141 A05;
    public final AnonymousClass1X4 A06;
    public final AnonymousClass1KK A07;
    public final AnonymousClass17T A08;
    public final C34831hi A09;
    public final AnonymousClass005 A0A;
    public final C90394a5 A0B = C90394a5.A00(this, 2);
    public final AnonymousClass17Y A0C;
    public final AnonymousClass16J A0D;
    public final C19770wU A0E;

    public static final void A01(C39931uI r3) {
        r3.A0C.A0H(new C1497172m(r3, 0));
    }

    public void A0R() {
        AnonymousClass16J r2 = this.A0D;
        Iterable A0X = C36421kH.A0X(r2);
        C90394a5 r1 = this.A0B;
        if (C007103b.A0j(A0X, r1)) {
            r2.unregisterObserver(r1);
        }
    }

    public final void A0S(AnonymousClass141 r4, AnonymousClass11F r5) {
        this.A00 = r5;
        this.A05 = r4;
        if (r5 instanceof UserJid) {
            AnonymousClass16J r2 = this.A0D;
            Iterable A0X = C36421kH.A0X(r2);
            C90394a5 r1 = this.A0B;
            if (!C007103b.A0j(A0X, r1)) {
                r2.registerObserver(r1);
            }
            this.A0E.Bp1(new C1501874h(this, r5, 12));
        }
    }

    public C39931uI(AnonymousClass17Y r2, AnonymousClass1X4 r3, AnonymousClass1KK r4, AnonymousClass16J r5, AnonymousClass17T r6, C19770wU r7, AnonymousClass005 r8) {
        C36321k7.A1B(r7, r6, r3, r5, r4);
        C36321k7.A10(r2, r8);
        this.A0E = r7;
        this.A08 = r6;
        this.A06 = r3;
        this.A0D = r5;
        this.A07 = r4;
        this.A0C = r2;
        this.A0A = r8;
        C023409w r0 = C023409w.A00;
        this.A02 = r0;
        this.A09 = C36441kJ.A0s(r0);
    }
}
