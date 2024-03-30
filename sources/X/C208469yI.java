package X;

import java.util.List;

/* renamed from: X.9yI  reason: invalid class name and case insensitive filesystem */
public class C208469yI implements B25 {
    public final AnonymousClass815 A00;
    public final AnonymousClass815 A01;

    public C196189Yb B4M() {
        return new C1684880u(C1684680s.A00(this.A00), C1684680s.A00(this.A01));
    }

    public List BDO() {
        throw AnonymousClass001.A0E("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean BNL() {
        if (!this.A00.BNL() || !this.A01.BNL()) {
            return false;
        }
        return true;
    }

    public C208469yI(AnonymousClass815 r1, AnonymousClass815 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
