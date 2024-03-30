package X;

import java.util.Set;

/* renamed from: X.67P  reason: invalid class name */
public abstract class AnonymousClass67P {
    public C158327gk A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass683 A03;

    public AnonymousClass67P(AnonymousClass683 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A03 = r2;
    }

    public final AnonymousClass66P A00(String str, boolean z, boolean z2) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass66P r5 = new AnonymousClass66P();
        if (this.A02) {
            AnonymousClass683 r8 = this.A03;
            C165477tU r7 = new C165477tU(r5, 0);
            C18740tg.A01();
            if (z2) {
                for (C132446Tt A0D : r8.A09) {
                    A0D.A0D(true);
                }
            }
            Set set = r8.A09;
            AnonymousClass5MK r2 = new AnonymousClass5MK(r8, r7, r8.A06, z);
            r8.A08.Box(r2, str);
            set.add(r2);
        }
        return r5;
    }

    public final synchronized void A01(Integer num) {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass683 r3 = this.A03;
            AnonymousClass610 r1 = new AnonymousClass610(this);
            C18740tg.A01();
            r3.A08.Box(new C162927pN(num, r3, r1, 0), new String[0]);
        }
    }
}
