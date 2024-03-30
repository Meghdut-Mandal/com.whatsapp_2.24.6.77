package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6rU  reason: invalid class name and case insensitive filesystem */
public final class C144016rU implements C159397jI {
    public final C123745x1 A00;
    public final C1260762l A01;
    public final AnonymousClass16D A02;
    public final Collection A03;
    public final AnonymousClass040 A04;

    private final List A00() {
        C122395um A002 = C1260762l.A00(this.A00, this.A01, this.A04);
        if (A002 == null) {
            return C023409w.A00;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C107265Nh A0D : A002.A01) {
            A0I.addAll(AnonymousClass6Gx.A00(this.A02, this.A03, A0D.A0D()));
        }
        return A0I;
    }

    public C144016rU(C123745x1 r1, C1260762l r2, AnonymousClass16D r3, Collection collection, AnonymousClass040 r5) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = collection;
    }

    public C1278569x BOH() {
        return new C1278569x(this, C110315aT.A00(A00()));
    }

    public C1278569x BOI() {
        return new C1278569x(this, A00());
    }
}
