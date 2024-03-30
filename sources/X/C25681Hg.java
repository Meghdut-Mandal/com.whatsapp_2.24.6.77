package X;

/* renamed from: X.1Hg  reason: invalid class name and case insensitive filesystem */
public final class C25681Hg {
    public final C25621Ha A00;
    public final C20810yC A01;
    public final C25661He A02;
    public final C18820ts A03;

    public C25681Hg(C25621Ha r2, C25661He r3, C18820ts r4, C20810yC r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A01 = r5;
        this.A03 = r4;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final boolean A00() {
        if (!this.A00.A03()) {
            C20810yC r2 = this.A01;
            C21000yV r1 = C21000yV.A02;
            if (!C20800yB.A01(r1, r2, 5459)) {
                return C20800yB.A01(r1, r2, 4010);
            }
            if (this.A02.A02().value >= C52232p6.AI_AVAILABLE.value) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        C20810yC r2 = this.A01;
        if (!C20800yB.A01(C21000yV.A02, r2, 5362)) {
            return false;
        }
        if (this.A00.A03()) {
            return true;
        }
        String A09 = r2.A09(7848);
        AnonymousClass00C.A08(A09);
        return C007103b.A0f(AnonymousClass099.A0K(A09, String.valueOf(','), 0)).contains(this.A03.A06());
    }

    public final boolean A02() {
        if (A00() && A01()) {
            if (!C20800yB.A01(C21000yV.A02, this.A01, 6251)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (A00() && A01()) {
            if (!C20800yB.A01(C21000yV.A02, this.A01, 7639)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
