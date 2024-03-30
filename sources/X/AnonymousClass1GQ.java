package X;

/* renamed from: X.1GQ  reason: invalid class name */
public final class AnonymousClass1GQ {
    public final C20810yC A00;
    public final C19730wQ A01;

    public AnonymousClass1GQ(C19730wQ r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final boolean A03() {
        if (A00(this, 1) || A00(this, 3)) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        return A00(this, 3);
    }

    public static final boolean A00(AnonymousClass1GQ r2, int i) {
        if (C20800yB.A00(C21000yV.A02, r2.A00, 3778) == i) {
            return true;
        }
        return false;
    }

    public static final boolean A01(AnonymousClass1GQ r4, int i) {
        C20810yC r3 = r4.A00;
        if ((C20800yB.A01(C21000yV.A02, r3, 3956) || !r4.A01.A0L()) && r3.A07(i) == AnonymousClass1MF.ENABLED.value) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AnonymousClass1GQ r1, int i) {
        if (r1.A00.A07(i) == AnonymousClass1MF.NEEDS_UPGRADE.value) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        if (!A01(this, 3877) || !A01(this, 3878)) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        if (!A01(this, 3877) || !A01(this, 3879)) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (A06()) {
            if (!C20800yB.A01(C21000yV.A02, this.A00, 7685)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
