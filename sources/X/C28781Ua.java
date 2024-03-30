package X;

/* renamed from: X.1Ua  reason: invalid class name and case insensitive filesystem */
public final class C28781Ua {
    public final C19730wQ A00;
    public final C20810yC A01;
    public final AnonymousClass1GQ A02;

    public C28781Ua(C19730wQ r2, C20810yC r3, AnonymousClass1GQ r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final boolean A00() {
        if (!this.A00.A0L()) {
            if (!C20800yB.A01(C21000yV.A02, this.A01, 2722)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (!AnonymousClass1GQ.A01(this.A02, 3877) || A00()) {
            return false;
        }
        C20810yC r3 = this.A01;
        C21000yV r2 = C21000yV.A01;
        if (C20800yB.A00(r2, r3, 3964) == C52442pR.APP_SWITCH_STATUS_AND_CHANNELS_ENABLED.value || C20800yB.A00(r2, r3, 3964) == C52442pR.XFAMILY_CROSSPOST_ENABLED.value) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (AnonymousClass1GQ.A01(this.A02, 3877) && A00()) {
            if (C20800yB.A00(C21000yV.A01, this.A01, 3964) != C52442pR.XFAMILY_CROSSPOST_ENABLED.value) {
                return false;
            }
            return true;
        }
        return false;
    }
}
