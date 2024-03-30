package X;

import java.util.List;

/* renamed from: X.3S3  reason: invalid class name */
public final class AnonymousClass3S3 {
    public static final List A02 = C36381kD.A13("instagram.com", "www.instagram.com");
    public final AnonymousClass3CN A00;
    public final AnonymousClass1DU A01;

    public final boolean A02(AnonymousClass3T1 r5, AnonymousClass3T1 r6) {
        String str;
        C36331k8.A1I(r5, r6);
        AnonymousClass3CN r0 = this.A00;
        C51762oL A002 = r0.A00(r5);
        C51762oL A003 = r0.A00(r6);
        if (!A00(this, r5) || !A00(this, r6) || A002 != A003) {
            return false;
        }
        C63483Kf A0M = r5.A0M();
        String str2 = null;
        if (A0M != null) {
            str = A0M.A02;
        } else {
            str = null;
        }
        C63483Kf A0M2 = r6.A0M();
        if (A0M2 != null) {
            str2 = A0M2.A02;
        }
        return AnonymousClass00C.A0J(str, str2);
    }

    public static final boolean A00(AnonymousClass3S3 r1, AnonymousClass3T1 r2) {
        if (!(r2 instanceof AnonymousClass2bV) || r2.A0N() == null || r2.A0M() == null || r1.A01(r2)) {
            return false;
        }
        return true;
    }

    public final boolean A01(AnonymousClass3T1 r3) {
        C52132ow r1;
        if (!(r3 instanceof AnonymousClass2bV)) {
            return false;
        }
        if (r3.A0N() != null && r3.A0M() != null && r3.A1R(256)) {
            return true;
        }
        if (r3.A0N() == null || r3.A0M() == null) {
            return false;
        }
        AnonymousClass3JM A0a = r3.A0a();
        if (A0a != null) {
            r1 = A0a.A01;
        } else {
            r1 = null;
        }
        if (r1 == C52132ow.A02) {
            return true;
        }
        return false;
    }

    public AnonymousClass3S3(AnonymousClass3CN r1, AnonymousClass1DU r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
