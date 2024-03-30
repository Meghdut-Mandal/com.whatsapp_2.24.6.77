package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.653  reason: invalid class name */
public final class AnonymousClass653 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass17Y A03;
    public final C21060yb A04;
    public final C20810yC A05;
    public final C25491Gn A06;
    public final AnonymousClass1D0 A07;
    public final C19890wg A08;
    public final Map A09 = C36431kI.A1G();

    public final void A00() {
        Map map = this.A09;
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            AnonymousClass4R0 r2 = (AnonymousClass4R0) A0z.next();
            AnonymousClass1D0 r4 = this.A07;
            C146506vi r3 = (C146506vi) r2;
            if (!r3.A08()) {
                C36321k7.A1L(r2, "app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=", AnonymousClass000.A0u());
            } else {
                r3.A04 = true;
                r3.A0N.A06();
                r4.A0B.A02(r3, r3.A03().A08);
                r4.A0D.A08(r3);
                r4.A0F.Boy(new C35721j9(r4, r3, 46));
            }
        }
        map.clear();
    }

    public AnonymousClass653(AnonymousClass17Y r2, C21060yb r3, C20810yC r4, C25491Gn r5, AnonymousClass1D0 r6, C19890wg r7) {
        C36321k7.A11(r6, r4, r2);
        C36341k9.A1F(r7, r3);
        this.A07 = r6;
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A08 = r7;
        this.A04 = r3;
    }
}
