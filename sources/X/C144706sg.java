package X;

import java.util.Iterator;

/* renamed from: X.6sg  reason: invalid class name and case insensitive filesystem */
public final class C144706sg implements C30631aW {
    public final C19730wQ A00;
    public final C19600wD A01;
    public final C25781Hq A02;
    public final C21010yW A03;
    public final AnonymousClass005 A04;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        C19730wQ r0 = this.A00;
        r0.A0G();
        if (r0.A00 != null) {
            this.A02.A01(this.A01.A04());
            AnonymousClass591 r2 = new AnonymousClass591();
            Iterator A0q = C90474aD.A0q(this.A04);
            while (A0q.hasNext()) {
                ((AnonymousClass7gT) A0q.next()).Bcw(r2);
            }
            this.A03.Blv(r2);
        }
    }

    public C144706sg(C19730wQ r1, C19600wD r2, C25781Hq r3, C21010yW r4, AnonymousClass005 r5) {
        C36321k7.A1B(r1, r4, r2, r3, r5);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }
}
