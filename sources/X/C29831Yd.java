package X;

/* renamed from: X.1Yd  reason: invalid class name and case insensitive filesystem */
public class C29831Yd {
    public final C19730wQ A00;
    public final C220412q A01;

    private boolean A00(AnonymousClass3T1 r5, int i) {
        if (r5 instanceof C181758nz) {
            C181758nz r52 = (C181758nz) r5;
            if (r52.A00 == i) {
                for (AnonymousClass11F A0M : r52.A01) {
                    if (this.A00.A0M(A0M)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean A01(AnonymousClass3T1 r2) {
        return A00(r2, 82);
    }

    public boolean A02(AnonymousClass3T1 r2) {
        return A00(r2, 81);
    }

    public boolean A03(AnonymousClass3T1 r5) {
        if (r5 instanceof C181758nz) {
            C181758nz r52 = (C181758nz) r5;
            if (r52.A00 == 145) {
                for (AnonymousClass11F A0M : r52.A01) {
                    if (this.A00.A0M(A0M)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C29831Yd(C19730wQ r1, C220412q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
